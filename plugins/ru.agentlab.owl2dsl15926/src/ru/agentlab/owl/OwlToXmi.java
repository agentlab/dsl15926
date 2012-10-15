package ru.agentlab.owl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*import ontologyapplication.OntologyapplicationPackage;
import ontologydatamodel.OntologydatamodelPackage;
*/
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.emf4sw.owl.OWLPackage;
import com.emf4sw.owl.resource.impl.OWLXMLResourceFactory;
import com.emf4sw.rdf.RDFPackage;

public class OwlToXmi {
	
	private static void printHelp() {
		System.out.println("Converter v1.0");
		System.out.println("Converts ISO15926 model in OWL XML into XMI format.");
		System.out.println("Usage: java [-cp needed;jars] " + OwlToXmi.class.getName() + " owl_xml_file_path xmi_file_path");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 2) {
			printHelp();
			return;
		}

		String inFilePath	= args[0];
		String outFilePath	= args[1];
		
		if (inFilePath.length() < 1 || outFilePath.length() < 1) {
			printHelp();
			return;
		}
		
		Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Registry.INSTANCE.getExtensionToFactoryMap().put("owl", new OWLXMLResourceFactory());
		
		Map<String, Object> options = new HashMap<String, Object>();
		// options.put(OWLResource.OPTION_REASONER, Boolean.TRUE);
		// options.put(OWL2EcoreOptions.OWL2ECORE_REFINE_METAMODEL, Boolean.TRUE);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(RDFPackage.eINSTANCE.getNsURI(), RDFPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(OWLPackage.eINSTANCE.getNsURI(), OWLPackage.eINSTANCE);
		/*resourceSet.getPackageRegistry().put(OntologydatamodelPackage.eINSTANCE.getNsURI(), OntologydatamodelPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(OntologyapplicationPackage.eINSTANCE.getNsURI(), OntologyapplicationPackage.eINSTANCE);
		*/
		Resource owlResource = resourceSet.createResource(URI.createURI(inFilePath));
		try {
			owlResource.load(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Resource owlXmiResource = resourceSet.createResource(URI.createURI(outFilePath));
		EList<EObject> l = owlResource.getContents();
		owlXmiResource.getContents().addAll(l);
		
		try {
			owlXmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Transformation succesfull!!");
	}

}
