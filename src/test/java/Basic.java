import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import resources.RequestPayload;
import resources.reusableMethods;

import static io.restassured.RestAssured.*;

public class Basic {

	public static void main(String[] args) {
		
	
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		//Post
	 String	postResonse = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(RequestPayload.AddPlace())
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server","Apache/2.4.52 (Ubuntu)")
		.extract().response().asString();
	 
	 
	// System.out.println(postResonse);
	 JsonPath js= new JsonPath(postResonse);
	String placeId= js.getString("place_id");
	//System.out.println(placeId);
	
	
	
	//Put 
	String newAddress = "Haryana";
	String putRes=given().log().all().header("Content-Type","application/json").queryParam("place_id",placeId).body("{\n"
			+ "\"place_id\":\""+placeId+"\",\n"
			+ "\"address\":\""+newAddress+"\",\n"
			+ "\"key\":\"qaclick123\"\n"
			+ "}")
	.when().put("maps/api/place/update/json")
	
	.then().and().log().all().assertThat().statusCode(200).extract().response().asString();
	
   JsonPath j2=new JsonPath(putRes);
	 String ActualMSG=j2.getString("msg");
	 assertEquals(ActualMSG, "Address successfully updated");
	 
	 
	 
	// Get Request
  	String getRes= given().log().all().queryParam("place_id", placeId).queryParam("key", "qaclick123")
	 	
		.when().get("maps/api/place/get/json")
		
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
	

	JsonPath jss=	reusableMethods.rawToJson(getRes);
		String actualAddress=jss.getString("address");
		//System.out.println(actualAddress);
	    Assert.assertEquals(actualAddress, newAddress);
		
	
}
}