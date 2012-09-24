/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.agentlab.dsl15926;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Property Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.ObjectPropertyInstance#getProperty <em>Property</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.ObjectPropertyInstance#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getObjectPropertyInstance()
 * @model
 * @generated
 */
public interface ObjectPropertyInstance extends PropertyInstance {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.ObjectProperty#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(ObjectProperty)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getObjectPropertyInstance_Property()
	 * @see ru.agentlab.dsl15926.ObjectProperty#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	ObjectProperty getProperty();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.ObjectPropertyInstance#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(ObjectProperty value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Individual)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getObjectPropertyInstance_Value()
	 * @model
	 * @generated
	 */
	Individual getValue();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.ObjectPropertyInstance#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Individual value);

} // ObjectPropertyInstance
