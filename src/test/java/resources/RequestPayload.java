package resources;

public class RequestPayload {
	

	 public static String AddPlace() {
		return "{\n"
				+ "  \"location\": {\n"
				+ "    \"lat\": -38.383494,\n"
				+ "    \"lng\": 33.427362\n"
				+ "  },\n"
				+ "  \"accuracy\": 50,\n"
				+ "  \"name\": \"Frontline house\",\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\n"
				+ "  \"types\": [\n"
				+ "    \"shoe park\",\n"
				+ "    \"shop\"\n"
				+ "  ],\n"
				+ "  \"website\": \"http://google.com\",\n"
				+ "  \"language\": \"French-IN\"\n"
				+ "}";

}
	 public static String ComplexJson() {
		 return "{\n"
		 		+ "\n"
		 		+ "\"dashboard\": {\n"
		 		+ "\n"
		 		+ "\"purchaseAmount\": 910,\n"
		 		+ "\n"
		 		+ "\"website\": \"rahulshettyacademy.com\"\n"
		 		+ "\n"
		 		+ "},\n"
		 		+ "\n"
		 		+ "\"courses\": [\n"
		 		+ "\n"
		 		+ "{\n"
		 		+ "\n"
		 		+ "\"title\": \"Selenium Python\",\n"
		 		+ "\n"
		 		+ "\"price\": 50,\n"
		 		+ "\n"
		 		+ "\"copies\": 6\n"
		 		+ "\n"
		 		+ "},\n"
		 		+ "\n"
		 		+ "{\n"
		 		+ "\n"
		 		+ "\"title\": \"Cypress\",\n"
		 		+ "\n"
		 		+ "\"price\": 40,\n"
		 		+ "\n"
		 		+ "\"copies\": 4\n"
		 		+ "\n"
		 		+ "},\n"
		 		+ "\n"
		 		+ "{\n"
		 		+ "\n"
		 		+ "\"title\": \"RPA\",\n"
		 		+ "\n"
		 		+ "\"price\": 45,\n"
		 		+ "\n"
		 		+ "\"copies\": 10\n"
		 		+ "\n"
		 		+ "}\n"
		 		+ "\n"
		 		+ "]\n"
		 		+ "\n"
		 		+ "}\n"
		 		+ "\n"
		 		+ "}";
}
	 public static String AddBook(String isbn, String aisle) {
		 String payload="{\n"
		 		+ "\n"
		 		+ "\"name\":\"Learn Appium Automation with Java\",\n"
		 		+ "\"isbn\":\""+isbn+"\",\n"
		 		+ "\"aisle\":\""+aisle+"\",\n"
		 		+ "\"author\":\"John foe\"\n"
		 		+ "}\n"
		 		+ "";
		 return payload;
		
	}
	 public static String prices() {
		return "{\n"
				+ "  \"email\": \"samaksh.arora@prepladder.com\",\n"
				+ "  \"phone\": \"919306474569\",\n"
				+ "  \"packID\": 251,\n"
				+ "  \"platform\": \"web\",\n"
				+ "  \"appName\": \"prepladder\",\n"
				+ "  \"country\": \"IN\",\n"
				+ "  \"courseID\": 1,\n"
				+ "  \"version\": \"101\",\n"
				+ "  \"apiKey\": \"prpldr_1721027699868:lr1kaaz49gvdhky:3057349\",\n"
				+ "  \"coupon\": \"NRA9QD\",\n"
				+ "  \"usePrepCash\": 1,\n"
				+ "  \"defaultValidity\": \"12\",\n"
				+ "  \"addNotes\": \"1\",\n"
				+ "  \"addNotesSnapshot\": 0,\n"
				+ "  \"utmData\": \"{}\",\n"
				+ "  \"electiveSubID\": \"\"\n"
				+ "}";
	
}
	 }