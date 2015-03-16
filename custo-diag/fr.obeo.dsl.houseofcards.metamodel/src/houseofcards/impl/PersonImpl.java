/**
 */
package houseofcards.impl;

import houseofcards.HouseofcardsPackage;
import houseofcards.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link houseofcards.impl.PersonImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link houseofcards.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link houseofcards.impl.PersonImpl#getInfluences <em>Influences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected Person dependsOn;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInfluences() <em>Influences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfluences()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> influences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HouseofcardsPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getDependsOn() {
		if (dependsOn != null && dependsOn.eIsProxy()) {
			InternalEObject oldDependsOn = (InternalEObject)dependsOn;
			dependsOn = (Person)eResolveProxy(oldDependsOn);
			if (dependsOn != oldDependsOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HouseofcardsPackage.PERSON__DEPENDS_ON, oldDependsOn, dependsOn));
			}
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependsOn(Person newDependsOn) {
		Person oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HouseofcardsPackage.PERSON__DEPENDS_ON, oldDependsOn, dependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HouseofcardsPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getInfluences() {
		if (influences == null) {
			influences = new EObjectResolvingEList<Person>(Person.class, this, HouseofcardsPackage.PERSON__INFLUENCES);
		}
		return influences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HouseofcardsPackage.PERSON__DEPENDS_ON:
				if (resolve) return getDependsOn();
				return basicGetDependsOn();
			case HouseofcardsPackage.PERSON__NAME:
				return getName();
			case HouseofcardsPackage.PERSON__INFLUENCES:
				return getInfluences();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HouseofcardsPackage.PERSON__DEPENDS_ON:
				setDependsOn((Person)newValue);
				return;
			case HouseofcardsPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case HouseofcardsPackage.PERSON__INFLUENCES:
				getInfluences().clear();
				getInfluences().addAll((Collection<? extends Person>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case HouseofcardsPackage.PERSON__DEPENDS_ON:
				setDependsOn((Person)null);
				return;
			case HouseofcardsPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HouseofcardsPackage.PERSON__INFLUENCES:
				getInfluences().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HouseofcardsPackage.PERSON__DEPENDS_ON:
				return dependsOn != null;
			case HouseofcardsPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HouseofcardsPackage.PERSON__INFLUENCES:
				return influences != null && !influences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
