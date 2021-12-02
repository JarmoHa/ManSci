/**
 */
package ovgu.pave.model.algorithmObjects;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ovgu.pave.model.solution.Route;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slacks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.algorithmObjects.Slacks#getRoute <em>Route</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.Slacks#getTimeSlack <em>Time Slack</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.Slacks#getUtilizationSlack <em>Utilization Slack</em>}</li>
 *   <li>{@link ovgu.pave.model.algorithmObjects.Slacks#getDrivingTimeSlack <em>Driving Time Slack</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSlacks()
 * @model
 * @generated
 */
public interface Slacks extends EObject {
	/**
	 * Returns the value of the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' attribute.
	 * @see #setRoute(Route)
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSlacks_Route()
	 * @model dataType="ovgu.pave.model.algorithmObjects.Route"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.algorithmObjects.Slacks#getRoute <em>Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' attribute.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Time Slack</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Slack</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Slack</em>' attribute list.
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSlacks_TimeSlack()
	 * @model unique="false"
	 * @generated
	 */
	EList<Long> getTimeSlack();

	/**
	 * Returns the value of the '<em><b>Utilization Slack</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization Slack</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization Slack</em>' attribute list.
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSlacks_UtilizationSlack()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getUtilizationSlack();

	/**
	 * Returns the value of the '<em><b>Driving Time Slack</b></em>' attribute list.
	 * The list contents are of type {@link java.util.List}<code>&lt;ovgu.pave.model.algorithmObjects.DrivingTimeInformation&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driving Time Slack</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driving Time Slack</em>' attribute list.
	 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage#getSlacks_DrivingTimeSlack()
	 * @model unique="false" dataType="ovgu.pave.model.algorithmObjects.DrivingTimeInformationList"
	 * @generated
	 */
	EList<List<DrivingTimeInformation>> getDrivingTimeSlack();

} // Slacks
