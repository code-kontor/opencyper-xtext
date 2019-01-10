/**
 * generated by Xtext 2.15.0
 */
package io.codekontor.opencypher.xtext.openCypher.impl;

import io.codekontor.opencypher.xtext.openCypher.NodeLabel;
import io.codekontor.opencypher.xtext.openCypher.OpenCypherPackage;
import io.codekontor.opencypher.xtext.openCypher.ScanHint;
import io.codekontor.opencypher.xtext.openCypher.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scan Hint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.impl.ScanHintImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link io.codekontor.opencypher.xtext.openCypher.impl.ScanHintImpl#getNodeLabel <em>Node Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScanHintImpl extends HintImpl implements ScanHint
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected VariableDeclaration variable;

  /**
   * The cached value of the '{@link #getNodeLabel() <em>Node Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeLabel()
   * @generated
   * @ordered
   */
  protected NodeLabel nodeLabel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScanHintImpl()
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
    return OpenCypherPackage.Literals.SCAN_HINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(VariableDeclaration newVariable, NotificationChain msgs)
  {
    VariableDeclaration oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.SCAN_HINT__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(VariableDeclaration newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.SCAN_HINT__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.SCAN_HINT__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.SCAN_HINT__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeLabel getNodeLabel()
  {
    return nodeLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodeLabel(NodeLabel newNodeLabel, NotificationChain msgs)
  {
    NodeLabel oldNodeLabel = nodeLabel;
    nodeLabel = newNodeLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenCypherPackage.SCAN_HINT__NODE_LABEL, oldNodeLabel, newNodeLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNodeLabel(NodeLabel newNodeLabel)
  {
    if (newNodeLabel != nodeLabel)
    {
      NotificationChain msgs = null;
      if (nodeLabel != null)
        msgs = ((InternalEObject)nodeLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.SCAN_HINT__NODE_LABEL, null, msgs);
      if (newNodeLabel != null)
        msgs = ((InternalEObject)newNodeLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenCypherPackage.SCAN_HINT__NODE_LABEL, null, msgs);
      msgs = basicSetNodeLabel(newNodeLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OpenCypherPackage.SCAN_HINT__NODE_LABEL, newNodeLabel, newNodeLabel));
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
      case OpenCypherPackage.SCAN_HINT__VARIABLE:
        return basicSetVariable(null, msgs);
      case OpenCypherPackage.SCAN_HINT__NODE_LABEL:
        return basicSetNodeLabel(null, msgs);
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
      case OpenCypherPackage.SCAN_HINT__VARIABLE:
        return getVariable();
      case OpenCypherPackage.SCAN_HINT__NODE_LABEL:
        return getNodeLabel();
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
      case OpenCypherPackage.SCAN_HINT__VARIABLE:
        setVariable((VariableDeclaration)newValue);
        return;
      case OpenCypherPackage.SCAN_HINT__NODE_LABEL:
        setNodeLabel((NodeLabel)newValue);
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
      case OpenCypherPackage.SCAN_HINT__VARIABLE:
        setVariable((VariableDeclaration)null);
        return;
      case OpenCypherPackage.SCAN_HINT__NODE_LABEL:
        setNodeLabel((NodeLabel)null);
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
      case OpenCypherPackage.SCAN_HINT__VARIABLE:
        return variable != null;
      case OpenCypherPackage.SCAN_HINT__NODE_LABEL:
        return nodeLabel != null;
    }
    return super.eIsSet(featureID);
  }

} //ScanHintImpl
