package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class storesControllerGetApi extends genricUtilities{
	@Test(groups = "common-service")
	public void getAllStoreCollection() {
		response=RestAssured.given().queryParams("pageNo",page,"size",size).get("/common-service/v1/storeCollection/list");
		Testcase=103;
		
	}
	@Test(groups = "common-service")
	public void getStoreListByCollectionName() {
		response=RestAssured.given().queryParams("pageNo",page,"pageSize",size).get("/common-service/v1/stores/list/"+collectionName);
		Testcase=104;
	}

}
