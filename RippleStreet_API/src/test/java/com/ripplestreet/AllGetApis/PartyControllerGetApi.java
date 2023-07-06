package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.amazonAwsUtilities;

import io.restassured.RestAssured;

public class PartyControllerGetApi extends amazonAwsUtilities {
	/// community-service/v1/event/{eventId}/party/list?eventId=2128&pageNo=1&pageSize=10
	@Test
	public void getlistofparties() {
		response = RestAssured.given().queryParam("pageNo", page, "pageSize", size).when()
				.get("/community-service/v1/event/{eventId}/party/list?eventId=2128&pageNo=1&pageSize=10");
		Testcase = 40;

	}
	
}
