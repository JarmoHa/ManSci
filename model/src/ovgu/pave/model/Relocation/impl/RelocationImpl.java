/**
 */
package ovgu.pave.model.Relocation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ovgu.pave.model.Relocation.RegionStatistic;
import ovgu.pave.model.Relocation.Relocation;
import ovgu.pave.model.Relocation.RelocationPackage;
import ovgu.pave.model.Relocation.TimePeriodPlan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RelocationImpl#getTimePeriodPlans <em>Time Period Plans</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.RelocationImpl#getRegionStatistics <em>Region Statistics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelocationImpl extends MinimalEObjectImpl.Container implements Relocation {
	/**
	 * The cached value of the '{@link #getTimePeriodPlans() <em>Time Period Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePeriodPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<TimePeriodPlan> timePeriodPlans;

	/**
	 * The cached value of the '{@link #getRegionStatistics() <em>Region Statistics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionStatistics()
	 * @generated
	 * @ordered
	 */
	protected EList<RegionStatistic> regionStatistics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelocationPackage.Literals.RELOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TimePeriodPlan> getTimePeriodPlans() {
		if (timePeriodPlans == null) {
			timePeriodPlans = new EObjectContainmentEList<TimePeriodPlan>(TimePeriodPlan.class, this, RelocationPackage.RELOCATION__TIME_PERIOD_PLANS);
		}
		return timePeriodPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RegionStatistic> getRegionStatistics() {
		if (regionStatistics == null) {
			regionStatistics = new EObjectResolvingEList<RegionStatistic>(RegionStatistic.class, this, RelocationPackage.RELOCATION__REGION_STATISTICS);
		}
		return regionStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RelocationPackage.RELOCATION__TIME_PERIOD_PLANS:
				return ((InternalEList<?>)getTimePeriodPlans()).basicRemove(otherEnd, msgs);
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
			case RelocationPackage.RELOCATION__TIME_PERIOD_PLANS:
				return getTimePeriodPlans();
			case RelocationPackage.RELOCATION__REGION_STATISTICS:
				return getRegionStatistics();
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
			case RelocationPackage.RELOCATION__TIME_PERIOD_PLANS:
				getTimePeriodPlans().clear();
				getTimePeriodPlans().addAll((Collection<? extends TimePeriodPlan>)newValue);
				return;
			case RelocationPackage.RELOCATION__REGION_STATISTICS:
				getRegionStatistics().clear();
				getRegionStatistics().addAll((Collection<? extends RegionStatistic>)newValue);
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
			case RelocationPackage.RELOCATION__TIME_PERIOD_PLANS:
				getTimePeriodPlans().clear();
				return;
			case RelocationPackage.RELOCATION__REGION_STATISTICS:
				getRegionStatistics().clear();
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
			case RelocationPackage.RELOCATION__TIME_PERIOD_PLANS:
				return timePeriodPlans != null && !timePeriodPlans.isEmpty();
			case RelocationPackage.RELOCATION__REGION_STATISTICS:
				return regionStatistics != null && !regionStatistics.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelocationImpl
