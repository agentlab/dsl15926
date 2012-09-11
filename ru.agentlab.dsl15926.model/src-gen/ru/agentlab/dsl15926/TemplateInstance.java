/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.TemplateInstance#getTemplates <em>Templates</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplateInstance()
 * @model
 * @generated
 */
public interface TemplateInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Templates</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Template#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' reference.
	 * @see #setTemplates(Template)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplateInstance_Templates()
	 * @see ru.agentlab.dsl15926.Template#getInstances
	 * @model opposite="instances" required="true"
	 * @generated
	 */
	Template getTemplates();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.TemplateInstance#getTemplates <em>Templates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Templates</em>' reference.
	 * @see #getTemplates()
	 * @generated
	 */
	void setTemplates(Template value);

} // TemplateInstance
