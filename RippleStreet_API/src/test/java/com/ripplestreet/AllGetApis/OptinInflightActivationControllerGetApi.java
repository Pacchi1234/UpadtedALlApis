package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.amazonAwsUtilities;

import io.restassured.RestAssured;

public class OptinInflightActivationControllerGetApi  extends amazonAwsUtilities{
	@Test
	public void getListOfAllocationTransientRecordByEventId() {
		response=RestAssured.given().when().get("/community-service/v1/reward-allocation-jobs/list/"+eventId);
		Testcase=38;
		
	}
	///community-service/v1/reward-allocation-jobs/2128/9593101
	@Test
	public void getAllocationTransientRecordByEventIdAndPersonId() {
		response=RestAssured.given().when().get("/community-service/v1/reward-allocation-jobs/"+eventId+"/"+pid);
		Testcase=39;
	}

}
