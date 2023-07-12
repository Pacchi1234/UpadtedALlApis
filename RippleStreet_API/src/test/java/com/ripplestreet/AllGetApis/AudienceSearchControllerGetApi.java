package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class AudienceSearchControllerGetApi extends genricUtilities {

	@Test(groups="segmentation")
	public void searchableFields() {
		response = RestAssured.get("/segmentation/v1/audience/searchableFields");
		Testcase = 76;

	}

}
