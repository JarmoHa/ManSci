/**
 */
package ovgu.pave.model.config.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.config.ConfigPackage;
import ovgu.pave.model.config.RequestConstraints;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.impl.RequestConstraintsImpl#getMaxWaitingTime <em>Max Waiting Time</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.RequestConstraintsImpl#getDetourFactor <em>Detour Factor</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.RequestConstraintsImpl#getServiceDuration <em>Service Duration</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.RequestConstraintsImpl#getMinTravelTime <em>Min Travel Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestConstraintsImpl extends MinimalEObjectImpl.Container implements RequestConstraints {
	/**
	 * The default value of the '{@link #getMaxWaitingTime() <em>Max Waiting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWaitingTime()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_WAITING_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxWaitingTime() <em>Max Waiting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWaitingTime()
	 * @generated
	 * @ordered
	 */
	protected long maxWaitingTime = MAX_WAITING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetourFactor() <em>Detour Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetourFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double DETOUR_FACTOR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDetourFactor() <em>Detour Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetourFactor()
	 * @generated
	 * @ordered
	 */
	protected double detourFactor = DETOUR_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDuration() <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int SERVICE_DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getServiceDuration() <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDuration()
	 * @generated
	 * @ordered
	 */
	protected int serviceDuration = SERVICE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinTravelTime() <em>Min Travel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTravelTime()
	 * @generated
	 * @ordered
	 */
	protected static final long MIN_TRAVEL_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMinTravelTime() <em>Min Travel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTravelTime()
	 * @generated
	 * @ordered
	 */
	protected long minTravelTime = MIN_TRAVEL_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.REQUEST_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxWaitingTime() {
		return maxWaitingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxWaitingTime(long newMaxWaitingTime) {
		long oldMaxWaitingTime = maxWaitingTime;
		maxWaitingTime = newMaxWaitingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.REQUEST_CONSTRAINTS__MAX_WAITING_TIME, oldMaxWaitingTime, maxWaitingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDetourFactor() {
		return detourFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetourFactor(double newDetourFactor) {
		double oldDetourFactor = detourFactor;
		detourFactor = newDetourFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.REQUEST_CONSTRAINTS__DETOUR_FACTOR, oldDetourFactor, detourFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getServiceDuration() {
		return serviceDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDuration(int newServiceDuration) {
		int oldServiceDuration = serviceDuration;
		serviceDuration = newServiceDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.REQUEST_CONSTRAINTS__SERVICE_DURATION, oldServiceDuration, serviceDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMinTravelTime() {
		return minTravelTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTravelTime(long newMinTravelTime) {
		long oldMinTravelTime = minTravelTime;
		minTravelTime = newMinTravelTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.REQUEST_CONSTRAINTS__MIN_TRAVEL_TIME, oldMinTravelTime, minTravelTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.REQUEST_CONSTRAINTS__MAX_WAITING_TIME:
				return getMaxWaitingTime();
			case ConfigPackage.REQUEST_CONSTRAINTS__DETOUR_FACTOR:
				return getDetourFactor();
			case ConfigPackage.REQUEST_CONSTRAINTS__SERVICE_DURATION:
				return getServiceDuration();
			case ConfigPackage.REQUEST_CONSTRAINTS__MIN_TRAVEL_TIME:
				return getMinTravelTime();
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
			case ConfigPackage.REQUEST_CONSTRAINTS__MAX_WAITING_TIME:
				setMaxWaitingTime((Long)newValue);
				return;
			case ConfigPackage.REQUEST_CONSTRAINTS__DETOUR_FACTOR:
				setDetourFactor((Double)newValue);
				return;
			case ConfigPackage.REQUEST_CONSTRAINTS__SERVICE_DURATION:
				setServiceDuration((Integer)newValue);
				return;
			case ConfigPackage.REQUEST_CONSTRAINTS__MIN_TRAVEL_TIME:
				setMinTravelTime((Long)newValue);
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
			case ConfigPackage.REQUEST_CONSTRAINTS__MAX_WAITING_TIME:
				setMaxWaitingTime(MAX_WAITING_TIME_EDEFAULT);
				return;
			case ConfigPackage.REQUEST_CONSTRAINTS__DETOUR_FACTOR:
				setDetourFactor(DETOUR_FACTOR_EDEFAULT);
				return;
			case ConfigPackage.REQUEST_CONSTRAINTS__SERVICE_DURATION:
				setServiceDuration(SERVICE_DURATION_EDEFAULT);
				return;
			case ConfigPackage.REQUEST_CONSTRAINTS__MIN_TRAVEL_TIME:
				setMinTravelTime(MIN_TRAVEL_TIME_EDEFAULT);
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
			case ConfigPackage.REQUEST_CONSTRAINTS__MAX_WAITING_TIME:
				return maxWaitingTime != MAX_WAITING_TIME_EDEFAULT;
			case ConfigPackage.REQUEST_CONSTRAINTS__DETOUR_FACTOR:
				return detourFactor != DETOUR_FACTOR_EDEFAULT;
			case ConfigPackage.REQUEST_CONSTRAINTS__SERVICE_DURATION:
				return serviceDuration != SERVICE_DURATION_EDEFAULT;
			case ConfigPackage.REQUEST_CONSTRAINTS__MIN_TRAVEL_TIME:
				return minTravelTime != MIN_TRAVEL_TIME_EDEFAULT;
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
		result.append(" (maxWaitingTime: ");
		result.append(maxWaitingTime);
		result.append(", detourFactor: ");
		result.append(detourFactor);
		result.append(", serviceDuration: ");
		result.append(serviceDuration);
		result.append(", minTravelTime: ");
		result.append(minTravelTime);
		result.append(')');
		return result.toString();
	}

} //RequestConstraintsImpl
