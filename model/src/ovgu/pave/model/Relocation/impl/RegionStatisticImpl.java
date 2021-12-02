/**
 */
package ovgu.pave.model.Relocation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import ovgu.pave.model.Relocation.RegionStatistic;
import ovgu.pave.model.Relocation.RelocationPackage;

import ovgu.pave.model.input.Region;
import ovgu.pave.model.input.Request;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region Statistic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionStatisticImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionStatisticImpl#getReceivingTimes <em>Receiving Times</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionStatisticImpl#getRejectedRequests <em>Rejected Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RegionStatisticImpl#getRelocationScore <em>Relocation Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionStatisticImpl extends MinimalEObjectImpl.Container implements RegionStatistic {
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
	 * The cached value of the '{@link #getReceivingTimes() <em>Receiving Times</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingTimes()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> receivingTimes;

	/**
	 * The cached value of the '{@link #getRejectedRequests() <em>Rejected Requests</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectedRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> rejectedRequests;

	/**
	 * The default value of the '{@link #getRelocationScore() <em>Relocation Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelocationScore()
	 * @generated
	 * @ordered
	 */
	protected static final double RELOCATION_SCORE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRelocationScore() <em>Relocation Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelocationScore()
	 * @generated
	 * @ordered
	 */
	protected double relocationScore = RELOCATION_SCORE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionStatisticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelocationPackage.Literals.REGION_STATISTIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.REGION_STATISTIC__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Long> getReceivingTimes() {
		if (receivingTimes == null) {
			receivingTimes = new EDataTypeUniqueEList<Long>(Long.class, this, RelocationPackage.REGION_STATISTIC__RECEIVING_TIMES);
		}
		return receivingTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Request> getRejectedRequests() {
		if (rejectedRequests == null) {
			rejectedRequests = new EDataTypeUniqueEList<Request>(Request.class, this, RelocationPackage.REGION_STATISTIC__REJECTED_REQUESTS);
		}
		return rejectedRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRelocationScore() {
		return relocationScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelocationScore(double newRelocationScore) {
		double oldRelocationScore = relocationScore;
		relocationScore = newRelocationScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.REGION_STATISTIC__RELOCATION_SCORE, oldRelocationScore, relocationScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelocationPackage.REGION_STATISTIC__REGION:
				return getRegion();
			case RelocationPackage.REGION_STATISTIC__RECEIVING_TIMES:
				return getReceivingTimes();
			case RelocationPackage.REGION_STATISTIC__REJECTED_REQUESTS:
				return getRejectedRequests();
			case RelocationPackage.REGION_STATISTIC__RELOCATION_SCORE:
				return getRelocationScore();
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
			case RelocationPackage.REGION_STATISTIC__REGION:
				setRegion((Region)newValue);
				return;
			case RelocationPackage.REGION_STATISTIC__RECEIVING_TIMES:
				getReceivingTimes().clear();
				getReceivingTimes().addAll((Collection<? extends Long>)newValue);
				return;
			case RelocationPackage.REGION_STATISTIC__REJECTED_REQUESTS:
				getRejectedRequests().clear();
				getRejectedRequests().addAll((Collection<? extends Request>)newValue);
				return;
			case RelocationPackage.REGION_STATISTIC__RELOCATION_SCORE:
				setRelocationScore((Double)newValue);
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
			case RelocationPackage.REGION_STATISTIC__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case RelocationPackage.REGION_STATISTIC__RECEIVING_TIMES:
				getReceivingTimes().clear();
				return;
			case RelocationPackage.REGION_STATISTIC__REJECTED_REQUESTS:
				getRejectedRequests().clear();
				return;
			case RelocationPackage.REGION_STATISTIC__RELOCATION_SCORE:
				setRelocationScore(RELOCATION_SCORE_EDEFAULT);
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
			case RelocationPackage.REGION_STATISTIC__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case RelocationPackage.REGION_STATISTIC__RECEIVING_TIMES:
				return receivingTimes != null && !receivingTimes.isEmpty();
			case RelocationPackage.REGION_STATISTIC__REJECTED_REQUESTS:
				return rejectedRequests != null && !rejectedRequests.isEmpty();
			case RelocationPackage.REGION_STATISTIC__RELOCATION_SCORE:
				return relocationScore != RELOCATION_SCORE_EDEFAULT;
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
		result.append(", receivingTimes: ");
		result.append(receivingTimes);
		result.append(", rejectedRequests: ");
		result.append(rejectedRequests);
		result.append(", relocationScore: ");
		result.append(relocationScore);
		result.append(')');
		return result.toString();
	}

} //RegionStatisticImpl
