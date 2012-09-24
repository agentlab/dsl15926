/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.agentlab.dsl15926.tests;

import junit.textui.TestRunner;

import ru.agentlab.dsl15926.DataPropertyInstance;
import ru.agentlab.dsl15926.Dsl15926Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Property Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPropertyInstanceTest extends PropertyInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataPropertyInstanceTest.class);
	}

	/**
	 * Constructs a new Data Property Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPropertyInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Property Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataPropertyInstance getFixture() {
		return (DataPropertyInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dsl15926Factory.eINSTANCE.createDataPropertyInstance());
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

} //DataPropertyInstanceTest
