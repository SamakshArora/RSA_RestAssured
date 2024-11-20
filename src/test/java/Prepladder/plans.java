package Prepladder;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import resources.RequestPayload;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import excel_Read.neetpg;

public class plans {
	@Test
	public void pgFreePlan() {
		
		RestAssured.baseURI ="https://web.prepladder.com";
		
		String postRes = given().header("Content-Type","application/json").body(RequestPayload.prices())
		
		.when().post("PackageWebUIController")
		
		.then().assertThat().statusCode(200).log().all().extract().response().asString();
		
		
		JsonPath js = new JsonPath(postRes);
		
		// excel class data call
		neetpg ng = new neetpg();
		
		// soft class calling
		SoftAssert soft= new SoftAssert();
		
		// 1 month
		String onemonthActualAmt = js.getString("packageSubscriptionPlans[0].amountAfterDiscount");
		soft.assertEquals(onemonthActualAmt, ng.actPrice(1), "1 month actual amount wrong");
		
		String onemonthMrpAmt = js.getString("packageSubscriptionPlans[0].amount");
		soft.assertEquals(onemonthMrpAmt, ng.mrpPrice(1), "1 month mrp amount wrong");
		
		
		// 3 months
		String threemonthActualAmt = js.getString("packageSubscriptionPlans[1].amountAfterDiscount");
		soft.assertEquals(threemonthActualAmt,ng.actPrice(3),"3 month actual amount wrong");
		
		String threemonthMrpAmt = js.getString("packageSubscriptionPlans[1].amount");
		soft.assertEquals(threemonthMrpAmt,ng.mrpPrice(3), "3 month mrp amount wrong");
		
		
		// 9 months
		String ninemonthActualAmt = js.getString("packageSubscriptionPlans[2].amountAfterDiscount");
		soft.assertEquals(ninemonthActualAmt,ng.actPrice(9),"9 month actual amount wrong");
		
		String ninemonthMrpAmt = js.getString("packageSubscriptionPlans[2].amount");
		soft.assertEquals(ninemonthMrpAmt, ng.mrpPrice(9), "9 month mrp amount wrong");
		
		
		// 1 year
		String oneYearActualAmt = js.getString("packageSubscriptionPlans[3].amountAfterDiscount");
		soft.assertEquals(oneYearActualAmt,ng.actPrice(12), "12 month actual amount wrong");
		
		String oneYearMrpAmt = js.getString("packageSubscriptionPlans[3].amount");
		soft.assertEquals(oneYearMrpAmt,ng.mrpPrice(12),"12 month mrp amount wrong");
		
		
		// 18 Months
		String eighteenmonthActualAmt = js.getString("packageSubscriptionPlans[4].amountAfterDiscount");
		soft.assertEquals(eighteenmonthActualAmt,ng.actPrice(18), "18 month actual amount wrong");
		
		String eighteenmonthMrpAmt = js.getString("packageSubscriptionPlans[4].amount");
		soft.assertEquals(eighteenmonthMrpAmt,ng.mrpPrice(18),"18 month mrp amount wrong");
		
		
		// 2 Years
		String twoYearActualAmt = js.getString("packageSubscriptionPlans[5].amountAfterDiscount");
		soft.assertEquals(twoYearActualAmt, ng.actPrice(24), "24 month actual amount wrong");
		
		String twoYearMrpAmt = js.getString("packageSubscriptionPlans[5].amount");
		soft.assertEquals(twoYearMrpAmt,ng.mrpPrice(24),"24 month mrp amount wrong" );
		
		
		//3 Year
		String threeYearActualAmt = js.getString("packageSubscriptionPlans[6].amountAfterDiscount");
		soft.assertEquals(threeYearActualAmt, ng.actPrice(36),"36 month actual amount wrong");
		
		String threeYearMrpAmt = js.getString("packageSubscriptionPlans[6].amount");
		soft.assertEquals(threeYearMrpAmt,ng.mrpPrice(36),"36 month mrp amount wrong" );
		
		
		// 4 year
		String fourYearActualAmt = js.getString("packageSubscriptionPlans[7].amountAfterDiscount");
		soft.assertEquals(fourYearActualAmt, ng.actPrice(48), "48 month actual amount wrong");
		
		String fourYearMrpAmt = js.getString("packageSubscriptionPlans[7].amount");
		soft.assertEquals(fourYearMrpAmt, ng.mrpPrice(48),"48 month mrp amount wrong");
		
		
		// 5 year
		String fiveYearActualAmt = js.getString("packageSubscriptionPlans[8].amountAfterDiscount");
		soft.assertEquals(fiveYearActualAmt, ng.actPrice(60), "60 month actual amount wrong");
		
		String fiveYearMrpAmt = js.getString("packageSubscriptionPlans[8].amount");
		soft.assertEquals(fiveYearMrpAmt,ng.mrpPrice(60),"60 month mrp amount wrong" );
		
		
		// 6 year
		String sixYearActualAmt = js.getString("packageSubscriptionPlans[9].amountAfterDiscount");
		soft.assertEquals(sixYearActualAmt,ng.actPrice(72),"72 month actual amount wrong");
		
		String sixYearMrpAmt = js.getString("packageSubscriptionPlans[9].amount");
		soft.assertEquals(sixYearMrpAmt,ng.mrpPrice(72),"72 month mrp amount wrong" );
		
		soft.assertAll();
	
				
	}
	
	
}
