package com.ripplestreet.AllGetApis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class IteratorGetApi extends genricUtilities {
	@Test
	public void getAllAGamesByAllDirectionsUsingIterator() throws InterruptedException, IOException {
		List<Response> ls = new ArrayList<Response>();
		ls.add(response = RestAssured.given().queryParams("columnName", columnName, "direction", directionDESC,
				"eventI", eventId, "pageNo", page, "pageSize", size).get("/gamification/v1/games/getAllGames"));
		ls.add(response = RestAssured.given().queryParams("columnName", columnName, "direction", directionASC, "eventI",
				eventId, "pageNo", page, "pageSize", size).get("/gamification/v1/games/getAllGames"));
		for (@SuppressWarnings("unused")
		Response response : ls)
			Testcase = 191;
		genricUtilities.StatusCode();
		Testcase = 192;
	}

	@Test
	public void discoverEventsByAllEventType() throws IOException {
		List<Response> ls = new ArrayList<Response>();
		ls.add(response = RestAssured.given()
				.queryParams("page", page, "size", size, "eventType", evnetTypeUpcomingEvents)
				.get("/event/events/discover/events/list"));
		genricUtilities.StatusCode();
		Testcase = 193;
		ls.add(response = RestAssured.given().queryParams("page", page, "size", size, "eventType", eventTypeOpenEvents)
				.get("/event/events/discover/events/list"));
		genricUtilities.StatusCode();
		Testcase = 194;
		ls.add(response = RestAssured.given()
				.queryParams("page", page, "size", size, "eventType", eventTypeCurrentEvents)
				.get("/event/events/discover/events/list"));
		Testcase = 195;
		genricUtilities.StatusCode();
		ls.add(response = RestAssured.given().queryParams("page", page, "size", size, "eventType", eventTypePastEvents)
				.get("/event/events/discover/events/list"));
		genricUtilities.StatusCode();
		Testcase = 196;
		for (@SuppressWarnings("unused") Response response : ls) {

		}

	}

}
