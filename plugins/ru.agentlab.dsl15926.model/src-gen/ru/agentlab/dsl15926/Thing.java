/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.Thing#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getThing()
 * @model abstract="true"
 * @generated
 */
public interface Thing extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.Class}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Class#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getThing_Classes()
	 * @see ru.agentlab.dsl15926.Class#getIndividuals
	 * @model opposite="individuals"
	 * @generated
	 */
	EList<ru.agentlab.dsl15926.Class> getClasses();

} // Thing
