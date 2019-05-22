/**
 * generated by Xtext 2.16.0
 */
package org.xtext.projectparamorel.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.projectparamorel.dsl.dsl.Preference#getScores <em>Scores</em>}</li>
 * </ul>
 *
 * @see org.xtext.projectparamorel.dsl.dsl.DslPackage#getPreference()
 * @model
 * @generated
 */
public interface Preference extends EObject
{
  /**
   * Returns the value of the '<em><b>Scores</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.projectparamorel.dsl.dsl.Score}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scores</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scores</em>' containment reference list.
   * @see org.xtext.projectparamorel.dsl.dsl.DslPackage#getPreference_Scores()
   * @model containment="true"
   * @generated
   */
  EList<Score> getScores();

} // Preference
