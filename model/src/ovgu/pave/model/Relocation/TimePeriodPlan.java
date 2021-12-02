/**
 */
package ovgu.pave.model.Relocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Period Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.Relocation.TimePeriodPlan#getRegionPlans <em>Region Plans</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.TimePeriodPlan#getEnd <em>End</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.TimePeriodPlan#getBeginn <em>Beginn</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.TimePeriodPlan#getDemands <em>Demands</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.TimePeriodPlan#getSupplies <em>Supplies</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.TimePeriodPlan#getRelocations <em>Relocations</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.Relocation.RelocationPackage#getTimePeriodPlan()
 * @model
 * @generated
 */
public interface TimePeriodPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Region Plans</b></em>' reference list.
	 * The list contents are of type {@link ovgu.pave.model.Relocation.RegionPlan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Plans</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Plans</em>' reference list.
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getTimePeriodPlan_RegionPlans()
	 * @model
	 * @generated
	 */
	EList<RegionPlan> getRegionPlans();

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getTimePeriodPlan_End()
	 * @model
	 * @generated
	 */
	long getEnd();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.TimePeriodPlan#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(long value);

	/**
	 * Returns the value of the '<em><b>Beginn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beginn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beginn</em>' attribute.
	 * @see #setBeginn(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getTimePeriodPlan_Beginn()
	 * @model
	 * @generated
	 */
	long getBeginn();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.TimePeriodPlan#getBeginn <em>Beginn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beginn</em>' attribute.
	 * @see #getBeginn()
	 * @generated
	 */
	void setBeginn(long value);

	/**
	 * Returns the value of the '<em><b>Demands</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demands</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demands</em>' attribute.
	 * @see #setDemands(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getTimePeriodPlan_Demands()
	 * @model
	 * @generated
	 */
	long getDemands();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.TimePeriodPlan#getDemands <em>Demands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demands</em>' attribute.
	 * @see #getDemands()
	 * @generated
	 */
	void setDemands(long value);

	/**
	 * Returns the value of the '<em><b>Supplies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplies</em>' attribute.
	 * @see #setSupplies(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getTimePeriodPlan_Supplies()
	 * @model
	 * @generated
	 */
	long getSupplies();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.TimePeriodPlan#getSupplies <em>Supplies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplies</em>' attribute.
	 * @see #getSupplies()
	 * @generated
	 */
	void setSupplies(long value);

	/**
	 * Returns the value of the '<em><b>Relocations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relocations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relocations</em>' attribute.
	 * @see #setRelocations(long)
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getTimePeriodPlan_Relocations()
	 * @model
	 * @generated
	 */
	long getRelocations();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.Relocation.TimePeriodPlan#getRelocations <em>Relocations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relocations</em>' attribute.
	 * @see #getRelocations()
	 * @generated
	 */
	void setRelocations(long value);

} // TimePeriodPlan
