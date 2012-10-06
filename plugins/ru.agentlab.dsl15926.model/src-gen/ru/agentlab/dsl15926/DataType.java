/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.DataType#getRange <em>Range</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.DataType#getEquivalentProperties <em>Equivalent Properties</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.DataType#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.DataType#getSuperPropertyOf <em>Super Property Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.DataType#getDisjointProperties <em>Disjoint Properties</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.DataType#getData <em>Data</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.DataType#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataType()
 * @model
 * @generated
 */
public interface DataType extends AbstractObject {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.DataRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataType_Range()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<DataRange> getRange();

	/**
	 * Returns the value of the '<em><b>Equivalent Properties</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Properties</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataType_EquivalentProperties()
	 * @model
	 * @generated
	 */
	EList<DataType> getEquivalentProperties();

	/**
	 * Returns the value of the '<em><b>Sub Property Of</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.DataType}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.DataType#getSuperPropertyOf <em>Super Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Property Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Property Of</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataType_SubPropertyOf()
	 * @see ru.agentlab.dsl15926.DataType#getSuperPropertyOf
	 * @model opposite="superPropertyOf"
	 * @generated
	 */
	EList<DataType> getSubPropertyOf();

	/**
	 * Returns the value of the '<em><b>Super Property Of</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.DataType}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.DataType#getSubPropertyOf <em>Sub Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Property Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Property Of</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataType_SuperPropertyOf()
	 * @see ru.agentlab.dsl15926.DataType#getSubPropertyOf
	 * @model opposite="subPropertyOf"
	 * @generated
	 */
	EList<DataType> getSuperPropertyOf();

	/**
	 * Returns the value of the '<em><b>Disjoint Properties</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint Properties</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataType_DisjointProperties()
	 * @model
	 * @generated
	 */
	EList<DataType> getDisjointProperties();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.Data}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Data#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataType_Data()
	 * @see ru.agentlab.dsl15926.Data#getDataType
	 * @model opposite="dataType"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Repository#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(Repository)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataType_Repository()
	 * @see ru.agentlab.dsl15926.Repository#getDataTypes
	 * @model opposite="dataTypes" transient="false"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.DataType#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // DataType
