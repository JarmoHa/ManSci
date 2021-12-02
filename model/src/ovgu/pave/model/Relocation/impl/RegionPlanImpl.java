/**
 */
package ovgu.pave.model.Relocation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ovgu.pave.model.Relocation.RegionPlan;
import ovgu.pave.model.Relocation.RelocationPackage;

import ovgu.pave.model.input.Region;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionPlanImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionPlanImpl#getTargetRegions <em>Target Regions</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionPlanImpl#getExpRelocationShare <em>Exp Relocation Share</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionPlanImpl#getReceivedVehicles <em>Received Vehicles</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionPlanImpl#getSourceCounter <em>Source Counter</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionPlanImpl#getSinkCounter <em>Sink Counter</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionPlanImpl#getOutcomeCounter <em>Outcome Counter</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionPlanImpl#getIncomeCounter <em>Income Counter</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionPlanImpl#getShareDiff <em>Share Diff</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionPlanImpl#getExpSupplierShare <em>Exp Supplier Share</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionPlanImpl#getSendedVehicles <em>Sended Vehicles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionPlanImpl extends MinimalEObjectImpl.Container implements RegionPlan {
	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final Region REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected Region region = REGION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetRegions() <em>Target Regions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<RegionPlan> targetRegions;

	/**
	 * The default value of the '{@link #getExpRelocationShare() <em>Exp Relocation Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpRelocationShare()
	 * @generated
	 * @ordered
	 */
	protected static final long EXP_RELOCATION_SHARE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExpRelocationShare() <em>Exp Relocation Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpRelocationShare()
	 * @generated
	 * @ordered
	 */
	protected long expRelocationShare = EXP_RELOCATION_SHARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceivedVehicles() <em>Received Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedVehicles()
	 * @generated
	 * @ordered
	 */
	protected static final long RECEIVED_VEHICLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getReceivedVehicles() <em>Received Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedVehicles()
	 * @generated
	 * @ordered
	 */
	protected long receivedVehicles = RECEIVED_VEHICLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceCounter() <em>Source Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCounter()
	 * @generated
	 * @ordered
	 */
	protected static final long SOURCE_COUNTER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSourceCounter() <em>Source Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCounter()
	 * @generated
	 * @ordered
	 */
	protected long sourceCounter = SOURCE_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSinkCounter() <em>Sink Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinkCounter()
	 * @generated
	 * @ordered
	 */
	protected static final long SINK_COUNTER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSinkCounter() <em>Sink Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinkCounter()
	 * @generated
	 * @ordered
	 */
	protected long sinkCounter = SINK_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutcomeCounter() <em>Outcome Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final long OUTCOME_COUNTER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getOutcomeCounter() <em>Outcome Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomeCounter()
	 * @generated
	 * @ordered
	 */
	protected long outcomeCounter = OUTCOME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncomeCounter() <em>Income Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final long INCOME_COUNTER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getIncomeCounter() <em>Income Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomeCounter()
	 * @generated
	 * @ordered
	 */
	protected long incomeCounter = INCOME_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getShareDiff() <em>Share Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareDiff()
	 * @generated
	 * @ordered
	 */
	protected static final long SHARE_DIFF_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getShareDiff() <em>Share Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareDiff()
	 * @generated
	 * @ordered
	 */
	protected long shareDiff = SHARE_DIFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpSupplierShare() <em>Exp Supplier Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpSupplierShare()
	 * @generated
	 * @ordered
	 */
	protected static final long EXP_SUPPLIER_SHARE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExpSupplierShare() <em>Exp Supplier Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpSupplierShare()
	 * @generated
	 * @ordered
	 */
	protected long expSupplierShare = EXP_SUPPLIER_SHARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendedVehicles() <em>Sended Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendedVehicles()
	 * @generated
	 * @ordered
	 */
	protected static final long SENDED_VEHICLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSendedVehicles() <em>Sended Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendedVehicles()
	 * @generated
	 * @ordered
	 */
	protected long sendedVehicles = SENDED_VEHICLES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelocationPackage.Literals.REGION_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Region getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegion(Region newRegion) {
		Region oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.REGION_PLAN__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RegionPlan> getTargetRegions() {
		if (targetRegions == null) {
			targetRegions = new EObjectResolvingEList<RegionPlan>(RegionPlan.class, this, RelocationPackage.REGION_PLAN__TARGET_REGIONS);
		}
		return targetRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getExpRelocationShare() {
		return expRelocationShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpRelocationShare(long newExpRelocationShare) {
		long oldExpRelocationShare = expRelocationShare;
		expRelocationShare = newExpRelocationShare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.REGION_PLAN__EXP_RELOCATION_SHARE, oldExpRelocationShare, expRelocationShare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getReceivedVehicles() {
		return receivedVehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceivedVehicles(long newReceivedVehicles) {
		long oldReceivedVehicles = receivedVehicles;
		receivedVehicles = newReceivedVehicles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.REGION_PLAN__RECEIVED_VEHICLES, oldReceivedVehicles, receivedVehicles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSourceCounter() {
		return sourceCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceCounter(long newSourceCounter) {
		long oldSourceCounter = sourceCounter;
		sourceCounter = newSourceCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.REGION_PLAN__SOURCE_COUNTER, oldSourceCounter, sourceCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSinkCounter() {
		return sinkCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSinkCounter(long newSinkCounter) {
		long oldSinkCounter = sinkCounter;
		sinkCounter = newSinkCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.REGION_PLAN__SINK_COUNTER, oldSinkCounter, sinkCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getOutcomeCounter() {
		return outcomeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutcomeCounter(long newOutcomeCounter) {
		long oldOutcomeCounter = outcomeCounter;
		outcomeCounter = newOutcomeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.REGION_PLAN__OUTCOME_COUNTER, oldOutcomeCounter, outcomeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getIncomeCounter() {
		return incomeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncomeCounter(long newIncomeCounter) {
		long oldIncomeCounter = incomeCounter;
		incomeCounter = newIncomeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.REGION_PLAN__INCOME_COUNTER, oldIncomeCounter, incomeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getShareDiff() {
		return shareDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShareDiff(long newShareDiff) {
		long oldShareDiff = shareDiff;
		shareDiff = newShareDiff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.REGION_PLAN__SHARE_DIFF, oldShareDiff, shareDiff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getExpSupplierShare() {
		return expSupplierShare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpSupplierShare(long newExpSupplierShare) {
		long oldExpSupplierShare = expSupplierShare;
		expSupplierShare = newExpSupplierShare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.REGION_PLAN__EXP_SUPPLIER_SHARE, oldExpSupplierShare, expSupplierShare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSendedVehicles() {
		return sendedVehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSendedVehicles(long newSendedVehicles) {
		long oldSendedVehicles = sendedVehicles;
		sendedVehicles = newSendedVehicles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.REGION_PLAN__SENDED_VEHICLES, oldSendedVehicles, sendedVehicles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelocationPackage.REGION_PLAN__REGION:
				return getRegion();
			case RelocationPackage.REGION_PLAN__TARGET_REGIONS:
				return getTargetRegions();
			case RelocationPackage.REGION_PLAN__EXP_RELOCATION_SHARE:
				return getExpRelocationShare();
			case RelocationPackage.REGION_PLAN__RECEIVED_VEHICLES:
				return getReceivedVehicles();
			case RelocationPackage.REGION_PLAN__SOURCE_COUNTER:
				return getSourceCounter();
			case RelocationPackage.REGION_PLAN__SINK_COUNTER:
				return getSinkCounter();
			case RelocationPackage.REGION_PLAN__OUTCOME_COUNTER:
				return getOutcomeCounter();
			case RelocationPackage.REGION_PLAN__INCOME_COUNTER:
				return getIncomeCounter();
			case RelocationPackage.REGION_PLAN__SHARE_DIFF:
				return getShareDiff();
			case RelocationPackage.REGION_PLAN__EXP_SUPPLIER_SHARE:
				return getExpSupplierShare();
			case RelocationPackage.REGION_PLAN__SENDED_VEHICLES:
				return getSendedVehicles();
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
			case RelocationPackage.REGION_PLAN__REGION:
				setRegion((Region)newValue);
				return;
			case RelocationPackage.REGION_PLAN__TARGET_REGIONS:
				getTargetRegions().clear();
				getTargetRegions().addAll((Collection<? extends RegionPlan>)newValue);
				return;
			case RelocationPackage.REGION_PLAN__EXP_RELOCATION_SHARE:
				setExpRelocationShare((Long)newValue);
				return;
			case RelocationPackage.REGION_PLAN__RECEIVED_VEHICLES:
				setReceivedVehicles((Long)newValue);
				return;
			case RelocationPackage.REGION_PLAN__SOURCE_COUNTER:
				setSourceCounter((Long)newValue);
				return;
			case RelocationPackage.REGION_PLAN__SINK_COUNTER:
				setSinkCounter((Long)newValue);
				return;
			case RelocationPackage.REGION_PLAN__OUTCOME_COUNTER:
				setOutcomeCounter((Long)newValue);
				return;
			case RelocationPackage.REGION_PLAN__INCOME_COUNTER:
				setIncomeCounter((Long)newValue);
				return;
			case RelocationPackage.REGION_PLAN__SHARE_DIFF:
				setShareDiff((Long)newValue);
				return;
			case RelocationPackage.REGION_PLAN__EXP_SUPPLIER_SHARE:
				setExpSupplierShare((Long)newValue);
				return;
			case RelocationPackage.REGION_PLAN__SENDED_VEHICLES:
				setSendedVehicles((Long)newValue);
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
			case RelocationPackage.REGION_PLAN__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case RelocationPackage.REGION_PLAN__TARGET_REGIONS:
				getTargetRegions().clear();
				return;
			case RelocationPackage.REGION_PLAN__EXP_RELOCATION_SHARE:
				setExpRelocationShare(EXP_RELOCATION_SHARE_EDEFAULT);
				return;
			case RelocationPackage.REGION_PLAN__RECEIVED_VEHICLES:
				setReceivedVehicles(RECEIVED_VEHICLES_EDEFAULT);
				return;
			case RelocationPackage.REGION_PLAN__SOURCE_COUNTER:
				setSourceCounter(SOURCE_COUNTER_EDEFAULT);
				return;
			case RelocationPackage.REGION_PLAN__SINK_COUNTER:
				setSinkCounter(SINK_COUNTER_EDEFAULT);
				return;
			case RelocationPackage.REGION_PLAN__OUTCOME_COUNTER:
				setOutcomeCounter(OUTCOME_COUNTER_EDEFAULT);
				return;
			case RelocationPackage.REGION_PLAN__INCOME_COUNTER:
				setIncomeCounter(INCOME_COUNTER_EDEFAULT);
				return;
			case RelocationPackage.REGION_PLAN__SHARE_DIFF:
				setShareDiff(SHARE_DIFF_EDEFAULT);
				return;
			case RelocationPackage.REGION_PLAN__EXP_SUPPLIER_SHARE:
				setExpSupplierShare(EXP_SUPPLIER_SHARE_EDEFAULT);
				return;
			case RelocationPackage.REGION_PLAN__SENDED_VEHICLES:
				setSendedVehicles(SENDED_VEHICLES_EDEFAULT);
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
			case RelocationPackage.REGION_PLAN__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case RelocationPackage.REGION_PLAN__TARGET_REGIONS:
				return targetRegions != null && !targetRegions.isEmpty();
			case RelocationPackage.REGION_PLAN__EXP_RELOCATION_SHARE:
				return expRelocationShare != EXP_RELOCATION_SHARE_EDEFAULT;
			case RelocationPackage.REGION_PLAN__RECEIVED_VEHICLES:
				return receivedVehicles != RECEIVED_VEHICLES_EDEFAULT;
			case RelocationPackage.REGION_PLAN__SOURCE_COUNTER:
				return sourceCounter != SOURCE_COUNTER_EDEFAULT;
			case RelocationPackage.REGION_PLAN__SINK_COUNTER:
				return sinkCounter != SINK_COUNTER_EDEFAULT;
			case RelocationPackage.REGION_PLAN__OUTCOME_COUNTER:
				return outcomeCounter != OUTCOME_COUNTER_EDEFAULT;
			case RelocationPackage.REGION_PLAN__INCOME_COUNTER:
				return incomeCounter != INCOME_COUNTER_EDEFAULT;
			case RelocationPackage.REGION_PLAN__SHARE_DIFF:
				return shareDiff != SHARE_DIFF_EDEFAULT;
			case RelocationPackage.REGION_PLAN__EXP_SUPPLIER_SHARE:
				return expSupplierShare != EXP_SUPPLIER_SHARE_EDEFAULT;
			case RelocationPackage.REGION_PLAN__SENDED_VEHICLES:
				return sendedVehicles != SENDED_VEHICLES_EDEFAULT;
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
		result.append(" (region: ");
		result.append(region);
		result.append(", expRelocationShare: ");
		result.append(expRelocationShare);
		result.append(", receivedVehicles: ");
		result.append(receivedVehicles);
		result.append(", sourceCounter: ");
		result.append(sourceCounter);
		result.append(", sinkCounter: ");
		result.append(sinkCounter);
		result.append(", outcomeCounter: ");
		result.append(outcomeCounter);
		result.append(", incomeCounter: ");
		result.append(incomeCounter);
		result.append(", shareDiff: ");
		result.append(shareDiff);
		result.append(", expSupplierShare: ");
		result.append(expSupplierShare);
		result.append(", sendedVehicles: ");
		result.append(sendedVehicles);
		result.append(')');
		return result.toString();
	}

} //RegionPlanImpl
