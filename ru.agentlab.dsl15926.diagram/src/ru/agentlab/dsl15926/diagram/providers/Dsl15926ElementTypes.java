package ru.agentlab.dsl15926.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.diagram.edit.parts.ClassEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.IndividualEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.RepositoryEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateInstanceEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateRoleEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateRoleInstanceEditPart;
import ru.agentlab.dsl15926.diagram.part.Dsl15926DiagramEditorPlugin;

/**
 * @generated
 */
public class Dsl15926ElementTypes {

	/**
	 * @generated
	 */
	private Dsl15926ElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Repository_1000 = getElementType("ru.agentlab.dsl15926.diagram.Repository_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TemplateInstance_2001 = getElementType("ru.agentlab.dsl15926.diagram.TemplateInstance_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Class_2002 = getElementType("ru.agentlab.dsl15926.diagram.Class_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Template_2003 = getElementType("ru.agentlab.dsl15926.diagram.Template_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Individual_2004 = getElementType("ru.agentlab.dsl15926.diagram.Individual_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TemplateRoleInstance_4001 = getElementType("ru.agentlab.dsl15926.diagram.TemplateRoleInstance_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TemplateRole_4002 = getElementType("ru.agentlab.dsl15926.diagram.TemplateRole_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return Dsl15926DiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Repository_1000,
					Dsl15926Package.eINSTANCE.getRepository());

			elements.put(TemplateInstance_2001,
					Dsl15926Package.eINSTANCE.getTemplateInstance());

			elements.put(Class_2002, Dsl15926Package.eINSTANCE.getClass_());

			elements.put(Template_2003, Dsl15926Package.eINSTANCE.getTemplate());

			elements.put(Individual_2004,
					Dsl15926Package.eINSTANCE.getIndividual());

			elements.put(TemplateRoleInstance_4001,
					Dsl15926Package.eINSTANCE.getTemplateRoleInstance());

			elements.put(TemplateRole_4002,
					Dsl15926Package.eINSTANCE.getTemplateRole());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Repository_1000);
			KNOWN_ELEMENT_TYPES.add(TemplateInstance_2001);
			KNOWN_ELEMENT_TYPES.add(Class_2002);
			KNOWN_ELEMENT_TYPES.add(Template_2003);
			KNOWN_ELEMENT_TYPES.add(Individual_2004);
			KNOWN_ELEMENT_TYPES.add(TemplateRoleInstance_4001);
			KNOWN_ELEMENT_TYPES.add(TemplateRole_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case RepositoryEditPart.VISUAL_ID:
			return Repository_1000;
		case TemplateInstanceEditPart.VISUAL_ID:
			return TemplateInstance_2001;
		case ClassEditPart.VISUAL_ID:
			return Class_2002;
		case TemplateEditPart.VISUAL_ID:
			return Template_2003;
		case IndividualEditPart.VISUAL_ID:
			return Individual_2004;
		case TemplateRoleInstanceEditPart.VISUAL_ID:
			return TemplateRoleInstance_4001;
		case TemplateRoleEditPart.VISUAL_ID:
			return TemplateRole_4002;
		}
		return null;
	}

}
