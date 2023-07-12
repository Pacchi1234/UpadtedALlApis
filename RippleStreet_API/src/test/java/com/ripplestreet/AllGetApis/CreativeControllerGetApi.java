package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class CreativeControllerGetApi extends genricUtilities {
	@Test(groups="event-campaign-manager")
	public void findHeroPlaylistById() {
		response = RestAssured
				.get("/event-campaign-manager/v1/creative/" + eventId + "/Event/heroPlaylist/" + playlistId);
		Testcase = 147;
	}

	@Test(groups="event-campaign-manager")
	public void findAllHeroPlaylistByModelId() {
		response = RestAssured
				.get("/event-campaign-manager/v1/creative/" + eventId + "/Event/listHeroPlaylistsByModelId");
		Testcase = 148;
	}

	@Test(groups="event-campaign-manager")
	public void getBannerByEventIdandId() {
		response = RestAssured.get("/event-campaign-manager/v1/creative/event/" + eventId + "/banner/" + bannerId);
		Testcase = 149;

	}

	@Test(groups="event-campaign-manager")
	public void getFavorByEventIdAndId() {
		response = RestAssured.get("/event-campaign-manager/v1/creative/event/" + eventId + "/favor/" + favorId);
		Testcase = 150;

	}

	@Test(groups="event-campaign-manager")
	public void finAllBannerByEventId() {
		response = RestAssured.get("/event-campaign-manager/v1/creative/event/" + eventId + "/listAllBannerByEventId");
		Testcase = 151;

	}

	@Test(groups="event-campaign-manager")
	public void FinfAllfavousByEventId() {
		response=RestAssured.get("/event-campaign-manager/v1/creative/event/"+eventId+"/listFavorsByEvent");
		Testcase=152;

	}
	@Test(groups="event-campaign-manager")
	public void FindHeroplaylistitemById() {
		response=RestAssured.get("/event-campaign-manager/v1/creative/heroPlaylistItems/"+eventId);
		Testcase=153;
		
	}
	@Test(groups="event-campaign-manager")
	public void findAllHeroPlaylistItemsByPlayListId() {
		response=RestAssured.get("/event-campaign-manager/v1/creative/listHeroPlaylistItems/"+eventId);
		Testcase=154;
		
	}
}
