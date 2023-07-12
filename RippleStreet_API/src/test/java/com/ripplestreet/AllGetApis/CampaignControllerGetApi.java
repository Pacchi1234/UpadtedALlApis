package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class CampaignControllerGetApi extends genricUtilities {
	@Test(groups="event-campaign-manager")
	public void findCampaignById() {
		RestAssured.baseURI = baseURI;
		response = RestAssured.get("/event-campaign-manager/v1/campaign/" + campaignId);
		Testcase = 144;
	}
	@Test(groups="event-campaign-manager")
	public void findAllCampaingn() {
		response=RestAssured.given().queryParams("pageNo", page, "pageSize",size).get("/event-campaign-manager/v1/campaign/list");
		Testcase=145;
	}
}
