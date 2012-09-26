/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.agentlab.dsl15926.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ru.agentlab.dsl15926.AbstractObject;
import ru.agentlab.dsl15926.Annotation;
import ru.agentlab.dsl15926.ClassExpression;
import ru.agentlab.dsl15926.ClassProperty;
import ru.agentlab.dsl15926.DataProperty;
import ru.agentlab.dsl15926.DataPropertyInstance;
import ru.agentlab.dsl15926.DataRange;
import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.Individual;
import ru.agentlab.dsl15926.NamedElement;
import ru.agentlab.dsl15926.ObjectProperty;
import ru.agentlab.dsl15926.ObjectPropertyInstance;
import ru.agentlab.dsl15926.Pattern;
import ru.agentlab.dsl15926.PropertyInstance;
import ru.agentlab.dsl15926.Repository;
import ru.agentlab.dsl15926.Template;
import ru.agentlab.dsl15926.TemplateInstance;
import ru.agentlab.dsl15926.TemplateRole;
import ru.agentlab.dsl15926.TemplateRoleInstance;
import ru.agentlab.dsl15926.Thing;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ru.agentlab.dsl15926.Dsl15926Package
 * @generated
 */
public class Dsl15926Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dsl15926Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl15926Switch() {
		if (modelPackage == null) {
			modelPackage = Dsl15926Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Dsl15926Package.ABSTRACT_OBJECT: {
				AbstractObject abstractObject = (AbstractObject)theEObject;
				T result = caseAbstractObject(abstractObject);
				if (result == null) result = caseThing(abstractObject);
				if (result == null) result = caseNamedElement(abstractObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.TEMPLATE: {
				Template template = (Template)theEObject;
				T result = caseTemplate(template);
				if (result == null) result = caseAbstractObject(template);
				if (result == null) result = caseThing(template);
				if (result == null) result = caseNamedElement(template);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.TEMPLATE_ROLE: {
				TemplateRole templateRole = (TemplateRole)theEObject;
				T result = caseTemplateRole(templateRole);
				if (result == null) result = caseNamedElement(templateRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.OBJECT_PROPERTY: {
				ObjectProperty objectProperty = (ObjectProperty)theEObject;
				T result = caseObjectProperty(objectProperty);
				if (result == null) result = caseClassProperty(objectProperty);
				if (result == null) result = caseNamedElement(objectProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.DATA_PROPERTY: {
				DataProperty dataProperty = (DataProperty)theEObject;
				T result = caseDataProperty(dataProperty);
				if (result == null) result = caseClassProperty(dataProperty);
				if (result == null) result = caseNamedElement(dataProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.CLASS_PROPERTY: {
				ClassProperty classProperty = (ClassProperty)theEObject;
				T result = caseClassProperty(classProperty);
				if (result == null) result = caseNamedElement(classProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.DATA_RANGE: {
				DataRange dataRange = (DataRange)theEObject;
				T result = caseDataRange(dataRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.INDIVIDUAL: {
				Individual individual = (Individual)theEObject;
				T result = caseIndividual(individual);
				if (result == null) result = caseThing(individual);
				if (result == null) result = caseNamedElement(individual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.DATA_PROPERTY_INSTANCE: {
				DataPropertyInstance dataPropertyInstance = (DataPropertyInstance)theEObject;
				T result = caseDataPropertyInstance(dataPropertyInstance);
				if (result == null) result = casePropertyInstance(dataPropertyInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.CLASS: {
				ru.agentlab.dsl15926.Class class_ = (ru.agentlab.dsl15926.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseAbstractObject(class_);
				if (result == null) result = caseThing(class_);
				if (result == null) result = caseNamedElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.TEMPLATE_INSTANCE: {
				TemplateInstance templateInstance = (TemplateInstance)theEObject;
				T result = caseTemplateInstance(templateInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = caseNamedElement(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.TEMPLATE_ROLE_INSTANCE: {
				TemplateRoleInstance templateRoleInstance = (TemplateRoleInstance)theEObject;
				T result = caseTemplateRoleInstance(templateRoleInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.OBJECT_PROPERTY_INSTANCE: {
				ObjectPropertyInstance objectPropertyInstance = (ObjectPropertyInstance)theEObject;
				T result = caseObjectPropertyInstance(objectPropertyInstance);
				if (result == null) result = casePropertyInstance(objectPropertyInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.PROPERTY_INSTANCE: {
				PropertyInstance propertyInstance = (PropertyInstance)theEObject;
				T result = casePropertyInstance(propertyInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Dsl15926Package.THING: {
				Thing thing = (Thing)theEObject;
				T result = caseThing(thing);
				if (result == null) result = caseNamedElement(thing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractObject(AbstractObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplate(Template object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateRole(TemplateRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectProperty(ObjectProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataProperty(DataProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassProperty(ClassProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRange(DataRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividual(Individual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Property Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Property Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPropertyInstance(DataPropertyInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(ru.agentlab.dsl15926.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateInstance(TemplateInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Role Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Role Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateRoleInstance(TemplateRoleInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Property Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Property Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectPropertyInstance(ObjectPropertyInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyInstance(PropertyInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThing(Thing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Dsl15926Switch
