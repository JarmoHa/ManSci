/**
 */
package ovgu.pave.model.input.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ovgu.pave.model.input.FirstRequestActivity;
import ovgu.pave.model.input.InputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>First Request Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.input.impl.FirstRequestActivityImpl#getEarliestArrival <em>Earliest Arrival</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FirstRequestActivityImpl extends RequestActivityImpl implements FirstRequestActivity {
	/**
	 * The default value of the '{@link #getEarliestArrival() <em>Earliest Arrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestArrival()
	 * @generated
	 * @ordered
	 */
	protected static final long EARLIEST_ARRIVAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEarliestArrival() <em>Earliest Arrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestArrival()
	 * @generated
	 * @ordered
	 */
	protected long earliestArrival = EARLIEST_ARRIVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirstRequestActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InputPackage.Literals.FIRST_REQUEST_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEarliestArrival() {
		return earliestArrival;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarliestArrival(long newEarliestArrival) {
		long oldEarliestArrival = earliestArrival;
		earliestArrival = newEarliestArrival;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InputPackage.FIRST_REQUEST_ACTIVITY__EARLIEST_ARRIVAL, oldEarliestArrival, earliestArrival));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InputPackage.FIRST_REQUEST_ACTIVITY__EARLIEST_ARRIVAL:
				return getEarliestArrival();
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
			case InputPackage.FIRST_REQUEST_ACTIVITY__EARLIEST_ARRIVAL:
				setEarliestArrival((Long)newValue);
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
			case InputPackage.FIRST_REQUEST_ACTIVITY__EARLIEST_ARRIVAL:
				setEarliestArrival(EARLIEST_ARRIVAL_EDEFAULT);
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
			case InputPackage.FIRST_REQUEST_ACTIVITY__EARLIEST_ARRIVAL:
				return earliestArrival != EARLIEST_ARRIVAL_EDEFAULT;
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
		result.append(" (earliestArrival: ");
		result.append(earliestArrival);
		result.append(')');
		return result.toString();
	}

} //FirstRequestActivityImpl
