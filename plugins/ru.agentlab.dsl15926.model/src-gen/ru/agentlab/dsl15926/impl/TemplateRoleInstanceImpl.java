/**
 */
package ru.agentlab.dsl15926.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.TemplateRole;
import ru.agentlab.dsl15926.TemplateRoleInstance;
import ru.agentlab.dsl15926.Thing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Role Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.impl.TemplateRoleInstanceImpl#getTemplateRole <em>Template Role</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.TemplateRoleInstanceImpl#getPropertyInstance <em>Property Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateRoleInstanceImpl extends EObjectImpl implements TemplateRoleInstance {
	/**
	 * The cached value of the '{@link #getTemplateRole() <em>Template Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateRole()
	 * @generated
	 * @ordered
	 */
	protected TemplateRole templateRole;

	/**
	 * The cached value of the '{@link #getPropertyInstance() <em>Property Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyInstance()
	 * @generated
	 * @ordered
	 */
	protected Thing propertyInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateRoleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl15926Package.Literals.TEMPLATE_ROLE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateRole getTemplateRole() {
		if (templateRole != null && templateRole.eIsProxy()) {
			InternalEObject oldTemplateRole = (InternalEObject)templateRole;
			templateRole = (TemplateRole)eResolveProxy(oldTemplateRole);
			if (templateRole != oldTemplateRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl15926Package.TEMPLATE_ROLE_INSTANCE__TEMPLATE_ROLE, oldTemplateRole, templateRole));
			}
		}
		return templateRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateRole basicGetTemplateRole() {
		return templateRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateRole(TemplateRole newTemplateRole, NotificationChain msgs) {
		TemplateRole oldTemplateRole = templateRole;
		templateRole = newTemplateRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Dsl15926Package.TEMPLATE_ROLE_INSTANCE__TEMPLATE_ROLE, oldTemplateRole, newTemplateRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateRole(TemplateRole newTemplateRole) {
		if (newTemplateRole != templateRole) {
			NotificationChain msgs = null;
			if (templateRole != null)
				msgs = ((InternalEObject)templateRole).eInverseRemove(this, Dsl15926Package.TEMPLATE_ROLE__INSTANCES, TemplateRole.class, msgs);
			if (newTemplateRole != null)
				msgs = ((InternalEObject)newTemplateRole).eInverseAdd(this, Dsl15926Package.TEMPLATE_ROLE__INSTANCES, TemplateRole.class, msgs);
			msgs = basicSetTemplateRole(newTemplateRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl15926Package.TEMPLATE_ROLE_INSTANCE__TEMPLATE_ROLE, newTemplateRole, newTemplateRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing getPropertyInstance() {
		if (propertyInstance != null && propertyInstance.eIsProxy()) {
			InternalEObject oldPropertyInstance = (InternalEObject)propertyInstance;
			propertyInstance = (Thing)eResolveProxy(oldPropertyInstance);
			if (propertyInstance != oldPropertyInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl15926Package.TEMPLATE_ROLE_INSTANCE__PROPERTY_INSTANCE, oldPropertyInstance, propertyInstance));
			}
		}
		return propertyInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing basicGetPropertyInstance() {
		return propertyInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyInstance(Thing newPropertyInstance) {
		Thing oldPropertyInstance = propertyInstance;
		propertyInstance = newPropertyInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl15926Package.TEMPLATE_ROLE_INSTANCE__PROPERTY_INSTANCE, oldPropertyInstance, propertyInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dsl15926Package.TEMPLATE_ROLE_INSTANCE__TEMPLATE_ROLE:
				if (templateRole != null)
					msgs = ((InternalEObject)templateRole).eInverseRemove(this, Dsl15926Package.TEMPLATE_ROLE__INSTANCES, TemplateRole.class, msgs);
				return basicSetTemplateRole((TemplateRole)otherEnd, msgs);
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
			case Dsl15926Package.TEMPLATE_ROLE_INSTANCE__TEMPLATE_ROLE:
				return basicSetTemplateRole(null, msgs);
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
			case Dsl15926Package.TEMPLATE_ROLE_INSTANCE__TEMPLATE_ROLE:
				if (resolve) return getTemplateRole();
				return basicGetTemplateRole();
			case Dsl15926Package.TEMPLATE_ROLE_INSTANCE__PROPERTY_INSTANCE:
				if (resolve) return getPropertyInstance();
				return basicGetPropertyInstance();
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
			case Dsl15926Package.TEMPLATE_ROLE_INSTANCE__TEMPLATE_ROLE:
				setTemplateRole((TemplateRole)newValue);
				return;
			case Dsl15926Package.TEMPLATE_ROLE_INSTANCE__PROPERTY_INSTANCE:
				setPropertyInstance((Thing)newValue);
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
			case Dsl15926Package.TEMPLATE_ROLE_INSTANCE__TEMPLATE_ROLE:
				setTemplateRole((TemplateRole)null);
				return;
			case Dsl15926Package.TEMPLATE_ROLE_INSTANCE__PROPERTY_INSTANCE:
				setPropertyInstance((Thing)null);
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
			case Dsl15926Package.TEMPLATE_ROLE_INSTANCE__TEMPLATE_ROLE:
				return templateRole != null;
			case Dsl15926Package.TEMPLATE_ROLE_INSTANCE__PROPERTY_INSTANCE:
				return propertyInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //TemplateRoleInstanceImpl
