package com.ripplestreet.EventFeedController;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class EventControllerPutAndPostApi extends  genricUtilities{
	JSONObject json = new JSONObject();

	@Test
	public void likeUnlikeEvent() {
		json.put("eventId", eventId);
		json.put("personId", pid);
		response = RestAssured.given().header("Content-Type", "application/json").contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(json.toJSONString()).when().put("/event/events/likeUnlikeEvent");
		// Testcase=14;//getNumericCellvalue
	}

	@Test
	public void updateEventPacksCount() {
		json.put("eventId", eventId);
		json.put("packCount", packCount);
		response = RestAssured.given().header("Content-Type", "application/json").contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(json.toJSONString()).when().put("/event/events/updateEventPackCount");
		
	}

	// POST Operation
	@Test
	public void getAllEventsByIds() {
		json.put("eventId", eventId);
		response = RestAssured.given().contentType("application/json").body(json).when()
				.post("/event/events/getAllEventsByIds");;

	}

}
