/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.Specialization#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Specialization#getSubClass <em>Sub Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Super Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class</em>' reference.
	 * @see #setSuperClass(AbstractObject)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getSpecialization_SuperClass()
	 * @model
	 * @generated
	 */
	AbstractObject getSuperClass();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.Specialization#getSuperClass <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class</em>' reference.
	 * @see #getSuperClass()
	 * @generated
	 */
	void setSuperClass(AbstractObject value);

	/**
	 * Returns the value of the '<em><b>Sub Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class</em>' reference.
	 * @see #setSubClass(AbstractObject)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getSpecialization_SubClass()
	 * @model
	 * @generated
	 */
	AbstractObject getSubClass();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.Specialization#getSubClass <em>Sub Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Class</em>' reference.
	 * @see #getSubClass()
	 * @generated
	 */
	void setSubClass(AbstractObject value);

} // Specialization
