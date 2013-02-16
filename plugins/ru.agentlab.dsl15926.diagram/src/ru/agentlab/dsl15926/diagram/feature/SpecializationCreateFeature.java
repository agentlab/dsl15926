package ru.agentlab.dsl15926.diagram.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import ru.agentlab.dsl15926.Dsl15926Factory;
import ru.agentlab.dsl15926.Specialization;
import ru.agentlab.dsl15926.Thing;

public class SpecializationCreateFeature extends
		AbstractCreateConnectionFeature {

	public SpecializationCreateFeature(IFeatureProvider fp) {
		// provide name and description for the UI, e.g. the palette
		super(fp, "Specialization", "Create Classification");
	}

	public boolean canCreate(ICreateConnectionContext context) {
		// return true if both anchors belong to an EClass
		// and those EClasses are not identical
		ru.agentlab.dsl15926.Class source = getEClass(context.getSourceAnchor());
		ru.agentlab.dsl15926.Class target = getEClass(context.getTargetAnchor());
		if (source != null && target != null && source != target) {
			return true;
		}
		return false;
	}

	public boolean canStartConnection(ICreateConnectionContext context) {
		// return true if start anchor belongs to a EClass
		if (getEClass(context.getSourceAnchor()) != null) {
			return true;
		}
		return false;
	}

	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		// get EClasses which should be connected
		ru.agentlab.dsl15926.Class source = getEClass(context.getSourceAnchor());
		ru.agentlab.dsl15926.Class target = getEClass(context.getTargetAnchor());

		if (source != null && target != null) {
			// create new business object
			Specialization eReference = createEReference(source, target);
			// add connection for business object
			AddConnectionContext addContext = new AddConnectionContext(
					context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(eReference);
			newConnection = (Connection) getFeatureProvider().addIfPossible(
					addContext);
		}

		return newConnection;
	}

	/**
	 * Returns the EClass belonging to the anchor, or null if not available.
	 */
	private ru.agentlab.dsl15926.Class getEClass(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor
					.getParent());
			if (object instanceof ru.agentlab.dsl15926.Class) {
				return (ru.agentlab.dsl15926.Class) object;
			}
		}
		return null;
	}
	
	/**
	 * Returns the EClass belonging to the anchor, or null if not available.
	 */
	private Thing getThing(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor
					.getParent());
			if (object instanceof Thing) {
				return (Thing) object;
			}
		}
		return null;
	}

	/**
	 * Creates a EReference between two EClasses.
	 */
	private Specialization createEReference(ru.agentlab.dsl15926.Class subClass, ru.agentlab.dsl15926.Class superClass) {
		Specialization classification = Dsl15926Factory.eINSTANCE.createSpecialization();
		classification.setSubClass(subClass);
		classification.setSuperClass(superClass);
		return classification;
	}
}
