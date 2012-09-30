/**
 */
package ru.agentlab.dsl15926;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.Data#getDataType <em>Data Type</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Data#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getData()
 * @model
 * @generated
 */
public interface Data extends Individual {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.DataType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(DataType)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getData_DataType()
	 * @see ru.agentlab.dsl15926.DataType#getData
	 * @model opposite="data"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.Data#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

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
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getData_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.Data#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Data
