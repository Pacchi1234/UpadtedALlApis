package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;
import java.io.*;

public class EventControllerGetApi extends genricUtilities {

	@Test(groups = "event")
	public void getAllCurrentMileStoneByEvent() throws IOException {
		RestAssured.baseURI=baseURI;
		response = RestAssured.given().when().get("/event/events/getAllCurrentMileStonesByEvent/" + eventId);
		Testcase = 1;
	}

	@Test(groups = "event")
	public void getAllEvents() {
		response = RestAssured.given().param("eventId", eventId).param("page", page).param("size", size).when()
				.get("/event/events/getAllEvents/_search");
		Testcase = 2;

	}

	@Test(groups = "event")
	public void getAllMileStonesByEvent() {
		response = RestAssured.given().when().get("/event/events/getAllMilestonesByEvent/" + eventId);
		Testcase = 3;
	}

	@Test(groups = "event")
	public void getAllProductByEvents() {
		response = RestAssured.given().when().get("/event/events/getAllProductsByEvent/" + eventId);
		Testcase = 4;
	}

	@Test(priority = 5, groups = "event")
	public void getAllServices() {
		response = RestAssured.given().when().get("/event/events/getAllServices");
		Testcase = 5;
	}

	@Test(priority = 6, groups = "event")
	public void getAllSubscriptionsByEvent() {
		response = RestAssured.given().when().get("/event/events/getAllSubscriptionsByEvent/" + eventId);
		Testcase = 6;

	}

	@Test(groups = "event")
	public void getAllSubscriptionsByServiceName() {
		response = RestAssured.given().when().get("/event/events/getAllSubscriptionsByServiceName/" + activitiesName);
		Testcase = 7;
	}

	@Test(groups = "event")
	public void getEventById() {
		response = RestAssured.given().when()
				.get("https://devapi-ecs.ripplestreet.com/event/events/getEventById/" + eventId);
		Testcase = 8;

	}

	@Test(priority = 9, groups = "event")
	public void getEventDetailBySlug() {
		response = RestAssured.given().when().get("/event/events/getEventDetailBySlug/" + slug);
		Testcase = 9;

	}

	@Test(priority = 10, groups = "event")
	public void getProductDetailEventIdAndProductId() {
		response = RestAssured.given().when().param("eventId", eventId).param("productId", productId)
				.get("/event/events/getProductDetailEventIdAndProductId");
		Testcase = 10;

	}

	@Test(priority = 11, groups = "event")
	public void getpackAndApplicationCountByEventId() {
		response = RestAssured.given().when().get("/event/events/packAndApplicationCountByEventId/" + eventId);
		Testcase = 11;

	}

	@Test(priority = 12, groups = "event")
	public void getByEventName() {
		response = RestAssured.given().when().get("/event/events/getByEventName/" + eventName);
		Testcase = 12;

	}

	@Test(priority = 13, groups = "event")
	public void getCurrentMileStonesByEvent() {
		response = RestAssured.given().when().get("/event/events/getCurrentMilestoneByEvent/" + eventId);
		Testcase = 13;

	}

	@Test(priority = 14, groups = "event")
	public void getEventDetailForWorkFlow() {
		response = RestAssured.given().when().get("/event/events/getEventDetail/" + eventId + "/" + pid);
		Testcase = 188;

	}

	@Test
	public void getFilteredEvents() {
		response = RestAssured.given().queryParams("eventId", eventId, "page", page, "size", size)
				.get("/event/events/getAllEvents/_search");
		Testcase = 189;
	}

	@Test
	public void getEventMileStoneByIdAndDate() {

		response = RestAssured.given().queryParams("eventId", eventId, "created", eventCreatedDate)
				.get("/event/events/getEventMileStoneByIdAndDate");
		Testcase=190;

	}

}
