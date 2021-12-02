/**
 */
package ovgu.pave.model.network;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.network.Network#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link ovgu.pave.model.network.Network#getZones <em>Zones</em>}</li>
 *   <li>{@link ovgu.pave.model.network.Network#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.network.NetworkPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' attribute.
	 * @see #setMatrix(Long[][])
	 * @see ovgu.pave.model.network.NetworkPackage#getNetwork_Matrix()
	 * @model dataType="ovgu.pave.model.network.LongMatrix" required="true"
	 * @generated
	 */
	Long[][] getMatrix();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.network.Network#getMatrix <em>Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' attribute.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(Long[][] value);

	/**
	 * Returns the value of the '<em><b>Zones</b></em>' reference list.
	 * The list contents are of type {@link ovgu.pave.model.network.Zone}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zones</em>' reference list.
	 * @see ovgu.pave.model.network.NetworkPackage#getNetwork_Zones()
	 * @model
	 * @generated
	 */
	EList<Zone> getZones();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link ovgu.pave.model.network.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see ovgu.pave.model.network.NetworkPackage#getNetwork_Locations()
	 * @model
	 * @generated
	 */
	EList<Location> getLocations();

} // Network
