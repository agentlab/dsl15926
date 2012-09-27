package ru.agentlab.dsl15926.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import ru.agentlab.dsl15926.diagram.edit.commands.ClassCreateCommand;
import ru.agentlab.dsl15926.diagram.edit.commands.IndividualCreateCommand;
import ru.agentlab.dsl15926.diagram.edit.commands.TemplateCreateCommand;
import ru.agentlab.dsl15926.diagram.edit.commands.TemplateInstanceCreateCommand;
import ru.agentlab.dsl15926.diagram.providers.Dsl15926ElementTypes;

/**
 * @generated
 */
public class RepositoryItemSemanticEditPolicy extends
		Dsl15926BaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RepositoryItemSemanticEditPolicy() {
		super(Dsl15926ElementTypes.Repository_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Dsl15926ElementTypes.TemplateInstance_2001 == req.getElementType()) {
			return getGEFWrapper(new TemplateInstanceCreateCommand(req));
		}
		if (Dsl15926ElementTypes.Class_2002 == req.getElementType()) {
			return getGEFWrapper(new ClassCreateCommand(req));
		}
		if (Dsl15926ElementTypes.Template_2003 == req.getElementType()) {
			return getGEFWrapper(new TemplateCreateCommand(req));
		}
		if (Dsl15926ElementTypes.Individual_2004 == req.getElementType()) {
			return getGEFWrapper(new IndividualCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
