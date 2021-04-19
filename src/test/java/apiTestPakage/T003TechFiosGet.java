package apiTestPakage;



import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import utilPakage.RndomString;

public class T003TechFiosGet {


	
	@BeforeMethod
	public void preCondition() {
	
		RestAssured.baseURI="https://techfios.com/api-prod/api/product";
		RestAssured.basePath="/read_one.php?id=1501";
		
		
		
	}
	
	@Test
	public void postMethod() {
		
		given().contentType("application/json; charset=UTF-8")
	
		
		
		
		.when().put()	
		
		
		
		
		.then().statusCode(200);
		
		
		
		
	}

}


