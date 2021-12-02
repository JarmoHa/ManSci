/**
 */
package ovgu.pave.model.input.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ovgu.pave.model.input.Input;
import ovgu.pave.model.input.InputPackage;
import ovgu.pave.model.input.Request;
import ovgu.pave.model.input.Trip;
import ovgu.pave.model.input.Vehicle;
import ovgu.pave.model.input.VehicleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.input.impl.InputImpl#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link ovgu.pave.model.input.impl.InputImpl#getVehicleTypes <em>Vehicle Types</em>}</li>
 *   <li>{@link ovgu.pave.model.input.impl.InputImpl#getRequests <em>Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.input.impl.InputImpl#getTrips <em>Trips</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends MinimalEObjectImpl.Container implements Input {
	/**
	 * The cached value of the '{@link #getVehicles() <em>Vehicles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> vehicles;

	/**
	 * The cached value of the '{@link #getVehicleTypes() <em>Vehicle Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleType> vehicleTypes;

	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> requests;

	/**
	 * The cached value of the '{@link #getTrips() <em>Trips</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrips()
	 * @generated
	 * @ordered
	 */
	protected EList<Trip> trips;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vehicle> getVehicles() {
		if (vehicles == null) {
			vehicles = new EObjectContainmentEList<Vehicle>(Vehicle.class, this, InputPackage.INPUT__VEHICLES);
		}
		return vehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VehicleType> getVehicleTypes() {
		if (vehicleTypes == null) {
			vehicleTypes = new EObjectContainmentEList<VehicleType>(VehicleType.class, this, InputPackage.INPUT__VEHICLE_TYPES);
		}
		return vehicleTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Request> getRequests() {
		if (requests == null) {
			requests = new EObjectResolvingEList<Request>(Request.class, this, InputPackage.INPUT__REQUESTS);
		}
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trip> getTrips() {
		if (trips == null) {
			trips = new EObjectResolvingEList<Trip>(Trip.class, this, InputPackage.INPUT__TRIPS);
		}
		return trips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InputPackage.INPUT__VEHICLES:
				return ((InternalEList<?>)getVehicles()).basicRemove(otherEnd, msgs);
			case InputPackage.INPUT__VEHICLE_TYPES:
				return ((InternalEList<?>)getVehicleTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InputPackage.INPUT__VEHICLES:
				return getVehicles();
			case InputPackage.INPUT__VEHICLE_TYPES:
				return getVehicleTypes();
			case InputPackage.INPUT__REQUESTS:
				return getRequests();
			case InputPackage.INPUT__TRIPS:
				return getTrips();
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
			case InputPackage.INPUT__VEHICLES:
				getVehicles().clear();
				getVehicles().addAll((Collection<? extends Vehicle>)newValue);
				return;
			case InputPackage.INPUT__VEHICLE_TYPES:
				getVehicleTypes().clear();
				getVehicleTypes().addAll((Collection<? extends VehicleType>)newValue);
				return;
			case InputPackage.INPUT__REQUESTS:
				getRequests().clear();
				getRequests().addAll((Collection<? extends Request>)newValue);
				return;
			case InputPackage.INPUT__TRIPS:
				getTrips().clear();
				getTrips().addAll((Collection<? extends Trip>)newValue);
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
			case InputPackage.INPUT__VEHICLES:
				getVehicles().clear();
				return;
			case InputPackage.INPUT__VEHICLE_TYPES:
				getVehicleTypes().clear();
				return;
			case InputPackage.INPUT__REQUESTS:
				getRequests().clear();
				return;
			case InputPackage.INPUT__TRIPS:
				getTrips().clear();
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
			case InputPackage.INPUT__VEHICLES:
				return vehicles != null && !vehicles.isEmpty();
			case InputPackage.INPUT__VEHICLE_TYPES:
				return vehicleTypes != null && !vehicleTypes.isEmpty();
			case InputPackage.INPUT__REQUESTS:
				return requests != null && !requests.isEmpty();
			case InputPackage.INPUT__TRIPS:
				return trips != null && !trips.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputImpl
