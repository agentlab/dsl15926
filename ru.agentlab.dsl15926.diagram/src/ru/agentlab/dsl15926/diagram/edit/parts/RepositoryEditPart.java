package ru.agentlab.dsl15926.diagram.edit.parts;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableLabelEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import ru.agentlab.dsl15926.diagram.edit.policies.RepositoryCanonicalEditPolicy;
import ru.agentlab.dsl15926.diagram.edit.policies.RepositoryItemSemanticEditPolicy;
import ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry;

/**
 * @generated
 */
public class RepositoryEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Dsl15926"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public RepositoryEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RepositoryItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new RepositoryCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						Dsl15926VisualIDRegistry.TYPED_INSTANCE));
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	/**
	 * @generated
	 */
	/*package-local*/static class NodeLabelDragPolicy extends
			NonResizableEditPolicy {

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected List createSelectionHandles() {
			MoveHandle h = new MoveHandle((GraphicalEditPart) getHost());
			h.setBorder(null);
			return Collections.singletonList(h);
		}

		/**
		 * @generated
		 */
		public Command getCommand(Request request) {
			return null;
		}

		/**
		 * @generated
		 */
		public boolean understandsRequest(Request request) {
			return false;
		}
	}

	/**
	 * @generated
	 */
	/*package-local*/static class LinkLabelDragPolicy extends
			NonResizableLabelEditPolicy {

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected List createSelectionHandles() {
			MoveHandle mh = new MoveHandle((GraphicalEditPart) getHost());
			mh.setBorder(null);
			return Collections.singletonList(mh);
		}
	}

}
