/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.VariableRef#getVariableRef <em>Variable Ref</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getVariableRef()
 * @model
 * @generated
 */
public interface VariableRef extends Expression
{
  /**
   * Returns the value of the '<em><b>Variable Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Ref</em>' reference.
   * @see #setVariableRef(VariableDeclaration)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getVariableRef_VariableRef()
   * @model
   * @generated
   */
  VariableDeclaration getVariableRef();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.VariableRef#getVariableRef <em>Variable Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Ref</em>' reference.
   * @see #getVariableRef()
   * @generated
   */
  void setVariableRef(VariableDeclaration value);

} // VariableRef
