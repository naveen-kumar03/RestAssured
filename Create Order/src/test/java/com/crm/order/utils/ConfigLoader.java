package com.crm.order.utils;

import java.util.Properties;

public class ConfigLoader {
	private final Properties properties;
	private static ConfigLoader configLoader;

	private ConfigLoader() {
		properties = PropertyUtils.propertyLoader("src/test/resources/config.properties");
	}

	public static ConfigLoader getInstance() {
		if (configLoader == null) {
			configLoader = new ConfigLoader();
		}
		return configLoader;
	}

	public String Application_Id() {
		String prop = properties.getProperty("Application_Id");
		if (prop != null)
			return prop;
		else
			throw new RuntimeException("Property Application_Id is not specified in the config.properties file");
	}

	public String Security_Token_Test() {
		String prop = properties.getProperty("Security_Token_Test");
		if (prop != null)
			return prop;
		else
			throw new RuntimeException("Property Security_Token_Test is not specified in the config.properties file");
	}

	public String Security_Token_Uat() {
		String prop = properties.getProperty("Security_Token_Uat");
		if (prop != null)
			return prop;
		else
			throw new RuntimeException("Property Security_Token_Uat is not specified in the config.properties file");
	}

	public String Content_Type() {
		String prop = properties.getProperty("Content_Type");
		if (prop != null)
			return prop;
		else
			throw new RuntimeException("Property Content_Type is not specified in the config.properties file");
	}

}
