/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Node Property Existence Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.DropNodePropertyExistenceConstraint#getNodePropertyExistenceConstraint <em>Node Property Existence Constraint</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getDropNodePropertyExistenceConstraint()
 * @model
 * @generated
 */
public interface DropNodePropertyExistenceConstraint extends Command
{
  /**
   * Returns the value of the '<em><b>Node Property Existence Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Property Existence Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Property Existence Constraint</em>' containment reference.
   * @see #setNodePropertyExistenceConstraint(NodePropertyExistenceConstraint)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getDropNodePropertyExistenceConstraint_NodePropertyExistenceConstraint()
   * @model containment="true"
   * @generated
   */
  NodePropertyExistenceConstraint getNodePropertyExistenceConstraint();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.DropNodePropertyExistenceConstraint#getNodePropertyExistenceConstraint <em>Node Property Existence Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Property Existence Constraint</em>' containment reference.
   * @see #getNodePropertyExistenceConstraint()
   * @generated
   */
  void setNodePropertyExistenceConstraint(NodePropertyExistenceConstraint value);

} // DropNodePropertyExistenceConstraint