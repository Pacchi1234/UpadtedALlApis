package com.ripplestreet.FilterApis;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class SearchControllerFiltersGetApi extends genricUtilities {
	@Test(groups = "common-service")
	public void getSearchByEntity() throws NumberFormatException, IOException {
		Testcase=420;
		for(String EntityName:entityName) {
			response=RestAssured.get("/common-service/v1/search/"+EntityName);
			genricUtilities.StatusCode();
			System.out.println(EntityName);
			Testcase++;
		}

	}

}
