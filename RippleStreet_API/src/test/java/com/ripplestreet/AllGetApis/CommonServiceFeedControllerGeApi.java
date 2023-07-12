package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class CommonServiceFeedControllerGeApi extends genricUtilities {
	@Test(groups="common-service")
	public void getAllFeedsForEvents() {
		response=RestAssured.given().queryParams("pageNo",page,"size",size).get("/common-service/v1/feeds/"+eventId);
		Testcase=98;
		
	}
	

}
