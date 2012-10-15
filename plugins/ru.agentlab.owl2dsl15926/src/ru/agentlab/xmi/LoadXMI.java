package ru.agentlab.xmi;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.emf4sw.owl.OWLPackage;
import com.emf4sw.rdf.RDFPackage;

public class LoadXMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ResourceSet resourceSet = new ResourceSetImpl();

		Registry.INSTANCE.getExtensionToFactoryMap().put("xmi",
				new XMIResourceFactoryImpl());

		// resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION,
		// true);

		resourceSet.getPackageRegistry().put(RDFPackage.eINSTANCE.getNsURI(),
				RDFPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(OWLPackage.eINSTANCE.getNsURI(),
				OWLPackage.eINSTANCE);
		/*resourceSet.getPackageRegistry()
				.put(Iso15926Package.eINSTANCE.getNsURI(),
						Iso15926Package.eINSTANCE);*/

		Resource owlResource = resourceSet.getResource(
				URI.createFileURI("data/RDF/data-model.xmi"), true);

		List<EObject> contents = owlResource.getContents();

		for (EObject o : contents) {
			System.out.println(o);
		}
	}

}
