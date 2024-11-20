import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

import resources.RequestPayload;

public class sumValidation {
	@Test
	public void sumofCourses() {
		int sum=0;
	
		JsonPath js = new JsonPath(RequestPayload.ComplexJson());
		int Count=js.getInt("courses.size()");
		 for(int i=0;i<Count;i++) 
		 {	  
			int prices=js.getInt("courses["+i+"].price");
			int copies=js.getInt("courses["+i+"].copies");
		int totalAmount= prices * copies;
		System.out.println(totalAmount);
		sum = sum+ totalAmount;
		
			
		 }
		 System.out.println("sum="+sum);
			
		int purchaseAmount=js.getInt("dashboard.purchaseAmount");
		
		assertEquals(sum, purchaseAmount);
	}
}
