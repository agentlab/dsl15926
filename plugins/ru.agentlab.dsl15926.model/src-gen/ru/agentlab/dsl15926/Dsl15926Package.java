/**
 */
package ru.agentlab.dsl15926;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.agentlab.dsl15926.Dsl15926Factory
 * @model kind="package"
 * @generated
 */
public interface Dsl15926Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsl15926";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://agentlab.ru/models/dsl15926/2012/08";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ru.agentlab";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Dsl15926Package eINSTANCE = ru.agentlab.dsl15926.impl.Dsl15926PackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.agentlab.dsl15926.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.dsl15926.impl.NamedElementImpl
	 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ANNOTATIONS = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ru.agentlab.dsl15926.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.dsl15926.impl.ThingImpl
	 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getThing()
	 * @generated
	 */
	int THING = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__LABEL = NAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__CLASSES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ru.agentlab.dsl15926.impl.AbstractObjectImpl <em>Abstract Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.dsl15926.impl.AbstractObjectImpl
	 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getAbstractObject()
	 * @generated
	 */
	int ABSTRACT_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT__LABEL = THING__LABEL;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT__ANNOTATIONS = THING__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT__CLASSES = THING__CLASSES;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT__SUB_CLASS_OF = THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT__SUPER_CLASS_OF = THING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT__DISJOINT_CLASSES = THING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT__EQUIVALENT_CLASSES = THING_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_FEATURE_COUNT = THING_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ru.agentlab.dsl15926.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.dsl15926.impl.TemplateImpl
	 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__LABEL = ABSTRACT_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__ANNOTATIONS = ABSTRACT_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__CLASSES = ABSTRACT_OBJECT__CLASSES;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__SUB_CLASS_OF = ABSTRACT_OBJECT__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__SUPER_CLASS_OF = ABSTRACT_OBJECT__SUPER_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__DISJOINT_CLASSES = ABSTRACT_OBJECT__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__EQUIVALENT_CLASSES = ABSTRACT_OBJECT__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__ROLES = ABSTRACT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__INSTANCES = ABSTRACT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__REPOSITORY = ABSTRACT_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = ABSTRACT_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ru.agentlab.dsl15926.impl.TemplateRoleImpl <em>Template Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.dsl15926.impl.TemplateRoleImpl
	 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getTemplateRole()
	 * @generated
	 */
	int TEMPLATE_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROLE__LABEL = NAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROLE__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Qualified Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROLE__QUALIFIED_CARDINALITY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROLE__INSTANCES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROLE__ENTITY_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Template Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ru.agentlab.dsl15926.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.dsl15926.impl.RepositoryImpl
	 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__TEMPLATES = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__URL = 2;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__IMPORTS = 3;

	/**
	 * The feature id for the '<em><b>Individuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__INDIVIDUALS = 4;

	/**
	 * The feature id for the '<em><b>Template Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__TEMPLATE_INSTANCES = 5;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PATTERNS = 6;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link ru.agentlab.dsl15926.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.dsl15926.impl.AnnotationImpl
	 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__LANG = 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ru.agentlab.dsl15926.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.dsl15926.impl.IndividualImpl
	 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__LABEL = THING__LABEL;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__ANNOTATIONS = THING__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__CLASSES = THING__CLASSES;

	/**
	 * The feature id for the '<em><b>Patterns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__PATTERNS = THING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__REPOSITORY = THING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = THING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ru.agentlab.dsl15926.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.dsl15926.impl.ClassImpl
	 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__LABEL = ABSTRACT_OBJECT__LABEL;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ANNOTATIONS = ABSTRACT_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLASSES = ABSTRACT_OBJECT__CLASSES;

	/**
	 * The feature id for the '<em><b>Sub Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUB_CLASS_OF = ABSTRACT_OBJECT__SUB_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Super Class Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_CLASS_OF = ABSTRACT_OBJECT__SUPER_CLASS_OF;

	/**
	 * The feature id for the '<em><b>Disjoint Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DISJOINT_CLASSES = ABSTRACT_OBJECT__DISJOINT_CLASSES;

	/**
	 * The feature id for the '<em><b>Equivalent Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__EQUIVALENT_CLASSES = ABSTRACT_OBJECT__EQUIVALENT_CLASSES;

	/**
	 * The feature id for the '<em><b>Individuals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__INDIVIDUALS = ABSTRACT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__REPOSITORY = ABSTRACT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = ABSTRACT_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ru.agentlab.dsl15926.impl.TemplateInstanceImpl <em>Template Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.dsl15926.impl.TemplateInstanceImpl
	 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getTemplateInstance()
	 * @generated
	 */
	int TEMPLATE_INSTANCE = 8;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INSTANCE__TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INSTANCE__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INSTANCE__REPOSITORY = 2;

	/**
	 * The number of structural features of the '<em>Template Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ru.agentlab.dsl15926.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.dsl15926.impl.PatternImpl
	 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__LABEL = NAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__ANNOTATIONS = NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Individuals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__INDIVIDUALS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__REPOSITORY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ru.agentlab.dsl15926.impl.TemplateRoleInstanceImpl <em>Template Role Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.agentlab.dsl15926.impl.TemplateRoleInstanceImpl
	 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getTemplateRoleInstance()
	 * @generated
	 */
	int TEMPLATE_ROLE_INSTANCE = 10;

	/**
	 * The feature id for the '<em><b>Template Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROLE_INSTANCE__TEMPLATE_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Property Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROLE_INSTANCE__PROPERTY_INSTANCE = 1;

	/**
	 * The number of structural features of the '<em>Template Role Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_ROLE_INSTANCE_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link ru.agentlab.dsl15926.AbstractObject <em>Abstract Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Object</em>'.
	 * @see ru.agentlab.dsl15926.AbstractObject
	 * @generated
	 */
	EClass getAbstractObject();

	/**
	 * Returns the meta object for the reference list '{@link ru.agentlab.dsl15926.AbstractObject#getSubClassOf <em>Sub Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Class Of</em>'.
	 * @see ru.agentlab.dsl15926.AbstractObject#getSubClassOf()
	 * @see #getAbstractObject()
	 * @generated
	 */
	EReference getAbstractObject_SubClassOf();

	/**
	 * Returns the meta object for the reference list '{@link ru.agentlab.dsl15926.AbstractObject#getSuperClassOf <em>Super Class Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Class Of</em>'.
	 * @see ru.agentlab.dsl15926.AbstractObject#getSuperClassOf()
	 * @see #getAbstractObject()
	 * @generated
	 */
	EReference getAbstractObject_SuperClassOf();

	/**
	 * Returns the meta object for the reference list '{@link ru.agentlab.dsl15926.AbstractObject#getDisjointClasses <em>Disjoint Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Disjoint Classes</em>'.
	 * @see ru.agentlab.dsl15926.AbstractObject#getDisjointClasses()
	 * @see #getAbstractObject()
	 * @generated
	 */
	EReference getAbstractObject_DisjointClasses();

	/**
	 * Returns the meta object for the reference list '{@link ru.agentlab.dsl15926.AbstractObject#getEquivalentClasses <em>Equivalent Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent Classes</em>'.
	 * @see ru.agentlab.dsl15926.AbstractObject#getEquivalentClasses()
	 * @see #getAbstractObject()
	 * @generated
	 */
	EReference getAbstractObject_EquivalentClasses();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.dsl15926.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see ru.agentlab.dsl15926.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.agentlab.dsl15926.Template#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see ru.agentlab.dsl15926.Template#getRoles()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Roles();

	/**
	 * Returns the meta object for the reference list '{@link ru.agentlab.dsl15926.Template#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see ru.agentlab.dsl15926.Template#getInstances()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Instances();

	/**
	 * Returns the meta object for the container reference '{@link ru.agentlab.dsl15926.Template#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see ru.agentlab.dsl15926.Template#getRepository()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Repository();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.dsl15926.TemplateRole <em>Template Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Role</em>'.
	 * @see ru.agentlab.dsl15926.TemplateRole
	 * @generated
	 */
	EClass getTemplateRole();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.dsl15926.TemplateRole#getQualifiedCardinality <em>Qualified Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Cardinality</em>'.
	 * @see ru.agentlab.dsl15926.TemplateRole#getQualifiedCardinality()
	 * @see #getTemplateRole()
	 * @generated
	 */
	EAttribute getTemplateRole_QualifiedCardinality();

	/**
	 * Returns the meta object for the reference list '{@link ru.agentlab.dsl15926.TemplateRole#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see ru.agentlab.dsl15926.TemplateRole#getInstances()
	 * @see #getTemplateRole()
	 * @generated
	 */
	EReference getTemplateRole_Instances();

	/**
	 * Returns the meta object for the reference '{@link ru.agentlab.dsl15926.TemplateRole#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Type</em>'.
	 * @see ru.agentlab.dsl15926.TemplateRole#getEntityType()
	 * @see #getTemplateRole()
	 * @generated
	 */
	EReference getTemplateRole_EntityType();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.dsl15926.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see ru.agentlab.dsl15926.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.agentlab.dsl15926.Repository#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see ru.agentlab.dsl15926.Repository#getClasses()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.agentlab.dsl15926.Repository#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see ru.agentlab.dsl15926.Repository#getTemplates()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Templates();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.dsl15926.Repository#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see ru.agentlab.dsl15926.Repository#getUrl()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Url();

	/**
	 * Returns the meta object for the attribute list '{@link ru.agentlab.dsl15926.Repository#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see ru.agentlab.dsl15926.Repository#getImports()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.agentlab.dsl15926.Repository#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individuals</em>'.
	 * @see ru.agentlab.dsl15926.Repository#getIndividuals()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Individuals();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.agentlab.dsl15926.Repository#getTemplateInstances <em>Template Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Instances</em>'.
	 * @see ru.agentlab.dsl15926.Repository#getTemplateInstances()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_TemplateInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.agentlab.dsl15926.Repository#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patterns</em>'.
	 * @see ru.agentlab.dsl15926.Repository#getPatterns()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Patterns();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.dsl15926.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ru.agentlab.dsl15926.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.dsl15926.NamedElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see ru.agentlab.dsl15926.NamedElement#getLabel()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.agentlab.dsl15926.NamedElement#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see ru.agentlab.dsl15926.NamedElement#getAnnotations()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Annotations();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.dsl15926.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ru.agentlab.dsl15926.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.dsl15926.Annotation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ru.agentlab.dsl15926.Annotation#getType()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Type();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.dsl15926.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ru.agentlab.dsl15926.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Value();

	/**
	 * Returns the meta object for the attribute '{@link ru.agentlab.dsl15926.Annotation#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see ru.agentlab.dsl15926.Annotation#getLang()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Lang();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.dsl15926.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see ru.agentlab.dsl15926.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for the reference list '{@link ru.agentlab.dsl15926.Individual#getPatterns <em>Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Patterns</em>'.
	 * @see ru.agentlab.dsl15926.Individual#getPatterns()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_Patterns();

	/**
	 * Returns the meta object for the container reference '{@link ru.agentlab.dsl15926.Individual#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see ru.agentlab.dsl15926.Individual#getRepository()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_Repository();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.dsl15926.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see ru.agentlab.dsl15926.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the reference list '{@link ru.agentlab.dsl15926.Class#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Individuals</em>'.
	 * @see ru.agentlab.dsl15926.Class#getIndividuals()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Individuals();

	/**
	 * Returns the meta object for the container reference '{@link ru.agentlab.dsl15926.Class#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see ru.agentlab.dsl15926.Class#getRepository()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Repository();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.dsl15926.TemplateInstance <em>Template Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Instance</em>'.
	 * @see ru.agentlab.dsl15926.TemplateInstance
	 * @generated
	 */
	EClass getTemplateInstance();

	/**
	 * Returns the meta object for the reference '{@link ru.agentlab.dsl15926.TemplateInstance#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see ru.agentlab.dsl15926.TemplateInstance#getTemplate()
	 * @see #getTemplateInstance()
	 * @generated
	 */
	EReference getTemplateInstance_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.agentlab.dsl15926.TemplateInstance#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see ru.agentlab.dsl15926.TemplateInstance#getRoles()
	 * @see #getTemplateInstance()
	 * @generated
	 */
	EReference getTemplateInstance_Roles();

	/**
	 * Returns the meta object for the container reference '{@link ru.agentlab.dsl15926.TemplateInstance#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see ru.agentlab.dsl15926.TemplateInstance#getRepository()
	 * @see #getTemplateInstance()
	 * @generated
	 */
	EReference getTemplateInstance_Repository();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.dsl15926.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see ru.agentlab.dsl15926.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the reference list '{@link ru.agentlab.dsl15926.Pattern#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Individuals</em>'.
	 * @see ru.agentlab.dsl15926.Pattern#getIndividuals()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Individuals();

	/**
	 * Returns the meta object for the container reference '{@link ru.agentlab.dsl15926.Pattern#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Repository</em>'.
	 * @see ru.agentlab.dsl15926.Pattern#getRepository()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Repository();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.dsl15926.TemplateRoleInstance <em>Template Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Role Instance</em>'.
	 * @see ru.agentlab.dsl15926.TemplateRoleInstance
	 * @generated
	 */
	EClass getTemplateRoleInstance();

	/**
	 * Returns the meta object for the reference '{@link ru.agentlab.dsl15926.TemplateRoleInstance#getTemplateRole <em>Template Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template Role</em>'.
	 * @see ru.agentlab.dsl15926.TemplateRoleInstance#getTemplateRole()
	 * @see #getTemplateRoleInstance()
	 * @generated
	 */
	EReference getTemplateRoleInstance_TemplateRole();

	/**
	 * Returns the meta object for the reference '{@link ru.agentlab.dsl15926.TemplateRoleInstance#getPropertyInstance <em>Property Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Instance</em>'.
	 * @see ru.agentlab.dsl15926.TemplateRoleInstance#getPropertyInstance()
	 * @see #getTemplateRoleInstance()
	 * @generated
	 */
	EReference getTemplateRoleInstance_PropertyInstance();

	/**
	 * Returns the meta object for class '{@link ru.agentlab.dsl15926.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see ru.agentlab.dsl15926.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the reference list '{@link ru.agentlab.dsl15926.Thing#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see ru.agentlab.dsl15926.Thing#getClasses()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Classes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Dsl15926Factory getDsl15926Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ru.agentlab.dsl15926.impl.AbstractObjectImpl <em>Abstract Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.dsl15926.impl.AbstractObjectImpl
		 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getAbstractObject()
		 * @generated
		 */
		EClass ABSTRACT_OBJECT = eINSTANCE.getAbstractObject();

		/**
		 * The meta object literal for the '<em><b>Sub Class Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_OBJECT__SUB_CLASS_OF = eINSTANCE.getAbstractObject_SubClassOf();

		/**
		 * The meta object literal for the '<em><b>Super Class Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_OBJECT__SUPER_CLASS_OF = eINSTANCE.getAbstractObject_SuperClassOf();

		/**
		 * The meta object literal for the '<em><b>Disjoint Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_OBJECT__DISJOINT_CLASSES = eINSTANCE.getAbstractObject_DisjointClasses();

		/**
		 * The meta object literal for the '<em><b>Equivalent Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_OBJECT__EQUIVALENT_CLASSES = eINSTANCE.getAbstractObject_EquivalentClasses();

		/**
		 * The meta object literal for the '{@link ru.agentlab.dsl15926.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.dsl15926.impl.TemplateImpl
		 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__ROLES = eINSTANCE.getTemplate_Roles();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__INSTANCES = eINSTANCE.getTemplate_Instances();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__REPOSITORY = eINSTANCE.getTemplate_Repository();

		/**
		 * The meta object literal for the '{@link ru.agentlab.dsl15926.impl.TemplateRoleImpl <em>Template Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.dsl15926.impl.TemplateRoleImpl
		 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getTemplateRole()
		 * @generated
		 */
		EClass TEMPLATE_ROLE = eINSTANCE.getTemplateRole();

		/**
		 * The meta object literal for the '<em><b>Qualified Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_ROLE__QUALIFIED_CARDINALITY = eINSTANCE.getTemplateRole_QualifiedCardinality();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_ROLE__INSTANCES = eINSTANCE.getTemplateRole_Instances();

		/**
		 * The meta object literal for the '<em><b>Entity Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_ROLE__ENTITY_TYPE = eINSTANCE.getTemplateRole_EntityType();

		/**
		 * The meta object literal for the '{@link ru.agentlab.dsl15926.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.dsl15926.impl.RepositoryImpl
		 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CLASSES = eINSTANCE.getRepository_Classes();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__TEMPLATES = eINSTANCE.getRepository_Templates();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__URL = eINSTANCE.getRepository_Url();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__IMPORTS = eINSTANCE.getRepository_Imports();

		/**
		 * The meta object literal for the '<em><b>Individuals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__INDIVIDUALS = eINSTANCE.getRepository_Individuals();

		/**
		 * The meta object literal for the '<em><b>Template Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__TEMPLATE_INSTANCES = eINSTANCE.getRepository_TemplateInstances();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__PATTERNS = eINSTANCE.getRepository_Patterns();

		/**
		 * The meta object literal for the '{@link ru.agentlab.dsl15926.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.dsl15926.impl.NamedElementImpl
		 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__LABEL = eINSTANCE.getNamedElement_Label();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__ANNOTATIONS = eINSTANCE.getNamedElement_Annotations();

		/**
		 * The meta object literal for the '{@link ru.agentlab.dsl15926.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.dsl15926.impl.AnnotationImpl
		 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__TYPE = eINSTANCE.getAnnotation_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__LANG = eINSTANCE.getAnnotation_Lang();

		/**
		 * The meta object literal for the '{@link ru.agentlab.dsl15926.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.dsl15926.impl.IndividualImpl
		 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '<em><b>Patterns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__PATTERNS = eINSTANCE.getIndividual_Patterns();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__REPOSITORY = eINSTANCE.getIndividual_Repository();

		/**
		 * The meta object literal for the '{@link ru.agentlab.dsl15926.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.dsl15926.impl.ClassImpl
		 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Individuals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__INDIVIDUALS = eINSTANCE.getClass_Individuals();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__REPOSITORY = eINSTANCE.getClass_Repository();

		/**
		 * The meta object literal for the '{@link ru.agentlab.dsl15926.impl.TemplateInstanceImpl <em>Template Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.dsl15926.impl.TemplateInstanceImpl
		 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getTemplateInstance()
		 * @generated
		 */
		EClass TEMPLATE_INSTANCE = eINSTANCE.getTemplateInstance();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_INSTANCE__TEMPLATE = eINSTANCE.getTemplateInstance_Template();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_INSTANCE__ROLES = eINSTANCE.getTemplateInstance_Roles();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_INSTANCE__REPOSITORY = eINSTANCE.getTemplateInstance_Repository();

		/**
		 * The meta object literal for the '{@link ru.agentlab.dsl15926.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.dsl15926.impl.PatternImpl
		 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Individuals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__INDIVIDUALS = eINSTANCE.getPattern_Individuals();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__REPOSITORY = eINSTANCE.getPattern_Repository();

		/**
		 * The meta object literal for the '{@link ru.agentlab.dsl15926.impl.TemplateRoleInstanceImpl <em>Template Role Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.dsl15926.impl.TemplateRoleInstanceImpl
		 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getTemplateRoleInstance()
		 * @generated
		 */
		EClass TEMPLATE_ROLE_INSTANCE = eINSTANCE.getTemplateRoleInstance();

		/**
		 * The meta object literal for the '<em><b>Template Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_ROLE_INSTANCE__TEMPLATE_ROLE = eINSTANCE.getTemplateRoleInstance_TemplateRole();

		/**
		 * The meta object literal for the '<em><b>Property Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_ROLE_INSTANCE__PROPERTY_INSTANCE = eINSTANCE.getTemplateRoleInstance_PropertyInstance();

		/**
		 * The meta object literal for the '{@link ru.agentlab.dsl15926.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.agentlab.dsl15926.impl.ThingImpl
		 * @see ru.agentlab.dsl15926.impl.Dsl15926PackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__CLASSES = eINSTANCE.getThing_Classes();

	}

} //Dsl15926Package