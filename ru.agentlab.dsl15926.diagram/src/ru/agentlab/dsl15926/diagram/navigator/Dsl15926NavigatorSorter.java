package ru.agentlab.dsl15926.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import ru.agentlab.dsl15926.diagram.part.Dsl15926VisualIDRegistry;

/**
 * @generated
 */
public class Dsl15926NavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof Dsl15926NavigatorItem) {
			Dsl15926NavigatorItem item = (Dsl15926NavigatorItem) element;
			return Dsl15926VisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
