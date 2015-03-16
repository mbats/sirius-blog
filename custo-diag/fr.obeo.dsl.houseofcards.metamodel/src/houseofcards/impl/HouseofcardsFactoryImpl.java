/**
 */
package houseofcards.impl;

import houseofcards.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HouseofcardsFactoryImpl extends EFactoryImpl implements HouseofcardsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HouseofcardsFactory init() {
		try {
			HouseofcardsFactory theHouseofcardsFactory = (HouseofcardsFactory)EPackage.Registry.INSTANCE.getEFactory(HouseofcardsPackage.eNS_URI);
			if (theHouseofcardsFactory != null) {
				return theHouseofcardsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HouseofcardsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HouseofcardsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HouseofcardsPackage.HOUSE: return createHouse();
			case HouseofcardsPackage.PERSON: return createPerson();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House createHouse() {
		HouseImpl house = new HouseImpl();
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HouseofcardsPackage getHouseofcardsPackage() {
		return (HouseofcardsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HouseofcardsPackage getPackage() {
		return HouseofcardsPackage.eINSTANCE;
	}

} //HouseofcardsFactoryImpl
