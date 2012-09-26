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
 * A representation of the model object '<em><b>Template Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.TemplateRole#getProperty <em>Property</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.TemplateRole#getQualifiedCardinality <em>Qualified Cardinality</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.TemplateRole#getInstances <em>Instances</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.TemplateRole#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplateRole()
 * @model
 * @generated
 */
public interface TemplateRole extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(ClassProperty)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplateRole_Property()
	 * @model required="true"
	 * @generated
	 */
	ClassProperty getProperty();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.TemplateRole#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(ClassProperty value);

	/**
	 * Returns the value of the '<em><b>Qualified Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Cardinality</em>' attribute.
	 * @see #setQualifiedCardinality(String)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplateRole_QualifiedCardinality()
	 * @model
	 * @generated
	 */
	String getQualifiedCardinality();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.TemplateRole#getQualifiedCardinality <em>Qualified Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Cardinality</em>' attribute.
	 * @see #getQualifiedCardinality()
	 * @generated
	 */
	void setQualifiedCardinality(String value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.TemplateRoleInstance}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.TemplateRoleInstance#getTemplateRole <em>Template Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplateRole_Instances()
	 * @see ru.agentlab.dsl15926.TemplateRoleInstance#getTemplateRole
	 * @model opposite="templateRole"
	 * @generated
	 */
	EList<TemplateRoleInstance> getInstances();

	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' reference.
	 * @see #setEntityType(Thing)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getTemplateRole_EntityType()
	 * @model
	 * @generated
	 */
	Thing getEntityType();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.TemplateRole#getEntityType <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' reference.
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(Thing value);

} // TemplateRole
