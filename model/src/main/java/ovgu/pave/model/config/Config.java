/**
 */
package ovgu.pave.model.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.Config#getInputFolder <em>Input Folder</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Config#getScenario <em>Scenario</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Config#getInputFilename <em>Input Filename</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Config#getConfigPath <em>Config Path</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Config#getOutputFolder <em>Output Folder</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Config#getRuns <em>Runs</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Config#getExperiments <em>Experiments</em>}</li>
 *   <li>{@link ovgu.pave.model.config.Config#getThreadCount <em>Thread Count</em>}</li>
 * </ul>
 *
 * @see ovgu.pave.model.config.ConfigPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Folder</em>' attribute.
	 * @see #setInputFolder(String)
	 * @see ovgu.pave.model.config.ConfigPackage#getConfig_InputFolder()
	 * @model
	 * @generated
	 */
	String getInputFolder();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Config#getInputFolder <em>Input Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Folder</em>' attribute.
	 * @see #getInputFolder()
	 * @generated
	 */
	void setInputFolder(String value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference.
	 * @see #setScenario(Scenario)
	 * @see ovgu.pave.model.config.ConfigPackage#getConfig_Scenario()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Scenario getScenario();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Config#getScenario <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' containment reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(Scenario value);

	/**
	 * Returns the value of the '<em><b>Input Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Filename</em>' attribute.
	 * @see #setInputFilename(String)
	 * @see ovgu.pave.model.config.ConfigPackage#getConfig_InputFilename()
	 * @model
	 * @generated
	 */
	String getInputFilename();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Config#getInputFilename <em>Input Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Filename</em>' attribute.
	 * @see #getInputFilename()
	 * @generated
	 */
	void setInputFilename(String value);

	/**
	 * Returns the value of the '<em><b>Config Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Path</em>' attribute.
	 * @see #setConfigPath(String)
	 * @see ovgu.pave.model.config.ConfigPackage#getConfig_ConfigPath()
	 * @model
	 * @generated
	 */
	String getConfigPath();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Config#getConfigPath <em>Config Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Path</em>' attribute.
	 * @see #getConfigPath()
	 * @generated
	 */
	void setConfigPath(String value);

	/**
	 * Returns the value of the '<em><b>Output Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Folder</em>' attribute.
	 * @see #setOutputFolder(String)
	 * @see ovgu.pave.model.config.ConfigPackage#getConfig_OutputFolder()
	 * @model
	 * @generated
	 */
	String getOutputFolder();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Config#getOutputFolder <em>Output Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Folder</em>' attribute.
	 * @see #getOutputFolder()
	 * @generated
	 */
	void setOutputFolder(String value);

	/**
	 * Returns the value of the '<em><b>Runs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs</em>' attribute.
	 * @see #setRuns(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getConfig_Runs()
	 * @model
	 * @generated
	 */
	int getRuns();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Config#getRuns <em>Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs</em>' attribute.
	 * @see #getRuns()
	 * @generated
	 */
	void setRuns(int value);

	/**
	 * Returns the value of the '<em><b>Experiments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experiments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiments</em>' attribute.
	 * @see #setExperiments(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getConfig_Experiments()
	 * @model
	 * @generated
	 */
	int getExperiments();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Config#getExperiments <em>Experiments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experiments</em>' attribute.
	 * @see #getExperiments()
	 * @generated
	 */
	void setExperiments(int value);

	/**
	 * Returns the value of the '<em><b>Thread Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Count</em>' attribute.
	 * @see #setThreadCount(int)
	 * @see ovgu.pave.model.config.ConfigPackage#getConfig_ThreadCount()
	 * @model
	 * @generated
	 */
	int getThreadCount();

	/**
	 * Sets the value of the '{@link ovgu.pave.model.config.Config#getThreadCount <em>Thread Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Count</em>' attribute.
	 * @see #getThreadCount()
	 * @generated
	 */
	void setThreadCount(int value);

} // Config
