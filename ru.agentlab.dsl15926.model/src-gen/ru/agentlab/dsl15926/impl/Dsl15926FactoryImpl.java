/**
 */
package ru.agentlab.dsl15926.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.agentlab.dsl15926.Annotation;
import ru.agentlab.dsl15926.Dsl15926Factory;
import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.Individual;
import ru.agentlab.dsl15926.Pattern;
import ru.agentlab.dsl15926.Repository;
import ru.agentlab.dsl15926.Template;
import ru.agentlab.dsl15926.TemplateInstance;
import ru.agentlab.dsl15926.TemplateRole;
import ru.agentlab.dsl15926.TemplateRoleInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Dsl15926FactoryImpl extends EFactoryImpl implements Dsl15926Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Dsl15926Factory init() {
		try {
			Dsl15926Factory theDsl15926Factory = (Dsl15926Factory)EPackage.Registry.INSTANCE.getEFactory("http://agentlab.ru/models/dsl15926/2012/08"); 
			if (theDsl15926Factory != null) {
				return theDsl15926Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Dsl15926FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl15926FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Dsl15926Package.TEMPLATE: return createTemplate();
			case Dsl15926Package.TEMPLATE_ROLE: return createTemplateRole();
			case Dsl15926Package.REPOSITORY: return createRepository();
			case Dsl15926Package.ANNOTATION: return createAnnotation();
			case Dsl15926Package.INDIVIDUAL: return createIndividual();
			case Dsl15926Package.CLASS: return createClass();
			case Dsl15926Package.TEMPLATE_INSTANCE: return createTemplateInstance();
			case Dsl15926Package.PATTERN: return createPattern();
			case Dsl15926Package.TEMPLATE_ROLE_INSTANCE: return createTemplateRoleInstance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateRole createTemplateRole() {
		TemplateRoleImpl templateRole = new TemplateRoleImpl();
		return templateRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual createIndividual() {
		IndividualImpl individual = new IndividualImpl();
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ru.agentlab.dsl15926.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateInstance createTemplateInstance() {
		TemplateInstanceImpl templateInstance = new TemplateInstanceImpl();
		return templateInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateRoleInstance createTemplateRoleInstance() {
		TemplateRoleInstanceImpl templateRoleInstance = new TemplateRoleInstanceImpl();
		return templateRoleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl15926Package getDsl15926Package() {
		return (Dsl15926Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Dsl15926Package getPackage() {
		return Dsl15926Package.eINSTANCE;
	}

} //Dsl15926FactoryImpl
