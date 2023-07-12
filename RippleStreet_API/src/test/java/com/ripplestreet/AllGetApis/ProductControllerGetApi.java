package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class ProductControllerGetApi extends genricUtilities{
	
	@Test(groups="event-campaign-manager")
	public void getListOfProdutsByEventID() {
		response=RestAssured.get("/event-campaign-manager/v1/event/"+eventId+"/marketingGoal/list");
		Testcase=172;
	}
	@Test(groups="event-campaign-manager")
	public void getProductsById() {
		response=RestAssured.get("/event-campaign-manager/v1/product/"+productId);
		Testcase=173;
		
	}

}
