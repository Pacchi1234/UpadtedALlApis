package com.ripplestreet.genricUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class amazonAwsUtilities {
	public String baseURI = ConfigFileReader.getInstance().getBaseURI();
	public String eventId = ConfigFileReader.getInstance().getEventId();
	public String page = ConfigFileReader.getInstance().getPage();
	public String size = ConfigFileReader.getInstance().getSize();
	public String activitiesName = ConfigFileReader.getInstance().getActivitiesName();
	public String pid = ConfigFileReader.getInstance().getPid();
	public String slug = ConfigFileReader.getInstance().getSlugValue();
	public String productId = ConfigFileReader.getInstance().getProductId();
	public String eventName = ConfigFileReader.getInstance().getByEventName();
	public String devApiPath = ConfigFileReader.getInstance().getdevApiPath();
	public String packCount = ConfigFileReader.getInstance().getpackCount();
	public static String feedItemId = ConfigFileReader.getInstance().getfeedItemId();
	public String ExcelSheetPageName = ConfigFileReader.getInstance().getExcelSheetPageName();
	public String feedType = ConfigFileReader.getInstance().getfeedType();
	public String id = ConfigFileReader.getInstance().getid();
	public String model = ConfigFileReader.getInstance().getmodel();
	public String comment = ConfigFileReader.getInstance().getcomment();
	public String ipAddress = ConfigFileReader.getInstance().getipAddress();
	public String amazoneURI = ConfigFileReader.getInstance().getAmazonBaseURL();
	

	public Response response;
	public int Testcase;

	@BeforeMethod
	public void BaseURI() {

		RestAssured.baseURI = baseURI;
	}

	@AfterMethod
	public void StatusCode() throws IOException {
		int statusCode = 200;
		Assert.assertEquals(200, statusCode);
		response.then().statusCode(200);
		String ActualOutput = response.asString();
		System.out.println(ActualOutput);
		

		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		String ExpectedOutput = workbook.getSheet(ExcelSheetPageName).getRow(Testcase).getCell(2).getStringCellValue();
		System.out.println(ExpectedOutput);
		if (ExpectedOutput.equals(ActualOutput)) {
			System.err.println("TestCase" + " " + Testcase + " " + "has been passed");

		} else {
			System.err.println("TestCase" + " " + Testcase + " " + "Expected and actual output is Mismatching");
		}

		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName);
		XSSFRow row = sheet.getRow(Testcase);
		XSSFCell cell = row.getCell(3);
		cell.setCellValue(ActualOutput);
		FileOutputStream fio = new FileOutputStream(file);
		workbook.write(fio);

	}

}
