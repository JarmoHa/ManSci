/**
 */
package ovgu.pave.model.solution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ovgu.pave.model.input.Vehicle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.solution.Route#getVehicle <em>Vehicle</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.Route#getRouteElements <em>Route Elements</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.solution.SolutionPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' attribute.
	 * @see #setVehicle(Vehicle)
	 * @see ovgu.pave.model.solution.SolutionPackage#getRoute_Vehicle()
	 * @model dataType="ovgu.pave.model.solution.Vehicle" transient="true"
	 * @generated
	 */
	Vehicle getVehicle();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.solution.Route#getVehicle <em>Vehicle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' attribute.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(Vehicle value);

	/**
	 * Returns the value of the '<em><b>Route Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ovgu.pave.model.solution.RouteElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Elements</em>' containment reference list.
	 * @see ovgu.pave.model.solution.SolutionPackage#getRoute_RouteElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RouteElement> getRouteElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	RouteElement getRouteElement(int index);

} // Route
