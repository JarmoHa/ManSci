/**
 */
package ovgu.pave.model.solution;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.solution.RouteElement#getRoute <em>Route</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.RouteElement#getServiceBegin <em>Service Begin</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.RouteElement#getDrivingTime <em>Driving Time</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.RouteElement#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.RouteElement#getServiceDuration <em>Service Duration</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.RouteElement#getLatestDrivingTime <em>Latest Driving Time</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.solution.SolutionPackage#getRouteElement()
 * @model
 * @generated
 */
public interface RouteElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(Route)
	 * @see ovgu.pave.model.solution.SolutionPackage#getRouteElement_Route()
	 * @model
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.solution.RouteElement#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

	/**
	 * Returns the value of the '<em><b>Service Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Begin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Begin</em>' attribute.
	 * @see #setServiceBegin(long)
	 * @see ovgu.pave.model.solution.SolutionPackage#getRouteElement_ServiceBegin()
	 * @model
	 * @generated
	 */
	long getServiceBegin();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.solution.RouteElement#getServiceBegin <em>Service Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Begin</em>' attribute.
	 * @see #getServiceBegin()
	 * @generated
	 */
	void setServiceBegin(long value);

	/**
	 * Returns the value of the '<em><b>Driving Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driving Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driving Time</em>' attribute.
	 * @see #setDrivingTime(long)
	 * @see ovgu.pave.model.solution.SolutionPackage#getRouteElement_DrivingTime()
	 * @model
	 * @generated
	 */
	long getDrivingTime();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.solution.RouteElement#getDrivingTime <em>Driving Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driving Time</em>' attribute.
	 * @see #getDrivingTime()
	 * @generated
	 */
	void setDrivingTime(long value);

	/**
	 * Returns the value of the '<em><b>Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilization</em>' attribute.
	 * @see #setUtilization(int)
	 * @see ovgu.pave.model.solution.SolutionPackage#getRouteElement_Utilization()
	 * @model
	 * @generated
	 */
	int getUtilization();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.solution.RouteElement#getUtilization <em>Utilization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization</em>' attribute.
	 * @see #getUtilization()
	 * @generated
	 */
	void setUtilization(int value);

	/**
	 * Returns the value of the '<em><b>Service Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Duration</em>' attribute.
	 * @see #setServiceDuration(long)
	 * @see ovgu.pave.model.solution.SolutionPackage#getRouteElement_ServiceDuration()
	 * @model
	 * @generated
	 */
	long getServiceDuration();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.solution.RouteElement#getServiceDuration <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Duration</em>' attribute.
	 * @see #getServiceDuration()
	 * @generated
	 */
	void setServiceDuration(long value);

	/**
	 * Returns the value of the '<em><b>Latest Driving Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Driving Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Driving Time</em>' attribute.
	 * @see #setLatestDrivingTime(long)
	 * @see ovgu.pave.model.solution.SolutionPackage#getRouteElement_LatestDrivingTime()
	 * @model
	 * @generated
	 */
	long getLatestDrivingTime();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.solution.RouteElement#getLatestDrivingTime <em>Latest Driving Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Driving Time</em>' attribute.
	 * @see #getLatestDrivingTime()
	 * @generated
	 */
	void setLatestDrivingTime(long value);

} // RouteElement
