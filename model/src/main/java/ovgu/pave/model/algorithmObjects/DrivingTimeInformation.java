/**
 */
package ovgu.pave.model.algorithmObjects;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driving Time Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.algorithmObjects.DrivingTimeInformation#getFirstIndex <em>First Index</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.DrivingTimeInformation#getDrivingTimeSlack <em>Driving Time Slack</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getDrivingTimeInformation()
 * @model
 * @generated
 */
public interface DrivingTimeInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>First Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Index</em>' attribute.
	 * @see #setFirstIndex(long)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getDrivingTimeInformation_FirstIndex()
	 * @model
	 * @generated
	 */
	long getFirstIndex();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.DrivingTimeInformation#getFirstIndex <em>First Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Index</em>' attribute.
	 * @see #getFirstIndex()
	 * @generated
	 */
	void setFirstIndex(long value);

	/**
	 * Returns the value of the '<em><b>Driving Time Slack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driving Time Slack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driving Time Slack</em>' attribute.
	 * @see #setDrivingTimeSlack(long)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getDrivingTimeInformation_DrivingTimeSlack()
	 * @model
	 * @generated
	 */
	long getDrivingTimeSlack();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.DrivingTimeInformation#getDrivingTimeSlack <em>Driving Time Slack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driving Time Slack</em>' attribute.
	 * @see #getDrivingTimeSlack()
	 * @generated
	 */
	void setDrivingTimeSlack(long value);

} // DrivingTimeInformation
