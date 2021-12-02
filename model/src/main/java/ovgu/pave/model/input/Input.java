/**
 */
package ovgu.pave.model.input;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.input.Input#getVehicles <em>Vehicles</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Input#getVehicleTypes <em>Vehicle Types</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Input#getRequests <em>Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Input#getTrips <em>Trips</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.input.InputPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehicles</b></em>' containment reference list.
	 * The list contents are of type {@link ovgu.pave.model.input.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicles</em>' containment reference list.
	 * @see ovgu.pave.model.input.InputPackage#getInput_Vehicles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Vehicle> getVehicles();

	/**
	 * Returns the value of the '<em><b>Vehicle Types</b></em>' containment reference list.
	 * The list contents are of type {@link ovgu.pave.model.input.VehicleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicle Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Types</em>' containment reference list.
	 * @see ovgu.pave.model.input.InputPackage#getInput_VehicleTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<VehicleType> getVehicleTypes();

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' reference list.
	 * The list contents are of type {@link ovgu.pave.model.input.Request}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' reference list.
	 * @see ovgu.pave.model.input.InputPackage#getInput_Requests()
	 * @model
	 * @generated
	 */
	EList<Request> getRequests();

	/**
	 * Returns the value of the '<em><b>Trips</b></em>' reference list.
	 * The list contents are of type {@link ovgu.pave.model.input.Trip}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trips</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trips</em>' reference list.
	 * @see ovgu.pave.model.input.InputPackage#getInput_Trips()
	 * @model
	 * @generated
	 */
	EList<Trip> getTrips();

} // Input
