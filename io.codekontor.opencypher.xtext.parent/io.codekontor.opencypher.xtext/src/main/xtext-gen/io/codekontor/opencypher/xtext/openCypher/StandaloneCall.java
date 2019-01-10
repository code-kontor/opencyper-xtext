/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standalone Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.StandaloneCall#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.StandaloneCall#getYieldItems <em>Yield Items</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getStandaloneCall()
 * @model
 * @generated
 */
public interface StandaloneCall extends Query
{
  /**
   * Returns the value of the '<em><b>Invocation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invocation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invocation</em>' containment reference.
   * @see #setInvocation(EObject)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getStandaloneCall_Invocation()
   * @model containment="true"
   * @generated
   */
  EObject getInvocation();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.StandaloneCall#getInvocation <em>Invocation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invocation</em>' containment reference.
   * @see #getInvocation()
   * @generated
   */
  void setInvocation(EObject value);

  /**
   * Returns the value of the '<em><b>Yield Items</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Yield Items</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yield Items</em>' containment reference.
   * @see #setYieldItems(YieldItems)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getStandaloneCall_YieldItems()
   * @model containment="true"
   * @generated
   */
  YieldItems getYieldItems();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.StandaloneCall#getYieldItems <em>Yield Items</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yield Items</em>' containment reference.
   * @see #getYieldItems()
   * @generated
   */
  void setYieldItems(YieldItems value);

} // StandaloneCall
