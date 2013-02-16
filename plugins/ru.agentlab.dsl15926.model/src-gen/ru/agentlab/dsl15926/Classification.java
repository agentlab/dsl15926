/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.Classification#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Classification#getClassified <em>Classified</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getClassification()
 * @model
 * @generated
 */
public interface Classification extends EObject {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' reference.
	 * @see #setClassifier(ru.agentlab.dsl15926.Class)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getClassification_Classifier()
	 * @model
	 * @generated
	 */
	ru.agentlab.dsl15926.Class getClassifier();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.Classification#getClassifier <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier</em>' reference.
	 * @see #getClassifier()
	 * @generated
	 */
	void setClassifier(ru.agentlab.dsl15926.Class value);

	/**
	 * Returns the value of the '<em><b>Classified</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classified</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified</em>' reference.
	 * @see #setClassified(Thing)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getClassification_Classified()
	 * @model
	 * @generated
	 */
	Thing getClassified();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.Classification#getClassified <em>Classified</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classified</em>' reference.
	 * @see #getClassified()
	 * @generated
	 */
	void setClassified(Thing value);

} // Classification
