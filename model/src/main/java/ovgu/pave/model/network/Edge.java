/**
 */
package ovgu.pave.model.network;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.network.Edge#getCost <em>Cost</em>}</li>
 *   <li>{@link ovgu.pave.model.network.Edge#getStartLocation <em>Start Location</em>}</li>
 *   <li>{@link ovgu.pave.model.network.Edge#getEndLocation <em>End Location</em>}</li>
 *   <li>{@link ovgu.pave.model.network.Edge#getDistance <em>Distance</em>}</li>
 *   <li>{@link ovgu.pave.model.network.Edge#getDuration <em>Duration</em>}</li>
 *   <li>{@link ovgu.pave.model.network.Edge#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.network.NetworkPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(long)
	 * @see ovgu.pave.model.network.NetworkPackage#getEdge_Cost()
	 * @model
	 * @generated
	 */
	long getCost();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.network.Edge#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(long value);

	/**
	 * Returns the value of the '<em><b>Start Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Location</em>' reference.
	 * @see #setStartLocation(Location)
	 * @see ovgu.pave.model.network.NetworkPackage#getEdge_StartLocation()
	 * @model required="true"
	 * @generated
	 */
	Location getStartLocation();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.network.Edge#getStartLocation <em>Start Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Location</em>' reference.
	 * @see #getStartLocation()
	 * @generated
	 */
	void setStartLocation(Location value);

	/**
	 * Returns the value of the '<em><b>End Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Location</em>' reference.
	 * @see #setEndLocation(Location)
	 * @see ovgu.pave.model.network.NetworkPackage#getEdge_EndLocation()
	 * @model required="true"
	 * @generated
	 */
	Location getEndLocation();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.network.Edge#getEndLocation <em>End Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Location</em>' reference.
	 * @see #getEndLocation()
	 * @generated
	 */
	void setEndLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see ovgu.pave.model.network.NetworkPackage#getEdge_Distance()
	 * @model
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.network.Edge#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(long)
	 * @see ovgu.pave.model.network.NetworkPackage#getEdge_Duration()
	 * @model
	 * @generated
	 */
	long getDuration();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.network.Edge#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(long value);

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
	 * @see ovgu.pave.model.network.NetworkPackage#getEdge_Id()
	 * @model default="-1"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.network.Edge#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Edge
