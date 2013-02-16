/**
 */
package ru.agentlab.dsl15926.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ru.agentlab.dsl15926.Classification;
import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.Thing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.impl.ClassificationImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.ClassificationImpl#getClassified <em>Classified</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassificationImpl extends EObjectImpl implements Classification {
	/**
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected ru.agentlab.dsl15926.Class classifier;

	/**
	 * The cached value of the '{@link #getClassified() <em>Classified</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassified()
	 * @generated
	 * @ordered
	 */
	protected Thing classified;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl15926Package.Literals.CLASSIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ru.agentlab.dsl15926.Class getClassifier() {
		if (classifier != null && classifier.eIsProxy()) {
			InternalEObject oldClassifier = (InternalEObject)classifier;
			classifier = (ru.agentlab.dsl15926.Class)eResolveProxy(oldClassifier);
			if (classifier != oldClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl15926Package.CLASSIFICATION__CLASSIFIER, oldClassifier, classifier));
			}
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ru.agentlab.dsl15926.Class basicGetClassifier() {
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifier(ru.agentlab.dsl15926.Class newClassifier) {
		ru.agentlab.dsl15926.Class oldClassifier = classifier;
		classifier = newClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl15926Package.CLASSIFICATION__CLASSIFIER, oldClassifier, classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing getClassified() {
		if (classified != null && classified.eIsProxy()) {
			InternalEObject oldClassified = (InternalEObject)classified;
			classified = (Thing)eResolveProxy(oldClassified);
			if (classified != oldClassified) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Dsl15926Package.CLASSIFICATION__CLASSIFIED, oldClassified, classified));
			}
		}
		return classified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing basicGetClassified() {
		return classified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassified(Thing newClassified) {
		Thing oldClassified = classified;
		classified = newClassified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl15926Package.CLASSIFICATION__CLASSIFIED, oldClassified, classified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Dsl15926Package.CLASSIFICATION__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
			case Dsl15926Package.CLASSIFICATION__CLASSIFIED:
				if (resolve) return getClassified();
				return basicGetClassified();
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
			case Dsl15926Package.CLASSIFICATION__CLASSIFIER:
				setClassifier((ru.agentlab.dsl15926.Class)newValue);
				return;
			case Dsl15926Package.CLASSIFICATION__CLASSIFIED:
				setClassified((Thing)newValue);
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
			case Dsl15926Package.CLASSIFICATION__CLASSIFIER:
				setClassifier((ru.agentlab.dsl15926.Class)null);
				return;
			case Dsl15926Package.CLASSIFICATION__CLASSIFIED:
				setClassified((Thing)null);
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
			case Dsl15926Package.CLASSIFICATION__CLASSIFIER:
				return classifier != null;
			case Dsl15926Package.CLASSIFICATION__CLASSIFIED:
				return classified != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassificationImpl
