package com.ripplestreet.AllPutApis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.units.qual.K;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.putApiUtilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class EventFeedControllerPutApi extends putApiUtilities {

	@Test(groups="event")
	public void likeAfeedById() throws InterruptedException, IOException, ParseException {

		try {
			Testcase=4;
			
			File file = new File(devApiPath);
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName2);
			XSSFRow row2 = sheet.getRow(Testcase);
			XSSFCell cell2 = row2.getCell(2);
			PutBody = cell2.getStringCellValue();
			//System.out.println(PutBody);
			
			


		
			response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when()
					.put("/event/events-feed/likeFeed");

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
