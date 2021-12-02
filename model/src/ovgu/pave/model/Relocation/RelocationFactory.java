/**
 */
package ovgu.pave.model.Relocation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ovgu.pave.model.Relocation.RelocationPackage
 * @generated
 */
public interface RelocationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelocationFactory eINSTANCE = ovgu.pave.model.Relocation.impl.RelocationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Relocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relocation</em>'.
	 * @generated
	 */
	Relocation createRelocation();

	/**
	 * Returns a new object of class '<em>Region Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region Plan</em>'.
	 * @generated
	 */
	RegionPlan createRegionPlan();

	/**
	 * Returns a new object of class '<em>Time Period Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Period Plan</em>'.
	 * @generated
	 */
	TimePeriodPlan createTimePeriodPlan();

	/**
	 * Returns a new object of class '<em>Region Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region Statistic</em>'.
	 * @generated
	 */
	RegionStatistic createRegionStatistic();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RelocationPackage getRelocationPackage();

} //RelocationFactory
