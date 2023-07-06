package com.ripplestreet.EventFeedController;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class EventFeedControllerPutAndPostApi extends genricUtilities {
	JSONObject json = new JSONObject();

	@Test
	public void LikeAFeedById() {
		json.put("feedType", feedType);
		json.put("id", id);
		json.put("personId", pid);
		response = RestAssured.given().header("Content-Type", "application/json").contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(json.toJSONString()).when().put("/event/events-feed/likeFeed");
		Testcase=1;
	}

	@Test
	public void getFeedComments() {
		json.put("eventId", eventId);
		json.put("model", model);
		json.put("id", id);
		json.put("userId", pid);
		response = RestAssured.given().contentType("application/json").body(json).when()
				.post("/event/events-feed/feed/comments");

	}

	@Test
	public void getIfFeedAreReportedAndLikedByUserId() {
		json.put("eventId", eventId);
		json.put("personId", pid);
		response = RestAssured.given().contentType("application/json").body(json).when()
				.post("/event/events-feed/feedIfReportedAndLiked/{feedType}?feedType=Discussion");
	}
	//https://devapi-ecs.ripplestreet.com/event/events-feed/reportFeed
	@Test
	public void reportFeedById() {
		json.put("comment", comment);
		json.put("feedType", feedType);
		json.put("id", id);
		json.put("ipAddress", ipAddress);
		json.put("personId", pid);
		response = RestAssured.given().contentType("application/json").body(json).when()
				.post("/event/events-feed/reportFeed");
	}

}
