/**
 */
package ovgu.pave.model.Relocation;

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
 * @see ovgu.pave.model.Relocation.RelocationFactory
 * @model kind="package"
 * @generated
 */
public interface RelocationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Relocation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ovgu.pave.Relocation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reloc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelocationPackage eINSTANCE = ovgu.pave.model.Relocation.impl.RelocationPackageImpl.init();

	/**
	 * The meta object id for the '{@link ovgu.pave.model.Relocation.impl.RelocationImpl <em>Relocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.Relocation.impl.RelocationImpl
	 * @see ovgu.pave.model.Relocation.impl.RelocationPackageImpl#getRelocation()
	 * @generated
	 */
	int RELOCATION = 0;

	/**
	 * The feature id for the '<em><b>Time Period Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATION__TIME_PERIOD_PLANS = 0;

	/**
	 * The feature id for the '<em><b>Region Statistics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATION__REGION_STATISTICS = 1;

	/**
	 * The number of structural features of the '<em>Relocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.Relocation.impl.RegionPlanImpl <em>Region Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.Relocation.impl.RegionPlanImpl
	 * @see ovgu.pave.model.Relocation.impl.RelocationPackageImpl#getRegionPlan()
	 * @generated
	 */
	int REGION_PLAN = 1;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PLAN__REGION = 0;

	/**
	 * The feature id for the '<em><b>Target Regions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PLAN__TARGET_REGIONS = 1;

	/**
	 * The feature id for the '<em><b>Exp Relocation Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PLAN__EXP_RELOCATION_SHARE = 2;

	/**
	 * The feature id for the '<em><b>Received Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PLAN__RECEIVED_VEHICLES = 3;

	/**
	 * The feature id for the '<em><b>Source Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PLAN__SOURCE_COUNTER = 4;

	/**
	 * The feature id for the '<em><b>Sink Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PLAN__SINK_COUNTER = 5;

	/**
	 * The feature id for the '<em><b>Outcome Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PLAN__OUTCOME_COUNTER = 6;

	/**
	 * The feature id for the '<em><b>Income Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PLAN__INCOME_COUNTER = 7;

	/**
	 * The feature id for the '<em><b>Share Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PLAN__SHARE_DIFF = 8;

	/**
	 * The feature id for the '<em><b>Exp Supplier Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PLAN__EXP_SUPPLIER_SHARE = 9;

	/**
	 * The feature id for the '<em><b>Sended Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PLAN__SENDED_VEHICLES = 10;

	/**
	 * The number of structural features of the '<em>Region Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PLAN_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Region Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.Relocation.impl.TimePeriodPlanImpl <em>Time Period Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.Relocation.impl.TimePeriodPlanImpl
	 * @see ovgu.pave.model.Relocation.impl.RelocationPackageImpl#getTimePeriodPlan()
	 * @generated
	 */
	int TIME_PERIOD_PLAN = 2;

	/**
	 * The feature id for the '<em><b>Region Plans</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_PLAN__REGION_PLANS = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_PLAN__END = 1;

	/**
	 * The feature id for the '<em><b>Beginn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_PLAN__BEGINN = 2;

	/**
	 * The feature id for the '<em><b>Demands</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_PLAN__DEMANDS = 3;

	/**
	 * The feature id for the '<em><b>Supplies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_PLAN__SUPPLIES = 4;

	/**
	 * The feature id for the '<em><b>Relocations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_PLAN__RELOCATIONS = 5;

	/**
	 * The number of structural features of the '<em>Time Period Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_PLAN_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Time Period Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ovgu.pave.model.Relocation.impl.RegionStatisticImpl <em>Region Statistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.Relocation.impl.RegionStatisticImpl
	 * @see ovgu.pave.model.Relocation.impl.RelocationPackageImpl#getRegionStatistic()
	 * @generated
	 */
	int REGION_STATISTIC = 3;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_STATISTIC__REGION = 0;

	/**
	 * The feature id for the '<em><b>Receiving Times</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_STATISTIC__RECEIVING_TIMES = 1;

	/**
	 * The feature id for the '<em><b>Rejected Requests</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_STATISTIC__REJECTED_REQUESTS = 2;

	/**
	 * The feature id for the '<em><b>Relocation Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_STATISTIC__RELOCATION_SCORE = 3;

	/**
	 * The number of structural features of the '<em>Region Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_STATISTIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Region Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_STATISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Region</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.Region
	 * @see ovgu.pave.model.Relocation.impl.RelocationPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 4;

	/**
	 * The meta object id for the '<em>Request</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ovgu.pave.model.input.Request
	 * @see ovgu.pave.model.Relocation.impl.RelocationPackageImpl#getRequest()
	 * @generated
	 */
	int REQUEST = 5;


	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.Relocation.Relocation <em>Relocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relocation</em>'.
	 * @see ovgu.pave.model.Relocation.Relocation
	 * @generated
	 */
	EClass getRelocation();

	/**
	 * Returns the meta object for the containment reference list '{@link ovgu.pave.model.Relocation.Relocation#getTimePeriodPlans <em>Time Period Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Period Plans</em>'.
	 * @see ovgu.pave.model.Relocation.Relocation#getTimePeriodPlans()
	 * @see #getRelocation()
	 * @generated
	 */
	EReference getRelocation_TimePeriodPlans();

	/**
	 * Returns the meta object for the reference list '{@link ovgu.pave.model.Relocation.Relocation#getRegionStatistics <em>Region Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Region Statistics</em>'.
	 * @see ovgu.pave.model.Relocation.Relocation#getRegionStatistics()
	 * @see #getRelocation()
	 * @generated
	 */
	EReference getRelocation_RegionStatistics();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.Relocation.RegionPlan <em>Region Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Plan</em>'.
	 * @see ovgu.pave.model.Relocation.RegionPlan
	 * @generated
	 */
	EClass getRegionPlan();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.RegionPlan#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see ovgu.pave.model.Relocation.RegionPlan#getRegion()
	 * @see #getRegionPlan()
	 * @generated
	 */
	EAttribute getRegionPlan_Region();

	/**
	 * Returns the meta object for the reference list '{@link ovgu.pave.model.Relocation.RegionPlan#getTargetRegions <em>Target Regions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Regions</em>'.
	 * @see ovgu.pave.model.Relocation.RegionPlan#getTargetRegions()
	 * @see #getRegionPlan()
	 * @generated
	 */
	EReference getRegionPlan_TargetRegions();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.RegionPlan#getExpRelocationShare <em>Exp Relocation Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exp Relocation Share</em>'.
	 * @see ovgu.pave.model.Relocation.RegionPlan#getExpRelocationShare()
	 * @see #getRegionPlan()
	 * @generated
	 */
	EAttribute getRegionPlan_ExpRelocationShare();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.RegionPlan#getReceivedVehicles <em>Received Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received Vehicles</em>'.
	 * @see ovgu.pave.model.Relocation.RegionPlan#getReceivedVehicles()
	 * @see #getRegionPlan()
	 * @generated
	 */
	EAttribute getRegionPlan_ReceivedVehicles();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.RegionPlan#getSourceCounter <em>Source Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Counter</em>'.
	 * @see ovgu.pave.model.Relocation.RegionPlan#getSourceCounter()
	 * @see #getRegionPlan()
	 * @generated
	 */
	EAttribute getRegionPlan_SourceCounter();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.RegionPlan#getSinkCounter <em>Sink Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sink Counter</em>'.
	 * @see ovgu.pave.model.Relocation.RegionPlan#getSinkCounter()
	 * @see #getRegionPlan()
	 * @generated
	 */
	EAttribute getRegionPlan_SinkCounter();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.RegionPlan#getOutcomeCounter <em>Outcome Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outcome Counter</em>'.
	 * @see ovgu.pave.model.Relocation.RegionPlan#getOutcomeCounter()
	 * @see #getRegionPlan()
	 * @generated
	 */
	EAttribute getRegionPlan_OutcomeCounter();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.RegionPlan#getIncomeCounter <em>Income Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Income Counter</em>'.
	 * @see ovgu.pave.model.Relocation.RegionPlan#getIncomeCounter()
	 * @see #getRegionPlan()
	 * @generated
	 */
	EAttribute getRegionPlan_IncomeCounter();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.RegionPlan#getShareDiff <em>Share Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Share Diff</em>'.
	 * @see ovgu.pave.model.Relocation.RegionPlan#getShareDiff()
	 * @see #getRegionPlan()
	 * @generated
	 */
	EAttribute getRegionPlan_ShareDiff();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.RegionPlan#getExpSupplierShare <em>Exp Supplier Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exp Supplier Share</em>'.
	 * @see ovgu.pave.model.Relocation.RegionPlan#getExpSupplierShare()
	 * @see #getRegionPlan()
	 * @generated
	 */
	EAttribute getRegionPlan_ExpSupplierShare();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.RegionPlan#getSendedVehicles <em>Sended Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sended Vehicles</em>'.
	 * @see ovgu.pave.model.Relocation.RegionPlan#getSendedVehicles()
	 * @see #getRegionPlan()
	 * @generated
	 */
	EAttribute getRegionPlan_SendedVehicles();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.Relocation.TimePeriodPlan <em>Time Period Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Period Plan</em>'.
	 * @see ovgu.pave.model.Relocation.TimePeriodPlan
	 * @generated
	 */
	EClass getTimePeriodPlan();

	/**
	 * Returns the meta object for the reference list '{@link ovgu.pave.model.Relocation.TimePeriodPlan#getRegionPlans <em>Region Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Region Plans</em>'.
	 * @see ovgu.pave.model.Relocation.TimePeriodPlan#getRegionPlans()
	 * @see #getTimePeriodPlan()
	 * @generated
	 */
	EReference getTimePeriodPlan_RegionPlans();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.TimePeriodPlan#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see ovgu.pave.model.Relocation.TimePeriodPlan#getEnd()
	 * @see #getTimePeriodPlan()
	 * @generated
	 */
	EAttribute getTimePeriodPlan_End();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.TimePeriodPlan#getBeginn <em>Beginn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginn</em>'.
	 * @see ovgu.pave.model.Relocation.TimePeriodPlan#getBeginn()
	 * @see #getTimePeriodPlan()
	 * @generated
	 */
	EAttribute getTimePeriodPlan_Beginn();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.TimePeriodPlan#getDemands <em>Demands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Demands</em>'.
	 * @see ovgu.pave.model.Relocation.TimePeriodPlan#getDemands()
	 * @see #getTimePeriodPlan()
	 * @generated
	 */
	EAttribute getTimePeriodPlan_Demands();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.TimePeriodPlan#getSupplies <em>Supplies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplies</em>'.
	 * @see ovgu.pave.model.Relocation.TimePeriodPlan#getSupplies()
	 * @see #getTimePeriodPlan()
	 * @generated
	 */
	EAttribute getTimePeriodPlan_Supplies();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.TimePeriodPlan#getRelocations <em>Relocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relocations</em>'.
	 * @see ovgu.pave.model.Relocation.TimePeriodPlan#getRelocations()
	 * @see #getTimePeriodPlan()
	 * @generated
	 */
	EAttribute getTimePeriodPlan_Relocations();

	/**
	 * Returns the meta object for class '{@link ovgu.pave.model.Relocation.RegionStatistic <em>Region Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Statistic</em>'.
	 * @see ovgu.pave.model.Relocation.RegionStatistic
	 * @generated
	 */
	EClass getRegionStatistic();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.RegionStatistic#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see ovgu.pave.model.Relocation.RegionStatistic#getRegion()
	 * @see #getRegionStatistic()
	 * @generated
	 */
	EAttribute getRegionStatistic_Region();

	/**
	 * Returns the meta object for the attribute list '{@link ovgu.pave.model.Relocation.RegionStatistic#getReceivingTimes <em>Receiving Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Receiving Times</em>'.
	 * @see ovgu.pave.model.Relocation.RegionStatistic#getReceivingTimes()
	 * @see #getRegionStatistic()
	 * @generated
	 */
	EAttribute getRegionStatistic_ReceivingTimes();

	/**
	 * Returns the meta object for the attribute list '{@link ovgu.pave.model.Relocation.RegionStatistic#getRejectedRequests <em>Rejected Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rejected Requests</em>'.
	 * @see ovgu.pave.model.Relocation.RegionStatistic#getRejectedRequests()
	 * @see #getRegionStatistic()
	 * @generated
	 */
	EAttribute getRegionStatistic_RejectedRequests();

	/**
	 * Returns the meta object for the attribute '{@link ovgu.pave.model.Relocation.RegionStatistic#getRelocationScore <em>Relocation Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relocation Score</em>'.
	 * @see ovgu.pave.model.Relocation.RegionStatistic#getRelocationScore()
	 * @see #getRegionStatistic()
	 * @generated
	 */
	EAttribute getRegionStatistic_RelocationScore();

	/**
	 * Returns the meta object for data type '{@link ovgu.pave.model.input.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Region</em>'.
	 * @see ovgu.pave.model.input.Region
	 * @model instanceClass="ovgu.pave.model.input.Region"
	 * @generated
	 */
	EDataType getRegion();

	/**
	 * Returns the meta object for data type '{@link ovgu.pave.model.input.Request <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Request</em>'.
	 * @see ovgu.pave.model.input.Request
	 * @model instanceClass="ovgu.pave.model.input.Request"
	 * @generated
	 */
	EDataType getRequest();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelocationFactory getRelocationFactory();

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
		 * The meta object literal for the '{@link ovgu.pave.model.Relocation.impl.RelocationImpl <em>Relocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.Relocation.impl.RelocationImpl
		 * @see ovgu.pave.model.Relocation.impl.RelocationPackageImpl#getRelocation()
		 * @generated
		 */
		EClass RELOCATION = eINSTANCE.getRelocation();

		/**
		 * The meta object literal for the '<em><b>Time Period Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELOCATION__TIME_PERIOD_PLANS = eINSTANCE.getRelocation_TimePeriodPlans();

		/**
		 * The meta object literal for the '<em><b>Region Statistics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELOCATION__REGION_STATISTICS = eINSTANCE.getRelocation_RegionStatistics();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.Relocation.impl.RegionPlanImpl <em>Region Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.Relocation.impl.RegionPlanImpl
		 * @see ovgu.pave.model.Relocation.impl.RelocationPackageImpl#getRegionPlan()
		 * @generated
		 */
		EClass REGION_PLAN = eINSTANCE.getRegionPlan();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_PLAN__REGION = eINSTANCE.getRegionPlan_Region();

		/**
		 * The meta object literal for the '<em><b>Target Regions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION_PLAN__TARGET_REGIONS = eINSTANCE.getRegionPlan_TargetRegions();

		/**
		 * The meta object literal for the '<em><b>Exp Relocation Share</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_PLAN__EXP_RELOCATION_SHARE = eINSTANCE.getRegionPlan_ExpRelocationShare();

		/**
		 * The meta object literal for the '<em><b>Received Vehicles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_PLAN__RECEIVED_VEHICLES = eINSTANCE.getRegionPlan_ReceivedVehicles();

		/**
		 * The meta object literal for the '<em><b>Source Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_PLAN__SOURCE_COUNTER = eINSTANCE.getRegionPlan_SourceCounter();

		/**
		 * The meta object literal for the '<em><b>Sink Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_PLAN__SINK_COUNTER = eINSTANCE.getRegionPlan_SinkCounter();

		/**
		 * The meta object literal for the '<em><b>Outcome Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_PLAN__OUTCOME_COUNTER = eINSTANCE.getRegionPlan_OutcomeCounter();

		/**
		 * The meta object literal for the '<em><b>Income Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_PLAN__INCOME_COUNTER = eINSTANCE.getRegionPlan_IncomeCounter();

		/**
		 * The meta object literal for the '<em><b>Share Diff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_PLAN__SHARE_DIFF = eINSTANCE.getRegionPlan_ShareDiff();

		/**
		 * The meta object literal for the '<em><b>Exp Supplier Share</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_PLAN__EXP_SUPPLIER_SHARE = eINSTANCE.getRegionPlan_ExpSupplierShare();

		/**
		 * The meta object literal for the '<em><b>Sended Vehicles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_PLAN__SENDED_VEHICLES = eINSTANCE.getRegionPlan_SendedVehicles();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.Relocation.impl.TimePeriodPlanImpl <em>Time Period Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.Relocation.impl.TimePeriodPlanImpl
		 * @see ovgu.pave.model.Relocation.impl.RelocationPackageImpl#getTimePeriodPlan()
		 * @generated
		 */
		EClass TIME_PERIOD_PLAN = eINSTANCE.getTimePeriodPlan();

		/**
		 * The meta object literal for the '<em><b>Region Plans</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PERIOD_PLAN__REGION_PLANS = eINSTANCE.getTimePeriodPlan_RegionPlans();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD_PLAN__END = eINSTANCE.getTimePeriodPlan_End();

		/**
		 * The meta object literal for the '<em><b>Beginn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD_PLAN__BEGINN = eINSTANCE.getTimePeriodPlan_Beginn();

		/**
		 * The meta object literal for the '<em><b>Demands</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD_PLAN__DEMANDS = eINSTANCE.getTimePeriodPlan_Demands();

		/**
		 * The meta object literal for the '<em><b>Supplies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD_PLAN__SUPPLIES = eINSTANCE.getTimePeriodPlan_Supplies();

		/**
		 * The meta object literal for the '<em><b>Relocations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD_PLAN__RELOCATIONS = eINSTANCE.getTimePeriodPlan_Relocations();

		/**
		 * The meta object literal for the '{@link ovgu.pave.model.Relocation.impl.RegionStatisticImpl <em>Region Statistic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.Relocation.impl.RegionStatisticImpl
		 * @see ovgu.pave.model.Relocation.impl.RelocationPackageImpl#getRegionStatistic()
		 * @generated
		 */
		EClass REGION_STATISTIC = eINSTANCE.getRegionStatistic();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_STATISTIC__REGION = eINSTANCE.getRegionStatistic_Region();

		/**
		 * The meta object literal for the '<em><b>Receiving Times</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_STATISTIC__RECEIVING_TIMES = eINSTANCE.getRegionStatistic_ReceivingTimes();

		/**
		 * The meta object literal for the '<em><b>Rejected Requests</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_STATISTIC__REJECTED_REQUESTS = eINSTANCE.getRegionStatistic_RejectedRequests();

		/**
		 * The meta object literal for the '<em><b>Relocation Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION_STATISTIC__RELOCATION_SCORE = eINSTANCE.getRegionStatistic_RelocationScore();

		/**
		 * The meta object literal for the '<em>Region</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.Region
		 * @see ovgu.pave.model.Relocation.impl.RelocationPackageImpl#getRegion()
		 * @generated
		 */
		EDataType REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em>Request</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ovgu.pave.model.input.Request
		 * @see ovgu.pave.model.Relocation.impl.RelocationPackageImpl#getRequest()
		 * @generated
		 */
		EDataType REQUEST = eINSTANCE.getRequest();

	}

} //RelocationPackage
