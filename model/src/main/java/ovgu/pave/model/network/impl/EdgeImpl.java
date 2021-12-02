/**
 */
package ovgu.pave.model.network.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.network.Edge;
import ovgu.pave.model.network.Location;
import ovgu.pave.model.network.NetworkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.network.impl.EdgeImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link ovgu.pave.model.network.impl.EdgeImpl#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link ovgu.pave.model.network.impl.EdgeImpl#getEndLocation <em>End Location</em>}</li>
 *   <li>{@link ovgu.pave.model.network.impl.EdgeImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link ovgu.pave.model.network.impl.EdgeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link ovgu.pave.model.network.impl.EdgeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends MinimalEObjectImpl.Container implements Edge {
	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final long COST_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected long cost = COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartLocation() <em>Start Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartLocation()
	 * @generated
	 * @ordered
	 */
	protected Location startLocation;

	/**
	 * The cached value of the '{@link #getEndLocation() <em>End Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndLocation()
	 * @generated
	 * @ordered
	 */
	protected Location endLocation;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long DURATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected long duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = -1;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(long newCost) {
		long oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.EDGE__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getStartLocation() {
		if (startLocation != null && startLocation.eIsProxy()) {
			InternalEObject oldStartLocation = (InternalEObject)startLocation;
			startLocation = (Location)eResolveProxy(oldStartLocation);
			if (startLocation != oldStartLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.EDGE__START_LOCATION, oldStartLocation, startLocation));
			}
		}
		return startLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetStartLocation() {
		return startLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartLocation(Location newStartLocation) {
		Location oldStartLocation = startLocation;
		startLocation = newStartLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.EDGE__START_LOCATION, oldStartLocation, startLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getEndLocation() {
		if (endLocation != null && endLocation.eIsProxy()) {
			InternalEObject oldEndLocation = (InternalEObject)endLocation;
			endLocation = (Location)eResolveProxy(oldEndLocation);
			if (endLocation != oldEndLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetworkPackage.EDGE__END_LOCATION, oldEndLocation, endLocation));
			}
		}
		return endLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetEndLocation() {
		return endLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndLocation(Location newEndLocation) {
		Location oldEndLocation = endLocation;
		endLocation = newEndLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.EDGE__END_LOCATION, oldEndLocation, endLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.EDGE__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(long newDuration) {
		long oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.EDGE__DURATION, oldDuration, duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.EDGE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkPackage.EDGE__COST:
				return getCost();
			case NetworkPackage.EDGE__START_LOCATION:
				if (resolve) return getStartLocation();
				return basicGetStartLocation();
			case NetworkPackage.EDGE__END_LOCATION:
				if (resolve) return getEndLocation();
				return basicGetEndLocation();
			case NetworkPackage.EDGE__DISTANCE:
				return getDistance();
			case NetworkPackage.EDGE__DURATION:
				return getDuration();
			case NetworkPackage.EDGE__ID:
				return getId();
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
			case NetworkPackage.EDGE__COST:
				setCost((Long)newValue);
				return;
			case NetworkPackage.EDGE__START_LOCATION:
				setStartLocation((Location)newValue);
				return;
			case NetworkPackage.EDGE__END_LOCATION:
				setEndLocation((Location)newValue);
				return;
			case NetworkPackage.EDGE__DISTANCE:
				setDistance((Double)newValue);
				return;
			case NetworkPackage.EDGE__DURATION:
				setDuration((Long)newValue);
				return;
			case NetworkPackage.EDGE__ID:
				setId((Integer)newValue);
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
			case NetworkPackage.EDGE__COST:
				setCost(COST_EDEFAULT);
				return;
			case NetworkPackage.EDGE__START_LOCATION:
				setStartLocation((Location)null);
				return;
			case NetworkPackage.EDGE__END_LOCATION:
				setEndLocation((Location)null);
				return;
			case NetworkPackage.EDGE__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case NetworkPackage.EDGE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case NetworkPackage.EDGE__ID:
				setId(ID_EDEFAULT);
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
			case NetworkPackage.EDGE__COST:
				return cost != COST_EDEFAULT;
			case NetworkPackage.EDGE__START_LOCATION:
				return startLocation != null;
			case NetworkPackage.EDGE__END_LOCATION:
				return endLocation != null;
			case NetworkPackage.EDGE__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case NetworkPackage.EDGE__DURATION:
				return duration != DURATION_EDEFAULT;
			case NetworkPackage.EDGE__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (cost: ");
		result.append(cost);
		result.append(", distance: ");
		result.append(distance);
		result.append(", duration: ");
		result.append(duration);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EdgeImpl
