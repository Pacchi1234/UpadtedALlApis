package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.amazonAwsUtilities;

import io.restassured.RestAssured;

public class EnrollmentControllerGetApi extends amazonAwsUtilities {
	@Test
	public void EnrollmentList() {
		response=RestAssured.given().when().get("/community-service/enrollment/list");
		Testcase=32;
	}
	@Test
	public void GetUserEnrollments() {
		response=RestAssured.given().when().get("/community-service/enrollments/"+pid);
		Testcase=33;
		
	}

}
