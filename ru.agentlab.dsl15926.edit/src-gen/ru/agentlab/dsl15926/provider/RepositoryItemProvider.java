/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ru.agentlab.dsl15926.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ru.agentlab.dsl15926.Dsl15926Factory;
import ru.agentlab.dsl15926.Dsl15926Package;
import ru.agentlab.dsl15926.Repository;

/**
 * This is the item provider adapter for a {@link ru.agentlab.dsl15926.Repository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUrlPropertyDescriptor(object);
			addImportsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Repository_url_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Repository_url_feature", "_UI_Repository_type"),
				 Dsl15926Package.Literals.REPOSITORY__URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Repository_imports_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Repository_imports_feature", "_UI_Repository_type"),
				 Dsl15926Package.Literals.REPOSITORY__IMPORTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Dsl15926Package.Literals.REPOSITORY__CLASSES);
			childrenFeatures.add(Dsl15926Package.Literals.REPOSITORY__OBJECT_PROPERTIES);
			childrenFeatures.add(Dsl15926Package.Literals.REPOSITORY__DATA_PROPERETIES);
			childrenFeatures.add(Dsl15926Package.Literals.REPOSITORY__TEMPLATES);
			childrenFeatures.add(Dsl15926Package.Literals.REPOSITORY__DATA_RANGES);
			childrenFeatures.add(Dsl15926Package.Literals.REPOSITORY__INDIVIDUALS);
			childrenFeatures.add(Dsl15926Package.Literals.REPOSITORY__TEMPLATE_INSTANCES);
			childrenFeatures.add(Dsl15926Package.Literals.REPOSITORY__PATTERNS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Repository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Repository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Repository)object).getUrl();
		return label == null || label.length() == 0 ?
			getString("_UI_Repository_type") :
			getString("_UI_Repository_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Repository.class)) {
			case Dsl15926Package.REPOSITORY__URL:
			case Dsl15926Package.REPOSITORY__IMPORTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Dsl15926Package.REPOSITORY__CLASSES:
			case Dsl15926Package.REPOSITORY__OBJECT_PROPERTIES:
			case Dsl15926Package.REPOSITORY__DATA_PROPERETIES:
			case Dsl15926Package.REPOSITORY__TEMPLATES:
			case Dsl15926Package.REPOSITORY__DATA_RANGES:
			case Dsl15926Package.REPOSITORY__INDIVIDUALS:
			case Dsl15926Package.REPOSITORY__TEMPLATE_INSTANCES:
			case Dsl15926Package.REPOSITORY__PATTERNS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Dsl15926Package.Literals.REPOSITORY__CLASSES,
				 Dsl15926Factory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(Dsl15926Package.Literals.REPOSITORY__OBJECT_PROPERTIES,
				 Dsl15926Factory.eINSTANCE.createObjectProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Dsl15926Package.Literals.REPOSITORY__DATA_PROPERETIES,
				 Dsl15926Factory.eINSTANCE.createDataProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Dsl15926Package.Literals.REPOSITORY__TEMPLATES,
				 Dsl15926Factory.eINSTANCE.createTemplate()));

		newChildDescriptors.add
			(createChildParameter
				(Dsl15926Package.Literals.REPOSITORY__DATA_RANGES,
				 Dsl15926Factory.eINSTANCE.createDataRange()));

		newChildDescriptors.add
			(createChildParameter
				(Dsl15926Package.Literals.REPOSITORY__INDIVIDUALS,
				 Dsl15926Factory.eINSTANCE.createIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(Dsl15926Package.Literals.REPOSITORY__TEMPLATE_INSTANCES,
				 Dsl15926Factory.eINSTANCE.createTemplateInstance()));

		newChildDescriptors.add
			(createChildParameter
				(Dsl15926Package.Literals.REPOSITORY__PATTERNS,
				 Dsl15926Factory.eINSTANCE.createPattern()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Dsl15926EditPlugin.INSTANCE;
	}

}
