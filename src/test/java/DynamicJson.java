import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import resources.RequestPayload;
import resources.reusableMethods;

public class DynamicJson {
	
	@Test(dataProvider = "BookData")
	public void addBook(String isbn,String aisle ){
		RestAssured.baseURI= "http://216.10.245.166";
		String Res=	given().log().all().header("Content-Type","application/json").body(RequestPayload.AddBook(isbn,aisle))
		.when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		
		JsonPath js=reusableMethods.rawToJson(Res);
		String id=js.get("ID");
		System.out.println(id);
		
		
		// Delete 
		String	resp=	given().log().all().header("Content-Type","application/json").body("{\n"
				+ "  \"ID\": \""+id+"\"\n"
				+ "}")
		.when().delete("Library/DeleteBook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		
	}
	
	
//	@Test(dataProvider = "BookData")
//	public void deleteBook(String isbn,String aisle ){
//String	resp=	RestAssured.baseURI= "http://216.10.245.166";
//		given().log().all().header("Content-Type","application/json").body("\"ID\" : \""+id+"\"")
//		.when().delete("Library/DeleteBook.php")
//		.then().log().all().assertThat().statusCode(200).extract().response().asString();
//		
//		
//	}
	// Parameterize the api tests with multiple data sets
	
	@DataProvider(name="BookData")
	public Object[][] getData() {
	
	return	new Object[][] {{"dofj","542"},{"jorsn","9583"},{"oru","7432"}};

}
}