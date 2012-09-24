/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.agentlab.dsl15926.tests;

import junit.textui.TestRunner;

import ru.agentlab.dsl15926.DataProperty;
import ru.agentlab.dsl15926.Dsl15926Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPropertyTest extends ClassPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataPropertyTest.class);
	}

	/**
	 * Constructs a new Data Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataProperty getFixture() {
		return (DataProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dsl15926Factory.eINSTANCE.createDataProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DataPropertyTest
