package ru.agentlab.dsl15926.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry;

/**
 * @generated
 */
public class Dsl15926EditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Dsl15926VisualIDRegistry.getVisualID(view)) {

			case RepositoryEditPart.VISUAL_ID:
				return new RepositoryEditPart(view);

			case TemplateInstanceEditPart.VISUAL_ID:
				return new TemplateInstanceEditPart(view);

			case ClassEditPart.VISUAL_ID:
				return new ClassEditPart(view);

			case ClassLabelEditPart.VISUAL_ID:
				return new ClassLabelEditPart(view);

			case TemplateEditPart.VISUAL_ID:
				return new TemplateEditPart(view);

			case TemplateLabelEditPart.VISUAL_ID:
				return new TemplateLabelEditPart(view);

			case IndividualEditPart.VISUAL_ID:
				return new IndividualEditPart(view);

			case IndividualLabelEditPart.VISUAL_ID:
				return new IndividualLabelEditPart(view);

			case TemplateRoleInstanceEditPart.VISUAL_ID:
				return new TemplateRoleInstanceEditPart(view);

			case TemplateRoleEditPart.VISUAL_ID:
				return new TemplateRoleEditPart(view);

			case TemplateRoleLabelEditPart.VISUAL_ID:
				return new TemplateRoleLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
