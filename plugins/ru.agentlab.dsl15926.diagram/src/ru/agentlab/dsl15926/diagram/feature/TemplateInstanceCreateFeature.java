package ru.agentlab.dsl15926.diagram.feature;

import org.eclipse.graphiti.examples.common.ExampleUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import ru.agentlab.dsl15926.TemplateInstance;
import ru.agentlab.dsl15926.impl.Dsl15926FactoryImpl;

public class TemplateInstanceCreateFeature extends AbstractCreateFeature {

	private static final String TITLE = "Create class";

	private static final String USER_QUESTION = "Enter new class name";

	public TemplateInstanceCreateFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, "Template Instance", "Create 15926 Template Instance");
	}

	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	public Object[] create(ICreateContext context) {
		// ask user for EClass name
		String newClassName = ExampleUtil.askString(TITLE, USER_QUESTION, "");
		if (newClassName == null || newClassName.trim().length() == 0) {
			return EMPTY;
		}

		TemplateInstance clazz = Dsl15926FactoryImpl.eINSTANCE.createTemplateInstance();
		// create EClass
//		EClass newClass = EcoreFactory.eINSTANCE.createEClass();
		// Add model element to resource.
		// We add the model element to the resource of the diagram for
		// simplicity's sake. Normally, a customer would use its own
		// model persistence layer for storing the business model separately.
		getDiagram().eResource().getContents().add(clazz);
//		clazz.setLabel(newClassName);

		// do the add
		addGraphicalRepresentation(context, clazz);

		// return newly created business object(s)
		return new Object[] { clazz };
	}

}
