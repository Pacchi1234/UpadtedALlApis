package com.ripplestreet.genricUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class putApiUtilities {
	public static String baseURI = ConfigFileReader.getInstance().getBaseURI();
	public static String eventId = ConfigFileReader.getInstance().getEventId();
	public String page = ConfigFileReader.getInstance().getPage();
	public static String size = ConfigFileReader.getInstance().getSize();
	public String activitiesName = ConfigFileReader.getInstance().getActivitiesName();
	public String pid = ConfigFileReader.getInstance().getPid();
	public String slug = ConfigFileReader.getInstance().getSlugValue();
	public String productId = ConfigFileReader.getInstance().getProductId();
	public String eventName = ConfigFileReader.getInstance().getByEventName();
	public static String devApiPath = ConfigFileReader.getInstance().getdevApiPath();
	public String packCount = ConfigFileReader.getInstance().getpackCount();
	public String feedItemId = ConfigFileReader.getInstance().getfeedItemId();
	public static String ExcelSheetPageName = ConfigFileReader.getInstance().getExcelSheetPageName();
	public String feedType = ConfigFileReader.getInstance().getfeedType();
	public String discussion_id = ConfigFileReader.getInstance().getdiscussion_id();
	public String model = ConfigFileReader.getInstance().getmodel();
	public String comment = ConfigFileReader.getInstance().getcomment();
	public String ipAddress = ConfigFileReader.getInstance().getipAddress();
	public String ugctaskId = ConfigFileReader.getInstance().getugcTaskId();
	public String ugcId = ConfigFileReader.getInstance().ugcId();
	public String assetId = ConfigFileReader.getInstance().getAssetId();
	public String reviewId = ConfigFileReader.getInstance().getreviewId();
	public String activityId = ConfigFileReader.getInstance().getactivityId();
	public String activitygroupId = ConfigFileReader.getInstance().getactivitygroupId();
	public String taskId = ConfigFileReader.getInstance().gettaskId();
	public String status = ConfigFileReader.getInstance().getstatus();
	public String segmentId = ConfigFileReader.getInstance().getsegmentId();
	public String segmentName = ConfigFileReader.getInstance().getsegmentName();
	public String folderId = ConfigFileReader.getInstance().getFolderId();
	public String segmentationtriggerId = ConfigFileReader.getInstance().getsegmentationtriggerId();
	public String tableName = ConfigFileReader.getInstance().gettableName();
	public String operation = ConfigFileReader.getInstance().getoperation();
	public String gamificationActivityId = ConfigFileReader.getInstance().getgamificationActivityId();
	public static String columnName = ConfigFileReader.getInstance().getcolumnName();
	public static String directionDESC = ConfigFileReader.getInstance().getdirectionDESC();
	public static String gamespageNo = ConfigFileReader.getInstance().getgamespageNo();
	public String gameId = ConfigFileReader.getInstance().getgameId();
	public String gameSlug = ConfigFileReader.getInstance().getgameSlug();
	public String jobId = ConfigFileReader.getInstance().getjobId();
	public String sourceType = ConfigFileReader.getInstance().getsourceType();
	public String receiptId = ConfigFileReader.getInstance().getreceiptId();
	public String collectionName = ConfigFileReader.getInstance().getcollectionName();
	public String optInId = ConfigFileReader.getInstance().getoptInId();
	public String rewardAllocationId = ConfigFileReader.getInstance().getrewardAllocationId();
	public String rewardId = ConfigFileReader.getInstance().getrewardId();
	public String rewardName = ConfigFileReader.getInstance().getrewardName();
	public String deliveryType = ConfigFileReader.getInstance().getdeliveryType();
	public String swagId = ConfigFileReader.getInstance().getswagId();
	public String notificationId = ConfigFileReader.getInstance().getnotificationId();
	public String campaignName = ConfigFileReader.getInstance().getcampaignName();
	public String email = ConfigFileReader.getInstance().getemail();
	public String templateName = ConfigFileReader.getInstance().gettemplateName();
	public String templateType = ConfigFileReader.getInstance().gettemplateType();
	public String templateTypeEnum = ConfigFileReader.getInstance().gettemplateTypeEnum();
	public String transactionlType = ConfigFileReader.getInstance().gettransactionType();
	public String fileName = ConfigFileReader.getInstance().gettransactionType();
	public String transactionTemplateId = ConfigFileReader.getInstance().gettransactionTemplateId();
	public String matrixNotificationId = ConfigFileReader.getInstance().getmatrixNotificationId();
	public String agencyId = ConfigFileReader.getInstance().getagencyId();
	public String playlistId = ConfigFileReader.getInstance().getplaylistId();
	public String bannerId = ConfigFileReader.getInstance().getbannerId();
	public String favorId = ConfigFileReader.getInstance().getfavorId();
	public String milestoneId = ConfigFileReader.getInstance().getmilestoneId();
	public String eventType = ConfigFileReader.getInstance().geteventtype();
	public String faqId = ConfigFileReader.getInstance().getfaqId();
	public String faqtopicId = ConfigFileReader.getInstance().getfaqtopicId();
	public String roleId = ConfigFileReader.getInstance().getrolId();
	public String sponsorId = ConfigFileReader.getInstance().getsponsorId();
	public String surveyType = ConfigFileReader.getInstance().getsurveyType();
	public String linkId = ConfigFileReader.getInstance().getlinkId();
	public String templateId = ConfigFileReader.getInstance().gettemplateId();
	public String eventCreatedDate = ConfigFileReader.getInstance().geteventCreatedDate();
	public String achievementId = ConfigFileReader.getInstance().getachievementId();
	public String triggerId = ConfigFileReader.getInstance().gettriggerId();
	public String AchievementProgramId = ConfigFileReader.getInstance().getAchievementProgramId();
	public String benifitType = ConfigFileReader.getInstance().getbenifitType();
	public String campaignId = ConfigFileReader.getInstance().getcampaignId();
	public String directionASC = ConfigFileReader.getInstance().getdirectionASC();
	public String evnetTypeUpcomingEvents = ConfigFileReader.getInstance().getevnetTypeUpcomingEvents();
	public String eventTypeOpenEvents = ConfigFileReader.getInstance().geteventTypeOpenEvents();
	public String eventTypeCurrentEvents = ConfigFileReader.getInstance().geteventTypeCurrentEvents();
	public String eventTypePastEvents = ConfigFileReader.getInstance().geteventTypePastEvents();
	public static String ExcelSheetPageName2 = ConfigFileReader.getInstance().getExcelSheetPageName2();
	public String commentId = ConfigFileReader.getInstance().getcommentId();
	public String updateCommentbody = ConfigFileReader.getInstance().getupdateCommentbody();
	public String isActive = ConfigFileReader.getInstance().getisActive();
	public String serviceId = ConfigFileReader.getInstance().getserviceId();
	public String subscriptionId = ConfigFileReader.getInstance().getsubscriptionId();
	public String isSponsorSubscribed = ConfigFileReader.getInstance().getisSponsorSubscribed();
	public String applicationId = ConfigFileReader.getInstance().getapplicationId();
	public String putBenefitId = ConfigFileReader.getInstance().getputBenefitId();
	public String description = ConfigFileReader.getInstance().getdescription();
	public String segmentJobId = ConfigFileReader.getInstance().getsegmentJobId();
	public String gameoptionId = ConfigFileReader.getInstance().getgameoptionId();
	public String Authorization=ConfigFileReader.getInstance().getAuthorization();
	public String rewardAllocationstatus=ConfigFileReader.getInstance().getrewardAllocationstatus();
	public String rewardAllocationItemId=ConfigFileReader.getInstance().getrewardAllocationItemId();
	public String deliveryItemId=ConfigFileReader.getInstance().getdeliveryItemId();
	public String rewardItemId=ConfigFileReader.getInstance().getrewardItemId();
	public String putNotificationId=ConfigFileReader.getInstance().getputNotificationId();
	public String publishStatus=ConfigFileReader.getInstance().getpublishStatus();
	public String updateTemplateId=ConfigFileReader.getInstance().getupdateTemplateId();
	public String isSuppressed=ConfigFileReader.getInstance().getisSuppressed();
	public String putAssetId=ConfigFileReader.getInstance().getputAssetId();
	public String updateEventMileStoneId=ConfigFileReader.getInstance().getupdateEventMileStoneId();
	public String targetId=ConfigFileReader.getInstance().gettargetId();
	public String PutFAQID=ConfigFileReader.getInstance().getPutFAQID();
	public String goalId=ConfigFileReader.getInstance().getgoalId();
	public static Response response;
	public static int Testcase;
	public static String PutBody;

	@BeforeMethod
	public static void BaseURI() throws InterruptedException, IOException, ParseException {

		RestAssured.baseURI = baseURI;

	}

	@AfterMethod
	public static void StatusCode() throws IOException, ParseException {

		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName2);

		XSSFRow row = sheet.getRow(Testcase);
		/**
		 * here It will fetch the Expected Output from the Excel cell Number 3
		 */
		XSSFCell Expected_Output = row.getCell(3);

		/**
		 * The Below line of code represents the actual response getting from the
		 * respective Apis in the form of String
		 */
		String cell = response.asString();
		System.out.println("Actual_output is" + " " + cell);

		System.out.println("Expected_Output is" + " " + Expected_Output);

		XSSFSheet sheet1 = workbook.getSheet(ExcelSheetPageName2);
		XSSFRow row1 = sheet1.getRow(Testcase);
		/**
		 * Here it will write the actual output in cell Number 4
		 */
		XSSFCell cell1 = row1.getCell(4);
		cell1.setCellValue(cell);
		FileOutputStream fio = new FileOutputStream(file);
		workbook.write(fio);

		/**
		 * The below Lines of code Is used to fecth the Numeric , String And boolean
		 * value from the respective cell
		 * 
		 */

		if (Expected_Output.getCellType() == CellType.STRING) {
			String ExpectedOutput = Expected_Output.getStringCellValue();
			if (ExpectedOutput.equals(cell)) {
			//	Assert.assertEquals(Expected_Output, cell);

				System.err.println("TestCase" + " " + Testcase + " " + "has been passed");

			} else {
				System.err.println("TestCase" + " " + Testcase + " " + "Expected and actual output is Mismatching");

			}
		} else if (Expected_Output.getCellType() == CellType.NUMERIC) {

			try {
				int ExpectedOutput = (int) Expected_Output.getNumericCellValue();
				int Actual_output = Integer.parseInt(cell);
				if (ExpectedOutput == Actual_output) {
					System.err.println("TestCase" + " " + Testcase + " " + "has been passed");

				} else {
					System.err.println("TestCase" + " " + Testcase + " " + "Expected and actual output is Mismatching");
				}
			} catch (NumberFormatException ne) {
				ne.printStackTrace();

			}

		} else if (Expected_Output.getCellType() == CellType.BOOLEAN) {
			Boolean ExpectedOutput = Expected_Output.getBooleanCellValue();

			if (ExpectedOutput.equals(cell)) {
				System.err.println("TestCase" + " " + Testcase + " " + "has been passed");

			} else {
				System.err.println("TestCase" + " " + Testcase + " " + "Expected and actual output is Mismatching");
			}

		}

	}

}
