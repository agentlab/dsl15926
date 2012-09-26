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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.agentlab.dsl15926.ClassProperty;
import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.TemplateRole;
import ru.agentlab.dsl15926.TemplateRoleInstance;
import ru.agentlab.dsl15926.Thing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.impl.TemplateRoleImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.TemplateRoleImpl#getQualifiedCardinality <em>Qualified Cardinality</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.TemplateRoleImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.TemplateRoleImpl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateRoleImpl extends NamedElementImpl implements TemplateRole {
	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected ClassProperty property;

	/**
	 * The default value of the '{@link #getQualifiedCardinality() <em>Qualified Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedCardinality() <em>Qualified Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedCardinality()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedCardinality = QUALIFIED_CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateRoleInstance> instances;

	/**
	 * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected Thing entityType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl15926Package.Literals.TEMPLATE_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassProperty getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (ClassProperty)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl15926Package.TEMPLATE_ROLE__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassProperty basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(ClassProperty newProperty) {
		ClassProperty oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl15926Package.TEMPLATE_ROLE__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedCardinality() {
		return qualifiedCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedCardinality(String newQualifiedCardinality) {
		String oldQualifiedCardinality = qualifiedCardinality;
		qualifiedCardinality = newQualifiedCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl15926Package.TEMPLATE_ROLE__QUALIFIED_CARDINALITY, oldQualifiedCardinality, qualifiedCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateRoleInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<TemplateRoleInstance>(TemplateRoleInstance.class, this, Dsl15926Package.TEMPLATE_ROLE__INSTANCES, Dsl15926Package.TEMPLATE_ROLE_INSTANCE__TEMPLATE_ROLE);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing getEntityType() {
		if (entityType != null && entityType.eIsProxy()) {
			InternalEObject oldEntityType = (InternalEObject)entityType;
			entityType = (Thing)eResolveProxy(oldEntityType);
			if (entityType != oldEntityType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl15926Package.TEMPLATE_ROLE__ENTITY_TYPE, oldEntityType, entityType));
			}
		}
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing basicGetEntityType() {
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityType(Thing newEntityType) {
		Thing oldEntityType = entityType;
		entityType = newEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl15926Package.TEMPLATE_ROLE__ENTITY_TYPE, oldEntityType, entityType));
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
			case Dsl15926Package.TEMPLATE_ROLE__INSTANCES:
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
			case Dsl15926Package.TEMPLATE_ROLE__INSTANCES:
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
			case Dsl15926Package.TEMPLATE_ROLE__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case Dsl15926Package.TEMPLATE_ROLE__QUALIFIED_CARDINALITY:
				return getQualifiedCardinality();
			case Dsl15926Package.TEMPLATE_ROLE__INSTANCES:
				return getInstances();
			case Dsl15926Package.TEMPLATE_ROLE__ENTITY_TYPE:
				if (resolve) return getEntityType();
				return basicGetEntityType();
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
			case Dsl15926Package.TEMPLATE_ROLE__PROPERTY:
				setProperty((ClassProperty)newValue);
				return;
			case Dsl15926Package.TEMPLATE_ROLE__QUALIFIED_CARDINALITY:
				setQualifiedCardinality((String)newValue);
				return;
			case Dsl15926Package.TEMPLATE_ROLE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends TemplateRoleInstance>)newValue);
				return;
			case Dsl15926Package.TEMPLATE_ROLE__ENTITY_TYPE:
				setEntityType((Thing)newValue);
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
			case Dsl15926Package.TEMPLATE_ROLE__PROPERTY:
				setProperty((ClassProperty)null);
				return;
			case Dsl15926Package.TEMPLATE_ROLE__QUALIFIED_CARDINALITY:
				setQualifiedCardinality(QUALIFIED_CARDINALITY_EDEFAULT);
				return;
			case Dsl15926Package.TEMPLATE_ROLE__INSTANCES:
				getInstances().clear();
				return;
			case Dsl15926Package.TEMPLATE_ROLE__ENTITY_TYPE:
				setEntityType((Thing)null);
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
			case Dsl15926Package.TEMPLATE_ROLE__PROPERTY:
				return property != null;
			case Dsl15926Package.TEMPLATE_ROLE__QUALIFIED_CARDINALITY:
				return QUALIFIED_CARDINALITY_EDEFAULT == null ? qualifiedCardinality != null : !QUALIFIED_CARDINALITY_EDEFAULT.equals(qualifiedCardinality);
			case Dsl15926Package.TEMPLATE_ROLE__INSTANCES:
				return instances != null && !instances.isEmpty();
			case Dsl15926Package.TEMPLATE_ROLE__ENTITY_TYPE:
				return entityType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (qualifiedCardinality: ");
		result.append(qualifiedCardinality);
		result.append(')');
		return result.toString();
	}

} //TemplateRoleImpl
