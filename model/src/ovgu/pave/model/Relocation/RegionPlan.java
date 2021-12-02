/**
 */
package ovgu.pave.model.Relocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ovgu.pave.model.input.Region;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.Relocation.RegionPlan#getRegion <em>Region</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.RegionPlan#getTargetRegions <em>Target Regions</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.RegionPlan#getExpRelocationShare <em>Exp Relocation Share</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.RegionPlan#getReceivedVehicles <em>Received Vehicles</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.RegionPlan#getSourceCounter <em>Source Counter</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.RegionPlan#getSinkCounter <em>Sink Counter</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.RegionPlan#getOutcomeCounter <em>Outcome Counter</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.RegionPlan#getIncomeCounter <em>Income Counter</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.RegionPlan#getShareDiff <em>Share Diff</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.RegionPlan#getExpSupplierShare <em>Exp Supplier Share</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.RegionPlan#getSendedVehicles <em>Sended Vehicles</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionPlan()
 * @model
 * @generated
 */
public interface RegionPlan extends EObject {
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
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionPlan_Region()
	 * @model dataType="ovgu.pave.model.Relocation.Region"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.RegionPlan#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Target Regions</b></em>' reference list.
	 * The list contents are of type {@link ovgu.pave.model.Relocation.RegionPlan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Regions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Regions</em>' reference list.
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionPlan_TargetRegions()
	 * @model
	 * @generated
	 */
	EList<RegionPlan> getTargetRegions();

	/**
	 * Returns the value of the '<em><b>Exp Relocation Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp Relocation Share</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp Relocation Share</em>' attribute.
	 * @see #setExpRelocationShare(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionPlan_ExpRelocationShare()
	 * @model
	 * @generated
	 */
	long getExpRelocationShare();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.RegionPlan#getExpRelocationShare <em>Exp Relocation Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Relocation Share</em>' attribute.
	 * @see #getExpRelocationShare()
	 * @generated
	 */
	void setExpRelocationShare(long value);

	/**
	 * Returns the value of the '<em><b>Received Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Vehicles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Vehicles</em>' attribute.
	 * @see #setReceivedVehicles(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionPlan_ReceivedVehicles()
	 * @model
	 * @generated
	 */
	long getReceivedVehicles();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.RegionPlan#getReceivedVehicles <em>Received Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Vehicles</em>' attribute.
	 * @see #getReceivedVehicles()
	 * @generated
	 */
	void setReceivedVehicles(long value);

	/**
	 * Returns the value of the '<em><b>Source Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Counter</em>' attribute.
	 * @see #setSourceCounter(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionPlan_SourceCounter()
	 * @model
	 * @generated
	 */
	long getSourceCounter();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.RegionPlan#getSourceCounter <em>Source Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Counter</em>' attribute.
	 * @see #getSourceCounter()
	 * @generated
	 */
	void setSourceCounter(long value);

	/**
	 * Returns the value of the '<em><b>Sink Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink Counter</em>' attribute.
	 * @see #setSinkCounter(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionPlan_SinkCounter()
	 * @model
	 * @generated
	 */
	long getSinkCounter();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.RegionPlan#getSinkCounter <em>Sink Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sink Counter</em>' attribute.
	 * @see #getSinkCounter()
	 * @generated
	 */
	void setSinkCounter(long value);

	/**
	 * Returns the value of the '<em><b>Outcome Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outcome Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outcome Counter</em>' attribute.
	 * @see #setOutcomeCounter(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionPlan_OutcomeCounter()
	 * @model
	 * @generated
	 */
	long getOutcomeCounter();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.RegionPlan#getOutcomeCounter <em>Outcome Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outcome Counter</em>' attribute.
	 * @see #getOutcomeCounter()
	 * @generated
	 */
	void setOutcomeCounter(long value);

	/**
	 * Returns the value of the '<em><b>Income Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Income Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Income Counter</em>' attribute.
	 * @see #setIncomeCounter(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionPlan_IncomeCounter()
	 * @model
	 * @generated
	 */
	long getIncomeCounter();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.RegionPlan#getIncomeCounter <em>Income Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Income Counter</em>' attribute.
	 * @see #getIncomeCounter()
	 * @generated
	 */
	void setIncomeCounter(long value);

	/**
	 * Returns the value of the '<em><b>Share Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Share Diff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share Diff</em>' attribute.
	 * @see #setShareDiff(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionPlan_ShareDiff()
	 * @model
	 * @generated
	 */
	long getShareDiff();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.RegionPlan#getShareDiff <em>Share Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share Diff</em>' attribute.
	 * @see #getShareDiff()
	 * @generated
	 */
	void setShareDiff(long value);

	/**
	 * Returns the value of the '<em><b>Exp Supplier Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp Supplier Share</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp Supplier Share</em>' attribute.
	 * @see #setExpSupplierShare(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionPlan_ExpSupplierShare()
	 * @model
	 * @generated
	 */
	long getExpSupplierShare();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.RegionPlan#getExpSupplierShare <em>Exp Supplier Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp Supplier Share</em>' attribute.
	 * @see #getExpSupplierShare()
	 * @generated
	 */
	void setExpSupplierShare(long value);

	/**
	 * Returns the value of the '<em><b>Sended Vehicles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sended Vehicles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sended Vehicles</em>' attribute.
	 * @see #setSendedVehicles(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRegionPlan_SendedVehicles()
	 * @model
	 * @generated
	 */
	long getSendedVehicles();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.RegionPlan#getSendedVehicles <em>Sended Vehicles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sended Vehicles</em>' attribute.
	 * @see #getSendedVehicles()
	 * @generated
	 */
	void setSendedVehicles(long value);

} // RegionPlan
