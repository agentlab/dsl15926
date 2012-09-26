/**
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
import ru.agentlab.dsl15926.Dsl15926Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.impl.AbstractObjectImpl#getSubClassOf <em>Sub Class Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.AbstractObjectImpl#getSuperClassOf <em>Super Class Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.AbstractObjectImpl#getDisjointClasses <em>Disjoint Classes</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.AbstractObjectImpl#getEquivalentClasses <em>Equivalent Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractObjectImpl extends ThingImpl implements AbstractObject {
	/**
	 * The cached value of the '{@link #getSubClassOf() <em>Sub Class Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassOf()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractObject> subClassOf;

	/**
	 * The cached value of the '{@link #getSuperClassOf() <em>Super Class Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClassOf()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractObject> superClassOf;

	/**
	 * The cached value of the '{@link #getDisjointClasses() <em>Disjoint Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractObject> disjointClasses;

	/**
	 * The cached value of the '{@link #getEquivalentClasses() <em>Equivalent Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractObject> equivalentClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl15926Package.Literals.ABSTRACT_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractObject> getSubClassOf() {
		if (subClassOf == null) {
			subClassOf = new EObjectWithInverseResolvingEList.ManyInverse<AbstractObject>(AbstractObject.class, this, Dsl15926Package.ABSTRACT_OBJECT__SUB_CLASS_OF, Dsl15926Package.ABSTRACT_OBJECT__SUPER_CLASS_OF);
		}
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractObject> getSuperClassOf() {
		if (superClassOf == null) {
			superClassOf = new EObjectWithInverseResolvingEList.ManyInverse<AbstractObject>(AbstractObject.class, this, Dsl15926Package.ABSTRACT_OBJECT__SUPER_CLASS_OF, Dsl15926Package.ABSTRACT_OBJECT__SUB_CLASS_OF);
		}
		return superClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractObject> getDisjointClasses() {
		if (disjointClasses == null) {
			disjointClasses = new EObjectResolvingEList<AbstractObject>(AbstractObject.class, this, Dsl15926Package.ABSTRACT_OBJECT__DISJOINT_CLASSES);
		}
		return disjointClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractObject> getEquivalentClasses() {
		if (equivalentClasses == null) {
			equivalentClasses = new EObjectResolvingEList<AbstractObject>(AbstractObject.class, this, Dsl15926Package.ABSTRACT_OBJECT__EQUIVALENT_CLASSES);
		}
		return equivalentClasses;
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
			case Dsl15926Package.ABSTRACT_OBJECT__SUB_CLASS_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubClassOf()).basicAdd(otherEnd, msgs);
			case Dsl15926Package.ABSTRACT_OBJECT__SUPER_CLASS_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperClassOf()).basicAdd(otherEnd, msgs);
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
			case Dsl15926Package.ABSTRACT_OBJECT__SUB_CLASS_OF:
				return ((InternalEList<?>)getSubClassOf()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.ABSTRACT_OBJECT__SUPER_CLASS_OF:
				return ((InternalEList<?>)getSuperClassOf()).basicRemove(otherEnd, msgs);
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
			case Dsl15926Package.ABSTRACT_OBJECT__SUB_CLASS_OF:
				return getSubClassOf();
			case Dsl15926Package.ABSTRACT_OBJECT__SUPER_CLASS_OF:
				return getSuperClassOf();
			case Dsl15926Package.ABSTRACT_OBJECT__DISJOINT_CLASSES:
				return getDisjointClasses();
			case Dsl15926Package.ABSTRACT_OBJECT__EQUIVALENT_CLASSES:
				return getEquivalentClasses();
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
			case Dsl15926Package.ABSTRACT_OBJECT__SUB_CLASS_OF:
				getSubClassOf().clear();
				getSubClassOf().addAll((Collection<? extends AbstractObject>)newValue);
				return;
			case Dsl15926Package.ABSTRACT_OBJECT__SUPER_CLASS_OF:
				getSuperClassOf().clear();
				getSuperClassOf().addAll((Collection<? extends AbstractObject>)newValue);
				return;
			case Dsl15926Package.ABSTRACT_OBJECT__DISJOINT_CLASSES:
				getDisjointClasses().clear();
				getDisjointClasses().addAll((Collection<? extends AbstractObject>)newValue);
				return;
			case Dsl15926Package.ABSTRACT_OBJECT__EQUIVALENT_CLASSES:
				getEquivalentClasses().clear();
				getEquivalentClasses().addAll((Collection<? extends AbstractObject>)newValue);
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
			case Dsl15926Package.ABSTRACT_OBJECT__SUB_CLASS_OF:
				getSubClassOf().clear();
				return;
			case Dsl15926Package.ABSTRACT_OBJECT__SUPER_CLASS_OF:
				getSuperClassOf().clear();
				return;
			case Dsl15926Package.ABSTRACT_OBJECT__DISJOINT_CLASSES:
				getDisjointClasses().clear();
				return;
			case Dsl15926Package.ABSTRACT_OBJECT__EQUIVALENT_CLASSES:
				getEquivalentClasses().clear();
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
			case Dsl15926Package.ABSTRACT_OBJECT__SUB_CLASS_OF:
				return subClassOf != null && !subClassOf.isEmpty();
			case Dsl15926Package.ABSTRACT_OBJECT__SUPER_CLASS_OF:
				return superClassOf != null && !superClassOf.isEmpty();
			case Dsl15926Package.ABSTRACT_OBJECT__DISJOINT_CLASSES:
				return disjointClasses != null && !disjointClasses.isEmpty();
			case Dsl15926Package.ABSTRACT_OBJECT__EQUIVALENT_CLASSES:
				return equivalentClasses != null && !equivalentClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractObjectImpl
