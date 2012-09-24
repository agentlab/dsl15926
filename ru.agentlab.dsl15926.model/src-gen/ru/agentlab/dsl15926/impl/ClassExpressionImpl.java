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

import ru.agentlab.dsl15926.ClassExpression;
import ru.agentlab.dsl15926.Dsl15926Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.impl.ClassExpressionImpl#getSubClassOf <em>Sub Class Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.ClassExpressionImpl#getSuperClassOf <em>Super Class Of</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.ClassExpressionImpl#getDisjointClasses <em>Disjoint Classes</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.ClassExpressionImpl#getEquivalentClasses <em>Equivalent Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassExpressionImpl extends NamedElementImpl implements ClassExpression {
	/**
	 * The cached value of the '{@link #getSubClassOf() <em>Sub Class Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClassOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> subClassOf;

	/**
	 * The cached value of the '{@link #getSuperClassOf() <em>Super Class Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClassOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> superClassOf;

	/**
	 * The cached value of the '{@link #getDisjointClasses() <em>Disjoint Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisjointClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> disjointClasses;

	/**
	 * The cached value of the '{@link #getEquivalentClasses() <em>Equivalent Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassExpression> equivalentClasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl15926Package.Literals.CLASS_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getSubClassOf() {
		if (subClassOf == null) {
			subClassOf = new EObjectWithInverseResolvingEList.ManyInverse<ClassExpression>(ClassExpression.class, this, Dsl15926Package.CLASS_EXPRESSION__SUB_CLASS_OF, Dsl15926Package.CLASS_EXPRESSION__SUPER_CLASS_OF);
		}
		return subClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getSuperClassOf() {
		if (superClassOf == null) {
			superClassOf = new EObjectWithInverseResolvingEList.ManyInverse<ClassExpression>(ClassExpression.class, this, Dsl15926Package.CLASS_EXPRESSION__SUPER_CLASS_OF, Dsl15926Package.CLASS_EXPRESSION__SUB_CLASS_OF);
		}
		return superClassOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getDisjointClasses() {
		if (disjointClasses == null) {
			disjointClasses = new EObjectResolvingEList<ClassExpression>(ClassExpression.class, this, Dsl15926Package.CLASS_EXPRESSION__DISJOINT_CLASSES);
		}
		return disjointClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassExpression> getEquivalentClasses() {
		if (equivalentClasses == null) {
			equivalentClasses = new EObjectResolvingEList<ClassExpression>(ClassExpression.class, this, Dsl15926Package.CLASS_EXPRESSION__EQUIVALENT_CLASSES);
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
			case Dsl15926Package.CLASS_EXPRESSION__SUB_CLASS_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubClassOf()).basicAdd(otherEnd, msgs);
			case Dsl15926Package.CLASS_EXPRESSION__SUPER_CLASS_OF:
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
			case Dsl15926Package.CLASS_EXPRESSION__SUB_CLASS_OF:
				return ((InternalEList<?>)getSubClassOf()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.CLASS_EXPRESSION__SUPER_CLASS_OF:
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
			case Dsl15926Package.CLASS_EXPRESSION__SUB_CLASS_OF:
				return getSubClassOf();
			case Dsl15926Package.CLASS_EXPRESSION__SUPER_CLASS_OF:
				return getSuperClassOf();
			case Dsl15926Package.CLASS_EXPRESSION__DISJOINT_CLASSES:
				return getDisjointClasses();
			case Dsl15926Package.CLASS_EXPRESSION__EQUIVALENT_CLASSES:
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
			case Dsl15926Package.CLASS_EXPRESSION__SUB_CLASS_OF:
				getSubClassOf().clear();
				getSubClassOf().addAll((Collection<? extends ClassExpression>)newValue);
				return;
			case Dsl15926Package.CLASS_EXPRESSION__SUPER_CLASS_OF:
				getSuperClassOf().clear();
				getSuperClassOf().addAll((Collection<? extends ClassExpression>)newValue);
				return;
			case Dsl15926Package.CLASS_EXPRESSION__DISJOINT_CLASSES:
				getDisjointClasses().clear();
				getDisjointClasses().addAll((Collection<? extends ClassExpression>)newValue);
				return;
			case Dsl15926Package.CLASS_EXPRESSION__EQUIVALENT_CLASSES:
				getEquivalentClasses().clear();
				getEquivalentClasses().addAll((Collection<? extends ClassExpression>)newValue);
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
			case Dsl15926Package.CLASS_EXPRESSION__SUB_CLASS_OF:
				getSubClassOf().clear();
				return;
			case Dsl15926Package.CLASS_EXPRESSION__SUPER_CLASS_OF:
				getSuperClassOf().clear();
				return;
			case Dsl15926Package.CLASS_EXPRESSION__DISJOINT_CLASSES:
				getDisjointClasses().clear();
				return;
			case Dsl15926Package.CLASS_EXPRESSION__EQUIVALENT_CLASSES:
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
			case Dsl15926Package.CLASS_EXPRESSION__SUB_CLASS_OF:
				return subClassOf != null && !subClassOf.isEmpty();
			case Dsl15926Package.CLASS_EXPRESSION__SUPER_CLASS_OF:
				return superClassOf != null && !superClassOf.isEmpty();
			case Dsl15926Package.CLASS_EXPRESSION__DISJOINT_CLASSES:
				return disjointClasses != null && !disjointClasses.isEmpty();
			case Dsl15926Package.CLASS_EXPRESSION__EQUIVALENT_CLASSES:
				return equivalentClasses != null && !equivalentClasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassExpressionImpl
