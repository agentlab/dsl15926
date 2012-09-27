package ru.agentlab.dsl15926.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.Repository;
import ru.agentlab.dsl15926.diagram.edit.parts.ClassEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.ClassLabelEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.IndividualEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.IndividualLabelEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.RepositoryEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateInstanceEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateLabelEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateRoleEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateRoleInstanceEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateRoleLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Dsl15926VisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "ru.agentlab.dsl15926.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (RepositoryEditPart.MODEL_ID.equals(view.getType())) {
				return RepositoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				Dsl15926DiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Dsl15926Package.eINSTANCE.getRepository().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Repository) domainElement)) {
			return RepositoryEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry
				.getModelID(containerView);
		if (!RepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (RepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RepositoryEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case RepositoryEditPart.VISUAL_ID:
			if (Dsl15926Package.eINSTANCE.getTemplateInstance().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateInstanceEditPart.VISUAL_ID;
			}
			if (Dsl15926Package.eINSTANCE.getClass_().isSuperTypeOf(
					domainElement.eClass())) {
				return ClassEditPart.VISUAL_ID;
			}
			if (Dsl15926Package.eINSTANCE.getTemplate().isSuperTypeOf(
					domainElement.eClass())) {
				return TemplateEditPart.VISUAL_ID;
			}
			if (Dsl15926Package.eINSTANCE.getIndividual().isSuperTypeOf(
					domainElement.eClass())) {
				return IndividualEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry
				.getModelID(containerView);
		if (!RepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (RepositoryEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RepositoryEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case RepositoryEditPart.VISUAL_ID:
			if (TemplateInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ClassEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TemplateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IndividualEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ClassEditPart.VISUAL_ID:
			if (ClassLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemplateEditPart.VISUAL_ID:
			if (TemplateLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IndividualEditPart.VISUAL_ID:
			if (IndividualLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TemplateRoleEditPart.VISUAL_ID:
			if (TemplateRoleLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Dsl15926Package.eINSTANCE.getTemplateRoleInstance().isSuperTypeOf(
				domainElement.eClass())) {
			return TemplateRoleInstanceEditPart.VISUAL_ID;
		}
		if (Dsl15926Package.eINSTANCE.getTemplateRole().isSuperTypeOf(
				domainElement.eClass())) {
			return TemplateRoleEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Repository element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case RepositoryEditPart.VISUAL_ID:
			return false;
		case TemplateInstanceEditPart.VISUAL_ID:
		case ClassEditPart.VISUAL_ID:
		case TemplateEditPart.VISUAL_ID:
		case IndividualEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
