/**
 */
package ovgu.pave.model.solution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ovgu.pave.model.input.Request;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.solution.Solution#getRoutes <em>Routes</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.Solution#getRejectedRequests <em>Rejected Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.Solution#getAcceptedRequests <em>Accepted Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.Solution#getRunTime <em>Run Time</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.Solution#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.solution.SolutionPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends EObject {
	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link ovgu.pave.model.solution.Route}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see ovgu.pave.model.solution.SolutionPackage#getSolution_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

	/**
	 * Returns the value of the '<em><b>Rejected Requests</b></em>' attribute list.
	 * The list contents are of type {@link ovgu.pave.model.input.Request}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rejected Requests</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejected Requests</em>' attribute list.
	 * @see ovgu.pave.model.solution.SolutionPackage#getSolution_RejectedRequests()
	 * @model dataType="ovgu.pave.model.solution.Requests" transient="true"
	 * @generated
	 */
	EList<Request> getRejectedRequests();

	/**
	 * Returns the value of the '<em><b>Accepted Requests</b></em>' attribute list.
	 * The list contents are of type {@link ovgu.pave.model.input.Request}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepted Requests</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted Requests</em>' attribute list.
	 * @see ovgu.pave.model.solution.SolutionPackage#getSolution_AcceptedRequests()
	 * @model dataType="ovgu.pave.model.solution.Requests" transient="true"
	 * @generated
	 */
	EList<Request> getAcceptedRequests();

	/**
	 * Returns the value of the '<em><b>Run Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run Time</em>' attribute.
	 * @see #setRunTime(long)
	 * @see ovgu.pave.model.solution.SolutionPackage#getSolution_RunTime()
	 * @model
	 * @generated
	 */
	long getRunTime();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.solution.Solution#getRunTime <em>Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run Time</em>' attribute.
	 * @see #getRunTime()
	 * @generated
	 */
	void setRunTime(long value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(double)
	 * @see ovgu.pave.model.solution.SolutionPackage#getSolution_Score()
	 * @model
	 * @generated
	 */
	double getScore();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.solution.Solution#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(double value);

} // Solution
