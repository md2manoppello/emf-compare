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
package org.eclipse.emf.compare.diff;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Reference Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.compare.diff.AddReferenceValue#getLeftAddedTarget <em>Left Added Target</em>}</li>
 *   <li>{@link org.eclipse.emf.compare.diff.AddReferenceValue#getRightAddedTarget <em>Right Added Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.compare.diff.DiffPackage#getAddReferenceValue()
 * @model
 * @generated
 */
public interface AddReferenceValue extends ReferenceChange {
	/**
	 * Returns the value of the '<em><b>Left Added Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Added Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Added Target</em>' reference list.
	 * @see org.eclipse.emf.compare.diff.DiffPackage#getAddReferenceValue_LeftAddedTarget()
	 * @model type="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EList getLeftAddedTarget();

	/**
	 * Returns the value of the '<em><b>Right Added Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Added Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Added Target</em>' reference list.
	 * @see org.eclipse.emf.compare.diff.DiffPackage#getAddReferenceValue_RightAddedTarget()
	 * @model type="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EList getRightAddedTarget();

} // AddReferenceValue