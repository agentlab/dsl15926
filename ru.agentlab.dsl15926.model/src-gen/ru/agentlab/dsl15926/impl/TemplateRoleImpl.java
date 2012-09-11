/**
 */
package ru.agentlab.dsl15926.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ru.agentlab.dsl15926.ClassProperty;
import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.TemplateRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.impl.TemplateRoleImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.TemplateRoleImpl#getQualifiedCardinality <em>Qualified Cardinality</em>}</li>
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dsl15926Package.TEMPLATE_ROLE__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case Dsl15926Package.TEMPLATE_ROLE__QUALIFIED_CARDINALITY:
				return getQualifiedCardinality();
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
			case Dsl15926Package.TEMPLATE_ROLE__PROPERTY:
				setProperty((ClassProperty)newValue);
				return;
			case Dsl15926Package.TEMPLATE_ROLE__QUALIFIED_CARDINALITY:
				setQualifiedCardinality((String)newValue);
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
