/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.TemplateInstance#getTemplate <em>Template</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.TemplateInstance#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplateInstance()
 * @model
 * @generated
 */
public interface TemplateInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Template#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(Template)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplateInstance_Template()
	 * @see ru.agentlab.dsl15926.Template#getInstances
	 * @model opposite="instances"
	 * @generated
	 */
	Template getTemplate();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.TemplateInstance#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.TemplateRoleInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplateInstance_Roles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<TemplateRoleInstance> getRoles();

} // TemplateInstance
