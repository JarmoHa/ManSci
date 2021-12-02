/**
 */
package ovgu.pave.model.algorithmObjects.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage;
import ovgu.pave.model.algorithmObjects.DrivingTimeInformation;
import ovgu.pave.model.algorithmObjects.Slacks;

import ovgu.pave.model.solution.Route;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slacks</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.SlacksImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.SlacksImpl#getTimeSlack <em>Time Slack</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.SlacksImpl#getUtilizationSlack <em>Utilization Slack</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.SlacksImpl#getDrivingTimeSlack <em>Driving Time Slack</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlacksImpl extends MinimalEObjectImpl.Container implements Slacks {
	/**
	 * The default value of the '{@link #getRoute() <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected static final Route ROUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected Route route = ROUTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeSlack() <em>Time Slack</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSlack()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> timeSlack;

	/**
	 * The cached value of the '{@link #getUtilizationSlack() <em>Utilization Slack</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizationSlack()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> utilizationSlack;

	/**
	 * The cached value of the '{@link #getDrivingTimeSlack() <em>Driving Time Slack</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivingTimeSlack()
	 * @generated
	 * @ordered
	 */
	protected EList<List<DrivingTimeInformation>> drivingTimeSlack;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlacksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmObjectsPackage.Literals.SLACKS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoute() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.SLACKS__ROUTE, oldRoute, route));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Long> getTimeSlack() {
		if (timeSlack == null) {
			timeSlack = new EDataTypeEList<Long>(Long.class, this, AlgorithmObjectsPackage.SLACKS__TIME_SLACK);
		}
		return timeSlack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getUtilizationSlack() {
		if (utilizationSlack == null) {
			utilizationSlack = new EDataTypeEList<Integer>(Integer.class, this, AlgorithmObjectsPackage.SLACKS__UTILIZATION_SLACK);
		}
		return utilizationSlack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<List<DrivingTimeInformation>> getDrivingTimeSlack() {
		if (drivingTimeSlack == null) {
			drivingTimeSlack = new EDataTypeEList<List<DrivingTimeInformation>>(List.class, this, AlgorithmObjectsPackage.SLACKS__DRIVING_TIME_SLACK);
		}
		return drivingTimeSlack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmObjectsPackage.SLACKS__ROUTE:
				return getRoute();
			case AlgorithmObjectsPackage.SLACKS__TIME_SLACK:
				return getTimeSlack();
			case AlgorithmObjectsPackage.SLACKS__UTILIZATION_SLACK:
				return getUtilizationSlack();
			case AlgorithmObjectsPackage.SLACKS__DRIVING_TIME_SLACK:
				return getDrivingTimeSlack();
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
			case AlgorithmObjectsPackage.SLACKS__ROUTE:
				setRoute((Route)newValue);
				return;
			case AlgorithmObjectsPackage.SLACKS__TIME_SLACK:
				getTimeSlack().clear();
				getTimeSlack().addAll((Collection<? extends Long>)newValue);
				return;
			case AlgorithmObjectsPackage.SLACKS__UTILIZATION_SLACK:
				getUtilizationSlack().clear();
				getUtilizationSlack().addAll((Collection<? extends Integer>)newValue);
				return;
			case AlgorithmObjectsPackage.SLACKS__DRIVING_TIME_SLACK:
				getDrivingTimeSlack().clear();
				getDrivingTimeSlack().addAll((Collection<? extends List<DrivingTimeInformation>>)newValue);
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
			case AlgorithmObjectsPackage.SLACKS__ROUTE:
				setRoute(ROUTE_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.SLACKS__TIME_SLACK:
				getTimeSlack().clear();
				return;
			case AlgorithmObjectsPackage.SLACKS__UTILIZATION_SLACK:
				getUtilizationSlack().clear();
				return;
			case AlgorithmObjectsPackage.SLACKS__DRIVING_TIME_SLACK:
				getDrivingTimeSlack().clear();
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
			case AlgorithmObjectsPackage.SLACKS__ROUTE:
				return ROUTE_EDEFAULT == null ? route != null : !ROUTE_EDEFAULT.equals(route);
			case AlgorithmObjectsPackage.SLACKS__TIME_SLACK:
				return timeSlack != null && !timeSlack.isEmpty();
			case AlgorithmObjectsPackage.SLACKS__UTILIZATION_SLACK:
				return utilizationSlack != null && !utilizationSlack.isEmpty();
			case AlgorithmObjectsPackage.SLACKS__DRIVING_TIME_SLACK:
				return drivingTimeSlack != null && !drivingTimeSlack.isEmpty();
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
		result.append(" (Route: ");
		result.append(route);
		result.append(", timeSlack: ");
		result.append(timeSlack);
		result.append(", utilizationSlack: ");
		result.append(utilizationSlack);
		result.append(", drivingTimeSlack: ");
		result.append(drivingTimeSlack);
		result.append(')');
		return result.toString();
	}

} //SlacksImpl
