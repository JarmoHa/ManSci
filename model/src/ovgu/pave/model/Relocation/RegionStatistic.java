/**
 */
package ovgu.pave.model.Relocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ovgu.pave.model.input.Region;
import ovgu.pave.model.input.Request;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region Statistic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.Relocation.RegionStatistic#getRegion <em>Region</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.RegionStatistic#getReceivingTimes <em>Receiving Times</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.RegionStatistic#getRejectedRequests <em>Rejected Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.RegionStatistic#getRelocationScore <em>Relocation Score</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionStatistic()
 * @model
 * @generated
 */
public interface RegionStatistic extends EObject {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(Region)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionStatistic_Region()
	 * @model dataType="ovgu.pave.model.Relocation.Region"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.RegionStatistic#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Receiving Times</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving Times</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving Times</em>' attribute list.
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionStatistic_ReceivingTimes()
	 * @model
	 * @generated
	 */
	EList<Long> getReceivingTimes();

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
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionStatistic_RejectedRequests()
	 * @model dataType="ovgu.pave.model.Relocation.Request"
	 * @generated
	 */
	EList<Request> getRejectedRequests();

	/**
	 * Returns the value of the '<em><b>Relocation Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relocation Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relocation Score</em>' attribute.
	 * @see #setRelocationScore(double)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionStatistic_RelocationScore()
	 * @model
	 * @generated
	 */
	double getRelocationScore();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.RegionStatistic#getRelocationScore <em>Relocation Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relocation Score</em>' attribute.
	 * @see #getRelocationScore()
	 * @generated
	 */
	void setRelocationScore(double value);

} // RegionStatistic
