package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.amazonAwsUtilities;
import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class CommunityControllerGetApi extends genricUtilities {
	@Test(groups="community-service")
	public void getAllAddressEntriesByPersonId() {
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size).when()
				.get("/community-service/community/getAllAddressEntriesByPersonId/" + pid);
		Testcase=23;
	}

	@Test(groups="community-service")
	public void getAllEventsByUserAndParticipantType() {
		response = RestAssured.given().when()
				.get("/community-service/community/getAllEventsByUserAndParticipantType/" + pid + "/Host");
		Testcase=24;
	}

	@Test(groups="community-service")
	public void getAllUsersByEventAndParticipantType() {
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size).when()
				.get("/community-service/community/getAllUsersByEventAndParticipantType/" + eventId + "/Host");
		Testcase=25;

	}

	@Test(groups="community-service")
	public void GettingDetailOfHeadHostByPersonId() {
		response = RestAssured.given().when().get("/community-service/community/getHeadShotByPersonId?personId=" + pid);
		Testcase=26;

	}

	@Test(groups="community-service")
	public void getUserEventParticipationBit() {
		response = RestAssured.given().queryParams( "userId", pid, "eventId", eventId).when()
				.get("/community-service/community/getUserEventParticipationBit");
		Testcase=27;

	}

	@Test(groups="community-service")
	public void getUserListByFilters() {
		response = RestAssured.given().queryParams("personId",pid, "pageNo", page, "pageSize", size).when()
				.get("/community-service/community/getUserListByFilters?personIds");
		Testcase=28;
	}
	@Test(groups="community-service")
	public void getUserParticipationBits() {
		response = RestAssured.given().queryParams( "userId", pid, "eventId", eventId).when()
				.get("/community-service/community/getUserParticipationBits");
		Testcase=29;
		
		
	}
	@Test(groups="community-service")
	public void getUserProfile() {
		response = RestAssured.given().when()
				.get("/community-service/community/userProfile/"+pid);
		Testcase=30;
		
	}
	@Test(groups="community-service")
	public void getUserDetails() {
		response = RestAssured.given().when()
				.get("/community-service/community/users/"+eventId+"?eventInfo=true");
		Testcase=31;
		
	}

}
