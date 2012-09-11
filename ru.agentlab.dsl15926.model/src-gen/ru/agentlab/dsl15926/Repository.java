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
 *   <li>{@link ru.agentlab.dsl15926.Repository#getObjectProperties <em>Object Properties</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getDataPropereties <em>Data Propereties</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getTemplates <em>Templates</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getDataRanges <em>Data Ranges</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getUrl <em>Url</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getImports <em>Imports</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getIndividuals <em>Individuals</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Repository#getTemplateInstances <em>Template Instances</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_Classes()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ru.agentlab.dsl15926.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Object Properties</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.ObjectProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Properties</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_ObjectProperties()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ObjectProperty> getObjectProperties();

	/**
	 * Returns the value of the '<em><b>Data Propereties</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Propereties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Propereties</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_DataPropereties()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<DataProperty> getDataPropereties();

	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.Template}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_Templates()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Template> getTemplates();

	/**
	 * Returns the value of the '<em><b>Data Ranges</b></em>' containment reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.DataRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Ranges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Ranges</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_DataRanges()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<DataRange> getDataRanges();

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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Individuals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individuals</em>' containment reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_Individuals()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Individual> getIndividuals();

	/**
	 * Returns the value of the '<em><b>Template Instances</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.TemplateInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Instances</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getRepository_TemplateInstances()
	 * @model
	 * @generated
	 */
	EList<TemplateInstance> getTemplateInstances();

} // Repository
