/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher.impl;

import io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage;
import io.codekontor.opencypher.xtext.openCypher.PropertyExpression;
import io.codekontor.opencypher.xtext.openCypher.RelationshipPatternSyntax;
import io.codekontor.opencypher.xtext.openCypher.RelationshipPropertyExistenceConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Property Existence Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.impl.RelationshipPropertyExistenceConstraintImpl#getRelationshipPattern <em>Relationship Pattern</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.impl.RelationshipPropertyExistenceConstraintImpl#getPropertyExpression <em>Property Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipPropertyExistenceConstraintImpl extends CreateRelationshipPropertyExistenceConstraintImpl implements RelationshipPropertyExistenceConstraint
{
  /**
   * The cached value of the '{@link #getRelationshipPattern() <em>Relationship Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationshipPattern()
   * @generated
   * @ordered
   */
  protected RelationshipPatternSyntax relationshipPattern;

  /**
   * The cached value of the '{@link #getPropertyExpression() <em>Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyExpression()
   * @generated
   * @ordered
   */
  protected PropertyExpression propertyExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipPropertyExistenceConstraintImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OpenCypherPackage.Literals.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipPatternSyntax getRelationshipPattern()
  {
    return relationshipPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelationshipPattern(RelationshipPatternSyntax newRelationshipPattern, NotificationChain msgs)
  {
    RelationshipPatternSyntax oldRelationshipPattern = relationshipPattern;
    relationshipPattern = newRelationshipPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PATTERN, oldRelationshipPattern, newRelationshipPattern);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelationshipPattern(RelationshipPatternSyntax newRelationshipPattern)
  {
    if (newRelationshipPattern != relationshipPattern)
    {
      NotificationChain msgs = null;
      if (relationshipPattern != null)
        msgs = ((InternalEObject)relationshipPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PATTERN, null, msgs);
      if (newRelationshipPattern != null)
        msgs = ((InternalEObject)newRelationshipPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PATTERN, null, msgs);
      msgs = basicSetRelationshipPattern(newRelationshipPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PATTERN, newRelationshipPattern, newRelationshipPattern));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyExpression getPropertyExpression()
  {
    return propertyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPropertyExpression(PropertyExpression newPropertyExpression, NotificationChain msgs)
  {
    PropertyExpression oldPropertyExpression = propertyExpression;
    propertyExpression = newPropertyExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__PROPERTY_EXPRESSION, oldPropertyExpression, newPropertyExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPropertyExpression(PropertyExpression newPropertyExpression)
  {
    if (newPropertyExpression != propertyExpression)
    {
      NotificationChain msgs = null;
      if (propertyExpression != null)
        msgs = ((InternalEObject)propertyExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__PROPERTY_EXPRESSION, null, msgs);
      if (newPropertyExpression != null)
        msgs = ((InternalEObject)newPropertyExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__PROPERTY_EXPRESSION, null, msgs);
      msgs = basicSetPropertyExpression(newPropertyExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__PROPERTY_EXPRESSION, newPropertyExpression, newPropertyExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PATTERN:
        return basicSetRelationshipPattern(null, msgs);
      case OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__PROPERTY_EXPRESSION:
        return basicSetPropertyExpression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PATTERN:
        return getRelationshipPattern();
      case OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__PROPERTY_EXPRESSION:
        return getPropertyExpression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PATTERN:
        setRelationshipPattern((RelationshipPatternSyntax)newValue);
        return;
      case OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__PROPERTY_EXPRESSION:
        setPropertyExpression((PropertyExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PATTERN:
        setRelationshipPattern((RelationshipPatternSyntax)null);
        return;
      case OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__PROPERTY_EXPRESSION:
        setPropertyExpression((PropertyExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__RELATIONSHIP_PATTERN:
        return relationshipPattern != null;
      case OpenCypherPackage.RELATIONSHIP_PROPERTY_EXISTENCE_CONSTRAINT__PROPERTY_EXPRESSION:
        return propertyExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //RelationshipPropertyExistenceConstraintImpl
