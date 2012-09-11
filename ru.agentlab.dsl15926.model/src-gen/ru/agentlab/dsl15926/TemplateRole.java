/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.ecore.EObject;

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

} // TemplateRole
