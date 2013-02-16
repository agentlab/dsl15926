/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Role Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.TemplateRoleInstance#getTemplateRole <em>Template Role</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.TemplateRoleInstance#getPropertyInstance <em>Property Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplateRoleInstance()
 * @model
 * @generated
 */
public interface TemplateRoleInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.TemplateRole#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Role</em>' reference.
	 * @see #setTemplateRole(TemplateRole)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplateRoleInstance_TemplateRole()
	 * @see ru.agentlab.dsl15926.TemplateRole#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	TemplateRole getTemplateRole();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.TemplateRoleInstance#getTemplateRole <em>Template Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Role</em>' reference.
	 * @see #getTemplateRole()
	 * @generated
	 */
	void setTemplateRole(TemplateRole value);

	/**
	 * Returns the value of the '<em><b>Property Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Instance</em>' reference.
	 * @see #setPropertyInstance(Thing)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplateRoleInstance_PropertyInstance()
	 * @model required="true"
	 * @generated
	 */
	Thing getPropertyInstance();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.TemplateRoleInstance#getPropertyInstance <em>Property Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Instance</em>' reference.
	 * @see #getPropertyInstance()
	 * @generated
	 */
	void setPropertyInstance(Thing value);

} // TemplateRoleInstance
