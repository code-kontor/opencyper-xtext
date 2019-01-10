/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Yield Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.YieldItems#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getYieldItems()
 * @model
 * @generated
 */
public interface YieldItems extends EObject
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link io.codekontor.opencypher.xtext.openCypher.YieldItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getYieldItems_Items()
   * @model containment="true"
   * @generated
   */
  EList<YieldItem> getItems();

} // YieldItems
