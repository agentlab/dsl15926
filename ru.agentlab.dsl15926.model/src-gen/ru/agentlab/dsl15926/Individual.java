/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.Individual#getPatterns <em>Patterns</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.Individual#getRepository <em>Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @see ru.agentlab.dsl15926.Dsl15926Package#getIndividual()
 * @model
 * @generated
 */
public interface Individual extends Thing {
	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' reference list.
	 * The list contents are of type {@link ru.agentlab.dsl15926.Pattern}.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Pattern#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patterns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' reference list.
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getIndividual_Patterns()
	 * @see ru.agentlab.dsl15926.Pattern#getIndividuals
	 * @model opposite="individuals"
	 * @generated
	 */
	EList<Pattern> getPatterns();

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ru.agentlab.dsl15926.Repository#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' container reference.
	 * @see #setRepository(Repository)
	 * @see ru.agentlab.dsl15926.Dsl15926Package#getIndividual_Repository()
	 * @see ru.agentlab.dsl15926.Repository#getIndividuals
	 * @model opposite="individuals" transient="false"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link ru.agentlab.dsl15926.Individual#getRepository <em>Repository</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' container reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

} // Individual
