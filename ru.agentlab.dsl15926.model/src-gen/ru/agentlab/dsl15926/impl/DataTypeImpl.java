/**
 */
package ru.agentlab.dsl15926.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.agentlab.dsl15926.Data;
import ru.agentlab.dsl15926.DataRange;
import ru.agentlab.dsl15926.DataType;
import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.Repository;

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
 *   <li>{@link ru.agentlab.dsl15926.impl.DataTypeImpl#getRepository <em>Repository</em>}</li>
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
	public Repository getRepository() {
		if (eContainerFeatureID() != Dsl15926Package.DATA_TYPE__REPOSITORY) return null;
		return (Repository)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository basicGetRepository() {
		if (eContainerFeatureID() != Dsl15926Package.DATA_TYPE__REPOSITORY) return null;
		return (Repository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRepository, Dsl15926Package.DATA_TYPE__REPOSITORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(Repository newRepository) {
		if (newRepository != eInternalContainer() || (eContainerFeatureID() != Dsl15926Package.DATA_TYPE__REPOSITORY && newRepository != null)) {
			if (EcoreUtil.isAncestor(this, newRepository))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, Dsl15926Package.REPOSITORY__DATA_TYPES, Repository.class, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl15926Package.DATA_TYPE__REPOSITORY, newRepository, newRepository));
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
			case Dsl15926Package.DATA_TYPE__REPOSITORY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRepository((Repository)otherEnd, msgs);
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
			case Dsl15926Package.DATA_TYPE__REPOSITORY:
				return basicSetRepository(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Dsl15926Package.DATA_TYPE__REPOSITORY:
				return eInternalContainer().eInverseRemove(this, Dsl15926Package.REPOSITORY__DATA_TYPES, Repository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case Dsl15926Package.DATA_TYPE__REPOSITORY:
				if (resolve) return getRepository();
				return basicGetRepository();
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
			case Dsl15926Package.DATA_TYPE__REPOSITORY:
				setRepository((Repository)newValue);
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
			case Dsl15926Package.DATA_TYPE__REPOSITORY:
				setRepository((Repository)null);
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
			case Dsl15926Package.DATA_TYPE__REPOSITORY:
				return basicGetRepository() != null;
		}
		return super.eIsSet(featureID);
	}

} //DataTypeImpl
