package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class ImageRecongnitionControllerGetApi extends genricUtilities {
	@Test
	public void getImageValidationResponse() {
		response = RestAssured.given().header("Authorization", AccessToken)
				.get("/activityugcreview/image_recognition/imageValidation?activityGroupId=" + activitygroupId
						+ "&activityId=" + activityId + "&eventId=" + eventId + "&fileName=" + fileName);
		Testcase = 432;
	}
}
