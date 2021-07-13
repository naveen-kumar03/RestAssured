package com.crm.order.utils;

import java.util.Properties;

public class DataLoader {
	private final Properties properties;
	private static DataLoader dataLoader;

	private DataLoader() {
		properties = PropertyUtils.propertyLoader("src/test/resources/data.properties");
	}

	public static DataLoader getInstance() {
		if (dataLoader == null) {
			dataLoader = new DataLoader();
		}
		return dataLoader;
	}

	public String getCustomerId() {
		String prop = properties.getProperty("Customer_Id");
		if (prop != null)
			return prop;
		else
			throw new RuntimeException("Property Customer_Id is not specified in the data.properties file");
	}
}
