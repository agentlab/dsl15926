package ru.agentlab.dsl15926.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import ru.agentlab.dsl15926.Class;
import ru.agentlab.dsl15926.TemplateInstance;
import ru.agentlab.dsl15926.TemplateRoleInstance;
import ru.agentlab.dsl15926.Thing;
import ru.agentlab.dsl15926.diagram.edit.policies.Dsl15926BaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class TemplateRoleInstanceReorientCommand extends EditElementCommand {

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
	public TemplateRoleInstanceReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof TemplateRoleInstance) {
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
		if (!(oldEnd instanceof TemplateInstance && newEnd instanceof TemplateInstance)) {
			return false;
		}
		Thing target = getLink().getPropertyInstance();
		return Dsl15926BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTemplateRoleInstance_4001(getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Thing && newEnd instanceof Thing)) {
			return false;
		}
		if (!(getLink().eContainer() instanceof TemplateInstance)) {
			return false;
		}
		TemplateInstance source = (TemplateInstance) getLink().eContainer();
		return Dsl15926BaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTemplateRoleInstance_4001(getLink(), source,
						getNewTarget());
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
		getLink().setPropertyInstance(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected TemplateRoleInstance getLink() {
		return (TemplateRoleInstance) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected TemplateInstance getOldSource() {
		return (TemplateInstance) oldEnd;
	}

	/**
	 * @generated
	 */
	protected TemplateInstance getNewSource() {
		return (TemplateInstance) newEnd;
	}

	/**
	 * @generated
	 */
	protected Thing getOldTarget() {
		return (Thing) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Thing getNewTarget() {
		return (Thing) newEnd;
	}
}
