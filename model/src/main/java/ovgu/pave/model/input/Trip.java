/**
 */
package ovgu.pave.model.input;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.input.Trip#getId <em>Id</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Trip#getPickupZoneId <em>Pickup Zone Id</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Trip#getDropoffZoneId <em>Dropoff Zone Id</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Trip#getRequestTime <em>Request Time</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.input.InputPackage#getTrip()
 * @model
 * @generated
 */
public interface Trip extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see ovgu.pave.model.input.InputPackage#getTrip_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Trip#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Pickup Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pickup Zone Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pickup Zone Id</em>' attribute.
	 * @see #setPickupZoneId(int)
	 * @see ovgu.pave.model.input.InputPackage#getTrip_PickupZoneId()
	 * @model
	 * @generated
	 */
	int getPickupZoneId();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Trip#getPickupZoneId <em>Pickup Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pickup Zone Id</em>' attribute.
	 * @see #getPickupZoneId()
	 * @generated
	 */
	void setPickupZoneId(int value);

	/**
	 * Returns the value of the '<em><b>Dropoff Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dropoff Zone Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dropoff Zone Id</em>' attribute.
	 * @see #setDropoffZoneId(int)
	 * @see ovgu.pave.model.input.InputPackage#getTrip_DropoffZoneId()
	 * @model
	 * @generated
	 */
	int getDropoffZoneId();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Trip#getDropoffZoneId <em>Dropoff Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dropoff Zone Id</em>' attribute.
	 * @see #getDropoffZoneId()
	 * @generated
	 */
	void setDropoffZoneId(int value);

	/**
	 * Returns the value of the '<em><b>Request Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Time</em>' attribute.
	 * @see #setRequestTime(long)
	 * @see ovgu.pave.model.input.InputPackage#getTrip_RequestTime()
	 * @model
	 * @generated
	 */
	long getRequestTime();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Trip#getRequestTime <em>Request Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Time</em>' attribute.
	 * @see #getRequestTime()
	 * @generated
	 */
	void setRequestTime(long value);

} // Trip
