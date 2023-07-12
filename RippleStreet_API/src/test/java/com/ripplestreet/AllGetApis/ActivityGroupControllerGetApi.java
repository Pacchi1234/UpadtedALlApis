package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class ActivityGroupControllerGetApi extends genricUtilities {
	@Test( alwaysRun = true,groups = { "activity-hub" })
	public void GetListofActivityGroups() {
		response=RestAssured.get("/activity-hub/v1/activity/group/list");
		Testcase=70;
		
	}
	@Test(groups = "activity-hub")
	public void GetActivityGroupsByyEventId() {
		response=RestAssured.get("/activity-hub/v1/activity/group/event/"+eventId);
		Testcase=71;
		
	}
	//https://devapi-ecs.ripplestreet.com/activity-hub/v1/activity/group/cb50dabc-953c-4a0e-b45d-7083ea07f8b8
	@Test(groups = "activity-hub")
	public void GetActivityGroup() {
		response=RestAssured.get("/activity-hub/v1/activity/group/event/"+activitygroupId);
		Testcase=72;
	}

}
