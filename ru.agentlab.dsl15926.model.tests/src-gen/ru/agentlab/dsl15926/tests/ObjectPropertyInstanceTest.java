/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.agentlab.dsl15926.tests;

import junit.textui.TestRunner;

import ru.agentlab.dsl15926.Dsl15926Factory;
import ru.agentlab.dsl15926.ObjectPropertyInstance;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Object Property Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectPropertyInstanceTest extends PropertyInstanceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectPropertyInstanceTest.class);
	}

	/**
	 * Constructs a new Object Property Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyInstanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Object Property Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ObjectPropertyInstance getFixture() {
		return (ObjectPropertyInstance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dsl15926Factory.eINSTANCE.createObjectPropertyInstance());
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

} //ObjectPropertyInstanceTest
