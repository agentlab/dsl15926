package ru.agentlab.dsl15926.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import ru.agentlab.dsl15926.diagram.edit.commands.TemplateRoleCreateCommand;
import ru.agentlab.dsl15926.diagram.edit.commands.TemplateRoleInstanceCreateCommand;
import ru.agentlab.dsl15926.diagram.edit.commands.TemplateRoleInstanceReorientCommand;
import ru.agentlab.dsl15926.diagram.edit.commands.TemplateRoleReorientCommand;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateRoleEditPart;
import ru.agentlab.dsl15926.diagram.edit.parts.TemplateRoleInstanceEditPart;
import ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry;
import ru.agentlab.dsl15926.diagram.providers.Dsl15926ElementTypes;

/**
 * @generated
 */
public class ClassItemSemanticEditPolicy extends
		Dsl15926BaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClassItemSemanticEditPolicy() {
		super(Dsl15926ElementTypes.Class_2002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (Dsl15926VisualIDRegistry.getVisualID(incomingLink) == TemplateRoleInstanceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (Dsl15926VisualIDRegistry.getVisualID(incomingLink) == TemplateRoleEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Dsl15926ElementTypes.TemplateRoleInstance_4001 == req
				.getElementType()) {
			return null;
		}
		if (Dsl15926ElementTypes.TemplateRole_4002 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (Dsl15926ElementTypes.TemplateRoleInstance_4001 == req
				.getElementType()) {
			return getGEFWrapper(new TemplateRoleInstanceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (Dsl15926ElementTypes.TemplateRole_4002 == req.getElementType()) {
			return getGEFWrapper(new TemplateRoleCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case TemplateRoleInstanceEditPart.VISUAL_ID:
			return getGEFWrapper(new TemplateRoleInstanceReorientCommand(req));
		case TemplateRoleEditPart.VISUAL_ID:
			return getGEFWrapper(new TemplateRoleReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
