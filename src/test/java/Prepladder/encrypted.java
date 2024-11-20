package Prepladder;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class encrypted {

	
	@Test
	 public void abc() {
		
		RestAssured.baseURI = "https://users.prepladder.com";
		String postRes = given().header("Content-Type","application/json").auth().body("{\n"
				+ "    \"appName\": \"prepladder\",\n"
				+ "    \"email\": \"kunal.prepladder@gmail.com\",\n"
				+ "    \"apiKey\": \"prpldr_1544422999:5c0e0657543a2:250369\",\n"
				+ "    \"version\": \"80\",\n"
				+ "    \"platform\": \"web\",\n"
				+ "    \"token\": \"$c3424111271*c7227252447*d7280948332~1721994848211\",\n"
				+ "    \"subjectID\": 0,\n"
				+ "    \"slug\": \"video_list\"\n"
				+ "}")
				
				.when().post("commonCells")
				
				.then().assertThat().statusCode(200).log().all().extract().response().asString();
				
	}
	
}
