package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class TaskControllerGetApi  extends genricUtilities{
	@Test(groups="activity-hub")
	public void getListOfTasks() {
		response=RestAssured.get("/activity-hub/v1/task/list");
		Testcase=73;
	}
	@Test(groups="activity-hub")
	public void getTask() {
		response=RestAssured.get("/activity-hub/v1/task/"+taskId);
		Testcase=74;
	}

	

}
