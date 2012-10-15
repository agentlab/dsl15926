package ru.agentlab.owl2iso15926;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import ru.shihkin.diplom.iso15926.Iso15926Package;
import ru.shihkin.diplom.iso15926.impl.Iso15926FactoryImpl;

import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.resource.impl.OWLXMLResourceFactory;
import com.emf4sw.rdf.RDFPackage;

public class Owl2Iso {

	private static void printHelp() {
		System.out.println("Converter v1.0");
		System.out
				.println("Converts ISO15926 model in OWL into internal format.");
		System.out
				.println("Usage: java [-cp needed;jars] BootMain owl_file_path output_dir_path");
	}

	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			printHelp();
			return;
		}

		String ontologyPath = args[0];
		String outputPath = args[1];

		if (ontologyPath.length() < 1 || outputPath.length() < 1) {
			printHelp();
			return;
		}

		Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Registry.INSTANCE.getExtensionToFactoryMap().put("owl", new OWLXMLResourceFactory());
		Registry.INSTANCE.getExtensionToFactoryMap().put("iso15926", new Iso15926FactoryImpl());

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(RDFPackage.eINSTANCE.getNsURI(), RDFPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(OWLPackage.eINSTANCE.getNsURI(), OWLPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(Iso15926Package.eINSTANCE.getNsURI(), Iso15926Package.eINSTANCE);

		Resource owlResource = resourceSet.createResource(URI.createURI(ontologyPath));
		owlResource.load(Collections.EMPTY_MAP);

		try {
			ModelFactory factory = new EMFModelFactory();
			EMFInjector injector = new EMFInjector();

			// metamodels
			IReferenceModel rdfMM = factory.newReferenceModel();
			injector.inject(rdfMM, RDFPackage.eNS_URI);
			IReferenceModel owlMM = factory.newReferenceModel();
			injector.inject(owlMM, OWLPackage.eNS_URI);
			IReferenceModel ontoMM = factory.newReferenceModel();
			injector.inject(ontoMM, Iso15926Package.eNS_URI);
			
			EMFModel inOwl = (EMFModel) factory.newModel(owlMM);
			EMFModel outOnto = (EMFModel) factory.newModel(ontoMM);

			injector.inject(inOwl, owlResource);
			
			//files for main transformation and libraries
			File owl2isofile = new File("./src/owl2iso.asm");
			File owl2isoHelperfile = new File("./src/owl2isoHelper.asm");
			
			//Input streams for main transformation and libraries
			InputStream owl2isoIS = new FileInputStream(owl2isofile);
			InputStream owl2isoHelperIS = new FileInputStream(owl2isoHelperfile);
			
			// launch transform
			ILauncher launcher = new EMFVMLauncher();
			launcher.initialize(Collections.<String, Object> emptyMap());
			launcher.addInModel(inOwl, "IN", "MM");
			launcher.addOutModel(outOnto, "OUT", "MM1");
			launcher.addLibrary("owl2isoHelper", launcher.loadModule(owl2isoHelperIS));
			
			//launch options
			Map<String, Object> options = new HashMap<String, Object>();
			options.put("allowInterModelReferences", "true");
		/*	options.put("supportUML2Stereotypes", "true");
			options.put("disassemble mode", "true");*/
			
			Object result = launcher.launch("run", new NullProgressMonitor(), options, owl2isoIS);

			OutputStream output = new FileOutputStream(new File(outputPath));
			outOnto.getResource().save(output, Collections.EMPTY_MAP);
			
			System.out.println("Transformation succesefull");
			/*DateTime endDateTime = new DateTime();
			Period period = new Period(startDateTime, endDateTime);
			System.out.println("Duration: " +
			PeriodFormat.wordBased().print(period));*/
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
}
