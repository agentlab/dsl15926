/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.agentlab.dsl15926.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.Template;
import ru.agentlab.dsl15926.TemplateInstance;
import ru.agentlab.dsl15926.TemplateRoleInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.impl.TemplateInstanceImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.TemplateInstanceImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateInstanceImpl extends EObjectImpl implements TemplateInstance {
	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected Template templates;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateRoleInstance> roles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl15926Package.Literals.TEMPLATE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getTemplates() {
		if (templates != null && templates.eIsProxy()) {
			InternalEObject oldTemplates = (InternalEObject)templates;
			templates = (Template)eResolveProxy(oldTemplates);
			if (templates != oldTemplates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl15926Package.TEMPLATE_INSTANCE__TEMPLATES, oldTemplates, templates));
			}
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template basicGetTemplates() {
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplates(Template newTemplates, NotificationChain msgs) {
		Template oldTemplates = templates;
		templates = newTemplates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Dsl15926Package.TEMPLATE_INSTANCE__TEMPLATES, oldTemplates, newTemplates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplates(Template newTemplates) {
		if (newTemplates != templates) {
			NotificationChain msgs = null;
			if (templates != null)
				msgs = ((InternalEObject)templates).eInverseRemove(this, Dsl15926Package.TEMPLATE__INSTANCES, Template.class, msgs);
			if (newTemplates != null)
				msgs = ((InternalEObject)newTemplates).eInverseAdd(this, Dsl15926Package.TEMPLATE__INSTANCES, Template.class, msgs);
			msgs = basicSetTemplates(newTemplates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl15926Package.TEMPLATE_INSTANCE__TEMPLATES, newTemplates, newTemplates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateRoleInstance> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList.Resolving<TemplateRoleInstance>(TemplateRoleInstance.class, this, Dsl15926Package.TEMPLATE_INSTANCE__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Dsl15926Package.TEMPLATE_INSTANCE__TEMPLATES:
				if (templates != null)
					msgs = ((InternalEObject)templates).eInverseRemove(this, Dsl15926Package.TEMPLATE__INSTANCES, Template.class, msgs);
				return basicSetTemplates((Template)otherEnd, msgs);
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
			case Dsl15926Package.TEMPLATE_INSTANCE__TEMPLATES:
				return basicSetTemplates(null, msgs);
			case Dsl15926Package.TEMPLATE_INSTANCE__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case Dsl15926Package.TEMPLATE_INSTANCE__TEMPLATES:
				if (resolve) return getTemplates();
				return basicGetTemplates();
			case Dsl15926Package.TEMPLATE_INSTANCE__ROLES:
				return getRoles();
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
			case Dsl15926Package.TEMPLATE_INSTANCE__TEMPLATES:
				setTemplates((Template)newValue);
				return;
			case Dsl15926Package.TEMPLATE_INSTANCE__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends TemplateRoleInstance>)newValue);
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
			case Dsl15926Package.TEMPLATE_INSTANCE__TEMPLATES:
				setTemplates((Template)null);
				return;
			case Dsl15926Package.TEMPLATE_INSTANCE__ROLES:
				getRoles().clear();
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
			case Dsl15926Package.TEMPLATE_INSTANCE__TEMPLATES:
				return templates != null;
			case Dsl15926Package.TEMPLATE_INSTANCE__ROLES:
				return roles != null && !roles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateInstanceImpl
