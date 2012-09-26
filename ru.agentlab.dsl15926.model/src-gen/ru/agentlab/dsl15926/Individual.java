/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.Individual#getPropertyValues <em>Property Values</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Individual#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getIndividual()
 * @model
 * @generated
 */
public interface Individual extends Thing {
	/**
	 * Returns the value of the '<em><b>Property Values</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.PropertyInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Values</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getIndividual_PropertyValues()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<PropertyInstance> getPropertyValues();

	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.Pattern}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Pattern#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getIndividual_Patterns()
	 * @see ru.agentlab.dsl15926.Pattern#getIndividuals
	 * @model opposite="individuals"
	 * @generated
	 */
	EList<Pattern> getPatterns();

} // Individual
