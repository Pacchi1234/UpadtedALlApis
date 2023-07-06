package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;
import java.io.*;

public class EventControllerGetApi extends genricUtilities{

	@Test(groups = "eventController")
	public void getAllCurrentMileStoneByEvent() throws IOException {
		response = RestAssured.given().when().get("/event/events/getAllCurrentMileStonesByEvent/" + eventId);
		Testcase = 1;
		//SheetName = "EventController";
	}

	@Test( groups = "eventController")
	public void getAllEvents() {
		response = RestAssured.given().param("eventId", eventId).param("page", page).param("size", size).when()
				.get("/event/events/getAllEvents/_search");
		Testcase = 2;

	}

	@Test( groups = "eventController")
	public void getAllMileStonesByEvent() {
		response = RestAssured.given().when().get("/event/events/getAllMilestonesByEvent/" + eventId);
		Testcase = 3;
	}

	@Test( groups = "eventController")
	public void getAllProductByEvents() {
		response = RestAssured.given().when().get("/event/events/getAllProductsByEvent/" + eventId);
		Testcase = 4;
	}

	@Test(priority = 5, groups = "eventController")
	public void getAllServices() {
		response = RestAssured.given().when().get("/event/events/getAllServices");
		Testcase = 5;
	}

	@Test(priority = 6, groups = "eventController")
	public void getAllSubscriptionsByEvent() {
		response = RestAssured.given().when().get("/event/events/getAllSubscriptionsByEvent/" + eventId);
		Testcase = 6;

	}

	@Test( groups = "eventController")
	public void getAllSubscriptionsByServiceName() {
		response = RestAssured.given().when().get("/event/events/getAllSubscriptionsByServiceName/" + activitiesName);
		Testcase = 7;
	}

	@Test( groups = "eventController")
	public void getEventById() {
		response = RestAssured.given().when()
				.get("https://devapi-ecs.ripplestreet.com/event/events/getEventById/" + eventId);
		Testcase = 8;

	}

	@Test(priority = 9, groups = "eventController")
	public void getEventDetailBySlug() {
		response = RestAssured.given().when().get("/event/events/getEventDetailBySlug/" + slug);
		Testcase = 9;

	}

	@Test(priority = 10, groups = "eventController")
	public void getProductDetailEventIdAndProductId() {
		response = RestAssured.given().when().param("eventId", eventId).param("productId", productId)
				.get("/event/events/getProductDetailEventIdAndProductId");
		Testcase = 10;

	}

	@Test(priority = 11, groups = "eventController")
	public void getpackAndApplicationCountByEventId() {
		response = RestAssured.given().when().get("/event/events/packAndApplicationCountByEventId/" + eventId);
		Testcase = 11;

	}

	@Test(priority = 12, groups = "eventController")
	public void getByEventName() {
		response = RestAssured.given().when().get("/event/events/getByEventName/" + eventName);
		Testcase = 12;

	}

	@Test(priority = 13, groups = "eventController")
	public void getCurrentMileStonesByEvent() {
		response = RestAssured.given().when().get("/event/events/getCurrentMilestoneByEvent/" + eventId);
		Testcase = 13;

	}

	// https://devapi-ecs.ripplestreet.com/event/events/getEventDetail/2128/9593101

	@Test(priority = 14, groups = "eventController", enabled = false)
	public void getEventDetailForWorkFlow() {
		response = RestAssured.given().when().get("/event/events/getEventDetail/2128/9593101");

	}

}
