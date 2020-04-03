package com.shasu19p.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * In Java, we can load complete properties file like spring's
 * application.properties file using Properties class of Java.
 */
public class WritesPropertiesFileToSystemPath {

	private static Logger logger = Logger.getLogger(WritesPropertiesFileToSystemPath.class.getCanonicalName());

	public static void main(String[] args) {

		args = new String[] { "false", "custom" };

		boolean xmlFormat = Boolean.getBoolean(args[0]);
		String clusterModule = args[1];

		StringBuilder mutableFilename = new StringBuilder("./logs/catalina.out");

		try {
			InputStream is = new SearchingFileInClassContextLoader().inputStreamFromClasspath(mutableFilename);
			Properties properties = new Properties();

			if (xmlFormat) {
				properties.loadFromXML(is);
			} else {
				properties.load(is);
			}
			properties.setProperty("test", clusterModule);

			File file = new File(
					"C:\\Users\\sunil\\development\\codebase\\shasu19\\java-small-learning-projects\\read-system-env-properties\\src\\main\\resources\\logs\\copy.out");
			if (!file.exists()) {
				file.createNewFile();
			}

			OutputStream os = new FileOutputStream(file);
			if (xmlFormat) {
				properties.storeToXML(os, "new file - xml");
			} else {
				properties.store(os, "new file - normal");
			}

		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getLocalizedMessage());
		}
	}
}
