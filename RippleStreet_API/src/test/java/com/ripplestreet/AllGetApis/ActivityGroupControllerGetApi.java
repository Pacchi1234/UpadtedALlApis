package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class ActivityGroupControllerGetApi extends genricUtilities {
	@Test( priority=70,alwaysRun = true,groups = { "activity-hub" })
	public void GetListofActivityGroups() {
		RestAssured.baseURI=baseURI;
		response=RestAssured.get("/activity-hub/v1/activity/group/list");
		Testcase=70;
		
	}
	@Test(priority=71,groups = "activity-hub")
	public void GetActivityGroupsByyEventId() {
		response=RestAssured.get("/activity-hub/v1/activity/group/event/"+eventId);
	
		System.out.println(eventId);
		Testcase=71;
		
	}
	@Test(priority=72,groups = "activity-hub")
	public void GetActivityGroup() {
		response=RestAssured.get("/activity-hub/v1/activity/group/"+activitygroupId);
		System.out.println(sponsorId);
		Testcase=72;
	}

}
