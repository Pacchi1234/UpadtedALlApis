package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class SegmentationDefinitionControllerVersion2 extends genricUtilities {

	@Test(groups="segmentation")
	public void getGetSegmentDefinitionByFolderIdAndSegmentId() {
		response = RestAssured.get("/segmentation/v2/folder/" + folderId + "/segment/" + segmentId);
		Testcase=82;
	}
	@Test(groups="segmentation")
	public void getAllSegments() {
		response=RestAssured.given().param("size", size).get("/segmentation/v2/folder/"+folderId+"/segment/list");
		Testcase=83;
		
	}
	@Test(groups="segmentation")
	public void getSegmentDefinitionById() {
		response=RestAssured.get("/segmentation/v2/segment/"+segmentId);
		Testcase=84;
		
	}
}
