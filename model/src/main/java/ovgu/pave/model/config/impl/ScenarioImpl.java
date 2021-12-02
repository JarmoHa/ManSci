/**
 */
package ovgu.pave.model.config.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.config.ConfigPackage;
import ovgu.pave.model.config.RequestConstraints;
import ovgu.pave.model.config.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.impl.ScenarioImpl#getRequestConstraints <em>Request Constraints</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ScenarioImpl#getPlanningPeriodBegin <em>Planning Period Begin</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ScenarioImpl#getPlanningPeriodLength <em>Planning Period Length</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ScenarioImpl#getNumberOfRequests <em>Number Of Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ScenarioImpl#getNumberOfVehicles <em>Number Of Vehicles</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ScenarioImpl#getTravelTimeFactor <em>Travel Time Factor</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ScenarioImpl#getVehicleCapacity <em>Vehicle Capacity</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ScenarioImpl#getRandomSeed <em>Random Seed</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ScenarioImpl#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario {
	/**
	 * The cached value of the '{@link #getRequestConstraints() <em>Request Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestConstraints()
	 * @generated
	 * @ordered
	 */
	protected RequestConstraints requestConstraints;

	/**
	 * The default value of the '{@link #getPlanningPeriodBegin() <em>Planning Period Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningPeriodBegin()
	 * @generated
	 * @ordered
	 */
	protected static final long PLANNING_PERIOD_BEGIN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPlanningPeriodBegin() <em>Planning Period Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningPeriodBegin()
	 * @generated
	 * @ordered
	 */
	protected long planningPeriodBegin = PLANNING_PERIOD_BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlanningPeriodLength() <em>Planning Period Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningPeriodLength()
	 * @generated
	 * @ordered
	 */
	protected static final long PLANNING_PERIOD_LENGTH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPlanningPeriodLength() <em>Planning Period Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningPeriodLength()
	 * @generated
	 * @ordered
	 */
	protected long planningPeriodLength = PLANNING_PERIOD_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfRequests() <em>Number Of Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRequests()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_REQUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRequests() <em>Number Of Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRequests()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRequests = NUMBER_OF_REQUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfVehicles() <em>Number Of Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfVehicles()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_VEHICLES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfVehicles() <em>Number Of Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfVehicles()
	 * @generated
	 * @ordered
	 */
	protected int numberOfVehicles = NUMBER_OF_VEHICLES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTravelTimeFactor() <em>Travel Time Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelTimeFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double TRAVEL_TIME_FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getTravelTimeFactor() <em>Travel Time Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelTimeFactor()
	 * @generated
	 * @ordered
	 */
	protected double travelTimeFactor = TRAVEL_TIME_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVehicleCapacity() <em>Vehicle Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int VEHICLE_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVehicleCapacity() <em>Vehicle Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleCapacity()
	 * @generated
	 * @ordered
	 */
	protected int vehicleCapacity = VEHICLE_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRandomSeed() <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomSeed()
	 * @generated
	 * @ordered
	 */
	protected static final int RANDOM_SEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRandomSeed() <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandomSeed()
	 * @generated
	 * @ordered
	 */
	protected int randomSeed = RANDOM_SEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected static final String AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected String area = AREA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestConstraints getRequestConstraints() {
		return requestConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestConstraints(RequestConstraints newRequestConstraints, NotificationChain msgs) {
		RequestConstraints oldRequestConstraints = requestConstraints;
		requestConstraints = newRequestConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.SCENARIO__REQUEST_CONSTRAINTS, oldRequestConstraints, newRequestConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestConstraints(RequestConstraints newRequestConstraints) {
		if (newRequestConstraints != requestConstraints) {
			NotificationChain msgs = null;
			if (requestConstraints != null)
				msgs = ((InternalEObject)requestConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.SCENARIO__REQUEST_CONSTRAINTS, null, msgs);
			if (newRequestConstraints != null)
				msgs = ((InternalEObject)newRequestConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.SCENARIO__REQUEST_CONSTRAINTS, null, msgs);
			msgs = basicSetRequestConstraints(newRequestConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.SCENARIO__REQUEST_CONSTRAINTS, newRequestConstraints, newRequestConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPlanningPeriodBegin() {
		return planningPeriodBegin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanningPeriodBegin(long newPlanningPeriodBegin) {
		long oldPlanningPeriodBegin = planningPeriodBegin;
		planningPeriodBegin = newPlanningPeriodBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.SCENARIO__PLANNING_PERIOD_BEGIN, oldPlanningPeriodBegin, planningPeriodBegin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPlanningPeriodLength() {
		return planningPeriodLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanningPeriodLength(long newPlanningPeriodLength) {
		long oldPlanningPeriodLength = planningPeriodLength;
		planningPeriodLength = newPlanningPeriodLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.SCENARIO__PLANNING_PERIOD_LENGTH, oldPlanningPeriodLength, planningPeriodLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRequests() {
		return numberOfRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRequests(int newNumberOfRequests) {
		int oldNumberOfRequests = numberOfRequests;
		numberOfRequests = newNumberOfRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.SCENARIO__NUMBER_OF_REQUESTS, oldNumberOfRequests, numberOfRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfVehicles() {
		return numberOfVehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfVehicles(int newNumberOfVehicles) {
		int oldNumberOfVehicles = numberOfVehicles;
		numberOfVehicles = newNumberOfVehicles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.SCENARIO__NUMBER_OF_VEHICLES, oldNumberOfVehicles, numberOfVehicles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTravelTimeFactor() {
		return travelTimeFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTravelTimeFactor(double newTravelTimeFactor) {
		double oldTravelTimeFactor = travelTimeFactor;
		travelTimeFactor = newTravelTimeFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.SCENARIO__TRAVEL_TIME_FACTOR, oldTravelTimeFactor, travelTimeFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVehicleCapacity() {
		return vehicleCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleCapacity(int newVehicleCapacity) {
		int oldVehicleCapacity = vehicleCapacity;
		vehicleCapacity = newVehicleCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.SCENARIO__VEHICLE_CAPACITY, oldVehicleCapacity, vehicleCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRandomSeed() {
		return randomSeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandomSeed(int newRandomSeed) {
		int oldRandomSeed = randomSeed;
		randomSeed = newRandomSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.SCENARIO__RANDOM_SEED, oldRandomSeed, randomSeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(String newArea) {
		String oldArea = area;
		area = newArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.SCENARIO__AREA, oldArea, area));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.SCENARIO__REQUEST_CONSTRAINTS:
				return basicSetRequestConstraints(null, msgs);
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
			case ConfigPackage.SCENARIO__REQUEST_CONSTRAINTS:
				return getRequestConstraints();
			case ConfigPackage.SCENARIO__PLANNING_PERIOD_BEGIN:
				return getPlanningPeriodBegin();
			case ConfigPackage.SCENARIO__PLANNING_PERIOD_LENGTH:
				return getPlanningPeriodLength();
			case ConfigPackage.SCENARIO__NUMBER_OF_REQUESTS:
				return getNumberOfRequests();
			case ConfigPackage.SCENARIO__NUMBER_OF_VEHICLES:
				return getNumberOfVehicles();
			case ConfigPackage.SCENARIO__TRAVEL_TIME_FACTOR:
				return getTravelTimeFactor();
			case ConfigPackage.SCENARIO__VEHICLE_CAPACITY:
				return getVehicleCapacity();
			case ConfigPackage.SCENARIO__RANDOM_SEED:
				return getRandomSeed();
			case ConfigPackage.SCENARIO__AREA:
				return getArea();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.SCENARIO__REQUEST_CONSTRAINTS:
				setRequestConstraints((RequestConstraints)newValue);
				return;
			case ConfigPackage.SCENARIO__PLANNING_PERIOD_BEGIN:
				setPlanningPeriodBegin((Long)newValue);
				return;
			case ConfigPackage.SCENARIO__PLANNING_PERIOD_LENGTH:
				setPlanningPeriodLength((Long)newValue);
				return;
			case ConfigPackage.SCENARIO__NUMBER_OF_REQUESTS:
				setNumberOfRequests((Integer)newValue);
				return;
			case ConfigPackage.SCENARIO__NUMBER_OF_VEHICLES:
				setNumberOfVehicles((Integer)newValue);
				return;
			case ConfigPackage.SCENARIO__TRAVEL_TIME_FACTOR:
				setTravelTimeFactor((Double)newValue);
				return;
			case ConfigPackage.SCENARIO__VEHICLE_CAPACITY:
				setVehicleCapacity((Integer)newValue);
				return;
			case ConfigPackage.SCENARIO__RANDOM_SEED:
				setRandomSeed((Integer)newValue);
				return;
			case ConfigPackage.SCENARIO__AREA:
				setArea((String)newValue);
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
			case ConfigPackage.SCENARIO__REQUEST_CONSTRAINTS:
				setRequestConstraints((RequestConstraints)null);
				return;
			case ConfigPackage.SCENARIO__PLANNING_PERIOD_BEGIN:
				setPlanningPeriodBegin(PLANNING_PERIOD_BEGIN_EDEFAULT);
				return;
			case ConfigPackage.SCENARIO__PLANNING_PERIOD_LENGTH:
				setPlanningPeriodLength(PLANNING_PERIOD_LENGTH_EDEFAULT);
				return;
			case ConfigPackage.SCENARIO__NUMBER_OF_REQUESTS:
				setNumberOfRequests(NUMBER_OF_REQUESTS_EDEFAULT);
				return;
			case ConfigPackage.SCENARIO__NUMBER_OF_VEHICLES:
				setNumberOfVehicles(NUMBER_OF_VEHICLES_EDEFAULT);
				return;
			case ConfigPackage.SCENARIO__TRAVEL_TIME_FACTOR:
				setTravelTimeFactor(TRAVEL_TIME_FACTOR_EDEFAULT);
				return;
			case ConfigPackage.SCENARIO__VEHICLE_CAPACITY:
				setVehicleCapacity(VEHICLE_CAPACITY_EDEFAULT);
				return;
			case ConfigPackage.SCENARIO__RANDOM_SEED:
				setRandomSeed(RANDOM_SEED_EDEFAULT);
				return;
			case ConfigPackage.SCENARIO__AREA:
				setArea(AREA_EDEFAULT);
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
			case ConfigPackage.SCENARIO__REQUEST_CONSTRAINTS:
				return requestConstraints != null;
			case ConfigPackage.SCENARIO__PLANNING_PERIOD_BEGIN:
				return planningPeriodBegin != PLANNING_PERIOD_BEGIN_EDEFAULT;
			case ConfigPackage.SCENARIO__PLANNING_PERIOD_LENGTH:
				return planningPeriodLength != PLANNING_PERIOD_LENGTH_EDEFAULT;
			case ConfigPackage.SCENARIO__NUMBER_OF_REQUESTS:
				return numberOfRequests != NUMBER_OF_REQUESTS_EDEFAULT;
			case ConfigPackage.SCENARIO__NUMBER_OF_VEHICLES:
				return numberOfVehicles != NUMBER_OF_VEHICLES_EDEFAULT;
			case ConfigPackage.SCENARIO__TRAVEL_TIME_FACTOR:
				return travelTimeFactor != TRAVEL_TIME_FACTOR_EDEFAULT;
			case ConfigPackage.SCENARIO__VEHICLE_CAPACITY:
				return vehicleCapacity != VEHICLE_CAPACITY_EDEFAULT;
			case ConfigPackage.SCENARIO__RANDOM_SEED:
				return randomSeed != RANDOM_SEED_EDEFAULT;
			case ConfigPackage.SCENARIO__AREA:
				return AREA_EDEFAULT == null ? area != null : !AREA_EDEFAULT.equals(area);
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
		result.append(" (planningPeriodBegin: ");
		result.append(planningPeriodBegin);
		result.append(", planningPeriodLength: ");
		result.append(planningPeriodLength);
		result.append(", numberOfRequests: ");
		result.append(numberOfRequests);
		result.append(", numberOfVehicles: ");
		result.append(numberOfVehicles);
		result.append(", travelTimeFactor: ");
		result.append(travelTimeFactor);
		result.append(", vehicleCapacity: ");
		result.append(vehicleCapacity);
		result.append(", randomSeed: ");
		result.append(randomSeed);
		result.append(", area: ");
		result.append(area);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
