/**
 */
package ovgu.pave.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.RequestConstraints#getMaxWaitingTime <em>Max Waiting Time</em>}</li>
 *   <li>{@link ovgu.pave.model.config.RequestConstraints#getDetourFactor <em>Detour Factor</em>}</li>
 *   <li>{@link ovgu.pave.model.config.RequestConstraints#getServiceDuration <em>Service Duration</em>}</li>
 *   <li>{@link ovgu.pave.model.config.RequestConstraints#getMinTravelTime <em>Min Travel Time</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.config.ConfigPackage#getRequestConstraints()
 * @model
 * @generated
 */
public interface RequestConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Waiting Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Waiting Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Waiting Time</em>' attribute.
	 * @see #setMaxWaitingTime(long)
	 * @see ovgu.pave.model.config.ConfigPackage#getRequestConstraints_MaxWaitingTime()
	 * @model
	 * @generated
	 */
	long getMaxWaitingTime();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.RequestConstraints#getMaxWaitingTime <em>Max Waiting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Waiting Time</em>' attribute.
	 * @see #getMaxWaitingTime()
	 * @generated
	 */
	void setMaxWaitingTime(long value);

	/**
	 * Returns the value of the '<em><b>Detour Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detour Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detour Factor</em>' attribute.
	 * @see #setDetourFactor(double)
	 * @see ovgu.pave.model.config.ConfigPackage#getRequestConstraints_DetourFactor()
	 * @model
	 * @generated
	 */
	double getDetourFactor();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.RequestConstraints#getDetourFactor <em>Detour Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detour Factor</em>' attribute.
	 * @see #getDetourFactor()
	 * @generated
	 */
	void setDetourFactor(double value);

	/**
	 * Returns the value of the '<em><b>Service Duration</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Duration</em>' attribute.
	 * @see #setServiceDuration(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getRequestConstraints_ServiceDuration()
	 * @model default="0"
	 * @generated
	 */
	int getServiceDuration();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.RequestConstraints#getServiceDuration <em>Service Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Duration</em>' attribute.
	 * @see #getServiceDuration()
	 * @generated
	 */
	void setServiceDuration(int value);

	/**
	 * Returns the value of the '<em><b>Min Travel Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Travel Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Travel Time</em>' attribute.
	 * @see #setMinTravelTime(long)
	 * @see ovgu.pave.model.config.ConfigPackage#getRequestConstraints_MinTravelTime()
	 * @model
	 * @generated
	 */
	long getMinTravelTime();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.RequestConstraints#getMinTravelTime <em>Min Travel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Travel Time</em>' attribute.
	 * @see #getMinTravelTime()
	 * @generated
	 */
	void setMinTravelTime(long value);

} // RequestConstraints
