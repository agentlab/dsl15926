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
 * A representation of the model object '<em><b>Class Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.ClassExpression#getSubClassOf <em>Sub Class Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.ClassExpression#getSuperClassOf <em>Super Class Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.ClassExpression#getDisjointClasses <em>Disjoint Classes</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.ClassExpression#getEquivalentClasses <em>Equivalent Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getClassExpression()
 * @model abstract="true"
 * @generated
 */
public interface ClassExpression extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Class Of</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.ClassExpression}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.ClassExpression#getSuperClassOf <em>Super Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Class Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Class Of</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getClassExpression_SubClassOf()
	 * @see ru.agentlab.dsl15926.ClassExpression#getSuperClassOf
	 * @model opposite="superClassOf"
	 * @generated
	 */
	EList<ClassExpression> getSubClassOf();

	/**
	 * Returns the value of the '<em><b>Super Class Of</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.ClassExpression}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.ClassExpression#getSubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class Of</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getClassExpression_SuperClassOf()
	 * @see ru.agentlab.dsl15926.ClassExpression#getSubClassOf
	 * @model opposite="subClassOf"
	 * @generated
	 */
	EList<ClassExpression> getSuperClassOf();

	/**
	 * Returns the value of the '<em><b>Disjoint Classes</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disjoint Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disjoint Classes</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getClassExpression_DisjointClasses()
	 * @model
	 * @generated
	 */
	EList<ClassExpression> getDisjointClasses();

	/**
	 * Returns the value of the '<em><b>Equivalent Classes</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.ClassExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equivalent Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equivalent Classes</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getClassExpression_EquivalentClasses()
	 * @model
	 * @generated
	 */
	EList<ClassExpression> getEquivalentClasses();

} // ClassExpression
