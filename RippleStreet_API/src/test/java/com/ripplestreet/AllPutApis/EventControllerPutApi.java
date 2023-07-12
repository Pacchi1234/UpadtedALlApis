package com.ripplestreet.AllPutApis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.putApiUtilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class EventControllerPutApi extends putApiUtilities {
	@Test(groups = "event")
	public void updateComment() throws IOException {
		RestAssured.baseURI = baseURI;
		Testcase = 1;
		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName2);
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(2);
		double PutBody = cell2.getNumericCellValue();
		System.out.println(PutBody);
		response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when()
				.put("/event/event/" + eventId + "/updateComment?body=" + updateCommentbody);

	}

	@Test(groups = "event")
	public void updateEventPacksCount() throws IOException {
		Testcase = 2;
		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName2);

		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(2);
		String PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);

		response = RestAssured.given().header("Content-Type", "application/json").contentType(ContentType.JSON)
				.body(PutBody).when().put("/event/events/updateEventPackCount");

	}

	@Test(groups = "event")
	public void updateEventSubscriptions() throws IOException {
		Testcase = 3;
		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName2);

		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(2);
		String PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);

		response = RestAssured.given().contentType(ContentType.JSON).accept(ContentType.JSON).body(PutBody).when()
				.put("/event/events/updateEventSubscriptions");

	}

}
