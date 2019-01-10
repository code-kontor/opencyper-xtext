/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.PatternPart#getVar <em>Var</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.PatternPart#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getPatternPart()
 * @model
 * @generated
 */
public interface PatternPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(VariableDeclaration)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getPatternPart_Var()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVar();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.PatternPart#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part</em>' containment reference.
   * @see #setPart(AnonymousPatternPart)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getPatternPart_Part()
   * @model containment="true"
   * @generated
   */
  AnonymousPatternPart getPart();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.PatternPart#getPart <em>Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part</em>' containment reference.
   * @see #getPart()
   * @generated
   */
  void setPart(AnonymousPatternPart value);

} // PatternPart
