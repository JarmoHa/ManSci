/**
 */
package ovgu.pave.model.Relocation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ovgu.pave.model.Relocation.RegionPlan;
import ovgu.pave.model.Relocation.RegionStatistic;
import ovgu.pave.model.Relocation.Relocation;
import ovgu.pave.model.Relocation.RelocationFactory;
import ovgu.pave.model.Relocation.RelocationPackage;
import ovgu.pave.model.Relocation.TimePeriodPlan;

import ovgu.pave.model.input.Region;
import ovgu.pave.model.input.Request;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelocationPackageImpl extends EPackageImpl implements RelocationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePeriodPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionStatisticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType regionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType requestEDataType = null;

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
	 * @see ovgu.pave.model.Relocation.RelocationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelocationPackageImpl() {
		super(eNS_URI, RelocationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelocationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelocationPackage init() {
		if (isInited) return (RelocationPackage)EPackage.Registry.INSTANCE.getEPackage(RelocationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelocationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelocationPackageImpl theRelocationPackage = registeredRelocationPackage instanceof RelocationPackageImpl ? (RelocationPackageImpl)registeredRelocationPackage : new RelocationPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRelocationPackage.createPackageContents();

		// Initialize created meta-data
		theRelocationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelocationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelocationPackage.eNS_URI, theRelocationPackage);
		return theRelocationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelocation() {
		return relocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelocation_TimePeriodPlans() {
		return (EReference)relocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelocation_RegionStatistics() {
		return (EReference)relocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegionPlan() {
		return regionPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionPlan_Region() {
		return (EAttribute)regionPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegionPlan_TargetRegions() {
		return (EReference)regionPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionPlan_ExpRelocationShare() {
		return (EAttribute)regionPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionPlan_ReceivedVehicles() {
		return (EAttribute)regionPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionPlan_SourceCounter() {
		return (EAttribute)regionPlanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionPlan_SinkCounter() {
		return (EAttribute)regionPlanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionPlan_OutcomeCounter() {
		return (EAttribute)regionPlanEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionPlan_IncomeCounter() {
		return (EAttribute)regionPlanEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionPlan_ShareDiff() {
		return (EAttribute)regionPlanEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionPlan_ExpSupplierShare() {
		return (EAttribute)regionPlanEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionPlan_SendedVehicles() {
		return (EAttribute)regionPlanEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimePeriodPlan() {
		return timePeriodPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimePeriodPlan_RegionPlans() {
		return (EReference)timePeriodPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimePeriodPlan_End() {
		return (EAttribute)timePeriodPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimePeriodPlan_Beginn() {
		return (EAttribute)timePeriodPlanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimePeriodPlan_Demands() {
		return (EAttribute)timePeriodPlanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimePeriodPlan_Supplies() {
		return (EAttribute)timePeriodPlanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimePeriodPlan_Relocations() {
		return (EAttribute)timePeriodPlanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegionStatistic() {
		return regionStatisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionStatistic_Region() {
		return (EAttribute)regionStatisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionStatistic_ReceivingTimes() {
		return (EAttribute)regionStatisticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionStatistic_RejectedRequests() {
		return (EAttribute)regionStatisticEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRegionStatistic_RelocationScore() {
		return (EAttribute)regionStatisticEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRegion() {
		return regionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRequest() {
		return requestEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelocationFactory getRelocationFactory() {
		return (RelocationFactory)getEFactoryInstance();
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
		relocationEClass = createEClass(RELOCATION);
		createEReference(relocationEClass, RELOCATION__TIME_PERIOD_PLANS);
		createEReference(relocationEClass, RELOCATION__REGION_STATISTICS);

		regionPlanEClass = createEClass(REGION_PLAN);
		createEAttribute(regionPlanEClass, REGION_PLAN__REGION);
		createEReference(regionPlanEClass, REGION_PLAN__TARGET_REGIONS);
		createEAttribute(regionPlanEClass, REGION_PLAN__EXP_RELOCATION_SHARE);
		createEAttribute(regionPlanEClass, REGION_PLAN__RECEIVED_VEHICLES);
		createEAttribute(regionPlanEClass, REGION_PLAN__SOURCE_COUNTER);
		createEAttribute(regionPlanEClass, REGION_PLAN__SINK_COUNTER);
		createEAttribute(regionPlanEClass, REGION_PLAN__OUTCOME_COUNTER);
		createEAttribute(regionPlanEClass, REGION_PLAN__INCOME_COUNTER);
		createEAttribute(regionPlanEClass, REGION_PLAN__SHARE_DIFF);
		createEAttribute(regionPlanEClass, REGION_PLAN__EXP_SUPPLIER_SHARE);
		createEAttribute(regionPlanEClass, REGION_PLAN__SENDED_VEHICLES);

		timePeriodPlanEClass = createEClass(TIME_PERIOD_PLAN);
		createEReference(timePeriodPlanEClass, TIME_PERIOD_PLAN__REGION_PLANS);
		createEAttribute(timePeriodPlanEClass, TIME_PERIOD_PLAN__END);
		createEAttribute(timePeriodPlanEClass, TIME_PERIOD_PLAN__BEGINN);
		createEAttribute(timePeriodPlanEClass, TIME_PERIOD_PLAN__DEMANDS);
		createEAttribute(timePeriodPlanEClass, TIME_PERIOD_PLAN__SUPPLIES);
		createEAttribute(timePeriodPlanEClass, TIME_PERIOD_PLAN__RELOCATIONS);

		regionStatisticEClass = createEClass(REGION_STATISTIC);
		createEAttribute(regionStatisticEClass, REGION_STATISTIC__REGION);
		createEAttribute(regionStatisticEClass, REGION_STATISTIC__RECEIVING_TIMES);
		createEAttribute(regionStatisticEClass, REGION_STATISTIC__REJECTED_REQUESTS);
		createEAttribute(regionStatisticEClass, REGION_STATISTIC__RELOCATION_SCORE);

		// Create data types
		regionEDataType = createEDataType(REGION);
		requestEDataType = createEDataType(REQUEST);
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
		initEClass(relocationEClass, Relocation.class, "Relocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelocation_TimePeriodPlans(), this.getTimePeriodPlan(), null, "timePeriodPlans", null, 0, -1, Relocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelocation_RegionStatistics(), this.getRegionStatistic(), null, "regionStatistics", null, 0, -1, Relocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionPlanEClass, RegionPlan.class, "RegionPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegionPlan_Region(), this.getRegion(), "region", null, 0, 1, RegionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionPlan_TargetRegions(), this.getRegionPlan(), null, "targetRegions", null, 0, -1, RegionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionPlan_ExpRelocationShare(), ecorePackage.getELong(), "expRelocationShare", null, 0, 1, RegionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionPlan_ReceivedVehicles(), ecorePackage.getELong(), "receivedVehicles", null, 0, 1, RegionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionPlan_SourceCounter(), ecorePackage.getELong(), "sourceCounter", null, 0, 1, RegionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionPlan_SinkCounter(), ecorePackage.getELong(), "sinkCounter", null, 0, 1, RegionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionPlan_OutcomeCounter(), ecorePackage.getELong(), "outcomeCounter", null, 0, 1, RegionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionPlan_IncomeCounter(), ecorePackage.getELong(), "incomeCounter", null, 0, 1, RegionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionPlan_ShareDiff(), ecorePackage.getELong(), "shareDiff", null, 0, 1, RegionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionPlan_ExpSupplierShare(), ecorePackage.getELong(), "expSupplierShare", null, 0, 1, RegionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionPlan_SendedVehicles(), ecorePackage.getELong(), "sendedVehicles", null, 0, 1, RegionPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timePeriodPlanEClass, TimePeriodPlan.class, "TimePeriodPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimePeriodPlan_RegionPlans(), this.getRegionPlan(), null, "regionPlans", null, 0, -1, TimePeriodPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePeriodPlan_End(), ecorePackage.getELong(), "end", null, 0, 1, TimePeriodPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePeriodPlan_Beginn(), ecorePackage.getELong(), "beginn", null, 0, 1, TimePeriodPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePeriodPlan_Demands(), ecorePackage.getELong(), "demands", null, 0, 1, TimePeriodPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePeriodPlan_Supplies(), ecorePackage.getELong(), "supplies", null, 0, 1, TimePeriodPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimePeriodPlan_Relocations(), ecorePackage.getELong(), "relocations", null, 0, 1, TimePeriodPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionStatisticEClass, RegionStatistic.class, "RegionStatistic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegionStatistic_Region(), this.getRegion(), "region", null, 0, 1, RegionStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionStatistic_ReceivingTimes(), ecorePackage.getELong(), "receivingTimes", null, 0, -1, RegionStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionStatistic_RejectedRequests(), this.getRequest(), "rejectedRequests", null, 0, -1, RegionStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegionStatistic_RelocationScore(), ecorePackage.getEDouble(), "relocationScore", null, 0, 1, RegionStatistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(regionEDataType, Region.class, "Region", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(requestEDataType, Request.class, "Request", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RelocationPackageImpl
