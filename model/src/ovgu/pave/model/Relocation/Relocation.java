/**
 */
package ovgu.pave.model.Relocation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.Relocation.Relocation#getTimePeriodPlans <em>Time Period Plans</em>}</li>
 *   <li>{@link ovgu.pave.model.Relocation.Relocation#getRegionStatistics <em>Region Statistics</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.Relocation.RelocationPackage#getRelocation()
 * @model
 * @generated
 */
public interface Relocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Period Plans</b></em>' containment reference list.
	 * The list contents are of type {@link ovgu.pave.model.Relocation.TimePeriodPlan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Period Plans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Period Plans</em>' containment reference list.
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRelocation_TimePeriodPlans()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimePeriodPlan> getTimePeriodPlans();

	/**
	 * Returns the value of the '<em><b>Region Statistics</b></em>' reference list.
	 * The list contents are of type {@link ovgu.pave.model.Relocation.RegionStatistic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region Statistics</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region Statistics</em>' reference list.
	 * @see ovgu.pave.model.Relocation.RelocationPackage#getRelocation_RegionStatistics()
	 * @model
	 * @generated
	 */
	EList<RegionStatistic> getRegionStatistics();

} // Relocation
