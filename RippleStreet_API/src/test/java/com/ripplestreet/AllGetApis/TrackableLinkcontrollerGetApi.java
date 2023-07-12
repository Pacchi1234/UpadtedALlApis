package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class TrackableLinkcontrollerGetApi extends genricUtilities {
	@Test(groups="event-campaign-manager")
	public void findAllLinksForAnEvent() {
		response = RestAssured.given().queryParams("pagNo", page, "pageSize", size)
				.get("/event-campaign-manager/v1/event/" + eventId + "/link/list");
		Testcase = 183;

	}

	@Test(groups="event-campaign-manager")
	public void getLinkById() {
		response = RestAssured.get("/event-campaign-manager/v1/link/" + linkId);
		Testcase = 184;
	}


	
}
