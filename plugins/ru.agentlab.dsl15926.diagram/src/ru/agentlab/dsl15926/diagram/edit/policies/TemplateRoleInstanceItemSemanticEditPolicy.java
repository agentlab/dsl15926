package ru.agentlab.dsl15926.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import ru.agentlab.dsl15926.diagram.providers.Dsl15926ElementTypes;

/**
 * @generated
 */
public class TemplateRoleInstanceItemSemanticEditPolicy extends
		Dsl15926BaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TemplateRoleInstanceItemSemanticEditPolicy() {
		super(Dsl15926ElementTypes.TemplateRoleInstance_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
