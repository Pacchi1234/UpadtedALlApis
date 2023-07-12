package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class DiscussionControllerGetApi extends  genricUtilities {
	//https://devapi-ecs.ripplestreet.com/activityugcreview/v1/discussions/getDiscussionListByFilters?eventId=2128&pageNo=1&pageSize=10
	@Test(groups = "event")
	public void getDiscussionListByFilters() {
		response=RestAssured.given().queryParams("pageNo", page, "pageSize",size).when().get("https://devapi-ecs.ripplestreet.com/activityugcreview/v1/discussions/getDiscussionListByFilters?eventId="+eventId);
		Testcase=55;
		
	}
	@Test(groups = "event")
	public void getDiscussion() {
		response=RestAssured.given().when().get("/activityugcreview/v1/discussions/"+discussion_id);
		Testcase=56;
		
	}

}
