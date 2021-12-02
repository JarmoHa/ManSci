/**
 */
package ovgu.pave.model.algorithmObjects.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ovgu.pave.model.algorithmObjects.AlgorithmObjectsFactory;
import ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage;
import ovgu.pave.model.algorithmObjects.DrivingTimeInformation;
import ovgu.pave.model.algorithmObjects.InsertionInformation;
import ovgu.pave.model.algorithmObjects.InsertionOption;
import ovgu.pave.model.algorithmObjects.Slacks;

import ovgu.pave.model.input.Request;

import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.RouteElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgorithmObjectsPackageImpl extends EPackageImpl implements AlgorithmObjectsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertionOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertionInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drivingTimeInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slacksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType routeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType routeElementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType requestsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType drivingTimeInformationListEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlgorithmObjectsPackageImpl() {
		super(eNS_URI, AlgorithmObjectsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AlgorithmObjectsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlgorithmObjectsPackage init() {
		if (isInited) return (AlgorithmObjectsPackage)EPackage.Registry.INSTANCE.getEPackage(AlgorithmObjectsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAlgorithmObjectsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AlgorithmObjectsPackageImpl theAlgorithmObjectsPackage = registeredAlgorithmObjectsPackage instanceof AlgorithmObjectsPackageImpl ? (AlgorithmObjectsPackageImpl)registeredAlgorithmObjectsPackage : new AlgorithmObjectsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAlgorithmObjectsPackage.createPackageContents();

		// Initialize created meta-data
		theAlgorithmObjectsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlgorithmObjectsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlgorithmObjectsPackage.eNS_URI, theAlgorithmObjectsPackage);
		return theAlgorithmObjectsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertionOption() {
		return insertionOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionOption_Costs() {
		return (EAttribute)insertionOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionOption_FirstActivityIndex() {
		return (EAttribute)insertionOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionOption_SecondActivityIndex() {
		return (EAttribute)insertionOptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionOption_Route() {
		return (EAttribute)insertionOptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertionInformation() {
		return insertionInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionInformation_Request() {
		return (EAttribute)insertionInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertionInformation_Score() {
		return (EAttribute)insertionInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertionInformation_InsertionOptions() {
		return (EReference)insertionInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrivingTimeInformation() {
		return drivingTimeInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrivingTimeInformation_FirstIndex() {
		return (EAttribute)drivingTimeInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrivingTimeInformation_DrivingTimeSlack() {
		return (EAttribute)drivingTimeInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlacks() {
		return slacksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlacks_Route() {
		return (EAttribute)slacksEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlacks_TimeSlack() {
		return (EAttribute)slacksEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlacks_UtilizationSlack() {
		return (EAttribute)slacksEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlacks_DrivingTimeSlack() {
		return (EAttribute)slacksEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRoute() {
		return routeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRouteElement() {
		return routeElementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRequests() {
		return requestsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDrivingTimeInformationList() {
		return drivingTimeInformationListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmObjectsFactory getAlgorithmObjectsFactory() {
		return (AlgorithmObjectsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		insertionOptionEClass = createEClass(INSERTION_OPTION);
		createEAttribute(insertionOptionEClass, INSERTION_OPTION__COSTS);
		createEAttribute(insertionOptionEClass, INSERTION_OPTION__FIRST_ACTIVITY_INDEX);
		createEAttribute(insertionOptionEClass, INSERTION_OPTION__SECOND_ACTIVITY_INDEX);
		createEAttribute(insertionOptionEClass, INSERTION_OPTION__ROUTE);

		insertionInformationEClass = createEClass(INSERTION_INFORMATION);
		createEAttribute(insertionInformationEClass, INSERTION_INFORMATION__REQUEST);
		createEAttribute(insertionInformationEClass, INSERTION_INFORMATION__SCORE);
		createEReference(insertionInformationEClass, INSERTION_INFORMATION__INSERTION_OPTIONS);

		drivingTimeInformationEClass = createEClass(DRIVING_TIME_INFORMATION);
		createEAttribute(drivingTimeInformationEClass, DRIVING_TIME_INFORMATION__FIRST_INDEX);
		createEAttribute(drivingTimeInformationEClass, DRIVING_TIME_INFORMATION__DRIVING_TIME_SLACK);

		slacksEClass = createEClass(SLACKS);
		createEAttribute(slacksEClass, SLACKS__ROUTE);
		createEAttribute(slacksEClass, SLACKS__TIME_SLACK);
		createEAttribute(slacksEClass, SLACKS__UTILIZATION_SLACK);
		createEAttribute(slacksEClass, SLACKS__DRIVING_TIME_SLACK);

		// Create data types
		routeEDataType = createEDataType(ROUTE);
		routeElementEDataType = createEDataType(ROUTE_ELEMENT);
		requestsEDataType = createEDataType(REQUESTS);
		drivingTimeInformationListEDataType = createEDataType(DRIVING_TIME_INFORMATION_LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(insertionOptionEClass, InsertionOption.class, "InsertionOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsertionOption_Costs(), ecorePackage.getELong(), "costs", null, 0, 1, InsertionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertionOption_FirstActivityIndex(), ecorePackage.getEInt(), "firstActivityIndex", null, 0, 1, InsertionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertionOption_SecondActivityIndex(), ecorePackage.getEInt(), "secondActivityIndex", null, 0, 1, InsertionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertionOption_Route(), this.getRoute(), "route", null, 0, 1, InsertionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertionInformationEClass, InsertionInformation.class, "InsertionInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsertionInformation_Request(), this.getRequests(), "request", null, 0, 1, InsertionInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertionInformation_Score(), ecorePackage.getELong(), "score", null, 0, 1, InsertionInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertionInformation_InsertionOptions(), this.getInsertionOption(), null, "insertionOptions", null, 0, -1, InsertionInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drivingTimeInformationEClass, DrivingTimeInformation.class, "DrivingTimeInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDrivingTimeInformation_FirstIndex(), ecorePackage.getELong(), "firstIndex", null, 0, 1, DrivingTimeInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrivingTimeInformation_DrivingTimeSlack(), ecorePackage.getELong(), "drivingTimeSlack", null, 0, 1, DrivingTimeInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slacksEClass, Slacks.class, "Slacks", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlacks_Route(), this.getRoute(), "Route", null, 0, 1, Slacks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlacks_TimeSlack(), ecorePackage.getELong(), "timeSlack", null, 0, -1, Slacks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlacks_UtilizationSlack(), ecorePackage.getEInt(), "utilizationSlack", null, 0, -1, Slacks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlacks_DrivingTimeSlack(), this.getDrivingTimeInformationList(), "drivingTimeSlack", null, 0, -1, Slacks.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(routeEDataType, Route.class, "Route", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(routeElementEDataType, RouteElement.class, "RouteElement", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(requestsEDataType, Request.class, "Requests", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(drivingTimeInformationListEDataType, List.class, "DrivingTimeInformationList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS, "java.util.List<ovgu.pave.model.algorithmObjects.DrivingTimeInformation>");

		// Create resource
		createResource(eNS_URI);
	}

} //AlgorithmObjectsPackageImpl
