/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.SetItem#getPropertyExpression <em>Property Expression</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.SetItem#getExpression <em>Expression</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.SetItem#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getSetItem()
 * @model
 * @generated
 */
public interface SetItem extends NodeLabels
{
  /**
   * Returns the value of the '<em><b>Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Expression</em>' containment reference.
   * @see #setPropertyExpression(PropertyExpression)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getSetItem_PropertyExpression()
   * @model containment="true"
   * @generated
   */
  PropertyExpression getPropertyExpression();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.SetItem#getPropertyExpression <em>Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Expression</em>' containment reference.
   * @see #getPropertyExpression()
   * @generated
   */
  void setPropertyExpression(PropertyExpression value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getSetItem_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.SetItem#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableDeclaration)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getSetItem_Variable()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.SetItem#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

} // SetItem
