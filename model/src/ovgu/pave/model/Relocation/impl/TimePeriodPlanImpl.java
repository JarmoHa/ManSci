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
import ovgu.pave.model.Relocation.TimePeriodPlan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Period Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.Relocation.impl.TimePeriodPlanImpl#getRegionPlans <em>Region Plans</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.TimePeriodPlanImpl#getEnd <em>End</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.TimePeriodPlanImpl#getBeginn <em>Beginn</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.TimePeriodPlanImpl#getDemands <em>Demands</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.TimePeriodPlanImpl#getSupplies <em>Supplies</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.impl.TimePeriodPlanImpl#getRelocations <em>Relocations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimePeriodPlanImpl extends MinimalEObjectImpl.Container implements TimePeriodPlan {
	/**
	 * The cached value of the '{@link #getRegionPlans() <em>Region Plans</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<RegionPlan> regionPlans;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final long END_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected long end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeginn() <em>Beginn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginn()
	 * @generated
	 * @ordered
	 */
	protected static final long BEGINN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBeginn() <em>Beginn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginn()
	 * @generated
	 * @ordered
	 */
	protected long beginn = BEGINN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDemands() <em>Demands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemands()
	 * @generated
	 * @ordered
	 */
	protected static final long DEMANDS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDemands() <em>Demands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemands()
	 * @generated
	 * @ordered
	 */
	protected long demands = DEMANDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplies() <em>Supplies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplies()
	 * @generated
	 * @ordered
	 */
	protected static final long SUPPLIES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSupplies() <em>Supplies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplies()
	 * @generated
	 * @ordered
	 */
	protected long supplies = SUPPLIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelocations() <em>Relocations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelocations()
	 * @generated
	 * @ordered
	 */
	protected static final long RELOCATIONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRelocations() <em>Relocations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelocations()
	 * @generated
	 * @ordered
	 */
	protected long relocations = RELOCATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimePeriodPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelocationPackage.Literals.TIME_PERIOD_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RegionPlan> getRegionPlans() {
		if (regionPlans == null) {
			regionPlans = new EObjectResolvingEList<RegionPlan>(RegionPlan.class, this, RelocationPackage.TIME_PERIOD_PLAN__REGION_PLANS);
		}
		return regionPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(long newEnd) {
		long oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.TIME_PERIOD_PLAN__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getBeginn() {
		return beginn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeginn(long newBeginn) {
		long oldBeginn = beginn;
		beginn = newBeginn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.TIME_PERIOD_PLAN__BEGINN, oldBeginn, beginn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getDemands() {
		return demands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDemands(long newDemands) {
		long oldDemands = demands;
		demands = newDemands;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.TIME_PERIOD_PLAN__DEMANDS, oldDemands, demands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSupplies() {
		return supplies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplies(long newSupplies) {
		long oldSupplies = supplies;
		supplies = newSupplies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.TIME_PERIOD_PLAN__SUPPLIES, oldSupplies, supplies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRelocations() {
		return relocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelocations(long newRelocations) {
		long oldRelocations = relocations;
		relocations = newRelocations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelocationPackage.TIME_PERIOD_PLAN__RELOCATIONS, oldRelocations, relocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelocationPackage.TIME_PERIOD_PLAN__REGION_PLANS:
				return getRegionPlans();
			case RelocationPackage.TIME_PERIOD_PLAN__END:
				return getEnd();
			case RelocationPackage.TIME_PERIOD_PLAN__BEGINN:
				return getBeginn();
			case RelocationPackage.TIME_PERIOD_PLAN__DEMANDS:
				return getDemands();
			case RelocationPackage.TIME_PERIOD_PLAN__SUPPLIES:
				return getSupplies();
			case RelocationPackage.TIME_PERIOD_PLAN__RELOCATIONS:
				return getRelocations();
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
			case RelocationPackage.TIME_PERIOD_PLAN__REGION_PLANS:
				getRegionPlans().clear();
				getRegionPlans().addAll((Collection<? extends RegionPlan>)newValue);
				return;
			case RelocationPackage.TIME_PERIOD_PLAN__END:
				setEnd((Long)newValue);
				return;
			case RelocationPackage.TIME_PERIOD_PLAN__BEGINN:
				setBeginn((Long)newValue);
				return;
			case RelocationPackage.TIME_PERIOD_PLAN__DEMANDS:
				setDemands((Long)newValue);
				return;
			case RelocationPackage.TIME_PERIOD_PLAN__SUPPLIES:
				setSupplies((Long)newValue);
				return;
			case RelocationPackage.TIME_PERIOD_PLAN__RELOCATIONS:
				setRelocations((Long)newValue);
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
			case RelocationPackage.TIME_PERIOD_PLAN__REGION_PLANS:
				getRegionPlans().clear();
				return;
			case RelocationPackage.TIME_PERIOD_PLAN__END:
				setEnd(END_EDEFAULT);
				return;
			case RelocationPackage.TIME_PERIOD_PLAN__BEGINN:
				setBeginn(BEGINN_EDEFAULT);
				return;
			case RelocationPackage.TIME_PERIOD_PLAN__DEMANDS:
				setDemands(DEMANDS_EDEFAULT);
				return;
			case RelocationPackage.TIME_PERIOD_PLAN__SUPPLIES:
				setSupplies(SUPPLIES_EDEFAULT);
				return;
			case RelocationPackage.TIME_PERIOD_PLAN__RELOCATIONS:
				setRelocations(RELOCATIONS_EDEFAULT);
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
			case RelocationPackage.TIME_PERIOD_PLAN__REGION_PLANS:
				return regionPlans != null && !regionPlans.isEmpty();
			case RelocationPackage.TIME_PERIOD_PLAN__END:
				return end != END_EDEFAULT;
			case RelocationPackage.TIME_PERIOD_PLAN__BEGINN:
				return beginn != BEGINN_EDEFAULT;
			case RelocationPackage.TIME_PERIOD_PLAN__DEMANDS:
				return demands != DEMANDS_EDEFAULT;
			case RelocationPackage.TIME_PERIOD_PLAN__SUPPLIES:
				return supplies != SUPPLIES_EDEFAULT;
			case RelocationPackage.TIME_PERIOD_PLAN__RELOCATIONS:
				return relocations != RELOCATIONS_EDEFAULT;
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
		result.append(" (end: ");
		result.append(end);
		result.append(", beginn: ");
		result.append(beginn);
		result.append(", demands: ");
		result.append(demands);
		result.append(", supplies: ");
		result.append(supplies);
		result.append(", relocations: ");
		result.append(relocations);
		result.append(')');
		return result.toString();
	}

} //TimePeriodPlanImpl
