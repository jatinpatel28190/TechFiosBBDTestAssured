package apiTestPakage;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import utilPakage.RndomString;

public class T002TechFiosPut {

	static HashMap map;
	
	@BeforeMethod
	public void preCondition() {
		map = new HashMap();
		map.put( "id" , "1501");
		map.put("name", RndomString.getname());
		map.put("price", RndomString.getPrice());
		map.put("description" , RndomString.getdescription());
		map.put("category_id", 2);
		map.put("created" , "2018-06-01 00:35:07");
		RestAssured.baseURI="https://techfios.com/api-prod/api/product";
		RestAssured.basePath="/create.php";
		
		
		
	}
	
	@Test
	public void postMethod() {
		
		given().contentType("application/json; charset=UTF-8")
		.body(map)
		
		
		
		
		.when().put()	
		
		
		
		
		.then().statusCode(201).log().all();// it will give you all response 
		
		
		
		
	}

}
