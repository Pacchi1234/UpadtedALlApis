package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class ActivityControllerGetApi extends genricUtilities {
	// https://devapi-ecs.ripplestreet.com/activity-hub/v1/activity/list
	@Test(groups = "activity-hub")
	public void getListOfActivities() {
		response = RestAssured.get("https://devapi-ecs.ripplestreet.com/activity-hub/v1/activity/list");
		Testcase = 68;

	}

	@Test(groups = "activity-hub")
	public void getActivity() {
		response = RestAssured.get("/activity-hub/v1/activity/" + activityId);
		Testcase = 69;
	}

}
