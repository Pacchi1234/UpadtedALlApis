package com.ripplestreet.genricUtilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath = "src//test//resources//config//Config.properties";
	private static ConfigFileReader configFileReader = new ConfigFileReader();

	private ConfigFileReader() {
		try {
			FileReader reader = new FileReader(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}

	}

	public static ConfigFileReader getInstance() {
		return configFileReader;
	}

	public String getBaseURI() {
		String baseURI = properties.getProperty("BaseURI");
		if (baseURI != null)
			return baseURI;
		else
			throw new RuntimeException("baseURI is not specified in the Configuration.properties file.");
	}

	public String getEventId() {
		String eventID = properties.getProperty("eventId");
		if (eventID != null)
			return eventID;
		else
			throw new RuntimeException("eventID is not specified in the Configuration.properties file.");
	}

	public String getPage() {
		String page = properties.getProperty("page");
		if (page != null)
			return page;
		else
			throw new RuntimeException("page is not specified in the Configuration.properties file");
	}

	public String getSize() {
		String size = properties.getProperty("size");
		if (size != null)
			return size;
		else
			throw new RuntimeException("size is not specified in the Configuration.properties file");

	}

	public String getActivitiesName() {
		String activitiesName = properties.getProperty("activitiesName");
		if (activitiesName != null)
			return activitiesName;
		else
			throw new RuntimeException("activitiesName is not specified in the Configuration.properties file");
	}

	public String getPid() {
		String pid = properties.getProperty("pid");
		if (pid != null)
			return pid;
		else
			throw new RuntimeException("pid is not specified in the configuration.properties file");
	}

	public String getSlugValue() {
		String slug = properties.getProperty("slug");
		if (slug != null)
			return slug;
		else
			throw new RuntimeException("slug is not specified in the configuration.properies file");

	}

	public String getProductId() {
		String productId = properties.getProperty("productId");
		if (productId != null)
			return productId;
		else
			throw new RuntimeException("productId is not specified in the configuration.properties file");
	}

	public String getByEventName() {
		String eventName = properties.getProperty("eventName");
		if (eventName != null)
			return eventName;
		else
			throw new RuntimeException("eventName is not apecified in the configuration.properties file");
	}

	public String getdevApiPath() {
		String devApiPath = properties.getProperty("devApiPath");
		if (devApiPath != null)
			return devApiPath;
		else
			throw new RuntimeException("devApipath is not specified in the configuration.properties file");
	}

	public String getpackCount() {
		String packCount = properties.getProperty("packCount");
		if (packCount != null)
			return packCount;
		else
			throw new RuntimeException("packCount is not specified in the congifiguration.properties file");
	}

	public String getfeedItemId() {
		String feedItemId = properties.getProperty("feedItemId");
		if (feedItemId != null)
			return feedItemId;
		else
			throw new RuntimeException("feedIteamId is not specified in the configuration.properties file");

	}

	public String getExcelSheetPageName() {
		String ExcelSheetPageName = properties.getProperty("ExcelSheetPageName");
		if (ExcelSheetPageName != null)
			return ExcelSheetPageName;
		else
			throw new RuntimeException("ExcelSheetPageName is not specified in the properties file");
	}

	public String getfeedType() {
		String feedType = properties.getProperty("feedType");
		if (feedType != null)
			return feedType;
		else
			throw new RuntimeException("feedType is not mentioned in the Configuration.properties file");
	}

	public String getid() {
		String id = properties.getProperty("id");
		if (id != null)
			return id;
		else
			throw new RuntimeException("id is not mentioned in the Configuration.properties file");
	}

	public String getmodel() {
		String model = properties.getProperty("model");
		if (model != null)
			return model;
		else
			throw new RuntimeException("model is not mentioned int the configuration.properties file");
	}

	public String getcomment() {
		String comment = properties.getProperty("comment");
		if (comment != null)
			return comment;
		else
			throw new RuntimeException("comment is not mentioned in the configuration.properties file");
	}

	public String getipAddress() {
		String ipAddress = properties.getProperty("comment");
		if (ipAddress != null)
			return ipAddress;
		else
			throw new RuntimeException("ipAddress is not mentioned in the Configuration.properties file");
	}
	public String getAmazonBaseURL() {
		String amazoneURI=properties.getProperty("amazoneURI");
		if(amazoneURI!=null)
			return amazoneURI;
		else
			throw new RuntimeException("amazoneURI is not mentioned in the Configuration.properties file");
	}
}
