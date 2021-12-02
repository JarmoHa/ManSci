/**
 */
package ovgu.pave.model.algorithmObjects;

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
 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsFactory
 * @model kind="package"
 * @generated
 */
public interface AlgorithmObjectsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "algorithmObjects";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ovgu.pave.algorithmObjects";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "alg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmObjectsPackage eINSTANCE = ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ovgu.pave.model.algorithmObjects.impl.InsertionOptionImpl <em>Insertion Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.algorithmObjects.impl.InsertionOptionImpl
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getInsertionOption()
	 * @generated
	 */
	int INSERTION_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPTION__COSTS = 0;

	/**
	 * The feature id for the '<em><b>First Activity Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPTION__FIRST_ACTIVITY_INDEX = 1;

	/**
	 * The feature id for the '<em><b>Second Activity Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPTION__SECOND_ACTIVITY_INDEX = 2;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPTION__ROUTE = 3;

	/**
	 * The number of structural features of the '<em>Insertion Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Insertion Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.algorithmObjects.impl.InsertionInformationImpl <em>Insertion Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.algorithmObjects.impl.InsertionInformationImpl
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getInsertionInformation()
	 * @generated
	 */
	int INSERTION_INFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Request</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_INFORMATION__REQUEST = 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_INFORMATION__SCORE = 1;

	/**
	 * The feature id for the '<em><b>Insertion Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_INFORMATION__INSERTION_OPTIONS = 2;

	/**
	 * The number of structural features of the '<em>Insertion Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_INFORMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Insertion Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.algorithmObjects.impl.DrivingTimeInformationImpl <em>Driving Time Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.algorithmObjects.impl.DrivingTimeInformationImpl
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getDrivingTimeInformation()
	 * @generated
	 */
	int DRIVING_TIME_INFORMATION = 2;

	/**
	 * The feature id for the '<em><b>First Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVING_TIME_INFORMATION__FIRST_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Driving Time Slack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVING_TIME_INFORMATION__DRIVING_TIME_SLACK = 1;

	/**
	 * The number of structural features of the '<em>Driving Time Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVING_TIME_INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Driving Time Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVING_TIME_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.algorithmObjects.impl.SlacksImpl <em>Slacks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.algorithmObjects.impl.SlacksImpl
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getSlacks()
	 * @generated
	 */
	int SLACKS = 3;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLACKS__ROUTE = 0;

	/**
	 * The feature id for the '<em><b>Time Slack</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLACKS__TIME_SLACK = 1;

	/**
	 * The feature id for the '<em><b>Utilization Slack</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLACKS__UTILIZATION_SLACK = 2;

	/**
	 * The feature id for the '<em><b>Driving Time Slack</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLACKS__DRIVING_TIME_SLACK = 3;

	/**
	 * The number of structural features of the '<em>Slacks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLACKS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Slacks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLACKS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Route</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.solution.Route
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 4;

	/**
	 * The meta object id for the '<em>Route Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.solution.RouteElement
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRouteElement()
	 * @generated
	 */
	int ROUTE_ELEMENT = 5;

	/**
	 * The meta object id for the '<em>Requests</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.Request
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRequests()
	 * @generated
	 */
	int REQUESTS = 6;

	/**
	 * The meta object id for the '<em>Driving Time Information List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getDrivingTimeInformationList()
	 * @generated
	 */
	int DRIVING_TIME_INFORMATION_LIST = 7;


	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.algorithmObjects.InsertionOption <em>Insertion Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insertion Option</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionOption
	 * @generated
	 */
	EClass getInsertionOption();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.InsertionOption#getCosts <em>Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Costs</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionOption#getCosts()
	 * @see #getInsertionOption()
	 * @generated
	 */
	EAttribute getInsertionOption_Costs();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.InsertionOption#getFirstActivityIndex <em>First Activity Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Activity Index</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionOption#getFirstActivityIndex()
	 * @see #getInsertionOption()
	 * @generated
	 */
	EAttribute getInsertionOption_FirstActivityIndex();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.InsertionOption#getSecondActivityIndex <em>Second Activity Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Second Activity Index</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionOption#getSecondActivityIndex()
	 * @see #getInsertionOption()
	 * @generated
	 */
	EAttribute getInsertionOption_SecondActivityIndex();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.InsertionOption#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionOption#getRoute()
	 * @see #getInsertionOption()
	 * @generated
	 */
	EAttribute getInsertionOption_Route();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.algorithmObjects.InsertionInformation <em>Insertion Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insertion Information</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionInformation
	 * @generated
	 */
	EClass getInsertionInformation();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.InsertionInformation#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionInformation#getRequest()
	 * @see #getInsertionInformation()
	 * @generated
	 */
	EAttribute getInsertionInformation_Request();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.InsertionInformation#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionInformation#getScore()
	 * @see #getInsertionInformation()
	 * @generated
	 */
	EAttribute getInsertionInformation_Score();

	/**
	 * Returns the meta object for the reference list '{@link ovgu.pave.model.algorithmObjects.InsertionInformation#getInsertionOptions <em>Insertion Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Insertion Options</em>'.
	 * @see ovgu.pave.model.algorithmObjects.InsertionInformation#getInsertionOptions()
	 * @see #getInsertionInformation()
	 * @generated
	 */
	EReference getInsertionInformation_InsertionOptions();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.algorithmObjects.DrivingTimeInformation <em>Driving Time Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driving Time Information</em>'.
	 * @see ovgu.pave.model.algorithmObjects.DrivingTimeInformation
	 * @generated
	 */
	EClass getDrivingTimeInformation();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.DrivingTimeInformation#getFirstIndex <em>First Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Index</em>'.
	 * @see ovgu.pave.model.algorithmObjects.DrivingTimeInformation#getFirstIndex()
	 * @see #getDrivingTimeInformation()
	 * @generated
	 */
	EAttribute getDrivingTimeInformation_FirstIndex();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.DrivingTimeInformation#getDrivingTimeSlack <em>Driving Time Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driving Time Slack</em>'.
	 * @see ovgu.pave.model.algorithmObjects.DrivingTimeInformation#getDrivingTimeSlack()
	 * @see #getDrivingTimeInformation()
	 * @generated
	 */
	EAttribute getDrivingTimeInformation_DrivingTimeSlack();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.algorithmObjects.Slacks <em>Slacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slacks</em>'.
	 * @see ovgu.pave.model.algorithmObjects.Slacks
	 * @generated
	 */
	EClass getSlacks();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.algorithmObjects.Slacks#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see ovgu.pave.model.algorithmObjects.Slacks#getRoute()
	 * @see #getSlacks()
	 * @generated
	 */
	EAttribute getSlacks_Route();

	/**
	 * Returns the meta object for the attribute list '{@link ovgu.pave.model.algorithmObjects.Slacks#getTimeSlack <em>Time Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time Slack</em>'.
	 * @see ovgu.pave.model.algorithmObjects.Slacks#getTimeSlack()
	 * @see #getSlacks()
	 * @generated
	 */
	EAttribute getSlacks_TimeSlack();

	/**
	 * Returns the meta object for the attribute list '{@link ovgu.pave.model.algorithmObjects.Slacks#getUtilizationSlack <em>Utilization Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Utilization Slack</em>'.
	 * @see ovgu.pave.model.algorithmObjects.Slacks#getUtilizationSlack()
	 * @see #getSlacks()
	 * @generated
	 */
	EAttribute getSlacks_UtilizationSlack();

	/**
	 * Returns the meta object for the attribute list '{@link ovgu.pave.model.algorithmObjects.Slacks#getDrivingTimeSlack <em>Driving Time Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Driving Time Slack</em>'.
	 * @see ovgu.pave.model.algorithmObjects.Slacks#getDrivingTimeSlack()
	 * @see #getSlacks()
	 * @generated
	 */
	EAttribute getSlacks_DrivingTimeSlack();

	/**
	 * Returns the meta object for data type '{@link ovgu.pave.model.solution.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Route</em>'.
	 * @see ovgu.pave.model.solution.Route
	 * @model instanceClass="ovgu.pave.model.solution.Route"
	 * @generated
	 */
	EDataType getRoute();

	/**
	 * Returns the meta object for data type '{@link ovgu.pave.model.solution.RouteElement <em>Route Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Route Element</em>'.
	 * @see ovgu.pave.model.solution.RouteElement
	 * @model instanceClass="ovgu.pave.model.solution.RouteElement"
	 * @generated
	 */
	EDataType getRouteElement();

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
	 * Returns the meta object for data type '{@link java.util.List <em>Driving Time Information List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Driving Time Information List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List&lt;ovgu.pave.model.algorithmObjects.DrivingTimeInformation&gt;"
	 * @generated
	 */
	EDataType getDrivingTimeInformationList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AlgorithmObjectsFactory getAlgorithmObjectsFactory();

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
		 * The meta object literal for the '{@link ovgu.pave.model.algorithmObjects.impl.InsertionOptionImpl <em>Insertion Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.algorithmObjects.impl.InsertionOptionImpl
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getInsertionOption()
		 * @generated
		 */
		EClass INSERTION_OPTION = eINSTANCE.getInsertionOption();

		/**
		 * The meta object literal for the '<em><b>Costs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_OPTION__COSTS = eINSTANCE.getInsertionOption_Costs();

		/**
		 * The meta object literal for the '<em><b>First Activity Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_OPTION__FIRST_ACTIVITY_INDEX = eINSTANCE.getInsertionOption_FirstActivityIndex();

		/**
		 * The meta object literal for the '<em><b>Second Activity Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_OPTION__SECOND_ACTIVITY_INDEX = eINSTANCE.getInsertionOption_SecondActivityIndex();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_OPTION__ROUTE = eINSTANCE.getInsertionOption_Route();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.algorithmObjects.impl.InsertionInformationImpl <em>Insertion Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.algorithmObjects.impl.InsertionInformationImpl
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getInsertionInformation()
		 * @generated
		 */
		EClass INSERTION_INFORMATION = eINSTANCE.getInsertionInformation();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_INFORMATION__REQUEST = eINSTANCE.getInsertionInformation_Request();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION_INFORMATION__SCORE = eINSTANCE.getInsertionInformation_Score();

		/**
		 * The meta object literal for the '<em><b>Insertion Options</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION_INFORMATION__INSERTION_OPTIONS = eINSTANCE.getInsertionInformation_InsertionOptions();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.algorithmObjects.impl.DrivingTimeInformationImpl <em>Driving Time Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.algorithmObjects.impl.DrivingTimeInformationImpl
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getDrivingTimeInformation()
		 * @generated
		 */
		EClass DRIVING_TIME_INFORMATION = eINSTANCE.getDrivingTimeInformation();

		/**
		 * The meta object literal for the '<em><b>First Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVING_TIME_INFORMATION__FIRST_INDEX = eINSTANCE.getDrivingTimeInformation_FirstIndex();

		/**
		 * The meta object literal for the '<em><b>Driving Time Slack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRIVING_TIME_INFORMATION__DRIVING_TIME_SLACK = eINSTANCE.getDrivingTimeInformation_DrivingTimeSlack();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.algorithmObjects.impl.SlacksImpl <em>Slacks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.algorithmObjects.impl.SlacksImpl
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getSlacks()
		 * @generated
		 */
		EClass SLACKS = eINSTANCE.getSlacks();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLACKS__ROUTE = eINSTANCE.getSlacks_Route();

		/**
		 * The meta object literal for the '<em><b>Time Slack</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLACKS__TIME_SLACK = eINSTANCE.getSlacks_TimeSlack();

		/**
		 * The meta object literal for the '<em><b>Utilization Slack</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLACKS__UTILIZATION_SLACK = eINSTANCE.getSlacks_UtilizationSlack();

		/**
		 * The meta object literal for the '<em><b>Driving Time Slack</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLACKS__DRIVING_TIME_SLACK = eINSTANCE.getSlacks_DrivingTimeSlack();

		/**
		 * The meta object literal for the '<em>Route</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.solution.Route
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRoute()
		 * @generated
		 */
		EDataType ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em>Route Element</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.solution.RouteElement
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRouteElement()
		 * @generated
		 */
		EDataType ROUTE_ELEMENT = eINSTANCE.getRouteElement();

		/**
		 * The meta object literal for the '<em>Requests</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.Request
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getRequests()
		 * @generated
		 */
		EDataType REQUESTS = eINSTANCE.getRequests();

		/**
		 * The meta object literal for the '<em>Driving Time Information List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsPackageImpl#getDrivingTimeInformationList()
		 * @generated
		 */
		EDataType DRIVING_TIME_INFORMATION_LIST = eINSTANCE.getDrivingTimeInformationList();

	}

} //AlgorithmObjectsPackage
