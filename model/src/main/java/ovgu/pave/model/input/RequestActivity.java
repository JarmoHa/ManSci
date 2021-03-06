/**
 */
package ovgu.pave.model.input;

import org.eclipse.emf.ecore.EObject;

import ovgu.pave.model.network.Location;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.input.RequestActivity#getRequest <em>Request</em>}</li>
 *   <li>{@link ovgu.pave.model.input.RequestActivity#getId <em>Id</em>}</li>
 *   <li>{@link ovgu.pave.model.input.RequestActivity#getServiceDuration <em>Service Duration</em>}</li>
 *   <li>{@link ovgu.pave.model.input.RequestActivity#getLatestArrival <em>Latest Arrival</em>}</li>
 *   <li>{@link ovgu.pave.model.input.RequestActivity#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.input.InputPackage#getRequestActivity()
 * @model
 * @generated
 */
public interface RequestActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference.
	 * @see #setRequest(Request)
	 * @see ovgu.pave.model.input.InputPackage#getRequestActivity_Request()
	 * @model required="true"
	 * @generated
	 */
	Request getRequest();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.RequestActivity#getRequest <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(Request value);

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
	 * @see ovgu.pave.model.input.InputPackage#getRequestActivity_Id()
	 * @model default="-1"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.RequestActivity#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see ovgu.pave.model.input.InputPackage#getRequestActivity_ServiceDuration()
	 * @model
	 * @generated
	 */
	long getServiceDuration();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.RequestActivity#getServiceDuration <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Duration</em>' attribute.
	 * @see #getServiceDuration()
	 * @generated
	 */
	void setServiceDuration(long value);

	/**
	 * Returns the value of the '<em><b>Latest Arrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Arrival</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Arrival</em>' attribute.
	 * @see #setLatestArrival(long)
	 * @see ovgu.pave.model.input.InputPackage#getRequestActivity_LatestArrival()
	 * @model
	 * @generated
	 */
	long getLatestArrival();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.RequestActivity#getLatestArrival <em>Latest Arrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Arrival</em>' attribute.
	 * @see #getLatestArrival()
	 * @generated
	 */
	void setLatestArrival(long value);

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
	 * @see ovgu.pave.model.input.InputPackage#getRequestActivity_Location()
	 * @model dataType="ovgu.pave.model.input.Location" required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.RequestActivity#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // RequestActivity
