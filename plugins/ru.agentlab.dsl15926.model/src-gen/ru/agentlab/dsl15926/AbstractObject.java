/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.AbstractObject#getSubClassOf <em>Sub Class Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.AbstractObject#getSuperClassOf <em>Super Class Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.AbstractObject#getDisjointClasses <em>Disjoint Classes</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.AbstractObject#getEquivalentClasses <em>Equivalent Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getAbstractObject()
 * @model abstract="true"
 * @generated
 */
public interface AbstractObject extends Thing {
	/**
	 * Returns the value of the '<em><b>Sub Class Of</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.AbstractObject}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.AbstractObject#getSuperClassOf <em>Super Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Class Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class Of</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getAbstractObject_SubClassOf()
	 * @see ru.agentlab.dsl15926.AbstractObject#getSuperClassOf
	 * @model opposite="superClassOf"
	 * @generated
	 */
	EList<AbstractObject> getSubClassOf();

	/**
	 * Returns the value of the '<em><b>Super Class Of</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.AbstractObject}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.AbstractObject#getSubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class Of</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getAbstractObject_SuperClassOf()
	 * @see ru.agentlab.dsl15926.AbstractObject#getSubClassOf
	 * @model opposite="subClassOf"
	 * @generated
	 */
	EList<AbstractObject> getSuperClassOf();

	/**
	 * Returns the value of the '<em><b>Disjoint Classes</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.AbstractObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint Classes</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getAbstractObject_DisjointClasses()
	 * @model
	 * @generated
	 */
	EList<AbstractObject> getDisjointClasses();

	/**
	 * Returns the value of the '<em><b>Equivalent Classes</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.AbstractObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Classes</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getAbstractObject_EquivalentClasses()
	 * @model
	 * @generated
	 */
	EList<AbstractObject> getEquivalentClasses();

} // AbstractObject
