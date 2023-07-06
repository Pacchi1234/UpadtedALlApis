package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.amazonAwsUtilities;

import io.restassured.RestAssured;

public class AudiencePromotionControllerGetApi extends amazonAwsUtilities {
	@Test
	public void getListOfAudiencePromotionJobsByEventId() {
		response=RestAssured.given().when().get("/community-service/v1/audience-promotion-jobs/list/"+eventId);
		Testcase=21;
	}
	@Test
	public void getListOfInviteOnlyUsersByEventId() {
		response=RestAssured.given().when().get("/community-service/v1/inviteOnlyUsers/list/"+eventId);
		Testcase=22;
	}

}
