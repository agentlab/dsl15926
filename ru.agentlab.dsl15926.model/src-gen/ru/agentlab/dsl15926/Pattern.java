/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.Pattern#getIndividuals <em>Individuals</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Individuals</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.Individual}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Individual#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individuals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individuals</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getPattern_Individuals()
	 * @see ru.agentlab.dsl15926.Individual#getPatterns
	 * @model opposite="patterns"
	 * @generated
	 */
	EList<Individual> getIndividuals();

} // Pattern
