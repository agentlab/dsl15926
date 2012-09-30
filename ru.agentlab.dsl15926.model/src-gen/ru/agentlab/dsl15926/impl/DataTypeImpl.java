/**
 */
package ru.agentlab.dsl15926.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.agentlab.dsl15926.Data;
import ru.agentlab.dsl15926.DataRange;
import ru.agentlab.dsl15926.DataType;
import ru.agentlab.dsl15926.Dsl15926Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.impl.DataTypeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.DataTypeImpl#getEquivalentProperties <em>Equivalent Properties</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.DataTypeImpl#getSubPropertyOf <em>Sub Property Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.DataTypeImpl#getSuperPropertyOf <em>Super Property Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.DataTypeImpl#getDisjointProperties <em>Disjoint Properties</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.DataTypeImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl extends AbstractObjectImpl implements DataType {
	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRange> range;

	/**
	 * The cached value of the '{@link #getEquivalentProperties() <em>Equivalent Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> equivalentProperties;

	/**
	 * The cached value of the '{@link #getSubPropertyOf() <em>Sub Property Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> subPropertyOf;

	/**
	 * The cached value of the '{@link #getSuperPropertyOf() <em>Super Property Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperPropertyOf()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> superPropertyOf;

	/**
	 * The cached value of the '{@link #getDisjointProperties() <em>Disjoint Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> disjointProperties;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl15926Package.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRange> getRange() {
		if (range == null) {
			range = new EObjectContainmentEList.Resolving<DataRange>(DataRange.class, this, Dsl15926Package.DATA_TYPE__RANGE);
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getEquivalentProperties() {
		if (equivalentProperties == null) {
			equivalentProperties = new EObjectResolvingEList<DataType>(DataType.class, this, Dsl15926Package.DATA_TYPE__EQUIVALENT_PROPERTIES);
		}
		return equivalentProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getSubPropertyOf() {
		if (subPropertyOf == null) {
			subPropertyOf = new EObjectWithInverseResolvingEList.ManyInverse<DataType>(DataType.class, this, Dsl15926Package.DATA_TYPE__SUB_PROPERTY_OF, Dsl15926Package.DATA_TYPE__SUPER_PROPERTY_OF);
		}
		return subPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getSuperPropertyOf() {
		if (superPropertyOf == null) {
			superPropertyOf = new EObjectWithInverseResolvingEList.ManyInverse<DataType>(DataType.class, this, Dsl15926Package.DATA_TYPE__SUPER_PROPERTY_OF, Dsl15926Package.DATA_TYPE__SUB_PROPERTY_OF);
		}
		return superPropertyOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDisjointProperties() {
		if (disjointProperties == null) {
			disjointProperties = new EObjectResolvingEList<DataType>(DataType.class, this, Dsl15926Package.DATA_TYPE__DISJOINT_PROPERTIES);
		}
		return disjointProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectWithInverseResolvingEList<Data>(Data.class, this, Dsl15926Package.DATA_TYPE__DATA, Dsl15926Package.DATA__DATA_TYPE);
		}
		return data;
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
			case Dsl15926Package.DATA_TYPE__SUB_PROPERTY_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubPropertyOf()).basicAdd(otherEnd, msgs);
			case Dsl15926Package.DATA_TYPE__SUPER_PROPERTY_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperPropertyOf()).basicAdd(otherEnd, msgs);
			case Dsl15926Package.DATA_TYPE__DATA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getData()).basicAdd(otherEnd, msgs);
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
			case Dsl15926Package.DATA_TYPE__RANGE:
				return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.DATA_TYPE__SUB_PROPERTY_OF:
				return ((InternalEList<?>)getSubPropertyOf()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.DATA_TYPE__SUPER_PROPERTY_OF:
				return ((InternalEList<?>)getSuperPropertyOf()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.DATA_TYPE__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case Dsl15926Package.DATA_TYPE__RANGE:
				return getRange();
			case Dsl15926Package.DATA_TYPE__EQUIVALENT_PROPERTIES:
				return getEquivalentProperties();
			case Dsl15926Package.DATA_TYPE__SUB_PROPERTY_OF:
				return getSubPropertyOf();
			case Dsl15926Package.DATA_TYPE__SUPER_PROPERTY_OF:
				return getSuperPropertyOf();
			case Dsl15926Package.DATA_TYPE__DISJOINT_PROPERTIES:
				return getDisjointProperties();
			case Dsl15926Package.DATA_TYPE__DATA:
				return getData();
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
			case Dsl15926Package.DATA_TYPE__RANGE:
				getRange().clear();
				getRange().addAll((Collection<? extends DataRange>)newValue);
				return;
			case Dsl15926Package.DATA_TYPE__EQUIVALENT_PROPERTIES:
				getEquivalentProperties().clear();
				getEquivalentProperties().addAll((Collection<? extends DataType>)newValue);
				return;
			case Dsl15926Package.DATA_TYPE__SUB_PROPERTY_OF:
				getSubPropertyOf().clear();
				getSubPropertyOf().addAll((Collection<? extends DataType>)newValue);
				return;
			case Dsl15926Package.DATA_TYPE__SUPER_PROPERTY_OF:
				getSuperPropertyOf().clear();
				getSuperPropertyOf().addAll((Collection<? extends DataType>)newValue);
				return;
			case Dsl15926Package.DATA_TYPE__DISJOINT_PROPERTIES:
				getDisjointProperties().clear();
				getDisjointProperties().addAll((Collection<? extends DataType>)newValue);
				return;
			case Dsl15926Package.DATA_TYPE__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
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
			case Dsl15926Package.DATA_TYPE__RANGE:
				getRange().clear();
				return;
			case Dsl15926Package.DATA_TYPE__EQUIVALENT_PROPERTIES:
				getEquivalentProperties().clear();
				return;
			case Dsl15926Package.DATA_TYPE__SUB_PROPERTY_OF:
				getSubPropertyOf().clear();
				return;
			case Dsl15926Package.DATA_TYPE__SUPER_PROPERTY_OF:
				getSuperPropertyOf().clear();
				return;
			case Dsl15926Package.DATA_TYPE__DISJOINT_PROPERTIES:
				getDisjointProperties().clear();
				return;
			case Dsl15926Package.DATA_TYPE__DATA:
				getData().clear();
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
			case Dsl15926Package.DATA_TYPE__RANGE:
				return range != null && !range.isEmpty();
			case Dsl15926Package.DATA_TYPE__EQUIVALENT_PROPERTIES:
				return equivalentProperties != null && !equivalentProperties.isEmpty();
			case Dsl15926Package.DATA_TYPE__SUB_PROPERTY_OF:
				return subPropertyOf != null && !subPropertyOf.isEmpty();
			case Dsl15926Package.DATA_TYPE__SUPER_PROPERTY_OF:
				return superPropertyOf != null && !superPropertyOf.isEmpty();
			case Dsl15926Package.DATA_TYPE__DISJOINT_PROPERTIES:
				return disjointProperties != null && !disjointProperties.isEmpty();
			case Dsl15926Package.DATA_TYPE__DATA:
				return data != null && !data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataTypeImpl
