/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.agentlab.dsl15926.tests;

import junit.textui.TestRunner;

import ru.agentlab.dsl15926.Dsl15926Factory;
import ru.agentlab.dsl15926.ObjectProperty;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectPropertyTest extends ClassPropertyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectPropertyTest.class);
	}

	/**
	 * Constructs a new Object Property test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectPropertyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Object Property test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ObjectProperty getFixture() {
		return (ObjectProperty)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dsl15926Factory.eINSTANCE.createObjectProperty());
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

} //ObjectPropertyTest
