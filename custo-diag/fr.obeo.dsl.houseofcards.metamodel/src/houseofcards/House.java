/**
 */
package houseofcards;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link houseofcards.House#getHouses <em>Houses</em>}</li>
 * </ul>
 *
 * @see houseofcards.HouseofcardsPackage#getHouse()
 * @model
 * @generated
 */
public interface House extends EObject {
	/**
	 * Returns the value of the '<em><b>Houses</b></em>' containment reference list.
	 * The list contents are of type {@link houseofcards.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houses</em>' containment reference list.
	 * @see houseofcards.HouseofcardsPackage#getHouse_Houses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getHouses();

} // House
