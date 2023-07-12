package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class TremendouesControllerGetApi  extends genricUtilities{
	@Test(groups = "reward-service")
	public void getTremendousCampaigns() {
		response=RestAssured.get("/reward-service/v1/campaigns/list");
		Testcase=125;
		
	}
	@Test(groups = "reward-service")
	public void getTremendousFundingSources() {
		response=RestAssured.get("/reward-service/v1/fundingSources/list");
		Testcase=126;
		
	}


}
