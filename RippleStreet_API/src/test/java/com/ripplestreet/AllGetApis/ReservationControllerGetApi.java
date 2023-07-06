package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.amazonAwsUtilities;

import io.restassured.RestAssured;

public class ReservationControllerGetApi extends amazonAwsUtilities {
	@Test
	public void GetUserStatusCountbyEventId() {
		response = RestAssured.given().when().get("/community-service/v1/getStatusCount/" + eventId);
		Testcase=41;

	}

}
