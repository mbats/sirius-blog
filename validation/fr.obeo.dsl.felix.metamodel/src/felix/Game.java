/**
 */
package felix;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link felix.Game#getBuilding <em>Building</em>}</li>
 * </ul>
 *
 * @see felix.FelixPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Building</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building</em>' containment reference.
	 * @see #setBuilding(Building)
	 * @see felix.FelixPackage#getGame_Building()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Building getBuilding();

	/**
	 * Sets the value of the '{@link felix.Game#getBuilding <em>Building</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building</em>' containment reference.
	 * @see #getBuilding()
	 * @generated
	 */
	void setBuilding(Building value);

} // Game
