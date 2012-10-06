/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getClasses <em>Classes</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getTemplates <em>Templates</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getUrl <em>Url</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getImports <em>Imports</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getIndividuals <em>Individuals</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getTemplateInstances <em>Template Instances</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository()
 * @model
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.Class}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Class#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_Classes()
	 * @see ru.agentlab.dsl15926.Class#getRepository
	 * @model opposite="repository" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ru.agentlab.dsl15926.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.Template}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Template#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_Templates()
	 * @see ru.agentlab.dsl15926.Template#getRepository
	 * @model opposite="repository" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Template> getTemplates();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.Repository#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_Imports()
	 * @model
	 * @generated
	 */
	EList<String> getImports();

	/**
	 * Returns the value of the '<em><b>Individuals</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.Individual}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Individual#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individuals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individuals</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_Individuals()
	 * @see ru.agentlab.dsl15926.Individual#getRepository
	 * @model opposite="repository" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Individual> getIndividuals();

	/**
	 * Returns the value of the '<em><b>Template Instances</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.TemplateInstance}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.TemplateInstance#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Instances</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_TemplateInstances()
	 * @see ru.agentlab.dsl15926.TemplateInstance#getRepository
	 * @model opposite="repository" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<TemplateInstance> getTemplateInstances();

	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.Pattern}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Pattern#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_Patterns()
	 * @see ru.agentlab.dsl15926.Pattern#getRepository
	 * @model opposite="repository" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Pattern> getPatterns();

} // Repository
