/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.Template#getRoles <em>Roles</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Template#getInstances <em>Instances</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Template#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplate()
 * @model
 * @generated
 */
public interface Template extends AbstractObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.TemplateRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplate_Roles()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<TemplateRole> getRoles();

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.TemplateInstance}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.TemplateInstance#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplate_Instances()
	 * @see ru.agentlab.dsl15926.TemplateInstance#getTemplate
	 * @model opposite="template"
	 * @generated
	 */
	EList<TemplateInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Repository#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(Repository)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplate_Repository()
	 * @see ru.agentlab.dsl15926.Repository#getTemplates
	 * @model opposite="templates" transient="false"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.Template#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // Template
