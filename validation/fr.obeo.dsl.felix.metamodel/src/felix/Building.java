/**
 */
package felix;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link felix.Building#isIsFixed <em>Is Fixed</em>}</li>
 * </ul>
 *
 * @see felix.FelixPackage#getBuilding()
 * @model
 * @generated
 */
public interface Building extends EObject {

	/**
	 * Returns the value of the '<em><b>Is Fixed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Fixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Fixed</em>' attribute.
	 * @see #setIsFixed(boolean)
	 * @see felix.FelixPackage#getBuilding_IsFixed()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsFixed();

	/**
	 * Sets the value of the '{@link felix.Building#isIsFixed <em>Is Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Fixed</em>' attribute.
	 * @see #isIsFixed()
	 * @generated
	 */
	void setIsFixed(boolean value);
} // Building
