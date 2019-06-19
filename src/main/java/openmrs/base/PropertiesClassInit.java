package openmrs.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class PropertiesClassInit {

	private static final Logger LOG = LoggerFactory.getLogger(PropertiesClassInit.class.getSimpleName()); 
	private static final String ORFilePath = "/openmrs/src/test/java/openmrs/resources/properties/OR.properties";
	private static final String ConfigPath = "/openmrs/src/test/java/openmrs/resources/properties/CONFIG.properties";
	private Properties properties;

	private static PropertiesClassInit instance = new PropertiesClassInit();

	public static PropertiesClassInit getInstanceOfProperties(){
		return instance;
	}

	private PropertiesClassInit(){
		loadPropertiesFromFiles(ORFilePath,ConfigPath);
	}

	private void loadPropertiesFromFiles(String... propertyFileNames){

		for(String propertyFile: propertyFileNames) {
			propertiesFromFile(propertyFile);
		}
	}

	private void propertiesFromFile(final String fileName){
		try{
			FileInputStream fis = new FileInputStream(new File(fileName));
			properties.load(fis);
			LOG.debug("Properties file is successfully loaded", fileName);
		}catch(IOException e){
			LOG.error("Error while loading property file", fileName, e);
		}
	}
	

}
