/**
 */
package ovgu.pave.model.solution.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.RouteElement;
import ovgu.pave.model.solution.SolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.solution.impl.RouteElementImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.impl.RouteElementImpl#getServiceBegin <em>Service Begin</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.impl.RouteElementImpl#getDrivingTime <em>Driving Time</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.impl.RouteElementImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.impl.RouteElementImpl#getServiceDuration <em>Service Duration</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.impl.RouteElementImpl#getLatestDrivingTime <em>Latest Driving Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteElementImpl extends MinimalEObjectImpl.Container implements RouteElement {
	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route;

	/**
	 * The default value of the '{@link #getServiceBegin() <em>Service Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBegin()
	 * @generated
	 * @ordered
	 */
	protected static final long SERVICE_BEGIN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getServiceBegin() <em>Service Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceBegin()
	 * @generated
	 * @ordered
	 */
	protected long serviceBegin = SERVICE_BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDrivingTime() <em>Driving Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivingTime()
	 * @generated
	 * @ordered
	 */
	protected static final long DRIVING_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDrivingTime() <em>Driving Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivingTime()
	 * @generated
	 * @ordered
	 */
	protected long drivingTime = DRIVING_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected static final int UTILIZATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUtilization() <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected int utilization = UTILIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDuration() <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long SERVICE_DURATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getServiceDuration() <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDuration()
	 * @generated
	 * @ordered
	 */
	protected long serviceDuration = SERVICE_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatestDrivingTime() <em>Latest Driving Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestDrivingTime()
	 * @generated
	 * @ordered
	 */
	protected static final long LATEST_DRIVING_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLatestDrivingTime() <em>Latest Driving Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestDrivingTime()
	 * @generated
	 * @ordered
	 */
	protected long latestDrivingTime = LATEST_DRIVING_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolutionPackage.Literals.ROUTE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoute() {
		if (route != null && route.eIsProxy()) {
			InternalEObject oldRoute = (InternalEObject)route;
			route = (Route)eResolveProxy(oldRoute);
			if (route != oldRoute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolutionPackage.ROUTE_ELEMENT__ROUTE, oldRoute, route));
			}
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route basicGetRoute() {
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(Route newRoute) {
		Route oldRoute = route;
		route = newRoute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.ROUTE_ELEMENT__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getServiceBegin() {
		return serviceBegin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceBegin(long newServiceBegin) {
		long oldServiceBegin = serviceBegin;
		serviceBegin = newServiceBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.ROUTE_ELEMENT__SERVICE_BEGIN, oldServiceBegin, serviceBegin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDrivingTime() {
		return drivingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrivingTime(long newDrivingTime) {
		long oldDrivingTime = drivingTime;
		drivingTime = newDrivingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.ROUTE_ELEMENT__DRIVING_TIME, oldDrivingTime, drivingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUtilization() {
		return utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilization(int newUtilization) {
		int oldUtilization = utilization;
		utilization = newUtilization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.ROUTE_ELEMENT__UTILIZATION, oldUtilization, utilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getServiceDuration() {
		return serviceDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDuration(long newServiceDuration) {
		long oldServiceDuration = serviceDuration;
		serviceDuration = newServiceDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.ROUTE_ELEMENT__SERVICE_DURATION, oldServiceDuration, serviceDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLatestDrivingTime() {
		return latestDrivingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestDrivingTime(long newLatestDrivingTime) {
		long oldLatestDrivingTime = latestDrivingTime;
		latestDrivingTime = newLatestDrivingTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.ROUTE_ELEMENT__LATEST_DRIVING_TIME, oldLatestDrivingTime, latestDrivingTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolutionPackage.ROUTE_ELEMENT__ROUTE:
				if (resolve) return getRoute();
				return basicGetRoute();
			case SolutionPackage.ROUTE_ELEMENT__SERVICE_BEGIN:
				return getServiceBegin();
			case SolutionPackage.ROUTE_ELEMENT__DRIVING_TIME:
				return getDrivingTime();
			case SolutionPackage.ROUTE_ELEMENT__UTILIZATION:
				return getUtilization();
			case SolutionPackage.ROUTE_ELEMENT__SERVICE_DURATION:
				return getServiceDuration();
			case SolutionPackage.ROUTE_ELEMENT__LATEST_DRIVING_TIME:
				return getLatestDrivingTime();
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
			case SolutionPackage.ROUTE_ELEMENT__ROUTE:
				setRoute((Route)newValue);
				return;
			case SolutionPackage.ROUTE_ELEMENT__SERVICE_BEGIN:
				setServiceBegin((Long)newValue);
				return;
			case SolutionPackage.ROUTE_ELEMENT__DRIVING_TIME:
				setDrivingTime((Long)newValue);
				return;
			case SolutionPackage.ROUTE_ELEMENT__UTILIZATION:
				setUtilization((Integer)newValue);
				return;
			case SolutionPackage.ROUTE_ELEMENT__SERVICE_DURATION:
				setServiceDuration((Long)newValue);
				return;
			case SolutionPackage.ROUTE_ELEMENT__LATEST_DRIVING_TIME:
				setLatestDrivingTime((Long)newValue);
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
			case SolutionPackage.ROUTE_ELEMENT__ROUTE:
				setRoute((Route)null);
				return;
			case SolutionPackage.ROUTE_ELEMENT__SERVICE_BEGIN:
				setServiceBegin(SERVICE_BEGIN_EDEFAULT);
				return;
			case SolutionPackage.ROUTE_ELEMENT__DRIVING_TIME:
				setDrivingTime(DRIVING_TIME_EDEFAULT);
				return;
			case SolutionPackage.ROUTE_ELEMENT__UTILIZATION:
				setUtilization(UTILIZATION_EDEFAULT);
				return;
			case SolutionPackage.ROUTE_ELEMENT__SERVICE_DURATION:
				setServiceDuration(SERVICE_DURATION_EDEFAULT);
				return;
			case SolutionPackage.ROUTE_ELEMENT__LATEST_DRIVING_TIME:
				setLatestDrivingTime(LATEST_DRIVING_TIME_EDEFAULT);
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
			case SolutionPackage.ROUTE_ELEMENT__ROUTE:
				return route != null;
			case SolutionPackage.ROUTE_ELEMENT__SERVICE_BEGIN:
				return serviceBegin != SERVICE_BEGIN_EDEFAULT;
			case SolutionPackage.ROUTE_ELEMENT__DRIVING_TIME:
				return drivingTime != DRIVING_TIME_EDEFAULT;
			case SolutionPackage.ROUTE_ELEMENT__UTILIZATION:
				return utilization != UTILIZATION_EDEFAULT;
			case SolutionPackage.ROUTE_ELEMENT__SERVICE_DURATION:
				return serviceDuration != SERVICE_DURATION_EDEFAULT;
			case SolutionPackage.ROUTE_ELEMENT__LATEST_DRIVING_TIME:
				return latestDrivingTime != LATEST_DRIVING_TIME_EDEFAULT;
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
		result.append(" (serviceBegin: ");
		result.append(serviceBegin);
		result.append(", drivingTime: ");
		result.append(drivingTime);
		result.append(", utilization: ");
		result.append(utilization);
		result.append(", serviceDuration: ");
		result.append(serviceDuration);
		result.append(", latestDrivingTime: ");
		result.append(latestDrivingTime);
		result.append(')');
		return result.toString();
	}

} //RouteElementImpl
