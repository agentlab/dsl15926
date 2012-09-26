/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.agentlab.dsl15926.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.agentlab.dsl15926.Dsl15926Package
 * @generated
 */
public class Dsl15926AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Dsl15926Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dsl15926AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Dsl15926Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Dsl15926Switch<Adapter> modelSwitch =
		new Dsl15926Switch<Adapter>() {
			@Override
			public Adapter caseAbstractObject(AbstractObject object) {
				return createAbstractObjectAdapter();
			}
			@Override
			public Adapter caseTemplate(Template object) {
				return createTemplateAdapter();
			}
			@Override
			public Adapter caseTemplateRole(TemplateRole object) {
				return createTemplateRoleAdapter();
			}
			@Override
			public Adapter caseRepository(Repository object) {
				return createRepositoryAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseObjectProperty(ObjectProperty object) {
				return createObjectPropertyAdapter();
			}
			@Override
			public Adapter caseDataProperty(DataProperty object) {
				return createDataPropertyAdapter();
			}
			@Override
			public Adapter caseClassProperty(ClassProperty object) {
				return createClassPropertyAdapter();
			}
			@Override
			public Adapter caseDataRange(DataRange object) {
				return createDataRangeAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseIndividual(Individual object) {
				return createIndividualAdapter();
			}
			@Override
			public Adapter caseDataPropertyInstance(DataPropertyInstance object) {
				return createDataPropertyInstanceAdapter();
			}
			@Override
			public Adapter caseClass(ru.agentlab.dsl15926.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseTemplateInstance(TemplateInstance object) {
				return createTemplateInstanceAdapter();
			}
			@Override
			public Adapter casePattern(Pattern object) {
				return createPatternAdapter();
			}
			@Override
			public Adapter caseTemplateRoleInstance(TemplateRoleInstance object) {
				return createTemplateRoleInstanceAdapter();
			}
			@Override
			public Adapter caseObjectPropertyInstance(ObjectPropertyInstance object) {
				return createObjectPropertyInstanceAdapter();
			}
			@Override
			public Adapter casePropertyInstance(PropertyInstance object) {
				return createPropertyInstanceAdapter();
			}
			@Override
			public Adapter caseThing(Thing object) {
				return createThingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.AbstractObject <em>Abstract Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.AbstractObject
	 * @generated
	 */
	public Adapter createAbstractObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.Template
	 * @generated
	 */
	public Adapter createTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.TemplateRole <em>Template Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.TemplateRole
	 * @generated
	 */
	public Adapter createTemplateRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.Repository
	 * @generated
	 */
	public Adapter createRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.ObjectProperty <em>Object Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.ObjectProperty
	 * @generated
	 */
	public Adapter createObjectPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.DataProperty
	 * @generated
	 */
	public Adapter createDataPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.ClassProperty <em>Class Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.ClassProperty
	 * @generated
	 */
	public Adapter createClassPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.DataRange <em>Data Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.DataRange
	 * @generated
	 */
	public Adapter createDataRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.Individual
	 * @generated
	 */
	public Adapter createIndividualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.DataPropertyInstance <em>Data Property Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.DataPropertyInstance
	 * @generated
	 */
	public Adapter createDataPropertyInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.TemplateInstance <em>Template Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.TemplateInstance
	 * @generated
	 */
	public Adapter createTemplateInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.TemplateRoleInstance <em>Template Role Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.TemplateRoleInstance
	 * @generated
	 */
	public Adapter createTemplateRoleInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.ObjectPropertyInstance <em>Object Property Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.ObjectPropertyInstance
	 * @generated
	 */
	public Adapter createObjectPropertyInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.PropertyInstance <em>Property Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.PropertyInstance
	 * @generated
	 */
	public Adapter createPropertyInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.agentlab.dsl15926.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.agentlab.dsl15926.Thing
	 * @generated
	 */
	public Adapter createThingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Dsl15926AdapterFactory
