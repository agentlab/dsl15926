package ru.agentlab.dsl15926.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

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
import ru.agentlab.dsl15926.diagram.part.Dsl15926DiagramEditorPlugin;
import ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry;
import ru.agentlab.dsl15926.diagram.providers.Dsl15926ElementTypes;
import ru.agentlab.dsl15926.diagram.providers.Dsl15926ParserProvider;

/**
 * @generated
 */
public class Dsl15926NavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Dsl15926DiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Dsl15926DiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Dsl15926NavigatorItem
				&& !isOwnView(((Dsl15926NavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof Dsl15926NavigatorGroup) {
			Dsl15926NavigatorGroup group = (Dsl15926NavigatorGroup) element;
			return Dsl15926DiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof Dsl15926NavigatorItem) {
			Dsl15926NavigatorItem navigatorItem = (Dsl15926NavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (Dsl15926VisualIDRegistry.getVisualID(view)) {
		case RepositoryEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://agentlab.ru/models/dsl15926/2012/08?Repository", Dsl15926ElementTypes.Repository_1000); //$NON-NLS-1$
		case TemplateRoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://agentlab.ru/models/dsl15926/2012/08?TemplateRole", Dsl15926ElementTypes.TemplateRole_4002); //$NON-NLS-1$
		case TemplateRoleInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://agentlab.ru/models/dsl15926/2012/08?TemplateRoleInstance", Dsl15926ElementTypes.TemplateRoleInstance_4001); //$NON-NLS-1$
		case ClassEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://agentlab.ru/models/dsl15926/2012/08?Class", Dsl15926ElementTypes.Class_2002); //$NON-NLS-1$
		case IndividualEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://agentlab.ru/models/dsl15926/2012/08?Individual", Dsl15926ElementTypes.Individual_2004); //$NON-NLS-1$
		case TemplateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://agentlab.ru/models/dsl15926/2012/08?Template", Dsl15926ElementTypes.Template_2003); //$NON-NLS-1$
		case TemplateInstanceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://agentlab.ru/models/dsl15926/2012/08?TemplateInstance", Dsl15926ElementTypes.TemplateInstance_2001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Dsl15926DiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& Dsl15926ElementTypes.isKnownElementType(elementType)) {
			image = Dsl15926ElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof Dsl15926NavigatorGroup) {
			Dsl15926NavigatorGroup group = (Dsl15926NavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Dsl15926NavigatorItem) {
			Dsl15926NavigatorItem navigatorItem = (Dsl15926NavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (Dsl15926VisualIDRegistry.getVisualID(view)) {
		case RepositoryEditPart.VISUAL_ID:
			return getRepository_1000Text(view);
		case TemplateRoleEditPart.VISUAL_ID:
			return getTemplateRole_4002Text(view);
		case TemplateRoleInstanceEditPart.VISUAL_ID:
			return getTemplateRoleInstance_4001Text(view);
		case ClassEditPart.VISUAL_ID:
			return getClass_2002Text(view);
		case IndividualEditPart.VISUAL_ID:
			return getIndividual_2004Text(view);
		case TemplateEditPart.VISUAL_ID:
			return getTemplate_2003Text(view);
		case TemplateInstanceEditPart.VISUAL_ID:
			return getTemplateInstance_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getIndividual_2004Text(View view) {
		IParser parser = Dsl15926ParserProvider.getParser(
				Dsl15926ElementTypes.Individual_2004,
				view.getElement() != null ? view.getElement() : view,
				Dsl15926VisualIDRegistry
						.getType(IndividualLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Dsl15926DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTemplateRole_4002Text(View view) {
		IParser parser = Dsl15926ParserProvider.getParser(
				Dsl15926ElementTypes.TemplateRole_4002,
				view.getElement() != null ? view.getElement() : view,
				Dsl15926VisualIDRegistry
						.getType(TemplateRoleLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Dsl15926DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getClass_2002Text(View view) {
		IParser parser = Dsl15926ParserProvider.getParser(
				Dsl15926ElementTypes.Class_2002,
				view.getElement() != null ? view.getElement() : view,
				Dsl15926VisualIDRegistry.getType(ClassLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Dsl15926DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTemplateInstance_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTemplate_2003Text(View view) {
		IParser parser = Dsl15926ParserProvider.getParser(
				Dsl15926ElementTypes.Template_2003,
				view.getElement() != null ? view.getElement() : view,
				Dsl15926VisualIDRegistry
						.getType(TemplateLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Dsl15926DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTemplateRoleInstance_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRepository_1000Text(View view) {
		Repository domainModelElement = (Repository) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getUrl();
		} else {
			Dsl15926DiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return RepositoryEditPart.MODEL_ID.equals(Dsl15926VisualIDRegistry
				.getModelID(view));
	}

}
