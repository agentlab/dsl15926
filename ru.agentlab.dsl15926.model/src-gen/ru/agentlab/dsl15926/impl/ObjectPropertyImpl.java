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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.agentlab.dsl15926.AbstractObject;
import ru.agentlab.dsl15926.ClassExpression;
import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.ObjectProperty;
import ru.agentlab.dsl15926.ObjectPropertyInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.impl.ObjectPropertyImpl#getRange <em>Range</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.ObjectPropertyImpl#getSuperPropertyOf <em>Super Property Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.ObjectPropertyImpl#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.ObjectPropertyImpl#getDisjointProperties <em>Disjoint Properties</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.ObjectPropertyImpl#getEquivalentProperties <em>Equivalent Properties</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.ObjectPropertyImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectPropertyImpl extends ClassPropertyImpl implements ObjectProperty {
	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractObject> range;

	/**
	 * The cached value of the '{@link #getSuperPropertyOf() <em>Super Property Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectProperty> superPropertyOf;

	/**
	 * The cached value of the '{@link #getSubPropertyOf() <em>Sub Property Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectProperty> subPropertyOf;

	/**
	 * The cached value of the '{@link #getDisjointProperties() <em>Disjoint Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectProperty> disjointProperties;

	/**
	 * The cached value of the '{@link #getEquivalentProperties() <em>Equivalent Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectProperty> equivalentProperties;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectPropertyInstance> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl15926Package.Literals.OBJECT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractObject> getRange() {
		if (range == null) {
			range = new EObjectResolvingEList<AbstractObject>(AbstractObject.class, this, Dsl15926Package.OBJECT_PROPERTY__RANGE);
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectProperty> getSuperPropertyOf() {
		if (superPropertyOf == null) {
			superPropertyOf = new EObjectWithInverseResolvingEList.ManyInverse<ObjectProperty>(ObjectProperty.class, this, Dsl15926Package.OBJECT_PROPERTY__SUPER_PROPERTY_OF, Dsl15926Package.OBJECT_PROPERTY__SUB_PROPERTY_OF);
		}
		return superPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectProperty> getSubPropertyOf() {
		if (subPropertyOf == null) {
			subPropertyOf = new EObjectWithInverseResolvingEList.ManyInverse<ObjectProperty>(ObjectProperty.class, this, Dsl15926Package.OBJECT_PROPERTY__SUB_PROPERTY_OF, Dsl15926Package.OBJECT_PROPERTY__SUPER_PROPERTY_OF);
		}
		return subPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectProperty> getDisjointProperties() {
		if (disjointProperties == null) {
			disjointProperties = new EObjectResolvingEList<ObjectProperty>(ObjectProperty.class, this, Dsl15926Package.OBJECT_PROPERTY__DISJOINT_PROPERTIES);
		}
		return disjointProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectProperty> getEquivalentProperties() {
		if (equivalentProperties == null) {
			equivalentProperties = new EObjectResolvingEList<ObjectProperty>(ObjectProperty.class, this, Dsl15926Package.OBJECT_PROPERTY__EQUIVALENT_PROPERTIES);
		}
		return equivalentProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectPropertyInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<ObjectPropertyInstance>(ObjectPropertyInstance.class, this, Dsl15926Package.OBJECT_PROPERTY__INSTANCES, Dsl15926Package.OBJECT_PROPERTY_INSTANCE__PROPERTY);
		}
		return instances;
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
			case Dsl15926Package.OBJECT_PROPERTY__SUPER_PROPERTY_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperPropertyOf()).basicAdd(otherEnd, msgs);
			case Dsl15926Package.OBJECT_PROPERTY__SUB_PROPERTY_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubPropertyOf()).basicAdd(otherEnd, msgs);
			case Dsl15926Package.OBJECT_PROPERTY__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
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
			case Dsl15926Package.OBJECT_PROPERTY__SUPER_PROPERTY_OF:
				return ((InternalEList<?>)getSuperPropertyOf()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.OBJECT_PROPERTY__SUB_PROPERTY_OF:
				return ((InternalEList<?>)getSubPropertyOf()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.OBJECT_PROPERTY__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
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
			case Dsl15926Package.OBJECT_PROPERTY__RANGE:
				return getRange();
			case Dsl15926Package.OBJECT_PROPERTY__SUPER_PROPERTY_OF:
				return getSuperPropertyOf();
			case Dsl15926Package.OBJECT_PROPERTY__SUB_PROPERTY_OF:
				return getSubPropertyOf();
			case Dsl15926Package.OBJECT_PROPERTY__DISJOINT_PROPERTIES:
				return getDisjointProperties();
			case Dsl15926Package.OBJECT_PROPERTY__EQUIVALENT_PROPERTIES:
				return getEquivalentProperties();
			case Dsl15926Package.OBJECT_PROPERTY__INSTANCES:
				return getInstances();
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
			case Dsl15926Package.OBJECT_PROPERTY__RANGE:
				getRange().clear();
				getRange().addAll((Collection<? extends AbstractObject>)newValue);
				return;
			case Dsl15926Package.OBJECT_PROPERTY__SUPER_PROPERTY_OF:
				getSuperPropertyOf().clear();
				getSuperPropertyOf().addAll((Collection<? extends ObjectProperty>)newValue);
				return;
			case Dsl15926Package.OBJECT_PROPERTY__SUB_PROPERTY_OF:
				getSubPropertyOf().clear();
				getSubPropertyOf().addAll((Collection<? extends ObjectProperty>)newValue);
				return;
			case Dsl15926Package.OBJECT_PROPERTY__DISJOINT_PROPERTIES:
				getDisjointProperties().clear();
				getDisjointProperties().addAll((Collection<? extends ObjectProperty>)newValue);
				return;
			case Dsl15926Package.OBJECT_PROPERTY__EQUIVALENT_PROPERTIES:
				getEquivalentProperties().clear();
				getEquivalentProperties().addAll((Collection<? extends ObjectProperty>)newValue);
				return;
			case Dsl15926Package.OBJECT_PROPERTY__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends ObjectPropertyInstance>)newValue);
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
			case Dsl15926Package.OBJECT_PROPERTY__RANGE:
				getRange().clear();
				return;
			case Dsl15926Package.OBJECT_PROPERTY__SUPER_PROPERTY_OF:
				getSuperPropertyOf().clear();
				return;
			case Dsl15926Package.OBJECT_PROPERTY__SUB_PROPERTY_OF:
				getSubPropertyOf().clear();
				return;
			case Dsl15926Package.OBJECT_PROPERTY__DISJOINT_PROPERTIES:
				getDisjointProperties().clear();
				return;
			case Dsl15926Package.OBJECT_PROPERTY__EQUIVALENT_PROPERTIES:
				getEquivalentProperties().clear();
				return;
			case Dsl15926Package.OBJECT_PROPERTY__INSTANCES:
				getInstances().clear();
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
			case Dsl15926Package.OBJECT_PROPERTY__RANGE:
				return range != null && !range.isEmpty();
			case Dsl15926Package.OBJECT_PROPERTY__SUPER_PROPERTY_OF:
				return superPropertyOf != null && !superPropertyOf.isEmpty();
			case Dsl15926Package.OBJECT_PROPERTY__SUB_PROPERTY_OF:
				return subPropertyOf != null && !subPropertyOf.isEmpty();
			case Dsl15926Package.OBJECT_PROPERTY__DISJOINT_PROPERTIES:
				return disjointProperties != null && !disjointProperties.isEmpty();
			case Dsl15926Package.OBJECT_PROPERTY__EQUIVALENT_PROPERTIES:
				return equivalentProperties != null && !equivalentProperties.isEmpty();
			case Dsl15926Package.OBJECT_PROPERTY__INSTANCES:
				return instances != null && !instances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectPropertyImpl
