/*  
 * Copyright (c) 2006, Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 */
package org.eclipse.emf.compare.diff.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.compare.diff.DiffElement;
import org.eclipse.emf.compare.diff.DiffFactory;
import org.eclipse.emf.compare.diff.DiffPackage;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.compare.diff.DiffElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiffElementItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiffElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		return getString("_UI_DiffElement_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DiffElement.class)) {
		case DiffPackage.DIFF_ELEMENT__SUB_DIFF_ELEMENTS:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors,
			Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS,
				DiffFactory.eINSTANCE.createAttributeChange()));

		newChildDescriptors.add(createChildParameter(
				DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS,
				DiffFactory.eINSTANCE.createReferenceChange()));

		newChildDescriptors.add(createChildParameter(
				DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS,
				DiffFactory.eINSTANCE.createModelElementChange()));

		newChildDescriptors.add(createChildParameter(
				DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS,
				DiffFactory.eINSTANCE.createAddModelElement()));

		newChildDescriptors.add(createChildParameter(
				DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS,
				DiffFactory.eINSTANCE.createRemoveModelElement()));

		newChildDescriptors.add(createChildParameter(
				DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS,
				DiffFactory.eINSTANCE.createUpdateModelElement()));

		newChildDescriptors.add(createChildParameter(
				DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS,
				DiffFactory.eINSTANCE.createMoveModelElement()));

		newChildDescriptors.add(createChildParameter(
				DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS,
				DiffFactory.eINSTANCE.createAddAttribute()));

		newChildDescriptors.add(createChildParameter(
				DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS,
				DiffFactory.eINSTANCE.createRemoveAttribute()));

		newChildDescriptors.add(createChildParameter(
				DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS,
				DiffFactory.eINSTANCE.createUpdateAttribute()));

		newChildDescriptors.add(createChildParameter(
				DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS,
				DiffFactory.eINSTANCE.createAddReferenceValue()));

		newChildDescriptors.add(createChildParameter(
				DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS,
				DiffFactory.eINSTANCE.createRemoveReferenceValue()));

		newChildDescriptors.add(createChildParameter(
				DiffPackage.Literals.DIFF_ELEMENT__SUB_DIFF_ELEMENTS,
				DiffFactory.eINSTANCE.createUpdateReference()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return DiffEditPlugin.INSTANCE;
	}

}