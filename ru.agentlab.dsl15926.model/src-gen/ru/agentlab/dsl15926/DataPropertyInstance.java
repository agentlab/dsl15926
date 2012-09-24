/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.agentlab.dsl15926;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.DataPropertyInstance#getProperty <em>Property</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.DataPropertyInstance#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataPropertyInstance()
 * @model
 * @generated
 */
public interface DataPropertyInstance extends PropertyInstance {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.DataProperty#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(DataProperty)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataPropertyInstance_Property()
	 * @see ru.agentlab.dsl15926.DataProperty#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	DataProperty getProperty();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.DataPropertyInstance#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(DataProperty value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataPropertyInstance_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.DataPropertyInstance#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DataPropertyInstance
