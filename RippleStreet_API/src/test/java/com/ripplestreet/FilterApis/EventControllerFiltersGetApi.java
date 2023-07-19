package com.ripplestreet.FilterApis;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class EventControllerFiltersGetApi extends genricUtilities {

	@SuppressWarnings("unchecked")
	@Test
	public void DiscoverEventFilters() throws NumberFormatException, IOException {
		ls.add(evnetTypeUpcomingEvents);
		ls.add(eventTypeOpenEvents);
		ls.add(eventTypeCurrentEvents);
		ls.add(eventTypePastEvents);

		Testcase = 252;
		for (int i = 0; i < ls.size(); i++) {

			response = RestAssured.given().queryParams("page", page, "size", size, "eventType", ls.get(i))
					.get("/event/events/discover/events/list");

			genricUtilities.StatusCode();
			Testcase = Testcase + 1;
		}
	}

	@SuppressWarnings("unchecked")
	@Test
	public void geFilterdEvent() throws NumberFormatException, IOException {
		Testcase = 257;
		map1.put("eventId", eventId);
		map1.put("eventName", eventName);
		map1.put("slug", slug);
		map1.put("sponsorId", sponsorId);
		System.out.println(map1);
		String s = map1.toString();
		ArrayList<String> keys = new ArrayList<>(map1.keySet());
		for (int i = 0; i < map1.size() - 1; i++) {
			String key = keys.get(i);
			Object value = map1.get(key);
			response = RestAssured.given().queryParam(key, value).get("/event/events/getAllEvents/_search");
			genricUtilities.StatusCode();
			Testcase = Testcase + 1;
		}
	}

	@SuppressWarnings("unchecked")
	@Test
	public void filterEvnts () throws IOException {
		Testcase = 259;
		map1.put("eventId", eventId);
		map1.put("sponsorId", sponsorId);
		map1.put("slug", slug);
		map1.put("eventName", eventName);

		map2.put("eventId", eventId);
		map2.put("eventName", eventName);
		map2.put("slug", slug);
		map2.put("sponsorId", sponsorId);

		map3.put("isActive", true);
		map3.put("isActive", false);
		map3.put("isChatterBox", true);
		map3.put("isChatterBox", false);
		map3.put("isFeatured", true);
		map3.put("isFeatured", false);
		map3.put("isListed", true);
		map3.put("isListed", false);

		ArrayList<String> keys = new ArrayList<>(map1.keySet());
		for (int i = 0; i < map1.size(); i++) {
			String key = keys.get(i);
			Object value = map1.get(key);
			ArrayList<String> keys1 = new ArrayList<>(map2.keySet());
			for (int j = 0; j < map2.size(); j++) {
				String keys2 = keys1.get(j);
				Object value1 = map2.get(keys2);
				ArrayList<String> keys3 = new ArrayList<>(map3.keySet());
				for (int k = 0; k < map3.size(); k++) {
					String keys4 = keys3.get(k);
				Object value2 =  map3.get(keys4);
					response = RestAssured.given().param(key, value).param(keys2, value1).param(keys4, value2)
							.get("/event/events/getAllEvents/_search");
					genricUtilities.StatusCode();
					Testcase = Testcase + 1;
				}
			}
		}
	}
}
