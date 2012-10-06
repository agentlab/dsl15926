package ru.agentlab.dsl15926.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import ru.agentlab.dsl15926.AbstractObject;
import ru.agentlab.dsl15926.Template;
import ru.agentlab.dsl15926.TemplateRole;
import ru.agentlab.dsl15926.diagram.edit.policies.Dsl15926BaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class TemplateRoleReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public TemplateRoleReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof TemplateRole) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Template && newEnd instanceof Template)) {
			return false;
		}
		AbstractObject target = getLink().getEntityType();
		return Dsl15926BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTemplateRole_4002(getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof AbstractObject && newEnd instanceof AbstractObject)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof Template)) {
			return false;
		}
		Template source = (Template) getLink().eContainer();
		return Dsl15926BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTemplateRole_4002(getLink(), source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getRoles().remove(getLink());
		getNewSource().getRoles().add(getLink());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setEntityType(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected TemplateRole getLink() {
		return (TemplateRole) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Template getOldSource() {
		return (Template) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Template getNewSource() {
		return (Template) newEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractObject getOldTarget() {
		return (AbstractObject) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractObject getNewTarget() {
		return (AbstractObject) newEnd;
	}
}
