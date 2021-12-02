/**
 */
package ovgu.pave.model.solution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ovgu.pave.model.solution.SolutionFactory
 * @model kind="package"
 * @generated
 */
public interface SolutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "solution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ovgu.pave.solution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sol";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolutionPackage eINSTANCE = ovgu.pave.model.solution.impl.SolutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link ovgu.pave.model.solution.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.solution.impl.RouteImpl
	 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 0;

	/**
	 * The feature id for the '<em><b>Vehicle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__VEHICLE = 0;

	/**
	 * The feature id for the '<em><b>Route Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ROUTE_ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Route Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___GET_ROUTE_ELEMENT__INT = 0;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.solution.impl.RouteElementImpl <em>Route Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.solution.impl.RouteElementImpl
	 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getRouteElement()
	 * @generated
	 */
	int ROUTE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__ROUTE = 0;

	/**
	 * The feature id for the '<em><b>Service Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__SERVICE_BEGIN = 1;

	/**
	 * The feature id for the '<em><b>Driving Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__DRIVING_TIME = 2;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__UTILIZATION = 3;

	/**
	 * The feature id for the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__SERVICE_DURATION = 4;

	/**
	 * The feature id for the '<em><b>Latest Driving Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT__LATEST_DRIVING_TIME = 5;

	/**
	 * The number of structural features of the '<em>Route Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Route Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.solution.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.solution.impl.SolutionImpl
	 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 2;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__ROUTES = 0;

	/**
	 * The feature id for the '<em><b>Rejected Requests</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__REJECTED_REQUESTS = 1;

	/**
	 * The feature id for the '<em><b>Accepted Requests</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__ACCEPTED_REQUESTS = 2;

	/**
	 * The feature id for the '<em><b>Run Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__RUN_TIME = 3;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SCORE = 4;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.solution.impl.SupportRouteElementImpl <em>Support Route Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.solution.impl.SupportRouteElementImpl
	 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getSupportRouteElement()
	 * @generated
	 */
	int SUPPORT_ROUTE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_ROUTE_ELEMENT__ROUTE = ROUTE_ELEMENT__ROUTE;

	/**
	 * The feature id for the '<em><b>Service Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_ROUTE_ELEMENT__SERVICE_BEGIN = ROUTE_ELEMENT__SERVICE_BEGIN;

	/**
	 * The feature id for the '<em><b>Driving Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_ROUTE_ELEMENT__DRIVING_TIME = ROUTE_ELEMENT__DRIVING_TIME;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_ROUTE_ELEMENT__UTILIZATION = ROUTE_ELEMENT__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_ROUTE_ELEMENT__SERVICE_DURATION = ROUTE_ELEMENT__SERVICE_DURATION;

	/**
	 * The feature id for the '<em><b>Latest Driving Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_ROUTE_ELEMENT__LATEST_DRIVING_TIME = ROUTE_ELEMENT__LATEST_DRIVING_TIME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_ROUTE_ELEMENT__LOCATION = ROUTE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_ROUTE_ELEMENT__TIME_STAMP = ROUTE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Support Route Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_ROUTE_ELEMENT_FEATURE_COUNT = ROUTE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Support Route Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_ROUTE_ELEMENT_OPERATION_COUNT = ROUTE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.solution.impl.RequestActivityRouteElementImpl <em>Request Activity Route Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.solution.impl.RequestActivityRouteElementImpl
	 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getRequestActivityRouteElement()
	 * @generated
	 */
	int REQUEST_ACTIVITY_ROUTE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY_ROUTE_ELEMENT__ROUTE = ROUTE_ELEMENT__ROUTE;

	/**
	 * The feature id for the '<em><b>Service Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY_ROUTE_ELEMENT__SERVICE_BEGIN = ROUTE_ELEMENT__SERVICE_BEGIN;

	/**
	 * The feature id for the '<em><b>Driving Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY_ROUTE_ELEMENT__DRIVING_TIME = ROUTE_ELEMENT__DRIVING_TIME;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY_ROUTE_ELEMENT__UTILIZATION = ROUTE_ELEMENT__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY_ROUTE_ELEMENT__SERVICE_DURATION = ROUTE_ELEMENT__SERVICE_DURATION;

	/**
	 * The feature id for the '<em><b>Latest Driving Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY_ROUTE_ELEMENT__LATEST_DRIVING_TIME = ROUTE_ELEMENT__LATEST_DRIVING_TIME;

	/**
	 * The feature id for the '<em><b>Request Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY_ROUTE_ELEMENT__REQUEST_ACTIVITY = ROUTE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request Activity Route Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY_ROUTE_ELEMENT_FEATURE_COUNT = ROUTE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Request Activity Route Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_ACTIVITY_ROUTE_ELEMENT_OPERATION_COUNT = ROUTE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Vehicle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.Vehicle
	 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 5;

	/**
	 * The meta object id for the '<em>Request Activity</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.RequestActivity
	 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getRequestActivity()
	 * @generated
	 */
	int REQUEST_ACTIVITY = 6;

	/**
	 * The meta object id for the '<em>Requests</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.Request
	 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getRequests()
	 * @generated
	 */
	int REQUESTS = 7;

	/**
	 * The meta object id for the '<em>Location</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.network.Location
	 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 8;

	/**
	 * The meta object id for the '<em>Vehicle Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.VehicleType
	 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getVehicleType()
	 * @generated
	 */
	int VEHICLE_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.solution.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see ovgu.pave.model.solution.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.solution.Route#getVehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle</em>'.
	 * @see ovgu.pave.model.solution.Route#getVehicle()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Vehicle();

	/**
	 * Returns the meta object for the containment reference list '{@link ovgu.pave.model.solution.Route#getRouteElements <em>Route Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route Elements</em>'.
	 * @see ovgu.pave.model.solution.Route#getRouteElements()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_RouteElements();

	/**
	 * Returns the meta object for the '{@link ovgu.pave.model.solution.Route#getRouteElement(int) <em>Get Route Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Route Element</em>' operation.
	 * @see ovgu.pave.model.solution.Route#getRouteElement(int)
	 * @generated
	 */
	EOperation getRoute__GetRouteElement__int();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.solution.RouteElement <em>Route Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Element</em>'.
	 * @see ovgu.pave.model.solution.RouteElement
	 * @generated
	 */
	EClass getRouteElement();

	/**
	 * Returns the meta object for the reference '{@link ovgu.pave.model.solution.RouteElement#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Route</em>'.
	 * @see ovgu.pave.model.solution.RouteElement#getRoute()
	 * @see #getRouteElement()
	 * @generated
	 */
	EReference getRouteElement_Route();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.solution.RouteElement#getServiceBegin <em>Service Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Begin</em>'.
	 * @see ovgu.pave.model.solution.RouteElement#getServiceBegin()
	 * @see #getRouteElement()
	 * @generated
	 */
	EAttribute getRouteElement_ServiceBegin();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.solution.RouteElement#getDrivingTime <em>Driving Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driving Time</em>'.
	 * @see ovgu.pave.model.solution.RouteElement#getDrivingTime()
	 * @see #getRouteElement()
	 * @generated
	 */
	EAttribute getRouteElement_DrivingTime();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.solution.RouteElement#getUtilization <em>Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization</em>'.
	 * @see ovgu.pave.model.solution.RouteElement#getUtilization()
	 * @see #getRouteElement()
	 * @generated
	 */
	EAttribute getRouteElement_Utilization();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.solution.RouteElement#getServiceDuration <em>Service Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Duration</em>'.
	 * @see ovgu.pave.model.solution.RouteElement#getServiceDuration()
	 * @see #getRouteElement()
	 * @generated
	 */
	EAttribute getRouteElement_ServiceDuration();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.solution.RouteElement#getLatestDrivingTime <em>Latest Driving Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Driving Time</em>'.
	 * @see ovgu.pave.model.solution.RouteElement#getLatestDrivingTime()
	 * @see #getRouteElement()
	 * @generated
	 */
	EAttribute getRouteElement_LatestDrivingTime();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.solution.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see ovgu.pave.model.solution.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the containment reference list '{@link ovgu.pave.model.solution.Solution#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routes</em>'.
	 * @see ovgu.pave.model.solution.Solution#getRoutes()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Routes();

	/**
	 * Returns the meta object for the attribute list '{@link ovgu.pave.model.solution.Solution#getRejectedRequests <em>Rejected Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rejected Requests</em>'.
	 * @see ovgu.pave.model.solution.Solution#getRejectedRequests()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_RejectedRequests();

	/**
	 * Returns the meta object for the attribute list '{@link ovgu.pave.model.solution.Solution#getAcceptedRequests <em>Accepted Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Requests</em>'.
	 * @see ovgu.pave.model.solution.Solution#getAcceptedRequests()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_AcceptedRequests();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.solution.Solution#getRunTime <em>Run Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run Time</em>'.
	 * @see ovgu.pave.model.solution.Solution#getRunTime()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_RunTime();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.solution.Solution#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see ovgu.pave.model.solution.Solution#getScore()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_Score();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.solution.SupportRouteElement <em>Support Route Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support Route Element</em>'.
	 * @see ovgu.pave.model.solution.SupportRouteElement
	 * @generated
	 */
	EClass getSupportRouteElement();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.solution.SupportRouteElement#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see ovgu.pave.model.solution.SupportRouteElement#getLocation()
	 * @see #getSupportRouteElement()
	 * @generated
	 */
	EAttribute getSupportRouteElement_Location();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.solution.SupportRouteElement#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see ovgu.pave.model.solution.SupportRouteElement#getTimeStamp()
	 * @see #getSupportRouteElement()
	 * @generated
	 */
	EAttribute getSupportRouteElement_TimeStamp();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.solution.RequestActivityRouteElement <em>Request Activity Route Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Activity Route Element</em>'.
	 * @see ovgu.pave.model.solution.RequestActivityRouteElement
	 * @generated
	 */
	EClass getRequestActivityRouteElement();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.solution.RequestActivityRouteElement#getRequestActivity <em>Request Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Activity</em>'.
	 * @see ovgu.pave.model.solution.RequestActivityRouteElement#getRequestActivity()
	 * @see #getRequestActivityRouteElement()
	 * @generated
	 */
	EAttribute getRequestActivityRouteElement_RequestActivity();

	/**
	 * Returns the meta object for data type '{@link ovgu.pave.model.input.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vehicle</em>'.
	 * @see ovgu.pave.model.input.Vehicle
	 * @model instanceClass="ovgu.pave.model.input.Vehicle"
	 * @generated
	 */
	EDataType getVehicle();

	/**
	 * Returns the meta object for data type '{@link ovgu.pave.model.input.RequestActivity <em>Request Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Request Activity</em>'.
	 * @see ovgu.pave.model.input.RequestActivity
	 * @model instanceClass="ovgu.pave.model.input.RequestActivity"
	 * @generated
	 */
	EDataType getRequestActivity();

	/**
	 * Returns the meta object for data type '{@link ovgu.pave.model.input.Request <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Requests</em>'.
	 * @see ovgu.pave.model.input.Request
	 * @model instanceClass="ovgu.pave.model.input.Request"
	 * @generated
	 */
	EDataType getRequests();

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
	 * Returns the meta object for data type '{@link ovgu.pave.model.input.VehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vehicle Type</em>'.
	 * @see ovgu.pave.model.input.VehicleType
	 * @model instanceClass="ovgu.pave.model.input.VehicleType"
	 * @generated
	 */
	EDataType getVehicleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SolutionFactory getSolutionFactory();

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
		 * The meta object literal for the '{@link ovgu.pave.model.solution.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.solution.impl.RouteImpl
		 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Vehicle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__VEHICLE = eINSTANCE.getRoute_Vehicle();

		/**
		 * The meta object literal for the '<em><b>Route Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__ROUTE_ELEMENTS = eINSTANCE.getRoute_RouteElements();

		/**
		 * The meta object literal for the '<em><b>Get Route Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROUTE___GET_ROUTE_ELEMENT__INT = eINSTANCE.getRoute__GetRouteElement__int();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.solution.impl.RouteElementImpl <em>Route Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.solution.impl.RouteElementImpl
		 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getRouteElement()
		 * @generated
		 */
		EClass ROUTE_ELEMENT = eINSTANCE.getRouteElement();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE_ELEMENT__ROUTE = eINSTANCE.getRouteElement_Route();

		/**
		 * The meta object literal for the '<em><b>Service Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_ELEMENT__SERVICE_BEGIN = eINSTANCE.getRouteElement_ServiceBegin();

		/**
		 * The meta object literal for the '<em><b>Driving Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_ELEMENT__DRIVING_TIME = eINSTANCE.getRouteElement_DrivingTime();

		/**
		 * The meta object literal for the '<em><b>Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_ELEMENT__UTILIZATION = eINSTANCE.getRouteElement_Utilization();

		/**
		 * The meta object literal for the '<em><b>Service Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_ELEMENT__SERVICE_DURATION = eINSTANCE.getRouteElement_ServiceDuration();

		/**
		 * The meta object literal for the '<em><b>Latest Driving Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE_ELEMENT__LATEST_DRIVING_TIME = eINSTANCE.getRouteElement_LatestDrivingTime();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.solution.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.solution.impl.SolutionImpl
		 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__ROUTES = eINSTANCE.getSolution_Routes();

		/**
		 * The meta object literal for the '<em><b>Rejected Requests</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__REJECTED_REQUESTS = eINSTANCE.getSolution_RejectedRequests();

		/**
		 * The meta object literal for the '<em><b>Accepted Requests</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__ACCEPTED_REQUESTS = eINSTANCE.getSolution_AcceptedRequests();

		/**
		 * The meta object literal for the '<em><b>Run Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__RUN_TIME = eINSTANCE.getSolution_RunTime();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__SCORE = eINSTANCE.getSolution_Score();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.solution.impl.SupportRouteElementImpl <em>Support Route Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.solution.impl.SupportRouteElementImpl
		 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getSupportRouteElement()
		 * @generated
		 */
		EClass SUPPORT_ROUTE_ELEMENT = eINSTANCE.getSupportRouteElement();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT_ROUTE_ELEMENT__LOCATION = eINSTANCE.getSupportRouteElement_Location();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT_ROUTE_ELEMENT__TIME_STAMP = eINSTANCE.getSupportRouteElement_TimeStamp();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.solution.impl.RequestActivityRouteElementImpl <em>Request Activity Route Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.solution.impl.RequestActivityRouteElementImpl
		 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getRequestActivityRouteElement()
		 * @generated
		 */
		EClass REQUEST_ACTIVITY_ROUTE_ELEMENT = eINSTANCE.getRequestActivityRouteElement();

		/**
		 * The meta object literal for the '<em><b>Request Activity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_ACTIVITY_ROUTE_ELEMENT__REQUEST_ACTIVITY = eINSTANCE.getRequestActivityRouteElement_RequestActivity();

		/**
		 * The meta object literal for the '<em>Vehicle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.Vehicle
		 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getVehicle()
		 * @generated
		 */
		EDataType VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em>Request Activity</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.RequestActivity
		 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getRequestActivity()
		 * @generated
		 */
		EDataType REQUEST_ACTIVITY = eINSTANCE.getRequestActivity();

		/**
		 * The meta object literal for the '<em>Requests</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.Request
		 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getRequests()
		 * @generated
		 */
		EDataType REQUESTS = eINSTANCE.getRequests();

		/**
		 * The meta object literal for the '<em>Location</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.network.Location
		 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getLocation()
		 * @generated
		 */
		EDataType LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em>Vehicle Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.VehicleType
		 * @see ovgu.pave.model.solution.impl.SolutionPackageImpl#getVehicleType()
		 * @generated
		 */
		EDataType VEHICLE_TYPE = eINSTANCE.getVehicleType();

	}

} //SolutionPackage
