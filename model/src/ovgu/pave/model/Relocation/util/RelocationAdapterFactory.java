/**
 */
package ovgu.pave.model.Relocation.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ovgu.pave.model.Relocation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ovgu.pave.model.Relocation.RelocationPackage
 * @generated
 */
public class RelocationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RelocationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelocationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RelocationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelocationSwitch<Adapter> modelSwitch =
		new RelocationSwitch<Adapter>() {
			@Override
			public Adapter caseRelocation(Relocation object) {
				return createRelocationAdapter();
			}
			@Override
			public Adapter caseRegionPlan(RegionPlan object) {
				return createRegionPlanAdapter();
			}
			@Override
			public Adapter caseTimePeriodPlan(TimePeriodPlan object) {
				return createTimePeriodPlanAdapter();
			}
			@Override
			public Adapter caseRegionStatistic(RegionStatistic object) {
				return createRegionStatisticAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ovgu.pave.model.Relocation.Relocation <em>Relocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ovgu.pave.model.Relocation.Relocation
	 * @generated
	 */
	public Adapter createRelocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ovgu.pave.model.Relocation.RegionPlan <em>Region Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ovgu.pave.model.Relocation.RegionPlan
	 * @generated
	 */
	public Adapter createRegionPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ovgu.pave.model.Relocation.TimePeriodPlan <em>Time Period Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ovgu.pave.model.Relocation.TimePeriodPlan
	 * @generated
	 */
	public Adapter createTimePeriodPlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ovgu.pave.model.Relocation.RegionStatistic <em>Region Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ovgu.pave.model.Relocation.RegionStatistic
	 * @generated
	 */
	public Adapter createRegionStatisticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RelocationAdapterFactory
