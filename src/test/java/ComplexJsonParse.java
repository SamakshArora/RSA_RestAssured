import io.restassured.path.json.JsonPath;
import resources.RequestPayload;

public class ComplexJsonParse {

//	1. Print No of courses returned by API
//
//	2.Print Purchase Amount
//
//	3. Print Title of the first course
//
//	4. Print All course titles and their respective Prices
//
//	5. Print no of copies sold by RPA Course
//
//	6. Verify if Sum of all Course prices matches with Purchase Amount
	
	public static void main(String[] args){
		
		
		JsonPath js = new JsonPath(RequestPayload.ComplexJson());
	
		
//		1. Print No of courses returned by API	
		int courseCount	=js.getInt("courses.size()");
	System.out.println("No of courses = "+courseCount);
	
	
	// 2.Print Purchase Amount
	int purchaseAmt=js.getInt("dashboard.purchaseAmount");
	System.out.println("Purchase Amount = "+purchaseAmt);
	
	// 3. Print Title of the first course
	 String title=js.get("courses[0].title");
	 System.out.println("Title of first course = "+title);
	 
	 
   //	4. Print All course titles and their respective Prices
	
	  for(int i=0;i<courseCount;i++) 
	  {
		  	String allTitle=js.get("courses["+i+"].title");
		  	System.out.println("Title = "+allTitle);
		  	System.out.println(js.get("courses["+i+"].price").toString());
        // System.out.println(" Prices = "+allPrices); 
	  }
	  
		//5. Print no of copies sold by RPA Course
	  System.out.println("no of copies sold by RPA Course");
	  for(int i=0;i<courseCount;i++) {
		  	String allTitle=js.get("courses["+i+"].title");
		  	if(allTitle.equalsIgnoreCase("RPA")) {
		  	int copies=	js.getInt("courses["+i+"].copies");
		  	System.out.println(copies);
		  	}
	  }
	}
	
}
