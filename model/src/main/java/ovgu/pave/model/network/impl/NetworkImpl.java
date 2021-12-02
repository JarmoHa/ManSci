/**
 */
package ovgu.pave.model.network.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ovgu.pave.model.network.Location;
import ovgu.pave.model.network.Network;
import ovgu.pave.model.network.NetworkPackage;
import ovgu.pave.model.network.Zone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.network.impl.NetworkImpl#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link ovgu.pave.model.network.impl.NetworkImpl#getZones <em>Zones</em>}</li>
 *   <li>{@link ovgu.pave.model.network.impl.NetworkImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network {
	/**
	 * The default value of the '{@link #getMatrix() <em>Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrix()
	 * @generated
	 * @ordered
	 */
	protected static final Long[][] MATRIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatrix() <em>Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrix()
	 * @generated
	 * @ordered
	 */
	protected Long[][] matrix = MATRIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZones() <em>Zones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZones()
	 * @generated
	 * @ordered
	 */
	protected EList<Zone> zones;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NetworkPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long[][] getMatrix() {
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatrix(Long[][] newMatrix) {
		Long[][] oldMatrix = matrix;
		matrix = newMatrix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NetworkPackage.NETWORK__MATRIX, oldMatrix, matrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Zone> getZones() {
		if (zones == null) {
			zones = new EObjectResolvingEList<Zone>(Zone.class, this, NetworkPackage.NETWORK__ZONES);
		}
		return zones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectResolvingEList<Location>(Location.class, this, NetworkPackage.NETWORK__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NetworkPackage.NETWORK__MATRIX:
				return getMatrix();
			case NetworkPackage.NETWORK__ZONES:
				return getZones();
			case NetworkPackage.NETWORK__LOCATIONS:
				return getLocations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NetworkPackage.NETWORK__MATRIX:
				setMatrix((Long[][])newValue);
				return;
			case NetworkPackage.NETWORK__ZONES:
				getZones().clear();
				getZones().addAll((Collection<? extends Zone>)newValue);
				return;
			case NetworkPackage.NETWORK__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NetworkPackage.NETWORK__MATRIX:
				setMatrix(MATRIX_EDEFAULT);
				return;
			case NetworkPackage.NETWORK__ZONES:
				getZones().clear();
				return;
			case NetworkPackage.NETWORK__LOCATIONS:
				getLocations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NetworkPackage.NETWORK__MATRIX:
				return MATRIX_EDEFAULT == null ? matrix != null : !MATRIX_EDEFAULT.equals(matrix);
			case NetworkPackage.NETWORK__ZONES:
				return zones != null && !zones.isEmpty();
			case NetworkPackage.NETWORK__LOCATIONS:
				return locations != null && !locations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (matrix: ");
		result.append(matrix);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
