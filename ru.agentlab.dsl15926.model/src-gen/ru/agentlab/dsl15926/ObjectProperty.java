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
 * A representation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.ObjectProperty#getRange <em>Range</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.ObjectProperty#getSuperPropertyOf <em>Super Property Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.ObjectProperty#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.ObjectProperty#getDisjointProperties <em>Disjoint Properties</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.ObjectProperty#getEquivalentProperties <em>Equivalent Properties</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.ObjectProperty#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getObjectProperty()
 * @model
 * @generated
 */
public interface ObjectProperty extends ClassProperty {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.AbstractObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getObjectProperty_Range()
	 * @model
	 * @generated
	 */
	EList<AbstractObject> getRange();

	/**
	 * Returns the value of the '<em><b>Super Property Of</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.ObjectProperty}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.ObjectProperty#getSubPropertyOf <em>Sub Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Property Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Property Of</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getObjectProperty_SuperPropertyOf()
	 * @see ru.agentlab.dsl15926.ObjectProperty#getSubPropertyOf
	 * @model opposite="subPropertyOf"
	 * @generated
	 */
	EList<ObjectProperty> getSuperPropertyOf();

	/**
	 * Returns the value of the '<em><b>Sub Property Of</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.ObjectProperty}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.ObjectProperty#getSuperPropertyOf <em>Super Property Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Property Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Property Of</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getObjectProperty_SubPropertyOf()
	 * @see ru.agentlab.dsl15926.ObjectProperty#getSuperPropertyOf
	 * @model opposite="superPropertyOf"
	 * @generated
	 */
	EList<ObjectProperty> getSubPropertyOf();

	/**
	 * Returns the value of the '<em><b>Disjoint Properties</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.ObjectProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint Properties</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getObjectProperty_DisjointProperties()
	 * @model
	 * @generated
	 */
	EList<ObjectProperty> getDisjointProperties();

	/**
	 * Returns the value of the '<em><b>Equivalent Properties</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.ObjectProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Properties</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getObjectProperty_EquivalentProperties()
	 * @model
	 * @generated
	 */
	EList<ObjectProperty> getEquivalentProperties();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.ObjectPropertyInstance}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.ObjectPropertyInstance#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getObjectProperty_Instances()
	 * @see ru.agentlab.dsl15926.ObjectPropertyInstance#getProperty
	 * @model opposite="property"
	 * @generated
	 */
	EList<ObjectPropertyInstance> getInstances();

} // ObjectProperty
