package ru.agentlab.dsl15926.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import ru.agentlab.dsl15926.AbstractObject;
import ru.agentlab.dsl15926.Class;
import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.Individual;
import ru.agentlab.dsl15926.Repository;
import ru.agentlab.dsl15926.Template;
import ru.agentlab.dsl15926.TemplateInstance;
import ru.agentlab.dsl15926.TemplateRole;
import ru.agentlab.dsl15926.TemplateRoleInstance;
import ru.agentlab.dsl15926.diagram.edit.parts.ClassEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.IndividualEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.RepositoryEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateInstanceEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateRoleEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateRoleInstanceEditPart;
import ru.agentlab.dsl15926.diagram.providers.Dsl15926ElementTypes;

/**
 * @generated
 */
public class Dsl15926DiagramUpdater {

	/**
	 * @generated
	 */
	public static List<Dsl15926NodeDescriptor> getSemanticChildren(View view) {
		switch (Dsl15926VisualIDRegistry.getVisualID(view)) {
		case RepositoryEditPart.VISUAL_ID:
			return getRepository_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926NodeDescriptor> getRepository_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Repository modelElement = (Repository) view.getElement();
		LinkedList<Dsl15926NodeDescriptor> result = new LinkedList<Dsl15926NodeDescriptor>();
		for (Iterator<?> it = modelElement.getTemplateInstances().iterator(); it
				.hasNext();) {
			TemplateInstance childElement = (TemplateInstance) it.next();
			int visualID = Dsl15926VisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TemplateInstanceEditPart.VISUAL_ID) {
				result.add(new Dsl15926NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getClasses().iterator(); it
				.hasNext();) {
			Class childElement = (Class) it.next();
			int visualID = Dsl15926VisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ClassEditPart.VISUAL_ID) {
				result.add(new Dsl15926NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTemplates().iterator(); it
				.hasNext();) {
			Template childElement = (Template) it.next();
			int visualID = Dsl15926VisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TemplateEditPart.VISUAL_ID) {
				result.add(new Dsl15926NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getIndividuals().iterator(); it
				.hasNext();) {
			Individual childElement = (Individual) it.next();
			int visualID = Dsl15926VisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IndividualEditPart.VISUAL_ID) {
				result.add(new Dsl15926NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getContainedLinks(View view) {
		switch (Dsl15926VisualIDRegistry.getVisualID(view)) {
		case RepositoryEditPart.VISUAL_ID:
			return getRepository_1000ContainedLinks(view);
		case TemplateInstanceEditPart.VISUAL_ID:
			return getTemplateInstance_2001ContainedLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_2002ContainedLinks(view);
		case TemplateEditPart.VISUAL_ID:
			return getTemplate_2003ContainedLinks(view);
		case IndividualEditPart.VISUAL_ID:
			return getIndividual_2004ContainedLinks(view);
		case TemplateRoleInstanceEditPart.VISUAL_ID:
			return getTemplateRoleInstance_4001ContainedLinks(view);
		case TemplateRoleEditPart.VISUAL_ID:
			return getTemplateRole_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getIncomingLinks(View view) {
		switch (Dsl15926VisualIDRegistry.getVisualID(view)) {
		case TemplateInstanceEditPart.VISUAL_ID:
			return getTemplateInstance_2001IncomingLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_2002IncomingLinks(view);
		case TemplateEditPart.VISUAL_ID:
			return getTemplate_2003IncomingLinks(view);
		case IndividualEditPart.VISUAL_ID:
			return getIndividual_2004IncomingLinks(view);
		case TemplateRoleInstanceEditPart.VISUAL_ID:
			return getTemplateRoleInstance_4001IncomingLinks(view);
		case TemplateRoleEditPart.VISUAL_ID:
			return getTemplateRole_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getOutgoingLinks(View view) {
		switch (Dsl15926VisualIDRegistry.getVisualID(view)) {
		case TemplateInstanceEditPart.VISUAL_ID:
			return getTemplateInstance_2001OutgoingLinks(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_2002OutgoingLinks(view);
		case TemplateEditPart.VISUAL_ID:
			return getTemplate_2003OutgoingLinks(view);
		case IndividualEditPart.VISUAL_ID:
			return getIndividual_2004OutgoingLinks(view);
		case TemplateRoleInstanceEditPart.VISUAL_ID:
			return getTemplateRoleInstance_4001OutgoingLinks(view);
		case TemplateRoleEditPart.VISUAL_ID:
			return getTemplateRole_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getRepository_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getTemplateInstance_2001ContainedLinks(
			View view) {
		TemplateInstance modelElement = (TemplateInstance) view.getElement();
		LinkedList<Dsl15926LinkDescriptor> result = new LinkedList<Dsl15926LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_TemplateRoleInstance_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getClass_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getTemplate_2003ContainedLinks(
			View view) {
		Template modelElement = (Template) view.getElement();
		LinkedList<Dsl15926LinkDescriptor> result = new LinkedList<Dsl15926LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_TemplateRole_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getIndividual_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getTemplateRoleInstance_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getTemplateRole_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getTemplateInstance_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getClass_2002IncomingLinks(
			View view) {
		Class modelElement = (Class) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Dsl15926LinkDescriptor> result = new LinkedList<Dsl15926LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_TemplateRoleInstance_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TemplateRole_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getTemplate_2003IncomingLinks(
			View view) {
		Template modelElement = (Template) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Dsl15926LinkDescriptor> result = new LinkedList<Dsl15926LinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_TemplateRole_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getIndividual_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getTemplateRoleInstance_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getTemplateRole_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getTemplateInstance_2001OutgoingLinks(
			View view) {
		TemplateInstance modelElement = (TemplateInstance) view.getElement();
		LinkedList<Dsl15926LinkDescriptor> result = new LinkedList<Dsl15926LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_TemplateRoleInstance_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getClass_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getTemplate_2003OutgoingLinks(
			View view) {
		Template modelElement = (Template) view.getElement();
		LinkedList<Dsl15926LinkDescriptor> result = new LinkedList<Dsl15926LinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_TemplateRole_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getIndividual_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getTemplateRoleInstance_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Dsl15926LinkDescriptor> getTemplateRole_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Dsl15926LinkDescriptor> getContainedTypeModelFacetLinks_TemplateRoleInstance_4001(
			TemplateInstance container) {
		LinkedList<Dsl15926LinkDescriptor> result = new LinkedList<Dsl15926LinkDescriptor>();
		for (Iterator<?> links = container.getRoles().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TemplateRoleInstance) {
				continue;
			}
			TemplateRoleInstance link = (TemplateRoleInstance) linkObject;
			if (TemplateRoleInstanceEditPart.VISUAL_ID != Dsl15926VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Class dst = link.getPropertyInstance();
			result.add(new Dsl15926LinkDescriptor(container, dst, link,
					Dsl15926ElementTypes.TemplateRoleInstance_4001,
					TemplateRoleInstanceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Dsl15926LinkDescriptor> getContainedTypeModelFacetLinks_TemplateRole_4002(
			Template container) {
		LinkedList<Dsl15926LinkDescriptor> result = new LinkedList<Dsl15926LinkDescriptor>();
		for (Iterator<?> links = container.getRoles().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TemplateRole) {
				continue;
			}
			TemplateRole link = (TemplateRole) linkObject;
			if (TemplateRoleEditPart.VISUAL_ID != Dsl15926VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractObject dst = link.getEntityType();
			result.add(new Dsl15926LinkDescriptor(container, dst, link,
					Dsl15926ElementTypes.TemplateRole_4002,
					TemplateRoleEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Dsl15926LinkDescriptor> getIncomingTypeModelFacetLinks_TemplateRoleInstance_4001(
			Class target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Dsl15926LinkDescriptor> result = new LinkedList<Dsl15926LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Dsl15926Package.eINSTANCE
					.getTemplateRoleInstance_PropertyInstance()
					|| false == setting.getEObject() instanceof TemplateRoleInstance) {
				continue;
			}
			TemplateRoleInstance link = (TemplateRoleInstance) setting
					.getEObject();
			if (TemplateRoleInstanceEditPart.VISUAL_ID != Dsl15926VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof TemplateInstance) {
				continue;
			}
			TemplateInstance container = (TemplateInstance) link.eContainer();
			result.add(new Dsl15926LinkDescriptor(container, target, link,
					Dsl15926ElementTypes.TemplateRoleInstance_4001,
					TemplateRoleInstanceEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Dsl15926LinkDescriptor> getIncomingTypeModelFacetLinks_TemplateRole_4002(
			AbstractObject target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Dsl15926LinkDescriptor> result = new LinkedList<Dsl15926LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Dsl15926Package.eINSTANCE
					.getTemplateRole_EntityType()
					|| false == setting.getEObject() instanceof TemplateRole) {
				continue;
			}
			TemplateRole link = (TemplateRole) setting.getEObject();
			if (TemplateRoleEditPart.VISUAL_ID != Dsl15926VisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Template) {
				continue;
			}
			Template container = (Template) link.eContainer();
			result.add(new Dsl15926LinkDescriptor(container, target, link,
					Dsl15926ElementTypes.TemplateRole_4002,
					TemplateRoleEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<Dsl15926NodeDescriptor> getSemanticChildren(View view) {
			return Dsl15926DiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Dsl15926LinkDescriptor> getContainedLinks(View view) {
			return Dsl15926DiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Dsl15926LinkDescriptor> getIncomingLinks(View view) {
			return Dsl15926DiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Dsl15926LinkDescriptor> getOutgoingLinks(View view) {
			return Dsl15926DiagramUpdater.getOutgoingLinks(view);
		}
	};

}
