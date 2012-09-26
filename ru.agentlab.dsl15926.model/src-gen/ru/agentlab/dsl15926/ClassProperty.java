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
 * A representation of the model object '<em><b>Class Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.ClassProperty#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getClassProperty()
 * @model abstract="true"
 * @generated
 */
public interface ClassProperty extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.AbstractObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getClassProperty_Domain()
	 * @model
	 * @generated
	 */
	EList<AbstractObject> getDomain();

} // ClassProperty
