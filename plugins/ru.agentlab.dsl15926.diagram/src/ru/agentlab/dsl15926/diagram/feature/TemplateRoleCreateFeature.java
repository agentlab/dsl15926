package ru.agentlab.dsl15926.diagram.feature;

import org.eclipse.graphiti.examples.common.ExampleUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import ru.agentlab.dsl15926.AbstractObject;
import ru.agentlab.dsl15926.Dsl15926Factory;
import ru.agentlab.dsl15926.Template;
import ru.agentlab.dsl15926.TemplateRole;

public class TemplateRoleCreateFeature extends
		AbstractCreateConnectionFeature {

	private static final String TITLE = "Create class";
	private static final String USER_QUESTION = "Enter new class name";
	
	public TemplateRoleCreateFeature(IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "Template Role", "Create Template Role");
	}

	public boolean canCreate(ICreateConnectionContext context) {
		// return true if both anchors belong to an EClass
		// and those EClasses are not identical
		Template source = getTemplate(context.getSourceAnchor());
		AbstractObject target = getAbstractObject(context.getTargetAnchor());
		if (source != null && target != null && source != target) {
			return true;
		}
		return false;
	}

	public boolean canStartConnection(ICreateConnectionContext context) {
		// return true if start anchor belongs to a EClass
		if (getTemplate(context.getSourceAnchor()) != null) {
			return true;
		}
		return false;
	}

	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;
		
		String newClassName = ExampleUtil.askString(TITLE, USER_QUESTION, "");
//		if (newClassName == null || newClassName.trim().length() == 0) {
//			return "";
//		}

		// get EClasses which should be connected
		Template source = getTemplate(context.getSourceAnchor());
		AbstractObject target = getAbstractObject(context.getTargetAnchor());

		if (source != null && target != null) {
			// create new business object
			TemplateRole eReference = createEReference(source, target);
			eReference.setLabel(newClassName);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(eReference);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
		}

		return newConnection;
	}

//	/**
//	 * Returns the EClass belonging to the anchor, or null if not available.
//	 */
//	private ru.agentlab.dsl15926.Class getEClass(Anchor anchor) {
//		if (anchor != null) {
//			Object object = getBusinessObjectForPictogramElement(anchor
//					.getParent());
//			if (object instanceof ru.agentlab.dsl15926.Class) {
//				return (ru.agentlab.dsl15926.Class) object;
//			}
//		}
//		return null;
//	}
	
	private Template getTemplate(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor
					.getParent());
			if (object instanceof Template) {
				return (Template) object;
			}
		}
		return null;
	}
	
	/**
	 * Returns the EClass belonging to the anchor, or null if not available.
	 */
	private AbstractObject getAbstractObject(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor
					.getParent());
			if (object instanceof AbstractObject) {
				return (AbstractObject) object;
			}
		}
		return null;
	}

	/**
	 * Creates a EReference between two EClasses.
	 */
	private TemplateRole createEReference(Template template, AbstractObject classified) {
		TemplateRole role = Dsl15926Factory.eINSTANCE.createTemplateRole();
		template.getRoles().add(role);
		role.setEntityType(classified);
		return role;
	}
}
