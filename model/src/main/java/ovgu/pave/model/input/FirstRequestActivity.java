/**
 */
package ovgu.pave.model.input;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>First Request Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.input.FirstRequestActivity#getEarliestArrival <em>Earliest Arrival</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.input.InputPackage#getFirstRequestActivity()
 * @model
 * @generated
 */
public interface FirstRequestActivity extends RequestActivity {
	/**
	 * Returns the value of the '<em><b>Earliest Arrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Earliest Arrival</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earliest Arrival</em>' attribute.
	 * @see #setEarliestArrival(long)
	 * @see ovgu.pave.model.input.InputPackage#getFirstRequestActivity_EarliestArrival()
	 * @model
	 * @generated
	 */
	long getEarliestArrival();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.input.FirstRequestActivity#getEarliestArrival <em>Earliest Arrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earliest Arrival</em>' attribute.
	 * @see #getEarliestArrival()
	 * @generated
	 */
	void setEarliestArrival(long value);

} // FirstRequestActivity
