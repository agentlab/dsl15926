/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.agentlab.dsl15926.tests;

import junit.textui.TestRunner;

import ru.agentlab.dsl15926.Dsl15926Factory;
import ru.agentlab.dsl15926.Pattern;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PatternTest.class);
	}

	/**
	 * Constructs a new Pattern test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Pattern test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Pattern getFixture() {
		return (Pattern)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Dsl15926Factory.eINSTANCE.createPattern());
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

} //PatternTest
