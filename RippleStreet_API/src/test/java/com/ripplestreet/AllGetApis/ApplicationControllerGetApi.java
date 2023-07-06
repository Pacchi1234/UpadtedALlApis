package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.amazonAwsUtilities;
import io.restassured.RestAssured;

public class ApplicationControllerGetApi extends amazonAwsUtilities {
	@Test
	public void getAllApplications() {
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size).when()
				.get("/community-service/v1/event/" + eventId + "/application/list");
		Testcase=19;
	}
}
