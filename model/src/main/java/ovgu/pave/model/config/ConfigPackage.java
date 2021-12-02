/**
 */
package ovgu.pave.model.config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see ovgu.pave.model.config.ConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ovgu.pave.config";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "con";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = ovgu.pave.model.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.ConfigImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Input Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__INPUT_FOLDER = 0;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Input Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__INPUT_FILENAME = 2;

	/**
	 * The feature id for the '<em><b>Config Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__CONFIG_PATH = 3;

	/**
	 * The feature id for the '<em><b>Output Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__OUTPUT_FOLDER = 4;

	/**
	 * The feature id for the '<em><b>Runs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__RUNS = 5;

	/**
	 * The feature id for the '<em><b>Experiments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__EXPERIMENTS = 6;

	/**
	 * The feature id for the '<em><b>Thread Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__THREAD_COUNT = 7;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.ScenarioImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Request Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__REQUEST_CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Planning Period Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PLANNING_PERIOD_BEGIN = 1;

	/**
	 * The feature id for the '<em><b>Planning Period Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PLANNING_PERIOD_LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Number Of Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NUMBER_OF_REQUESTS = 3;

	/**
	 * The feature id for the '<em><b>Number Of Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NUMBER_OF_VEHICLES = 4;

	/**
	 * The feature id for the '<em><b>Travel Time Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__TRAVEL_TIME_FACTOR = 5;

	/**
	 * The feature id for the '<em><b>Vehicle Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__VEHICLE_CAPACITY = 6;

	/**
	 * The feature id for the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__RANDOM_SEED = 7;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__AREA = 8;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.config.impl.RequestConstraintsImpl <em>Request Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.config.impl.RequestConstraintsImpl
	 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getRequestConstraints()
	 * @generated
	 */
	int REQUEST_CONSTRAINTS = 2;

	/**
	 * The feature id for the '<em><b>Max Waiting Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_CONSTRAINTS__MAX_WAITING_TIME = 0;

	/**
	 * The feature id for the '<em><b>Detour Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_CONSTRAINTS__DETOUR_FACTOR = 1;

	/**
	 * The feature id for the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_CONSTRAINTS__SERVICE_DURATION = 2;

	/**
	 * The feature id for the '<em><b>Min Travel Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_CONSTRAINTS__MIN_TRAVEL_TIME = 3;

	/**
	 * The number of structural features of the '<em>Request Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_CONSTRAINTS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Request Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_CONSTRAINTS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see ovgu.pave.model.config.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Config#getInputFolder <em>Input Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Folder</em>'.
	 * @see ovgu.pave.model.config.Config#getInputFolder()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_InputFolder();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.config.Config#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scenario</em>'.
	 * @see ovgu.pave.model.config.Config#getScenario()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Scenario();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Config#getInputFilename <em>Input Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Filename</em>'.
	 * @see ovgu.pave.model.config.Config#getInputFilename()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_InputFilename();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Config#getConfigPath <em>Config Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Path</em>'.
	 * @see ovgu.pave.model.config.Config#getConfigPath()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_ConfigPath();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Config#getOutputFolder <em>Output Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Folder</em>'.
	 * @see ovgu.pave.model.config.Config#getOutputFolder()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_OutputFolder();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Config#getRuns <em>Runs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runs</em>'.
	 * @see ovgu.pave.model.config.Config#getRuns()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Runs();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Config#getExperiments <em>Experiments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experiments</em>'.
	 * @see ovgu.pave.model.config.Config#getExperiments()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Experiments();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Config#getThreadCount <em>Thread Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Count</em>'.
	 * @see ovgu.pave.model.config.Config#getThreadCount()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_ThreadCount();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see ovgu.pave.model.config.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference '{@link ovgu.pave.model.config.Scenario#getRequestConstraints <em>Request Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request Constraints</em>'.
	 * @see ovgu.pave.model.config.Scenario#getRequestConstraints()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_RequestConstraints();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Scenario#getPlanningPeriodBegin <em>Planning Period Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planning Period Begin</em>'.
	 * @see ovgu.pave.model.config.Scenario#getPlanningPeriodBegin()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_PlanningPeriodBegin();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Scenario#getPlanningPeriodLength <em>Planning Period Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Planning Period Length</em>'.
	 * @see ovgu.pave.model.config.Scenario#getPlanningPeriodLength()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_PlanningPeriodLength();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Scenario#getNumberOfRequests <em>Number Of Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Requests</em>'.
	 * @see ovgu.pave.model.config.Scenario#getNumberOfRequests()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_NumberOfRequests();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Scenario#getNumberOfVehicles <em>Number Of Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Vehicles</em>'.
	 * @see ovgu.pave.model.config.Scenario#getNumberOfVehicles()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_NumberOfVehicles();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Scenario#getTravelTimeFactor <em>Travel Time Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Travel Time Factor</em>'.
	 * @see ovgu.pave.model.config.Scenario#getTravelTimeFactor()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_TravelTimeFactor();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Scenario#getVehicleCapacity <em>Vehicle Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle Capacity</em>'.
	 * @see ovgu.pave.model.config.Scenario#getVehicleCapacity()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_VehicleCapacity();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Scenario#getRandomSeed <em>Random Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random Seed</em>'.
	 * @see ovgu.pave.model.config.Scenario#getRandomSeed()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_RandomSeed();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.Scenario#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see ovgu.pave.model.config.Scenario#getArea()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Area();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.config.RequestConstraints <em>Request Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Constraints</em>'.
	 * @see ovgu.pave.model.config.RequestConstraints
	 * @generated
	 */
	EClass getRequestConstraints();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.RequestConstraints#getMaxWaitingTime <em>Max Waiting Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Waiting Time</em>'.
	 * @see ovgu.pave.model.config.RequestConstraints#getMaxWaitingTime()
	 * @see #getRequestConstraints()
	 * @generated
	 */
	EAttribute getRequestConstraints_MaxWaitingTime();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.RequestConstraints#getDetourFactor <em>Detour Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detour Factor</em>'.
	 * @see ovgu.pave.model.config.RequestConstraints#getDetourFactor()
	 * @see #getRequestConstraints()
	 * @generated
	 */
	EAttribute getRequestConstraints_DetourFactor();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.RequestConstraints#getServiceDuration <em>Service Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Duration</em>'.
	 * @see ovgu.pave.model.config.RequestConstraints#getServiceDuration()
	 * @see #getRequestConstraints()
	 * @generated
	 */
	EAttribute getRequestConstraints_ServiceDuration();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.config.RequestConstraints#getMinTravelTime <em>Min Travel Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Travel Time</em>'.
	 * @see ovgu.pave.model.config.RequestConstraints#getMinTravelTime()
	 * @see #getRequestConstraints()
	 * @generated
	 */
	EAttribute getRequestConstraints_MinTravelTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

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
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.ConfigImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Input Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__INPUT_FOLDER = eINSTANCE.getConfig_InputFolder();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__SCENARIO = eINSTANCE.getConfig_Scenario();

		/**
		 * The meta object literal for the '<em><b>Input Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__INPUT_FILENAME = eINSTANCE.getConfig_InputFilename();

		/**
		 * The meta object literal for the '<em><b>Config Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__CONFIG_PATH = eINSTANCE.getConfig_ConfigPath();

		/**
		 * The meta object literal for the '<em><b>Output Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__OUTPUT_FOLDER = eINSTANCE.getConfig_OutputFolder();

		/**
		 * The meta object literal for the '<em><b>Runs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__RUNS = eINSTANCE.getConfig_Runs();

		/**
		 * The meta object literal for the '<em><b>Experiments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__EXPERIMENTS = eINSTANCE.getConfig_Experiments();

		/**
		 * The meta object literal for the '<em><b>Thread Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__THREAD_COUNT = eINSTANCE.getConfig_ThreadCount();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.ScenarioImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Request Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__REQUEST_CONSTRAINTS = eINSTANCE.getScenario_RequestConstraints();

		/**
		 * The meta object literal for the '<em><b>Planning Period Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__PLANNING_PERIOD_BEGIN = eINSTANCE.getScenario_PlanningPeriodBegin();

		/**
		 * The meta object literal for the '<em><b>Planning Period Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__PLANNING_PERIOD_LENGTH = eINSTANCE.getScenario_PlanningPeriodLength();

		/**
		 * The meta object literal for the '<em><b>Number Of Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NUMBER_OF_REQUESTS = eINSTANCE.getScenario_NumberOfRequests();

		/**
		 * The meta object literal for the '<em><b>Number Of Vehicles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NUMBER_OF_VEHICLES = eINSTANCE.getScenario_NumberOfVehicles();

		/**
		 * The meta object literal for the '<em><b>Travel Time Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__TRAVEL_TIME_FACTOR = eINSTANCE.getScenario_TravelTimeFactor();

		/**
		 * The meta object literal for the '<em><b>Vehicle Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__VEHICLE_CAPACITY = eINSTANCE.getScenario_VehicleCapacity();

		/**
		 * The meta object literal for the '<em><b>Random Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__RANDOM_SEED = eINSTANCE.getScenario_RandomSeed();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__AREA = eINSTANCE.getScenario_Area();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.config.impl.RequestConstraintsImpl <em>Request Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.config.impl.RequestConstraintsImpl
		 * @see ovgu.pave.model.config.impl.ConfigPackageImpl#getRequestConstraints()
		 * @generated
		 */
		EClass REQUEST_CONSTRAINTS = eINSTANCE.getRequestConstraints();

		/**
		 * The meta object literal for the '<em><b>Max Waiting Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_CONSTRAINTS__MAX_WAITING_TIME = eINSTANCE.getRequestConstraints_MaxWaitingTime();

		/**
		 * The meta object literal for the '<em><b>Detour Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_CONSTRAINTS__DETOUR_FACTOR = eINSTANCE.getRequestConstraints_DetourFactor();

		/**
		 * The meta object literal for the '<em><b>Service Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_CONSTRAINTS__SERVICE_DURATION = eINSTANCE.getRequestConstraints_ServiceDuration();

		/**
		 * The meta object literal for the '<em><b>Min Travel Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_CONSTRAINTS__MIN_TRAVEL_TIME = eINSTANCE.getRequestConstraints_MinTravelTime();

	}

} //ConfigPackage
