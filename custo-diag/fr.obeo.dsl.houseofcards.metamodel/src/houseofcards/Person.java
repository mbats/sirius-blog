/**
 */
package houseofcards;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link houseofcards.Person#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link houseofcards.Person#getName <em>Name</em>}</li>
 *   <li>{@link houseofcards.Person#getInfluences <em>Influences</em>}</li>
 * </ul>
 *
 * @see houseofcards.HouseofcardsPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' reference.
	 * @see #setDependsOn(Person)
	 * @see houseofcards.HouseofcardsPackage#getPerson_DependsOn()
	 * @model
	 * @generated
	 */
	Person getDependsOn();

	/**
	 * Sets the value of the '{@link houseofcards.Person#getDependsOn <em>Depends On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' reference.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(Person value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see houseofcards.HouseofcardsPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link houseofcards.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Influences</b></em>' reference list.
	 * The list contents are of type {@link houseofcards.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Influences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Influences</em>' reference list.
	 * @see houseofcards.HouseofcardsPackage#getPerson_Influences()
	 * @model
	 * @generated
	 */
	EList<Person> getInfluences();

} // Person
