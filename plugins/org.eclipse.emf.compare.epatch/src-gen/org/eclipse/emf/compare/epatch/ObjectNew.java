/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.compare.epatch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object New</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.compare.epatch.ObjectNew#getImport <em>Import</em>}</li>
 *   <li>{@link org.eclipse.emf.compare.epatch.ObjectNew#getImpFrag <em>Imp Frag</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.compare.epatch.EpatchPackage#getObjectNew()
 * @model
 * @generated
 */
public interface ObjectNew extends CreatedObject
{
  /**
	 * Returns the value of the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference.
	 * @see #setImport(ModelImport)
	 * @see org.eclipse.emf.compare.epatch.EpatchPackage#getObjectNew_Import()
	 * @model
	 * @generated
	 */
  ModelImport getImport();

  /**
	 * Sets the value of the '{@link org.eclipse.emf.compare.epatch.ObjectNew#getImport <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' reference.
	 * @see #getImport()
	 * @generated
	 */
  void setImport(ModelImport value);

  /**
	 * Returns the value of the '<em><b>Imp Frag</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imp Frag</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Imp Frag</em>' attribute.
	 * @see #setImpFrag(String)
	 * @see org.eclipse.emf.compare.epatch.EpatchPackage#getObjectNew_ImpFrag()
	 * @model
	 * @generated
	 */
  String getImpFrag();

  /**
	 * Sets the value of the '{@link org.eclipse.emf.compare.epatch.ObjectNew#getImpFrag <em>Imp Frag</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imp Frag</em>' attribute.
	 * @see #getImpFrag()
	 * @generated
	 */
  void setImpFrag(String value);

} // ObjectNew
