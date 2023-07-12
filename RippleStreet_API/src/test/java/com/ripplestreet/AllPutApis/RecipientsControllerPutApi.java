package com.ripplestreet.AllPutApis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.putApiUtilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class RecipientsControllerPutApi extends putApiUtilities {
	@Test
	public void deleteRecipientsByCampaignId() throws Throwable {
		Testcase=40;
		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName2);
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(2);
		PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);

		response = RestAssured.given().queryParams("isSuppressed",isSuppressed,"notificationId",putNotificationId).contentType(ContentType.JSON).body(PutBody).when()
				.put("/notification/v1/recipients/deleteRecipientsByCampaignId");
			
		}
		
	}


