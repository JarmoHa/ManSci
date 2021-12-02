/**
 */
package ovgu.pave.model.config.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ovgu.pave.model.config.Config;
import ovgu.pave.model.config.ConfigPackage;
import ovgu.pave.model.config.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ovgu.pave.model.config.impl.ConfigImpl#getInputFolder <em>Input Folder</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ConfigImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ConfigImpl#getInputFilename <em>Input Filename</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ConfigImpl#getConfigPath <em>Config Path</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ConfigImpl#getOutputFolder <em>Output Folder</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ConfigImpl#getRuns <em>Runs</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ConfigImpl#getExperiments <em>Experiments</em>}</li>
 *   <li>{@link ovgu.pave.model.config.impl.ConfigImpl#getThreadCount <em>Thread Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigImpl extends MinimalEObjectImpl.Container implements Config {
	/**
	 * The default value of the '{@link #getInputFolder() <em>Input Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputFolder() <em>Input Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFolder()
	 * @generated
	 * @ordered
	 */
	protected String inputFolder = INPUT_FOLDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected Scenario scenario;

	/**
	 * The default value of the '{@link #getInputFilename() <em>Input Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputFilename() <em>Input Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFilename()
	 * @generated
	 * @ordered
	 */
	protected String inputFilename = INPUT_FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigPath() <em>Config Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfigPath() <em>Config Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigPath()
	 * @generated
	 * @ordered
	 */
	protected String configPath = CONFIG_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputFolder() <em>Output Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputFolder() <em>Output Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFolder()
	 * @generated
	 * @ordered
	 */
	protected String outputFolder = OUTPUT_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuns() <em>Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns()
	 * @generated
	 * @ordered
	 */
	protected static final int RUNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRuns() <em>Runs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns()
	 * @generated
	 * @ordered
	 */
	protected int runs = RUNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExperiments() <em>Experiments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperiments()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPERIMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExperiments() <em>Experiments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperiments()
	 * @generated
	 * @ordered
	 */
	protected int experiments = EXPERIMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreadCount() <em>Thread Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadCount()
	 * @generated
	 * @ordered
	 */
	protected static final int THREAD_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThreadCount() <em>Thread Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadCount()
	 * @generated
	 * @ordered
	 */
	protected int threadCount = THREAD_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputFolder() {
		return inputFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFolder(String newInputFolder) {
		String oldInputFolder = inputFolder;
		inputFolder = newInputFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__INPUT_FOLDER, oldInputFolder, inputFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(Scenario newScenario, NotificationChain msgs) {
		Scenario oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__SCENARIO, oldScenario, newScenario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(Scenario newScenario) {
		if (newScenario != scenario) {
			NotificationChain msgs = null;
			if (scenario != null)
				msgs = ((InternalEObject)scenario).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.CONFIG__SCENARIO, null, msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigPackage.CONFIG__SCENARIO, null, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputFilename() {
		return inputFilename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFilename(String newInputFilename) {
		String oldInputFilename = inputFilename;
		inputFilename = newInputFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__INPUT_FILENAME, oldInputFilename, inputFilename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfigPath() {
		return configPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigPath(String newConfigPath) {
		String oldConfigPath = configPath;
		configPath = newConfigPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__CONFIG_PATH, oldConfigPath, configPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputFolder() {
		return outputFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFolder(String newOutputFolder) {
		String oldOutputFolder = outputFolder;
		outputFolder = newOutputFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__OUTPUT_FOLDER, oldOutputFolder, outputFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRuns() {
		return runs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuns(int newRuns) {
		int oldRuns = runs;
		runs = newRuns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__RUNS, oldRuns, runs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExperiments() {
		return experiments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExperiments(int newExperiments) {
		int oldExperiments = experiments;
		experiments = newExperiments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__EXPERIMENTS, oldExperiments, experiments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThreadCount() {
		return threadCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadCount(int newThreadCount) {
		int oldThreadCount = threadCount;
		threadCount = newThreadCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.CONFIG__THREAD_COUNT, oldThreadCount, threadCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.CONFIG__SCENARIO:
				return basicSetScenario(null, msgs);
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
			case ConfigPackage.CONFIG__INPUT_FOLDER:
				return getInputFolder();
			case ConfigPackage.CONFIG__SCENARIO:
				return getScenario();
			case ConfigPackage.CONFIG__INPUT_FILENAME:
				return getInputFilename();
			case ConfigPackage.CONFIG__CONFIG_PATH:
				return getConfigPath();
			case ConfigPackage.CONFIG__OUTPUT_FOLDER:
				return getOutputFolder();
			case ConfigPackage.CONFIG__RUNS:
				return getRuns();
			case ConfigPackage.CONFIG__EXPERIMENTS:
				return getExperiments();
			case ConfigPackage.CONFIG__THREAD_COUNT:
				return getThreadCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.CONFIG__INPUT_FOLDER:
				setInputFolder((String)newValue);
				return;
			case ConfigPackage.CONFIG__SCENARIO:
				setScenario((Scenario)newValue);
				return;
			case ConfigPackage.CONFIG__INPUT_FILENAME:
				setInputFilename((String)newValue);
				return;
			case ConfigPackage.CONFIG__CONFIG_PATH:
				setConfigPath((String)newValue);
				return;
			case ConfigPackage.CONFIG__OUTPUT_FOLDER:
				setOutputFolder((String)newValue);
				return;
			case ConfigPackage.CONFIG__RUNS:
				setRuns((Integer)newValue);
				return;
			case ConfigPackage.CONFIG__EXPERIMENTS:
				setExperiments((Integer)newValue);
				return;
			case ConfigPackage.CONFIG__THREAD_COUNT:
				setThreadCount((Integer)newValue);
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
			case ConfigPackage.CONFIG__INPUT_FOLDER:
				setInputFolder(INPUT_FOLDER_EDEFAULT);
				return;
			case ConfigPackage.CONFIG__SCENARIO:
				setScenario((Scenario)null);
				return;
			case ConfigPackage.CONFIG__INPUT_FILENAME:
				setInputFilename(INPUT_FILENAME_EDEFAULT);
				return;
			case ConfigPackage.CONFIG__CONFIG_PATH:
				setConfigPath(CONFIG_PATH_EDEFAULT);
				return;
			case ConfigPackage.CONFIG__OUTPUT_FOLDER:
				setOutputFolder(OUTPUT_FOLDER_EDEFAULT);
				return;
			case ConfigPackage.CONFIG__RUNS:
				setRuns(RUNS_EDEFAULT);
				return;
			case ConfigPackage.CONFIG__EXPERIMENTS:
				setExperiments(EXPERIMENTS_EDEFAULT);
				return;
			case ConfigPackage.CONFIG__THREAD_COUNT:
				setThreadCount(THREAD_COUNT_EDEFAULT);
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
			case ConfigPackage.CONFIG__INPUT_FOLDER:
				return INPUT_FOLDER_EDEFAULT == null ? inputFolder != null : !INPUT_FOLDER_EDEFAULT.equals(inputFolder);
			case ConfigPackage.CONFIG__SCENARIO:
				return scenario != null;
			case ConfigPackage.CONFIG__INPUT_FILENAME:
				return INPUT_FILENAME_EDEFAULT == null ? inputFilename != null : !INPUT_FILENAME_EDEFAULT.equals(inputFilename);
			case ConfigPackage.CONFIG__CONFIG_PATH:
				return CONFIG_PATH_EDEFAULT == null ? configPath != null : !CONFIG_PATH_EDEFAULT.equals(configPath);
			case ConfigPackage.CONFIG__OUTPUT_FOLDER:
				return OUTPUT_FOLDER_EDEFAULT == null ? outputFolder != null : !OUTPUT_FOLDER_EDEFAULT.equals(outputFolder);
			case ConfigPackage.CONFIG__RUNS:
				return runs != RUNS_EDEFAULT;
			case ConfigPackage.CONFIG__EXPERIMENTS:
				return experiments != EXPERIMENTS_EDEFAULT;
			case ConfigPackage.CONFIG__THREAD_COUNT:
				return threadCount != THREAD_COUNT_EDEFAULT;
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
		result.append(" (inputFolder: ");
		result.append(inputFolder);
		result.append(", inputFilename: ");
		result.append(inputFilename);
		result.append(", configPath: ");
		result.append(configPath);
		result.append(", outputFolder: ");
		result.append(outputFolder);
		result.append(", runs: ");
		result.append(runs);
		result.append(", experiments: ");
		result.append(experiments);
		result.append(", threadCount: ");
		result.append(threadCount);
		result.append(')');
		return result.toString();
	}

} //ConfigImpl
