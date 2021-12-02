/**
 */
package ovgu.pave.model.input;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ovgu.pave.model.input.InputFactory
 * @model kind="package"
 * @generated
 */
public interface InputPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "input";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ovgu.pave.input";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "in";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InputPackage eINSTANCE = ovgu.pave.model.input.impl.InputPackageImpl.init();

	/**
	 * The meta object id for the '{@link ovgu.pave.model.input.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.impl.InputImpl
	 * @see ovgu.pave.model.input.impl.InputPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 0;

	/**
	 * The feature id for the '<em><b>Vehicles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VEHICLES = 0;

	/**
	 * The feature id for the '<em><b>Vehicle Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VEHICLE_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__REQUESTS = 2;

	/**
	 * The feature id for the '<em><b>Trips</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TRIPS = 3;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.input.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.impl.RequestImpl
	 * @see ovgu.pave.model.input.impl.InputPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 1;

	/**
	 * The feature id for the '<em><b>First Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__FIRST_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Second Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__SECOND_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__ID = 2;

	/**
	 * The feature id for the '<em><b>Request Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__REQUEST_TIME = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Max Driving Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST__MAX_DRIVING_DURATION = 5;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.input.impl.VehicleTypeImpl <em>Vehicle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.impl.VehicleTypeImpl
	 * @see ovgu.pave.model.input.impl.InputPackageImpl#getVehicleType()
	 * @generated
	 */
	int VEHICLE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__CAPACITY = 1;

	/**
	 * The number of structural features of the '<em>Vehicle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vehicle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.input.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.impl.VehicleImpl
	 * @see ovgu.pave.model.input.impl.InputPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__ID = 1;

	/**
	 * The feature id for the '<em><b>End Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__END_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Start Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__START_LOCATION = 3;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.input.impl.RequestActivityImpl <em>Request Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.impl.RequestActivityImpl
	 * @see ovgu.pave.model.input.impl.InputPackageImpl#getRequestActivity()
	 * @generated
	 */
	int REQUEST_ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY__REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY__ID = 1;

	/**
	 * The feature id for the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY__SERVICE_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Latest Arrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY__LATEST_ARRIVAL = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY__LOCATION = 4;

	/**
	 * The number of structural features of the '<em>Request Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Request Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.input.impl.FirstRequestActivityImpl <em>First Request Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.impl.FirstRequestActivityImpl
	 * @see ovgu.pave.model.input.impl.InputPackageImpl#getFirstRequestActivity()
	 * @generated
	 */
	int FIRST_REQUEST_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_REQUEST_ACTIVITY__REQUEST = REQUEST_ACTIVITY__REQUEST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_REQUEST_ACTIVITY__ID = REQUEST_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_REQUEST_ACTIVITY__SERVICE_DURATION = REQUEST_ACTIVITY__SERVICE_DURATION;

	/**
	 * The feature id for the '<em><b>Latest Arrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_REQUEST_ACTIVITY__LATEST_ARRIVAL = REQUEST_ACTIVITY__LATEST_ARRIVAL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_REQUEST_ACTIVITY__LOCATION = REQUEST_ACTIVITY__LOCATION;

	/**
	 * The feature id for the '<em><b>Earliest Arrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_REQUEST_ACTIVITY__EARLIEST_ARRIVAL = REQUEST_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>First Request Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_REQUEST_ACTIVITY_FEATURE_COUNT = REQUEST_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>First Request Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRST_REQUEST_ACTIVITY_OPERATION_COUNT = REQUEST_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.input.impl.SecondRequestActivityImpl <em>Second Request Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.impl.SecondRequestActivityImpl
	 * @see ovgu.pave.model.input.impl.InputPackageImpl#getSecondRequestActivity()
	 * @generated
	 */
	int SECOND_REQUEST_ACTIVITY = 6;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_REQUEST_ACTIVITY__REQUEST = REQUEST_ACTIVITY__REQUEST;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_REQUEST_ACTIVITY__ID = REQUEST_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_REQUEST_ACTIVITY__SERVICE_DURATION = REQUEST_ACTIVITY__SERVICE_DURATION;

	/**
	 * The feature id for the '<em><b>Latest Arrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_REQUEST_ACTIVITY__LATEST_ARRIVAL = REQUEST_ACTIVITY__LATEST_ARRIVAL;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_REQUEST_ACTIVITY__LOCATION = REQUEST_ACTIVITY__LOCATION;

	/**
	 * The number of structural features of the '<em>Second Request Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_REQUEST_ACTIVITY_FEATURE_COUNT = REQUEST_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Second Request Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_REQUEST_ACTIVITY_OPERATION_COUNT = REQUEST_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.input.impl.TripImpl <em>Trip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.impl.TripImpl
	 * @see ovgu.pave.model.input.impl.InputPackageImpl#getTrip()
	 * @generated
	 */
	int TRIP = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__ID = 0;

	/**
	 * The feature id for the '<em><b>Pickup Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__PICKUP_ZONE_ID = 1;

	/**
	 * The feature id for the '<em><b>Dropoff Zone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__DROPOFF_ZONE_ID = 2;

	/**
	 * The feature id for the '<em><b>Request Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP__REQUEST_TIME = 3;

	/**
	 * The number of structural features of the '<em>Trip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Trip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Location</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.network.Location
	 * @see ovgu.pave.model.input.impl.InputPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 8;


	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.input.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see ovgu.pave.model.input.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the containment reference list '{@link ovgu.pave.model.input.Input#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicles</em>'.
	 * @see ovgu.pave.model.input.Input#getVehicles()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Vehicles();

	/**
	 * Returns the meta object for the containment reference list '{@link ovgu.pave.model.input.Input#getVehicleTypes <em>Vehicle Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vehicle Types</em>'.
	 * @see ovgu.pave.model.input.Input#getVehicleTypes()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_VehicleTypes();

	/**
	 * Returns the meta object for the reference list '{@link ovgu.pave.model.input.Input#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requests</em>'.
	 * @see ovgu.pave.model.input.Input#getRequests()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Requests();

	/**
	 * Returns the meta object for the reference list '{@link ovgu.pave.model.input.Input#getTrips <em>Trips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trips</em>'.
	 * @see ovgu.pave.model.input.Input#getTrips()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Trips();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.input.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see ovgu.pave.model.input.Request
	 * @generated
	 */
	EClass getRequest();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.input.Request#getFirstActivity <em>First Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>First Activity</em>'.
	 * @see ovgu.pave.model.input.Request#getFirstActivity()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_FirstActivity();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.input.Request#getSecondActivity <em>Second Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Second Activity</em>'.
	 * @see ovgu.pave.model.input.Request#getSecondActivity()
	 * @see #getRequest()
	 * @generated
	 */
	EReference getRequest_SecondActivity();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.Request#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ovgu.pave.model.input.Request#getId()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.Request#getRequestTime <em>Request Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Time</em>'.
	 * @see ovgu.pave.model.input.Request#getRequestTime()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_RequestTime();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.Request#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see ovgu.pave.model.input.Request#getQuantity()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.Request#getMaxDrivingDuration <em>Max Driving Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Driving Duration</em>'.
	 * @see ovgu.pave.model.input.Request#getMaxDrivingDuration()
	 * @see #getRequest()
	 * @generated
	 */
	EAttribute getRequest_MaxDrivingDuration();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.input.VehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Type</em>'.
	 * @see ovgu.pave.model.input.VehicleType
	 * @generated
	 */
	EClass getVehicleType();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.VehicleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ovgu.pave.model.input.VehicleType#getId()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_Id();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.VehicleType#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see ovgu.pave.model.input.VehicleType#getCapacity()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_Capacity();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.input.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see ovgu.pave.model.input.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the reference '{@link ovgu.pave.model.input.Vehicle#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see ovgu.pave.model.input.Vehicle#getType()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Type();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.Vehicle#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ovgu.pave.model.input.Vehicle#getId()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_Id();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.Vehicle#getEndLocation <em>End Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Location</em>'.
	 * @see ovgu.pave.model.input.Vehicle#getEndLocation()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_EndLocation();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.Vehicle#getStartLocation <em>Start Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Location</em>'.
	 * @see ovgu.pave.model.input.Vehicle#getStartLocation()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_StartLocation();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.input.FirstRequestActivity <em>First Request Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>First Request Activity</em>'.
	 * @see ovgu.pave.model.input.FirstRequestActivity
	 * @generated
	 */
	EClass getFirstRequestActivity();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.FirstRequestActivity#getEarliestArrival <em>Earliest Arrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Earliest Arrival</em>'.
	 * @see ovgu.pave.model.input.FirstRequestActivity#getEarliestArrival()
	 * @see #getFirstRequestActivity()
	 * @generated
	 */
	EAttribute getFirstRequestActivity_EarliestArrival();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.input.RequestActivity <em>Request Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Activity</em>'.
	 * @see ovgu.pave.model.input.RequestActivity
	 * @generated
	 */
	EClass getRequestActivity();

	/**
	 * Returns the meta object for the reference '{@link ovgu.pave.model.input.RequestActivity#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request</em>'.
	 * @see ovgu.pave.model.input.RequestActivity#getRequest()
	 * @see #getRequestActivity()
	 * @generated
	 */
	EReference getRequestActivity_Request();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.RequestActivity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ovgu.pave.model.input.RequestActivity#getId()
	 * @see #getRequestActivity()
	 * @generated
	 */
	EAttribute getRequestActivity_Id();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.RequestActivity#getServiceDuration <em>Service Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Duration</em>'.
	 * @see ovgu.pave.model.input.RequestActivity#getServiceDuration()
	 * @see #getRequestActivity()
	 * @generated
	 */
	EAttribute getRequestActivity_ServiceDuration();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.RequestActivity#getLatestArrival <em>Latest Arrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Arrival</em>'.
	 * @see ovgu.pave.model.input.RequestActivity#getLatestArrival()
	 * @see #getRequestActivity()
	 * @generated
	 */
	EAttribute getRequestActivity_LatestArrival();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.RequestActivity#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see ovgu.pave.model.input.RequestActivity#getLocation()
	 * @see #getRequestActivity()
	 * @generated
	 */
	EAttribute getRequestActivity_Location();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.input.SecondRequestActivity <em>Second Request Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Second Request Activity</em>'.
	 * @see ovgu.pave.model.input.SecondRequestActivity
	 * @generated
	 */
	EClass getSecondRequestActivity();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.input.Trip <em>Trip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trip</em>'.
	 * @see ovgu.pave.model.input.Trip
	 * @generated
	 */
	EClass getTrip();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.Trip#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ovgu.pave.model.input.Trip#getId()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_Id();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.Trip#getPickupZoneId <em>Pickup Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pickup Zone Id</em>'.
	 * @see ovgu.pave.model.input.Trip#getPickupZoneId()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_PickupZoneId();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.Trip#getDropoffZoneId <em>Dropoff Zone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropoff Zone Id</em>'.
	 * @see ovgu.pave.model.input.Trip#getDropoffZoneId()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_DropoffZoneId();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.input.Trip#getRequestTime <em>Request Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Time</em>'.
	 * @see ovgu.pave.model.input.Trip#getRequestTime()
	 * @see #getTrip()
	 * @generated
	 */
	EAttribute getTrip_RequestTime();

	/**
	 * Returns the meta object for data type '{@link ovgu.pave.model.network.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Location</em>'.
	 * @see ovgu.pave.model.network.Location
	 * @model instanceClass="ovgu.pave.model.network.Location"
	 * @generated
	 */
	EDataType getLocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InputFactory getInputFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ovgu.pave.model.input.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.impl.InputImpl
		 * @see ovgu.pave.model.input.impl.InputPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Vehicles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__VEHICLES = eINSTANCE.getInput_Vehicles();

		/**
		 * The meta object literal for the '<em><b>Vehicle Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__VEHICLE_TYPES = eINSTANCE.getInput_VehicleTypes();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__REQUESTS = eINSTANCE.getInput_Requests();

		/**
		 * The meta object literal for the '<em><b>Trips</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__TRIPS = eINSTANCE.getInput_Trips();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.input.impl.RequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.impl.RequestImpl
		 * @see ovgu.pave.model.input.impl.InputPackageImpl#getRequest()
		 * @generated
		 */
		EClass REQUEST = eINSTANCE.getRequest();

		/**
		 * The meta object literal for the '<em><b>First Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__FIRST_ACTIVITY = eINSTANCE.getRequest_FirstActivity();

		/**
		 * The meta object literal for the '<em><b>Second Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST__SECOND_ACTIVITY = eINSTANCE.getRequest_SecondActivity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__ID = eINSTANCE.getRequest_Id();

		/**
		 * The meta object literal for the '<em><b>Request Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__REQUEST_TIME = eINSTANCE.getRequest_RequestTime();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__QUANTITY = eINSTANCE.getRequest_Quantity();

		/**
		 * The meta object literal for the '<em><b>Max Driving Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST__MAX_DRIVING_DURATION = eINSTANCE.getRequest_MaxDrivingDuration();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.input.impl.VehicleTypeImpl <em>Vehicle Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.impl.VehicleTypeImpl
		 * @see ovgu.pave.model.input.impl.InputPackageImpl#getVehicleType()
		 * @generated
		 */
		EClass VEHICLE_TYPE = eINSTANCE.getVehicleType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__ID = eINSTANCE.getVehicleType_Id();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__CAPACITY = eINSTANCE.getVehicleType_Capacity();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.input.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.impl.VehicleImpl
		 * @see ovgu.pave.model.input.impl.InputPackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__TYPE = eINSTANCE.getVehicle_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__ID = eINSTANCE.getVehicle_Id();

		/**
		 * The meta object literal for the '<em><b>End Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__END_LOCATION = eINSTANCE.getVehicle_EndLocation();

		/**
		 * The meta object literal for the '<em><b>Start Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__START_LOCATION = eINSTANCE.getVehicle_StartLocation();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.input.impl.FirstRequestActivityImpl <em>First Request Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.impl.FirstRequestActivityImpl
		 * @see ovgu.pave.model.input.impl.InputPackageImpl#getFirstRequestActivity()
		 * @generated
		 */
		EClass FIRST_REQUEST_ACTIVITY = eINSTANCE.getFirstRequestActivity();

		/**
		 * The meta object literal for the '<em><b>Earliest Arrival</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRST_REQUEST_ACTIVITY__EARLIEST_ARRIVAL = eINSTANCE.getFirstRequestActivity_EarliestArrival();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.input.impl.RequestActivityImpl <em>Request Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.impl.RequestActivityImpl
		 * @see ovgu.pave.model.input.impl.InputPackageImpl#getRequestActivity()
		 * @generated
		 */
		EClass REQUEST_ACTIVITY = eINSTANCE.getRequestActivity();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUEST_ACTIVITY__REQUEST = eINSTANCE.getRequestActivity_Request();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_ACTIVITY__ID = eINSTANCE.getRequestActivity_Id();

		/**
		 * The meta object literal for the '<em><b>Service Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_ACTIVITY__SERVICE_DURATION = eINSTANCE.getRequestActivity_ServiceDuration();

		/**
		 * The meta object literal for the '<em><b>Latest Arrival</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_ACTIVITY__LATEST_ARRIVAL = eINSTANCE.getRequestActivity_LatestArrival();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_ACTIVITY__LOCATION = eINSTANCE.getRequestActivity_Location();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.input.impl.SecondRequestActivityImpl <em>Second Request Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.impl.SecondRequestActivityImpl
		 * @see ovgu.pave.model.input.impl.InputPackageImpl#getSecondRequestActivity()
		 * @generated
		 */
		EClass SECOND_REQUEST_ACTIVITY = eINSTANCE.getSecondRequestActivity();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.input.impl.TripImpl <em>Trip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.impl.TripImpl
		 * @see ovgu.pave.model.input.impl.InputPackageImpl#getTrip()
		 * @generated
		 */
		EClass TRIP = eINSTANCE.getTrip();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__ID = eINSTANCE.getTrip_Id();

		/**
		 * The meta object literal for the '<em><b>Pickup Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__PICKUP_ZONE_ID = eINSTANCE.getTrip_PickupZoneId();

		/**
		 * The meta object literal for the '<em><b>Dropoff Zone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__DROPOFF_ZONE_ID = eINSTANCE.getTrip_DropoffZoneId();

		/**
		 * The meta object literal for the '<em><b>Request Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIP__REQUEST_TIME = eINSTANCE.getTrip_RequestTime();

		/**
		 * The meta object literal for the '<em>Location</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.network.Location
		 * @see ovgu.pave.model.input.impl.InputPackageImpl#getLocation()
		 * @generated
		 */
		EDataType LOCATION = eINSTANCE.getLocation();

	}

} //InputPackage
