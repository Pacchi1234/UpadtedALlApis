package com.ripplestreet.FilterApis;

import java.io.IOException;
import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class FeedControllerFiltersGetApi extends genricUtilities {
	@Test(groups = "common-service")
	public void getAllfeedForEvents() throws NumberFormatException, IOException {
		Testcase = 376;
		for (String feedControllerType : FeedTypes) {
			response = RestAssured.get("/common-service/v1/feeds/" + eventId + "?pageNo=" + page + "&size=" + size
					+ "&types=" + feedControllerType);
			System.out.println(feedControllerType);
			genricUtilities.StatusCode();
			Testcase++;
		}
		
	}
	@Test
	public void feed() throws NumberFormatException, IOException {
		Testcase=422;
		for(String booleans : booleanValues) {
			response=RestAssured.get("/common-service/v1/feeds/1485?featured="+booleans+"&pageNo="+page+"&size="+size);
			genricUtilities.StatusCode();
			Testcase++;
		}
	}
}
