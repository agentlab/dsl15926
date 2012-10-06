package ru.agentlab.dsl15926.diagram.providers;

import ru.agentlab.dsl15926.diagram.part.Dsl15926DiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = Dsl15926DiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			Dsl15926DiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
