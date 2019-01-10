/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Comprehension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.PatternComprehension#getPathVariable <em>Path Variable</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.PatternComprehension#getPattern <em>Pattern</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.PatternComprehension#getWhere <em>Where</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.PatternComprehension#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getPatternComprehension()
 * @model
 * @generated
 */
public interface PatternComprehension extends Expression
{
  /**
   * Returns the value of the '<em><b>Path Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path Variable</em>' containment reference.
   * @see #setPathVariable(VariableDeclaration)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getPatternComprehension_PathVariable()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getPathVariable();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.PatternComprehension#getPathVariable <em>Path Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path Variable</em>' containment reference.
   * @see #getPathVariable()
   * @generated
   */
  void setPathVariable(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(RelationshipsPattern)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getPatternComprehension_Pattern()
   * @model containment="true"
   * @generated
   */
  RelationshipsPattern getPattern();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.PatternComprehension#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(RelationshipsPattern value);

  /**
   * Returns the value of the '<em><b>Where</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' containment reference.
   * @see #setWhere(Where)
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getPatternComprehension_Where()
   * @model containment="true"
   * @generated
   */
  Where getWhere();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.PatternComprehension#getWhere <em>Where</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where</em>' containment reference.
   * @see #getWhere()
   * @generated
   */
  void setWhere(Where value);

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
   * @see io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage#getPatternComprehension_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link io.codekontor.opencypher.xtext.openCypher.PatternComprehension#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // PatternComprehension
