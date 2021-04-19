package apiTestPakage;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class T004TechFiosDelet {

	@Test
	public void deleteMethod() {

		RestAssured.baseURI = "https://techfios.com/api-prod/api/product";
		RestAssured.basePath = "/delete.php/1502";
		Response response = // store response here

				given().
				when().
				    delete().
				 then().
				     statusCode(200).extract().response();

		System.out.println(response.asString());
		
		Assert.assertEquals(response.asString().contains("Product was deleted."),true);

	}

}
