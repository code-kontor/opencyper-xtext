/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Hint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.JoinHint#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getJoinHint()
 * @model
 * @generated
 */
public interface JoinHint extends Hint
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link io.codekontor.opencypher.xtext.openCypher.VariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getJoinHint_Variables()
   * @model containment="true"
   * @generated
   */
  EList<VariableDeclaration> getVariables();

} // JoinHint
