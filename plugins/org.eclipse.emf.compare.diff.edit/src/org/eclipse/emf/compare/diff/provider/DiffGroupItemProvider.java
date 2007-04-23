/**
 * <copyright>
 * </copyright>
 *
 * $Id: DiffGroupItemProvider.java,v 1.3 2007/04/17 06:05:58 cbrun Exp $
 */
package org.eclipse.emf.compare.diff.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.compare.diff.DiffGroup;
import org.eclipse.emf.compare.diff.DiffPackage;
import org.eclipse.emf.compare.match.statistic.similarity.NameSimilarity;
import org.eclipse.emf.compare.util.FactoryException;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.emf.compare.diff.DiffGroup} object.
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class DiffGroupItemProvider extends DiffElementItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DiffGroupItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLeftParentPropertyDescriptor(object);
			addSubchangesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Left Parent feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLeftParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DiffGroup_leftParent_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_DiffGroup_leftParent_feature",
						"_UI_DiffGroup_type"),
				DiffPackage.Literals.DIFF_GROUP__LEFT_PARENT, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Subchanges feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubchangesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(), getResourceLocator(),
						getString("_UI_DiffGroup_subchanges_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DiffGroup_subchanges_feature",
								"_UI_DiffGroup_type"),
						DiffPackage.Literals.DIFF_GROUP__SUBCHANGES, true,
						false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DiffGroup.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/DiffGroup"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getText(Object object) {
		DiffGroup group = (DiffGroup) object;
		if (group.getLeftParent() != null) {
			try {
				return getString("_UI_DiffGroup_type", new Object[] {
						group.getSubchanges(),
						group.getLeftParent().eClass().getName()+" ",
						NameSimilarity.findName(group.getLeftParent()) });
			} catch (FactoryException e) {
				return getString("_UI_DiffGroup_type", new Object[] {
						group.getSubchanges(),
						group.getLeftParent().eClass().getName(), " model" });
			}
		} else {
			return getString("_UI_DiffGroup_type", new Object[] {
					group.getSubchanges(), "", " model" });
		}
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DiffGroup.class)) {
		case DiffPackage.DIFF_GROUP__SUBCHANGES:
			fireNotifyChanged(new ViewerNotification(notification, notification
					.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing all of the children that can be created under this object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors,
			Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return DiffEditPlugin.INSTANCE;
	}

}