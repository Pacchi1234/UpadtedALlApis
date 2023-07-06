package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.amazonAwsUtilities;

import io.restassured.RestAssured;

public class userFamilyControllerGetApi extends amazonAwsUtilities {
	@Test
	public void getUserChildern() {
		response=RestAssured.given().when().get("/community-service/v1/userFamily/children/9593101"+pid);
		Testcase=42;
	}//this get request is not working
	@Test
	public void getAllPetTypes() {
		response=RestAssured.given().when().get("/community-service/v1/userFamily/petType/list");
		Testcase=43;
		
	}
	@Test
	public void getAllPetsForUser() {
		response=RestAssured.given().when().get("/community-service/v1/userFamily/pets/"+pid);
		Testcase=44;
		
	}

}
