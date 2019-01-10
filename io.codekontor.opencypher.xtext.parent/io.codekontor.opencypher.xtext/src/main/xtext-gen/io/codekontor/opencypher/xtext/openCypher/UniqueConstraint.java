/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.UniqueConstraint#getVariable <em>Variable</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.UniqueConstraint#getNodeLabel <em>Node Label</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.UniqueConstraint#getPropertyExpression <em>Property Expression</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getUniqueConstraint()
 * @model
 * @generated
 */
public interface UniqueConstraint extends CreateUniqueConstraint
{
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
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getUniqueConstraint_Variable()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.UniqueConstraint#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Node Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Label</em>' containment reference.
   * @see #setNodeLabel(NodeLabel)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getUniqueConstraint_NodeLabel()
   * @model containment="true"
   * @generated
   */
  NodeLabel getNodeLabel();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.UniqueConstraint#getNodeLabel <em>Node Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Label</em>' containment reference.
   * @see #getNodeLabel()
   * @generated
   */
  void setNodeLabel(NodeLabel value);

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
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getUniqueConstraint_PropertyExpression()
   * @model containment="true"
   * @generated
   */
  PropertyExpression getPropertyExpression();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.UniqueConstraint#getPropertyExpression <em>Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Expression</em>' containment reference.
   * @see #getPropertyExpression()
   * @generated
   */
  void setPropertyExpression(PropertyExpression value);

} // UniqueConstraint
