/**
 */
package ovgu.pave.model.solution;

import ovgu.pave.model.input.RequestActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Activity Route Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.solution.RequestActivityRouteElement#getRequestActivity <em>Request Activity</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.solution.SolutionPackage#getRequestActivityRouteElement()
 * @model
 * @generated
 */
public interface RequestActivityRouteElement extends RouteElement {
	/**
	 * Returns the value of the '<em><b>Request Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Activity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Activity</em>' attribute.
	 * @see #setRequestActivity(RequestActivity)
	 * @see ovgu.pave.model.solution.SolutionPackage#getRequestActivityRouteElement_RequestActivity()
	 * @model dataType="ovgu.pave.model.solution.RequestActivity" required="true" transient="true"
	 * @generated
	 */
	RequestActivity getRequestActivity();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.solution.RequestActivityRouteElement#getRequestActivity <em>Request Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Activity</em>' attribute.
	 * @see #getRequestActivity()
	 * @generated
	 */
	void setRequestActivity(RequestActivity value);

} // RequestActivityRouteElement
