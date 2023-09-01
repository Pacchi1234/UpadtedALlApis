package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class FeedControllerGetApi extends genricUtilities {
	@Test(groups="common-service")
	public void getAllFeedsForEvent() {
		response=RestAssured.get("/common-service/v1/feeds/"+eventId+"?pageNo="+page+"&size="+size);
		System.out.println(eventId);
		Testcase=421;
		
	}

}
