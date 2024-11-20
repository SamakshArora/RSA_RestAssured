package resources;

import io.restassured.path.json.JsonPath;

public class reusableMethods {
	public static JsonPath rawToJson(String response) {
		JsonPath jss = new JsonPath(response);
		return jss;
	

}}
