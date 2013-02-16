/**
 */
package ru.agentlab.dsl15926.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ru.agentlab.dsl15926.AbstractObject;
import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.impl.SpecializationImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.SpecializationImpl#getSubClass <em>Sub Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecializationImpl extends EObjectImpl implements Specialization {
	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected AbstractObject superClass;

	/**
	 * The cached value of the '{@link #getSubClass() <em>Sub Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClass()
	 * @generated
	 * @ordered
	 */
	protected AbstractObject subClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl15926Package.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractObject getSuperClass() {
		if (superClass != null && superClass.eIsProxy()) {
			InternalEObject oldSuperClass = (InternalEObject)superClass;
			superClass = (AbstractObject)eResolveProxy(oldSuperClass);
			if (superClass != oldSuperClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl15926Package.SPECIALIZATION__SUPER_CLASS, oldSuperClass, superClass));
			}
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractObject basicGetSuperClass() {
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClass(AbstractObject newSuperClass) {
		AbstractObject oldSuperClass = superClass;
		superClass = newSuperClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl15926Package.SPECIALIZATION__SUPER_CLASS, oldSuperClass, superClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractObject getSubClass() {
		if (subClass != null && subClass.eIsProxy()) {
			InternalEObject oldSubClass = (InternalEObject)subClass;
			subClass = (AbstractObject)eResolveProxy(oldSubClass);
			if (subClass != oldSubClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl15926Package.SPECIALIZATION__SUB_CLASS, oldSubClass, subClass));
			}
		}
		return subClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractObject basicGetSubClass() {
		return subClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubClass(AbstractObject newSubClass) {
		AbstractObject oldSubClass = subClass;
		subClass = newSubClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl15926Package.SPECIALIZATION__SUB_CLASS, oldSubClass, subClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dsl15926Package.SPECIALIZATION__SUPER_CLASS:
				if (resolve) return getSuperClass();
				return basicGetSuperClass();
			case Dsl15926Package.SPECIALIZATION__SUB_CLASS:
				if (resolve) return getSubClass();
				return basicGetSubClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Dsl15926Package.SPECIALIZATION__SUPER_CLASS:
				setSuperClass((AbstractObject)newValue);
				return;
			case Dsl15926Package.SPECIALIZATION__SUB_CLASS:
				setSubClass((AbstractObject)newValue);
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
			case Dsl15926Package.SPECIALIZATION__SUPER_CLASS:
				setSuperClass((AbstractObject)null);
				return;
			case Dsl15926Package.SPECIALIZATION__SUB_CLASS:
				setSubClass((AbstractObject)null);
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
			case Dsl15926Package.SPECIALIZATION__SUPER_CLASS:
				return superClass != null;
			case Dsl15926Package.SPECIALIZATION__SUB_CLASS:
				return subClass != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecializationImpl
