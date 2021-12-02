package ovgu.pave.handler.modelHandler;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLResource.XMLMap;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import ovgu.pave.model.config.Config;
import ovgu.pave.model.config.ConfigPackage;

public class IOHandler {

	protected static void saveConfig(Config config, String path) {
		save(config, path, false);
	}

	protected static Config loadConfig(String path) {
		return load(Config.class, path, false);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void save(EObject saveObject, String path, boolean zip) {
		Resource resource = new XMLResourceImpl(URI.createURI(path));
		
		Map options = new HashMap();
		if (zip)
			options.put(XMLResource.OPTION_ZIP, true);

		options.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, true);
		resource.getContents().add(saveObject);
		
		try {
			resource.save(options);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static <T extends EObject> T load(Class<T> clas, String path, boolean zip) {
		Resource resource = new XMLResourceImpl(URI.createURI(path));
		
		Map options = new HashMap();
		if (zip)
			options.put(XMLResource.OPTION_ZIP, true);
		
		XMLMap xmlMap = new XMLMapImpl();
		if (clas.equals(Config.class))
			xmlMap.setNoNamespacePackage(ConfigPackage.eINSTANCE);
		
		try {
			resource.load(options);
			return (T) resource.getContents().get(0);

		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
