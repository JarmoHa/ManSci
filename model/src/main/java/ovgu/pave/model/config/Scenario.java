/**
 */
package ovgu.pave.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.Scenario#getRequestConstraints <em>Request Constraints</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Scenario#getPlanningPeriodBegin <em>Planning Period Begin</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Scenario#getPlanningPeriodLength <em>Planning Period Length</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Scenario#getNumberOfRequests <em>Number Of Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Scenario#getNumberOfVehicles <em>Number Of Vehicles</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Scenario#getTravelTimeFactor <em>Travel Time Factor</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Scenario#getVehicleCapacity <em>Vehicle Capacity</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Scenario#getRandomSeed <em>Random Seed</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Scenario#getArea <em>Area</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.config.ConfigPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Request Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Constraints</em>' containment reference.
	 * @see #setRequestConstraints(RequestConstraints)
	 * @see ovgu.pave.model.config.ConfigPackage#getScenario_RequestConstraints()
	 * @model containment="true"
	 * @generated
	 */
	RequestConstraints getRequestConstraints();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Scenario#getRequestConstraints <em>Request Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Constraints</em>' containment reference.
	 * @see #getRequestConstraints()
	 * @generated
	 */
	void setRequestConstraints(RequestConstraints value);

	/**
	 * Returns the value of the '<em><b>Planning Period Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planning Period Begin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Period Begin</em>' attribute.
	 * @see #setPlanningPeriodBegin(long)
	 * @see ovgu.pave.model.config.ConfigPackage#getScenario_PlanningPeriodBegin()
	 * @model
	 * @generated
	 */
	long getPlanningPeriodBegin();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Scenario#getPlanningPeriodBegin <em>Planning Period Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Period Begin</em>' attribute.
	 * @see #getPlanningPeriodBegin()
	 * @generated
	 */
	void setPlanningPeriodBegin(long value);

	/**
	 * Returns the value of the '<em><b>Planning Period Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planning Period Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planning Period Length</em>' attribute.
	 * @see #setPlanningPeriodLength(long)
	 * @see ovgu.pave.model.config.ConfigPackage#getScenario_PlanningPeriodLength()
	 * @model
	 * @generated
	 */
	long getPlanningPeriodLength();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Scenario#getPlanningPeriodLength <em>Planning Period Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planning Period Length</em>' attribute.
	 * @see #getPlanningPeriodLength()
	 * @generated
	 */
	void setPlanningPeriodLength(long value);

	/**
	 * Returns the value of the '<em><b>Number Of Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Requests</em>' attribute.
	 * @see #setNumberOfRequests(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getScenario_NumberOfRequests()
	 * @model
	 * @generated
	 */
	int getNumberOfRequests();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Scenario#getNumberOfRequests <em>Number Of Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Requests</em>' attribute.
	 * @see #getNumberOfRequests()
	 * @generated
	 */
	void setNumberOfRequests(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Vehicles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Vehicles</em>' attribute.
	 * @see #setNumberOfVehicles(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getScenario_NumberOfVehicles()
	 * @model
	 * @generated
	 */
	int getNumberOfVehicles();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Scenario#getNumberOfVehicles <em>Number Of Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Vehicles</em>' attribute.
	 * @see #getNumberOfVehicles()
	 * @generated
	 */
	void setNumberOfVehicles(int value);

	/**
	 * Returns the value of the '<em><b>Travel Time Factor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Travel Time Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Time Factor</em>' attribute.
	 * @see #setTravelTimeFactor(double)
	 * @see ovgu.pave.model.config.ConfigPackage#getScenario_TravelTimeFactor()
	 * @model default="1"
	 * @generated
	 */
	double getTravelTimeFactor();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Scenario#getTravelTimeFactor <em>Travel Time Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Time Factor</em>' attribute.
	 * @see #getTravelTimeFactor()
	 * @generated
	 */
	void setTravelTimeFactor(double value);

	/**
	 * Returns the value of the '<em><b>Vehicle Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicle Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Capacity</em>' attribute.
	 * @see #setVehicleCapacity(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getScenario_VehicleCapacity()
	 * @model
	 * @generated
	 */
	int getVehicleCapacity();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Scenario#getVehicleCapacity <em>Vehicle Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle Capacity</em>' attribute.
	 * @see #getVehicleCapacity()
	 * @generated
	 */
	void setVehicleCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Random Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random Seed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random Seed</em>' attribute.
	 * @see #setRandomSeed(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getScenario_RandomSeed()
	 * @model
	 * @generated
	 */
	int getRandomSeed();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Scenario#getRandomSeed <em>Random Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random Seed</em>' attribute.
	 * @see #getRandomSeed()
	 * @generated
	 */
	void setRandomSeed(int value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see #setArea(String)
	 * @see ovgu.pave.model.config.ConfigPackage#getScenario_Area()
	 * @model
	 * @generated
	 */
	String getArea();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Scenario#getArea <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' attribute.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(String value);

} // Scenario
