/**
 */
package felix.impl;

import felix.Building;
import felix.FelixPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link felix.impl.BuildingImpl#isIsFixed <em>Is Fixed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildingImpl extends MinimalEObjectImpl.Container implements Building {
	/**
	 * The default value of the '{@link #isIsFixed() <em>Is Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFixed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FIXED_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isIsFixed() <em>Is Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFixed()
	 * @generated
	 * @ordered
	 */
	protected boolean isFixed = IS_FIXED_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FelixPackage.Literals.BUILDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFixed() {
		return isFixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFixed(boolean newIsFixed) {
		boolean oldIsFixed = isFixed;
		isFixed = newIsFixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FelixPackage.BUILDING__IS_FIXED, oldIsFixed, isFixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FelixPackage.BUILDING__IS_FIXED:
				return isIsFixed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FelixPackage.BUILDING__IS_FIXED:
				setIsFixed((Boolean)newValue);
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
			case FelixPackage.BUILDING__IS_FIXED:
				setIsFixed(IS_FIXED_EDEFAULT);
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
			case FelixPackage.BUILDING__IS_FIXED:
				return isFixed != IS_FIXED_EDEFAULT;
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
		result.append(" (isFixed: ");
		result.append(isFixed);
		result.append(')');
		return result.toString();
	}

} //BuildingImpl
