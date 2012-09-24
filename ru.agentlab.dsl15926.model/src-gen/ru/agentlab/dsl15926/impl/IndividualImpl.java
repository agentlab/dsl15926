/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.agentlab.dsl15926.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.Individual;
import ru.agentlab.dsl15926.Pattern;
import ru.agentlab.dsl15926.PropertyInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.impl.IndividualImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.IndividualImpl#getPropertyValues <em>Property Values</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.IndividualImpl#getPatterns <em>Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndividualImpl extends NamedElementImpl implements Individual {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ru.agentlab.dsl15926.Class> classes;

	/**
	 * The cached value of the '{@link #getPropertyValues() <em>Property Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyInstance> propertyValues;

	/**
	 * The cached value of the '{@link #getPatterns() <em>Patterns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<Pattern> patterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl15926Package.Literals.INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ru.agentlab.dsl15926.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectWithInverseResolvingEList.ManyInverse<ru.agentlab.dsl15926.Class>(ru.agentlab.dsl15926.Class.class, this, Dsl15926Package.INDIVIDUAL__CLASSES, Dsl15926Package.CLASS__INDIVIDUALS);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyInstance> getPropertyValues() {
		if (propertyValues == null) {
			propertyValues = new EObjectContainmentEList.Resolving<PropertyInstance>(PropertyInstance.class, this, Dsl15926Package.INDIVIDUAL__PROPERTY_VALUES);
		}
		return propertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pattern> getPatterns() {
		if (patterns == null) {
			patterns = new EObjectWithInverseResolvingEList.ManyInverse<Pattern>(Pattern.class, this, Dsl15926Package.INDIVIDUAL__PATTERNS, Dsl15926Package.PATTERN__INDIVIDUALS);
		}
		return patterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dsl15926Package.INDIVIDUAL__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
			case Dsl15926Package.INDIVIDUAL__PATTERNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPatterns()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dsl15926Package.INDIVIDUAL__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.INDIVIDUAL__PROPERTY_VALUES:
				return ((InternalEList<?>)getPropertyValues()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.INDIVIDUAL__PATTERNS:
				return ((InternalEList<?>)getPatterns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dsl15926Package.INDIVIDUAL__CLASSES:
				return getClasses();
			case Dsl15926Package.INDIVIDUAL__PROPERTY_VALUES:
				return getPropertyValues();
			case Dsl15926Package.INDIVIDUAL__PATTERNS:
				return getPatterns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Dsl15926Package.INDIVIDUAL__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ru.agentlab.dsl15926.Class>)newValue);
				return;
			case Dsl15926Package.INDIVIDUAL__PROPERTY_VALUES:
				getPropertyValues().clear();
				getPropertyValues().addAll((Collection<? extends PropertyInstance>)newValue);
				return;
			case Dsl15926Package.INDIVIDUAL__PATTERNS:
				getPatterns().clear();
				getPatterns().addAll((Collection<? extends Pattern>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Dsl15926Package.INDIVIDUAL__CLASSES:
				getClasses().clear();
				return;
			case Dsl15926Package.INDIVIDUAL__PROPERTY_VALUES:
				getPropertyValues().clear();
				return;
			case Dsl15926Package.INDIVIDUAL__PATTERNS:
				getPatterns().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Dsl15926Package.INDIVIDUAL__CLASSES:
				return classes != null && !classes.isEmpty();
			case Dsl15926Package.INDIVIDUAL__PROPERTY_VALUES:
				return propertyValues != null && !propertyValues.isEmpty();
			case Dsl15926Package.INDIVIDUAL__PATTERNS:
				return patterns != null && !patterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualImpl
