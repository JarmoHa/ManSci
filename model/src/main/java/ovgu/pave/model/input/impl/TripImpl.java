/**
 */
package ovgu.pave.model.input.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.input.InputPackage;
import ovgu.pave.model.input.Trip;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.input.impl.TripImpl#getId <em>Id</em>}</li>
 *   <li>{@link ovgu.pave.model.input.impl.TripImpl#getPickupZoneId <em>Pickup Zone Id</em>}</li>
 *   <li>{@link ovgu.pave.model.input.impl.TripImpl#getDropoffZoneId <em>Dropoff Zone Id</em>}</li>
 *   <li>{@link ovgu.pave.model.input.impl.TripImpl#getRequestTime <em>Request Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripImpl extends MinimalEObjectImpl.Container implements Trip {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPickupZoneId() <em>Pickup Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickupZoneId()
	 * @generated
	 * @ordered
	 */
	protected static final int PICKUP_ZONE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPickupZoneId() <em>Pickup Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPickupZoneId()
	 * @generated
	 * @ordered
	 */
	protected int pickupZoneId = PICKUP_ZONE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDropoffZoneId() <em>Dropoff Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropoffZoneId()
	 * @generated
	 * @ordered
	 */
	protected static final int DROPOFF_ZONE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDropoffZoneId() <em>Dropoff Zone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDropoffZoneId()
	 * @generated
	 * @ordered
	 */
	protected int dropoffZoneId = DROPOFF_ZONE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestTime() <em>Request Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestTime()
	 * @generated
	 * @ordered
	 */
	protected static final long REQUEST_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRequestTime() <em>Request Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestTime()
	 * @generated
	 * @ordered
	 */
	protected long requestTime = REQUEST_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputPackage.Literals.TRIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.TRIP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPickupZoneId() {
		return pickupZoneId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPickupZoneId(int newPickupZoneId) {
		int oldPickupZoneId = pickupZoneId;
		pickupZoneId = newPickupZoneId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.TRIP__PICKUP_ZONE_ID, oldPickupZoneId, pickupZoneId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDropoffZoneId() {
		return dropoffZoneId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropoffZoneId(int newDropoffZoneId) {
		int oldDropoffZoneId = dropoffZoneId;
		dropoffZoneId = newDropoffZoneId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.TRIP__DROPOFF_ZONE_ID, oldDropoffZoneId, dropoffZoneId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRequestTime() {
		return requestTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestTime(long newRequestTime) {
		long oldRequestTime = requestTime;
		requestTime = newRequestTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.TRIP__REQUEST_TIME, oldRequestTime, requestTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InputPackage.TRIP__ID:
				return getId();
			case InputPackage.TRIP__PICKUP_ZONE_ID:
				return getPickupZoneId();
			case InputPackage.TRIP__DROPOFF_ZONE_ID:
				return getDropoffZoneId();
			case InputPackage.TRIP__REQUEST_TIME:
				return getRequestTime();
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
			case InputPackage.TRIP__ID:
				setId((Integer)newValue);
				return;
			case InputPackage.TRIP__PICKUP_ZONE_ID:
				setPickupZoneId((Integer)newValue);
				return;
			case InputPackage.TRIP__DROPOFF_ZONE_ID:
				setDropoffZoneId((Integer)newValue);
				return;
			case InputPackage.TRIP__REQUEST_TIME:
				setRequestTime((Long)newValue);
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
			case InputPackage.TRIP__ID:
				setId(ID_EDEFAULT);
				return;
			case InputPackage.TRIP__PICKUP_ZONE_ID:
				setPickupZoneId(PICKUP_ZONE_ID_EDEFAULT);
				return;
			case InputPackage.TRIP__DROPOFF_ZONE_ID:
				setDropoffZoneId(DROPOFF_ZONE_ID_EDEFAULT);
				return;
			case InputPackage.TRIP__REQUEST_TIME:
				setRequestTime(REQUEST_TIME_EDEFAULT);
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
			case InputPackage.TRIP__ID:
				return id != ID_EDEFAULT;
			case InputPackage.TRIP__PICKUP_ZONE_ID:
				return pickupZoneId != PICKUP_ZONE_ID_EDEFAULT;
			case InputPackage.TRIP__DROPOFF_ZONE_ID:
				return dropoffZoneId != DROPOFF_ZONE_ID_EDEFAULT;
			case InputPackage.TRIP__REQUEST_TIME:
				return requestTime != REQUEST_TIME_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", pickupZoneId: ");
		result.append(pickupZoneId);
		result.append(", dropoffZoneId: ");
		result.append(dropoffZoneId);
		result.append(", requestTime: ");
		result.append(requestTime);
		result.append(')');
		return result.toString();
	}

} //TripImpl
