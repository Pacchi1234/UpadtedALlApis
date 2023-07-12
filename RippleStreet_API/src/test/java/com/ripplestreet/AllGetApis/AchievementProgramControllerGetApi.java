package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class AchievementProgramControllerGetApi extends genricUtilities
{
	@Test(groups="benefits-platform")
	public void GetListofAchievementPrograms() {
		response=RestAssured.get("/benefits-platform/v1/achievementProgram/list");
		Testcase=62;
		
	}
	@Test(groups="benefits-platform")
	public void GetListOfAchievementProgramsforAchievementId() {
		response=RestAssured.get("/benefits-platform/v1/achievementProgram/list/"+achievementId);
		Testcase=63;
		
	}
	@Test(groups="benefits-platform")
	public void GetAchievementProgram() {
		response=RestAssured.get("/benefits-platform/v1/achievementProgram/"+AchievementProgramId);
		Testcase=64;
		
	}
	
	
	

}
