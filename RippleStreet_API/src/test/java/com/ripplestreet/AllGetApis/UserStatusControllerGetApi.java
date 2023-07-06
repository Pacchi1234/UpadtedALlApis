package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.amazonAwsUtilities;

import io.restassured.RestAssured;

public class UserStatusControllerGetApi extends amazonAwsUtilities{
	@Test
	public void GetUserAndEventDataByEventIdandPersonId() {
		response=RestAssured.given().when().get("/community-service/v1/getUserAndEventData?eventId="+eventId+"&pid="+pid);
		Testcase=45;
		
	}
	public void GetUserStatusActionbyEventIdandPersonId() {
		//response=RestAssured.given().when().
		//here Authorization is required
	}

}
