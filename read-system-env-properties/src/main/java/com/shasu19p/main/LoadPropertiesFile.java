package com.shasu19p.main;

import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * In Java, we can load complete properties file like spring's
 * application.properties file using Properties class of Java.
 */
public class LoadPropertiesFile {

	private static Logger logger = Logger.getLogger(LoadPropertiesFile.class.getCanonicalName());

	public static void main(String[] args) {

		args = new String[] { "false", "custom" };

		boolean xmlFormat = Boolean.getBoolean(args[0]);
		String clusterModule = args[1];

		StringBuilder mutableFilename = new StringBuilder("./logs/catalina.out");

		try {
			InputStream is = new SearchingFileInClassContextLoader().inputStreamFromClasspath(mutableFilename);
			Properties retval = new Properties();

			if (xmlFormat) {
				retval.loadFromXML(is);
			} else {
				retval.load(is);
			}

			String customPropKey = "active-cluster-module";

			retval.setProperty(customPropKey, clusterModule);

			logger.log(Level.FINE, retval.getProperty("name"));
			// System.out.println(retval.getProperty("name"));

			logger.log(Level.FINE, (String) retval.get("address"));
			// System.out.println((String) retval.get("address"));

			logger.log(Level.FINE, retval.getProperty(customPropKey));
			// System.out.println(retval.getProperty(customPropKey));

			logger.log(Level.FINE, (String) retval.get(customPropKey));
			// System.out.println((String) retval.get(customPropKey));

		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getLocalizedMessage());
		}
	}
}
