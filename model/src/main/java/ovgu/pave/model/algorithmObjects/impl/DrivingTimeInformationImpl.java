/**
 */
package ovgu.pave.model.algorithmObjects.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage;
import ovgu.pave.model.algorithmObjects.DrivingTimeInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driving Time Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.DrivingTimeInformationImpl#getFirstIndex <em>First Index</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.impl.DrivingTimeInformationImpl#getDrivingTimeSlack <em>Driving Time Slack</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DrivingTimeInformationImpl extends MinimalEObjectImpl.Container implements DrivingTimeInformation {
	/**
	 * The default value of the '{@link #getFirstIndex() <em>First Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstIndex()
	 * @generated
	 * @ordered
	 */
	protected static final long FIRST_INDEX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getFirstIndex() <em>First Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstIndex()
	 * @generated
	 * @ordered
	 */
	protected long firstIndex = FIRST_INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDrivingTimeSlack() <em>Driving Time Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivingTimeSlack()
	 * @generated
	 * @ordered
	 */
	protected static final long DRIVING_TIME_SLACK_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDrivingTimeSlack() <em>Driving Time Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrivingTimeSlack()
	 * @generated
	 * @ordered
	 */
	protected long drivingTimeSlack = DRIVING_TIME_SLACK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrivingTimeInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmObjectsPackage.Literals.DRIVING_TIME_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFirstIndex() {
		return firstIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstIndex(long newFirstIndex) {
		long oldFirstIndex = firstIndex;
		firstIndex = newFirstIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.DRIVING_TIME_INFORMATION__FIRST_INDEX, oldFirstIndex, firstIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDrivingTimeSlack() {
		return drivingTimeSlack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDrivingTimeSlack(long newDrivingTimeSlack) {
		long oldDrivingTimeSlack = drivingTimeSlack;
		drivingTimeSlack = newDrivingTimeSlack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmObjectsPackage.DRIVING_TIME_INFORMATION__DRIVING_TIME_SLACK, oldDrivingTimeSlack, drivingTimeSlack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AlgorithmObjectsPackage.DRIVING_TIME_INFORMATION__FIRST_INDEX:
				return getFirstIndex();
			case AlgorithmObjectsPackage.DRIVING_TIME_INFORMATION__DRIVING_TIME_SLACK:
				return getDrivingTimeSlack();
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
			case AlgorithmObjectsPackage.DRIVING_TIME_INFORMATION__FIRST_INDEX:
				setFirstIndex((Long)newValue);
				return;
			case AlgorithmObjectsPackage.DRIVING_TIME_INFORMATION__DRIVING_TIME_SLACK:
				setDrivingTimeSlack((Long)newValue);
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
			case AlgorithmObjectsPackage.DRIVING_TIME_INFORMATION__FIRST_INDEX:
				setFirstIndex(FIRST_INDEX_EDEFAULT);
				return;
			case AlgorithmObjectsPackage.DRIVING_TIME_INFORMATION__DRIVING_TIME_SLACK:
				setDrivingTimeSlack(DRIVING_TIME_SLACK_EDEFAULT);
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
			case AlgorithmObjectsPackage.DRIVING_TIME_INFORMATION__FIRST_INDEX:
				return firstIndex != FIRST_INDEX_EDEFAULT;
			case AlgorithmObjectsPackage.DRIVING_TIME_INFORMATION__DRIVING_TIME_SLACK:
				return drivingTimeSlack != DRIVING_TIME_SLACK_EDEFAULT;
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
		result.append(" (firstIndex: ");
		result.append(firstIndex);
		result.append(", drivingTimeSlack: ");
		result.append(drivingTimeSlack);
		result.append(')');
		return result.toString();
	}

} //DrivingTimeInformationImpl
