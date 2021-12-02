/**
 */
package ovgu.pave.model.input;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.input.Request#getFirstActivity <em>First Activity</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Request#getSecondActivity <em>Second Activity</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Request#getId <em>Id</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Request#getRequestTime <em>Request Time</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Request#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link ovgu.pave.model.input.Request#getMaxDrivingDuration <em>Max Driving Duration</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.input.InputPackage#getRequest()
 * @model
 * @generated
 */
public interface Request extends EObject {
	/**
	 * Returns the value of the '<em><b>First Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Activity</em>' containment reference.
	 * @see #setFirstActivity(FirstRequestActivity)
	 * @see ovgu.pave.model.input.InputPackage#getRequest_FirstActivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FirstRequestActivity getFirstActivity();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Request#getFirstActivity <em>First Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Activity</em>' containment reference.
	 * @see #getFirstActivity()
	 * @generated
	 */
	void setFirstActivity(FirstRequestActivity value);

	/**
	 * Returns the value of the '<em><b>Second Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Activity</em>' containment reference.
	 * @see #setSecondActivity(SecondRequestActivity)
	 * @see ovgu.pave.model.input.InputPackage#getRequest_SecondActivity()
	 * @model containment="true"
	 * @generated
	 */
	SecondRequestActivity getSecondActivity();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Request#getSecondActivity <em>Second Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Activity</em>' containment reference.
	 * @see #getSecondActivity()
	 * @generated
	 */
	void setSecondActivity(SecondRequestActivity value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see ovgu.pave.model.input.InputPackage#getRequest_Id()
	 * @model default="-1" id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Request#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Request Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Time</em>' attribute.
	 * @see #setRequestTime(long)
	 * @see ovgu.pave.model.input.InputPackage#getRequest_RequestTime()
	 * @model
	 * @generated
	 */
	long getRequestTime();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Request#getRequestTime <em>Request Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Time</em>' attribute.
	 * @see #getRequestTime()
	 * @generated
	 */
	void setRequestTime(long value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see ovgu.pave.model.input.InputPackage#getRequest_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Request#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Max Driving Duration</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Driving Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Driving Duration</em>' attribute.
	 * @see #setMaxDrivingDuration(long)
	 * @see ovgu.pave.model.input.InputPackage#getRequest_MaxDrivingDuration()
	 * @model default="-1"
	 * @generated
	 */
	long getMaxDrivingDuration();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.Request#getMaxDrivingDuration <em>Max Driving Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Driving Duration</em>' attribute.
	 * @see #getMaxDrivingDuration()
	 * @generated
	 */
	void setMaxDrivingDuration(long value);

} // Request
