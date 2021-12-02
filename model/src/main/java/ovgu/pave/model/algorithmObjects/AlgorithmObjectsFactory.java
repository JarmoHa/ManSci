/**
 */
package ovgu.pave.model.algorithmObjects;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ovgu.pave.model.algorithmObjects.AlgorithmObjectsPackage
 * @generated
 */
public interface AlgorithmObjectsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AlgorithmObjectsFactory eINSTANCE = ovgu.pave.model.algorithmObjects.impl.AlgorithmObjectsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Insertion Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insertion Option</em>'.
	 * @generated
	 */
	InsertionOption createInsertionOption();

	/**
	 * Returns a new object of class '<em>Insertion Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insertion Information</em>'.
	 * @generated
	 */
	InsertionInformation createInsertionInformation();

	/**
	 * Returns a new object of class '<em>Driving Time Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Driving Time Information</em>'.
	 * @generated
	 */
	DrivingTimeInformation createDrivingTimeInformation();

	/**
	 * Returns a new object of class '<em>Slacks</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slacks</em>'.
	 * @generated
	 */
	Slacks createSlacks();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AlgorithmObjectsPackage getAlgorithmObjectsPackage();

} //AlgorithmObjectsFactory
