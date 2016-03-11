package fiu.cis.kdrg.conf;

import java.net.*;
import java.util.*;

import java.io.*;

public class Environment {

	private static String API_DATA_HOME = null;
	private static String LOCAL_DATA_HOME = "U:\\qwang\\labworkspace\\java\\search\\conf";

	public static Properties getProperties() {
//		API_DATA_HOME = System.getenv("API_DATA_HOME");
//		String propertyFile = API_DATA_HOME + File.separator + "conf" + File.separator + "data.properties";
		String propertyFile = LOCAL_DATA_HOME + File.separator + "data.properties";
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(propertyFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
}
