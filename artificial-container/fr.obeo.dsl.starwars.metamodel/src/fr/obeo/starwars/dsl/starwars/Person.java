/**
 */
package fr.obeo.starwars.dsl.starwars;

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
 *   <li>{@link fr.obeo.starwars.dsl.starwars.Person#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.starwars.dsl.starwars.Person#isDark <em>Dark</em>}</li>
 * </ul>
 *
 * @see fr.obeo.starwars.dsl.starwars.StarwarsPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
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
	 * @see fr.obeo.starwars.dsl.starwars.StarwarsPackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.obeo.starwars.dsl.starwars.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dark</em>' attribute.
	 * @see #setDark(boolean)
	 * @see fr.obeo.starwars.dsl.starwars.StarwarsPackage#getPerson_Dark()
	 * @model
	 * @generated
	 */
	boolean isDark();

	/**
	 * Sets the value of the '{@link fr.obeo.starwars.dsl.starwars.Person#isDark <em>Dark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dark</em>' attribute.
	 * @see #isDark()
	 * @generated
	 */
	void setDark(boolean value);

} // Person
