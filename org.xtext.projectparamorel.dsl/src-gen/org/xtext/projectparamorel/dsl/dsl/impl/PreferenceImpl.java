/**
 * generated by Xtext 2.16.0
 */
package org.xtext.projectparamorel.dsl.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.projectparamorel.dsl.dsl.DslPackage;
import org.xtext.projectparamorel.dsl.dsl.Preference;
import org.xtext.projectparamorel.dsl.dsl.Score;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Preference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.projectparamorel.dsl.dsl.impl.PreferenceImpl#getScores <em>Scores</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreferenceImpl extends MinimalEObjectImpl.Container implements Preference
{
  /**
   * The cached value of the '{@link #getScores() <em>Scores</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScores()
   * @generated
   * @ordered
   */
  protected EList<Score> scores;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreferenceImpl()
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
    return DslPackage.Literals.PREFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Score> getScores()
  {
    if (scores == null)
    {
      scores = new EObjectContainmentEList<Score>(Score.class, this, DslPackage.PREFERENCE__SCORES);
    }
    return scores;
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
      case DslPackage.PREFERENCE__SCORES:
        return ((InternalEList<?>)getScores()).basicRemove(otherEnd, msgs);
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
      case DslPackage.PREFERENCE__SCORES:
        return getScores();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.PREFERENCE__SCORES:
        getScores().clear();
        getScores().addAll((Collection<? extends Score>)newValue);
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
      case DslPackage.PREFERENCE__SCORES:
        getScores().clear();
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
      case DslPackage.PREFERENCE__SCORES:
        return scores != null && !scores.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PreferenceImpl
