/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.compare.epatch.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.compare.epatch.EpatchPackage;
import org.eclipse.emf.compare.epatch.ModelImport;
import org.eclipse.emf.compare.epatch.ObjectNew;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object New</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.compare.epatch.impl.ObjectNewImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.emf.compare.epatch.impl.ObjectNewImpl#getImpFrag <em>Imp Frag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectNewImpl extends CreatedObjectImpl implements ObjectNew
{
  /**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
  protected ModelImport import_;

  /**
	 * The default value of the '{@link #getImpFrag() <em>Imp Frag</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImpFrag()
	 * @generated
	 * @ordered
	 */
  protected static final String IMP_FRAG_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getImpFrag() <em>Imp Frag</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImpFrag()
	 * @generated
	 * @ordered
	 */
  protected String impFrag = IMP_FRAG_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ObjectNewImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return EpatchPackage.Literals.OBJECT_NEW;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ModelImport getImport()
  {
		if (import_ != null && import_.eIsProxy()) {
			InternalEObject oldImport = (InternalEObject)import_;
			import_ = (ModelImport)eResolveProxy(oldImport);
			if (import_ != oldImport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EpatchPackage.OBJECT_NEW__IMPORT, oldImport, import_));
			}
		}
		return import_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ModelImport basicGetImport()
  {
		return import_;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setImport(ModelImport newImport)
  {
		ModelImport oldImport = import_;
		import_ = newImport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpatchPackage.OBJECT_NEW__IMPORT, oldImport, import_));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getImpFrag()
  {
		return impFrag;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setImpFrag(String newImpFrag)
  {
		String oldImpFrag = impFrag;
		impFrag = newImpFrag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpatchPackage.OBJECT_NEW__IMP_FRAG, oldImpFrag, impFrag));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case EpatchPackage.OBJECT_NEW__IMPORT:
				if (resolve) return getImport();
				return basicGetImport();
			case EpatchPackage.OBJECT_NEW__IMP_FRAG:
				return getImpFrag();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EpatchPackage.OBJECT_NEW__IMPORT:
				setImport((ModelImport)newValue);
				return;
			case EpatchPackage.OBJECT_NEW__IMP_FRAG:
				setImpFrag((String)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case EpatchPackage.OBJECT_NEW__IMPORT:
				setImport((ModelImport)null);
				return;
			case EpatchPackage.OBJECT_NEW__IMP_FRAG:
				setImpFrag(IMP_FRAG_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case EpatchPackage.OBJECT_NEW__IMPORT:
				return import_ != null;
			case EpatchPackage.OBJECT_NEW__IMP_FRAG:
				return IMP_FRAG_EDEFAULT == null ? impFrag != null : !IMP_FRAG_EDEFAULT.equals(impFrag);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (impFrag: ");
		result.append(impFrag);
		result.append(')');
		return result.toString();
	}

} //ObjectNewImpl
