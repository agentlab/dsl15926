/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.DataProperty#getRange <em>Range</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.DataProperty#getEquivalentProperties <em>Equivalent Properties</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.DataProperty#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.DataProperty#getSuperPropertyOf <em>Super Property Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.DataProperty#getDisjointProperties <em>Disjoint Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataProperty()
 * @model
 * @generated
 */
public interface DataProperty extends ClassProperty {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.DataRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataProperty_Range()
	 * @model
	 * @generated
	 */
	EList<DataRange> getRange();

	/**
	 * Returns the value of the '<em><b>Equivalent Properties</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Properties</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataProperty_EquivalentProperties()
	 * @model
	 * @generated
	 */
	EList<DataProperty> getEquivalentProperties();

	/**
	 * Returns the value of the '<em><b>Sub Property Of</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.DataProperty}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.DataProperty#getSuperPropertyOf <em>Super Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Property Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Property Of</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataProperty_SubPropertyOf()
	 * @see ru.agentlab.dsl15926.DataProperty#getSuperPropertyOf
	 * @model opposite="superPropertyOf"
	 * @generated
	 */
	EList<DataProperty> getSubPropertyOf();

	/**
	 * Returns the value of the '<em><b>Super Property Of</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.DataProperty}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.DataProperty#getSubPropertyOf <em>Sub Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Property Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Property Of</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataProperty_SuperPropertyOf()
	 * @see ru.agentlab.dsl15926.DataProperty#getSubPropertyOf
	 * @model opposite="subPropertyOf"
	 * @generated
	 */
	EList<DataProperty> getSuperPropertyOf();

	/**
	 * Returns the value of the '<em><b>Disjoint Properties</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint Properties</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getDataProperty_DisjointProperties()
	 * @model
	 * @generated
	 */
	EList<DataProperty> getDisjointProperties();

} // DataProperty
