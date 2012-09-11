/**
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
 *   <li>{@link ru.agentlab.dsl15926.Individual#getClasses <em>Classes</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Individual#getPropertyValues <em>Property Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getIndividual()
 * @model
 * @generated
 */
public interface Individual extends NamedElement {
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
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getIndividual_Classes()
	 * @see ru.agentlab.dsl15926.Class#getIndividuals
	 * @model opposite="individuals"
	 * @generated
	 */
	EList<ru.agentlab.dsl15926.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Property Values</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.PropertyValue}.
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
	EList<PropertyValue> getPropertyValues();

} // Individual
