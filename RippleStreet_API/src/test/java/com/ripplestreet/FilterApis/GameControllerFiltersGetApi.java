package com.ripplestreet.FilterApis;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class GameControllerFiltersGetApi extends genricUtilities {

	@SuppressWarnings("unchecked")
	@Test(groups = "gamification")
	public void getAllgames() throws IOException {
		Testcase = 370;	map1.put("name", gameName);
		map1.put("goalCount", goalCount);
		map1.put("isActive", isActive);
		map1.put("eventId", eventId);
		map1.put("gameId", gameId);
	
		ArrayList<String> key = new ArrayList<String>(map1.keySet());
		for (int i = 0; i < map1.size(); i++) {
			String keys = key.get(i);
			Object Value = map1.get(keys);
			response = RestAssured.given().params(keys, Value).get("/gamification/v1/games/getAllGames");
			genricUtilities.StatusCode();
			Testcase++;

		}

	}

}
