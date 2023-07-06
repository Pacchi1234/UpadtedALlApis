package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.amazonAwsUtilities;

import io.restassured.RestAssured;

public class AudienceControllerGetApi extends amazonAwsUtilities {
	@Test
	public void getParticipantsWithApplicationsForEvent() {
		response=RestAssured.given().queryParams("pageNo", page, "pageSize", size).when().get("/community-service/v1/event/participant/list?"+eventId+"&participantType=All");
		Testcase=20;
		
	}

}
