package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class DiscussionControllerGetApi extends  genricUtilities {
	@Test(priority=55,groups = "activityugcreview")
	public void getDiscussionListByFilters() {
		RestAssured.baseURI=baseURI;
		response=RestAssured.given().queryParams("pageNo", page, "pageSize",size).when().get("/activityugcreview/v1/discussions/getDiscussionListByFilters?eventId="+eventId);
		Testcase=55;
		
	}
	@Test(priority=56,groups = "activityugcreview")
	public void getDiscussion() {
		response=RestAssured.given().when().get("/activityugcreview/v1/discussions/"+discussion_id);
		System.out.println(discussion_id);
		Testcase=56;
		
	}

}
