/**
 */
package ovgu.pave.model.solution;

import ovgu.pave.model.network.Location;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Support Route Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.solution.SupportRouteElement#getLocation <em>Location</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.SupportRouteElement#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.solution.SolutionPackage#getSupportRouteElement()
 * @model
 * @generated
 */
public interface SupportRouteElement extends RouteElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(Location)
	 * @see ovgu.pave.model.solution.SolutionPackage#getSupportRouteElement_Location()
	 * @model dataType="ovgu.pave.model.solution.Location" required="true" transient="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.solution.SupportRouteElement#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(long)
	 * @see ovgu.pave.model.solution.SolutionPackage#getSupportRouteElement_TimeStamp()
	 * @model
	 * @generated
	 */
	long getTimeStamp();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.solution.SupportRouteElement#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(long value);

} // SupportRouteElement
