/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.NodePattern#getVariable <em>Variable</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.NodePattern#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getNodePattern()
 * @model
 * @generated
 */
public interface NodePattern extends NodeLabels
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
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getNodePattern_Variable()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.NodePattern#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(Properties)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getNodePattern_Properties()
   * @model containment="true"
   * @generated
   */
  Properties getProperties();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.NodePattern#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(Properties value);

} // NodePattern
