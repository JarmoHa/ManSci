/**
 */
package ovgu.pave.model.solution.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ovgu.pave.model.input.Request;

import ovgu.pave.model.solution.Route;
import ovgu.pave.model.solution.Solution;
import ovgu.pave.model.solution.SolutionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.solution.impl.SolutionImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.impl.SolutionImpl#getRejectedRequests <em>Rejected Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.impl.SolutionImpl#getAcceptedRequests <em>Accepted Requests</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.impl.SolutionImpl#getRunTime <em>Run Time</em>}</li>
 *   <li>{@link ovgu.pave.model.solution.impl.SolutionImpl#getScore <em>Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionImpl extends MinimalEObjectImpl.Container implements Solution {
	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> routes;

	/**
	 * The cached value of the '{@link #getRejectedRequests() <em>Rejected Requests</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectedRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> rejectedRequests;

	/**
	 * The cached value of the '{@link #getAcceptedRequests() <em>Accepted Requests</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptedRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> acceptedRequests;

	/**
	 * The default value of the '{@link #getRunTime() <em>Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunTime()
	 * @generated
	 * @ordered
	 */
	protected static final long RUN_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRunTime() <em>Run Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunTime()
	 * @generated
	 * @ordered
	 */
	protected long runTime = RUN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final double SCORE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected double score = SCORE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolutionPackage.Literals.SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectContainmentEList<Route>(Route.class, this, SolutionPackage.SOLUTION__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Request> getRejectedRequests() {
		if (rejectedRequests == null) {
			rejectedRequests = new EDataTypeUniqueEList<Request>(Request.class, this, SolutionPackage.SOLUTION__REJECTED_REQUESTS);
		}
		return rejectedRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Request> getAcceptedRequests() {
		if (acceptedRequests == null) {
			acceptedRequests = new EDataTypeUniqueEList<Request>(Request.class, this, SolutionPackage.SOLUTION__ACCEPTED_REQUESTS);
		}
		return acceptedRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRunTime() {
		return runTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunTime(long newRunTime) {
		long oldRunTime = runTime;
		runTime = newRunTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.SOLUTION__RUN_TIME, oldRunTime, runTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(double newScore) {
		double oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolutionPackage.SOLUTION__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolutionPackage.SOLUTION__ROUTES:
				return ((InternalEList<?>)getRoutes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolutionPackage.SOLUTION__ROUTES:
				return getRoutes();
			case SolutionPackage.SOLUTION__REJECTED_REQUESTS:
				return getRejectedRequests();
			case SolutionPackage.SOLUTION__ACCEPTED_REQUESTS:
				return getAcceptedRequests();
			case SolutionPackage.SOLUTION__RUN_TIME:
				return getRunTime();
			case SolutionPackage.SOLUTION__SCORE:
				return getScore();
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
			case SolutionPackage.SOLUTION__ROUTES:
				getRoutes().clear();
				getRoutes().addAll((Collection<? extends Route>)newValue);
				return;
			case SolutionPackage.SOLUTION__REJECTED_REQUESTS:
				getRejectedRequests().clear();
				getRejectedRequests().addAll((Collection<? extends Request>)newValue);
				return;
			case SolutionPackage.SOLUTION__ACCEPTED_REQUESTS:
				getAcceptedRequests().clear();
				getAcceptedRequests().addAll((Collection<? extends Request>)newValue);
				return;
			case SolutionPackage.SOLUTION__RUN_TIME:
				setRunTime((Long)newValue);
				return;
			case SolutionPackage.SOLUTION__SCORE:
				setScore((Double)newValue);
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
			case SolutionPackage.SOLUTION__ROUTES:
				getRoutes().clear();
				return;
			case SolutionPackage.SOLUTION__REJECTED_REQUESTS:
				getRejectedRequests().clear();
				return;
			case SolutionPackage.SOLUTION__ACCEPTED_REQUESTS:
				getAcceptedRequests().clear();
				return;
			case SolutionPackage.SOLUTION__RUN_TIME:
				setRunTime(RUN_TIME_EDEFAULT);
				return;
			case SolutionPackage.SOLUTION__SCORE:
				setScore(SCORE_EDEFAULT);
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
			case SolutionPackage.SOLUTION__ROUTES:
				return routes != null && !routes.isEmpty();
			case SolutionPackage.SOLUTION__REJECTED_REQUESTS:
				return rejectedRequests != null && !rejectedRequests.isEmpty();
			case SolutionPackage.SOLUTION__ACCEPTED_REQUESTS:
				return acceptedRequests != null && !acceptedRequests.isEmpty();
			case SolutionPackage.SOLUTION__RUN_TIME:
				return runTime != RUN_TIME_EDEFAULT;
			case SolutionPackage.SOLUTION__SCORE:
				return score != SCORE_EDEFAULT;
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
		result.append(" (rejectedRequests: ");
		result.append(rejectedRequests);
		result.append(", acceptedRequests: ");
		result.append(acceptedRequests);
		result.append(", runTime: ");
		result.append(runTime);
		result.append(", score: ");
		result.append(score);
		result.append(')');
		return result.toString();
	}

} //SolutionImpl
