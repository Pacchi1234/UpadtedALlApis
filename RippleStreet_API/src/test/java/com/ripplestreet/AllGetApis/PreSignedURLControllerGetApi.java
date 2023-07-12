package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class PreSignedURLControllerGetApi extends genricUtilities {
	@Test(groups="notification")
	public void getAllFilesBynotificationId() {
		response = RestAssured.get("/notification/urls/getAllFilesByNotificationId/" + notificationId);
		Testcase = 133;

	}

}
