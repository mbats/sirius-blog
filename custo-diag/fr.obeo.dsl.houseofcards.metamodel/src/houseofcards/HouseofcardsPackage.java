/**
 */
package houseofcards;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see houseofcards.HouseofcardsFactory
 * @model kind="package"
 * @generated
 */
public interface HouseofcardsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "houseofcards";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/houseofcards";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "houseofcards";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HouseofcardsPackage eINSTANCE = houseofcards.impl.HouseofcardsPackageImpl.init();

	/**
	 * The meta object id for the '{@link houseofcards.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see houseofcards.impl.HouseImpl
	 * @see houseofcards.impl.HouseofcardsPackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 0;

	/**
	 * The feature id for the '<em><b>Houses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__HOUSES = 0;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link houseofcards.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see houseofcards.impl.PersonImpl
	 * @see houseofcards.impl.HouseofcardsPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 1;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEPENDS_ON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 1;

	/**
	 * The feature id for the '<em><b>Influences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__INFLUENCES = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link houseofcards.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see houseofcards.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for the containment reference list '{@link houseofcards.House#getHouses <em>Houses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Houses</em>'.
	 * @see houseofcards.House#getHouses()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Houses();

	/**
	 * Returns the meta object for class '{@link houseofcards.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see houseofcards.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the reference '{@link houseofcards.Person#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Depends On</em>'.
	 * @see houseofcards.Person#getDependsOn()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_DependsOn();

	/**
	 * Returns the meta object for the attribute '{@link houseofcards.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see houseofcards.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the reference list '{@link houseofcards.Person#getInfluences <em>Influences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Influences</em>'.
	 * @see houseofcards.Person#getInfluences()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Influences();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HouseofcardsFactory getHouseofcardsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link houseofcards.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see houseofcards.impl.HouseImpl
		 * @see houseofcards.impl.HouseofcardsPackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '<em><b>Houses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__HOUSES = eINSTANCE.getHouse_Houses();

		/**
		 * The meta object literal for the '{@link houseofcards.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see houseofcards.impl.PersonImpl
		 * @see houseofcards.impl.HouseofcardsPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__DEPENDS_ON = eINSTANCE.getPerson_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Influences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__INFLUENCES = eINSTANCE.getPerson_Influences();

	}

} //HouseofcardsPackage
