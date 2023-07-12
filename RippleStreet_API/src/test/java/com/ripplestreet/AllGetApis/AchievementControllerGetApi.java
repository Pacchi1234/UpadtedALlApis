package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class AchievementControllerGetApi extends genricUtilities{
	
	@Test(groups="benefits-platform")
	public void GetListofAchievements() {
		RestAssured.baseURI=baseURI;
		response=RestAssured.get("/benefits-platform/v1/achievement/list");
		Testcase=59;
		
	}
	@Test(groups="benefits-platform")
	public void getAchivements() {
		response=RestAssured.get("/benefits-platform/v1/achievement/"+achievementId);
		Testcase=60;
	}
	@Test(groups="benefits-platform")
	public void GetListofAchievementsforTriggerId() {
		response=RestAssured.get("/benefits-platform/v1/achievement/list/"+triggerId);
		Testcase=61;
	}
}
