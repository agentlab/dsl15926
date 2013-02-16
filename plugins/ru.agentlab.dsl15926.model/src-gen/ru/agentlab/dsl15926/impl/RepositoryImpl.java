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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ru.agentlab.dsl15926.Classification;
import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.Individual;
import ru.agentlab.dsl15926.Repository;
import ru.agentlab.dsl15926.Specialization;
import ru.agentlab.dsl15926.Template;
import ru.agentlab.dsl15926.TemplateInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ru.agentlab.dsl15926.impl.RepositoryImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.RepositoryImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.RepositoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.RepositoryImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.RepositoryImpl#getIndividuals <em>Individuals</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.RepositoryImpl#getTemplateInstances <em>Template Instances</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.RepositoryImpl#getClassifications <em>Classifications</em>}</li>
 *   <li>{@link ru.agentlab.dsl15926.impl.RepositoryImpl#getSpecializations <em>Specializations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryImpl extends EObjectImpl implements Repository {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<ru.agentlab.dsl15926.Class> classes;

	/**
	 * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<Template> templates;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<String> imports;

	/**
	 * The cached value of the '{@link #getIndividuals() <em>Individuals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividuals()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> individuals;

	/**
	 * The cached value of the '{@link #getTemplateInstances() <em>Template Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateInstance> templateInstances;

	/**
	 * The cached value of the '{@link #getClassifications() <em>Classifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Classification> classifications;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specializations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Dsl15926Package.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ru.agentlab.dsl15926.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList.Resolving<ru.agentlab.dsl15926.Class>(ru.agentlab.dsl15926.Class.class, this, Dsl15926Package.REPOSITORY__CLASSES, Dsl15926Package.CLASS__REPOSITORY);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Template> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentWithInverseEList.Resolving<Template>(Template.class, this, Dsl15926Package.REPOSITORY__TEMPLATES, Dsl15926Package.TEMPLATE__REPOSITORY);
		}
		return templates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Dsl15926Package.REPOSITORY__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImports() {
		if (imports == null) {
			imports = new EDataTypeUniqueEList<String>(String.class, this, Dsl15926Package.REPOSITORY__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getIndividuals() {
		if (individuals == null) {
			individuals = new EObjectContainmentWithInverseEList.Resolving<Individual>(Individual.class, this, Dsl15926Package.REPOSITORY__INDIVIDUALS, Dsl15926Package.INDIVIDUAL__REPOSITORY);
		}
		return individuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateInstance> getTemplateInstances() {
		if (templateInstances == null) {
			templateInstances = new EObjectContainmentWithInverseEList.Resolving<TemplateInstance>(TemplateInstance.class, this, Dsl15926Package.REPOSITORY__TEMPLATE_INSTANCES, Dsl15926Package.TEMPLATE_INSTANCE__REPOSITORY);
		}
		return templateInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classification> getClassifications() {
		if (classifications == null) {
			classifications = new EObjectContainmentEList.Resolving<Classification>(Classification.class, this, Dsl15926Package.REPOSITORY__CLASSIFICATIONS);
		}
		return classifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentEList.Resolving<Specialization>(Specialization.class, this, Dsl15926Package.REPOSITORY__SPECIALIZATIONS);
		}
		return specializations;
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
			case Dsl15926Package.REPOSITORY__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
			case Dsl15926Package.REPOSITORY__TEMPLATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplates()).basicAdd(otherEnd, msgs);
			case Dsl15926Package.REPOSITORY__INDIVIDUALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIndividuals()).basicAdd(otherEnd, msgs);
			case Dsl15926Package.REPOSITORY__TEMPLATE_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateInstances()).basicAdd(otherEnd, msgs);
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
			case Dsl15926Package.REPOSITORY__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.REPOSITORY__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.REPOSITORY__INDIVIDUALS:
				return ((InternalEList<?>)getIndividuals()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.REPOSITORY__TEMPLATE_INSTANCES:
				return ((InternalEList<?>)getTemplateInstances()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.REPOSITORY__CLASSIFICATIONS:
				return ((InternalEList<?>)getClassifications()).basicRemove(otherEnd, msgs);
			case Dsl15926Package.REPOSITORY__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
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
			case Dsl15926Package.REPOSITORY__CLASSES:
				return getClasses();
			case Dsl15926Package.REPOSITORY__TEMPLATES:
				return getTemplates();
			case Dsl15926Package.REPOSITORY__URL:
				return getUrl();
			case Dsl15926Package.REPOSITORY__IMPORTS:
				return getImports();
			case Dsl15926Package.REPOSITORY__INDIVIDUALS:
				return getIndividuals();
			case Dsl15926Package.REPOSITORY__TEMPLATE_INSTANCES:
				return getTemplateInstances();
			case Dsl15926Package.REPOSITORY__CLASSIFICATIONS:
				return getClassifications();
			case Dsl15926Package.REPOSITORY__SPECIALIZATIONS:
				return getSpecializations();
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
			case Dsl15926Package.REPOSITORY__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends ru.agentlab.dsl15926.Class>)newValue);
				return;
			case Dsl15926Package.REPOSITORY__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends Template>)newValue);
				return;
			case Dsl15926Package.REPOSITORY__URL:
				setUrl((String)newValue);
				return;
			case Dsl15926Package.REPOSITORY__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends String>)newValue);
				return;
			case Dsl15926Package.REPOSITORY__INDIVIDUALS:
				getIndividuals().clear();
				getIndividuals().addAll((Collection<? extends Individual>)newValue);
				return;
			case Dsl15926Package.REPOSITORY__TEMPLATE_INSTANCES:
				getTemplateInstances().clear();
				getTemplateInstances().addAll((Collection<? extends TemplateInstance>)newValue);
				return;
			case Dsl15926Package.REPOSITORY__CLASSIFICATIONS:
				getClassifications().clear();
				getClassifications().addAll((Collection<? extends Classification>)newValue);
				return;
			case Dsl15926Package.REPOSITORY__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
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
			case Dsl15926Package.REPOSITORY__CLASSES:
				getClasses().clear();
				return;
			case Dsl15926Package.REPOSITORY__TEMPLATES:
				getTemplates().clear();
				return;
			case Dsl15926Package.REPOSITORY__URL:
				setUrl(URL_EDEFAULT);
				return;
			case Dsl15926Package.REPOSITORY__IMPORTS:
				getImports().clear();
				return;
			case Dsl15926Package.REPOSITORY__INDIVIDUALS:
				getIndividuals().clear();
				return;
			case Dsl15926Package.REPOSITORY__TEMPLATE_INSTANCES:
				getTemplateInstances().clear();
				return;
			case Dsl15926Package.REPOSITORY__CLASSIFICATIONS:
				getClassifications().clear();
				return;
			case Dsl15926Package.REPOSITORY__SPECIALIZATIONS:
				getSpecializations().clear();
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
			case Dsl15926Package.REPOSITORY__CLASSES:
				return classes != null && !classes.isEmpty();
			case Dsl15926Package.REPOSITORY__TEMPLATES:
				return templates != null && !templates.isEmpty();
			case Dsl15926Package.REPOSITORY__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case Dsl15926Package.REPOSITORY__IMPORTS:
				return imports != null && !imports.isEmpty();
			case Dsl15926Package.REPOSITORY__INDIVIDUALS:
				return individuals != null && !individuals.isEmpty();
			case Dsl15926Package.REPOSITORY__TEMPLATE_INSTANCES:
				return templateInstances != null && !templateInstances.isEmpty();
			case Dsl15926Package.REPOSITORY__CLASSIFICATIONS:
				return classifications != null && !classifications.isEmpty();
			case Dsl15926Package.REPOSITORY__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
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
		result.append(" (url: ");
		result.append(url);
		result.append(", imports: ");
		result.append(imports);
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl
