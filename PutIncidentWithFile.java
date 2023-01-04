package assessmentchaining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PutIncidentWithFile extends RestAssuredBase {
    @Test(dependsOnMethods = "assessmentchaining.CreateIncidentWithFile.create")
	public void put() {
    	File fileName= new File("./src/test/resources/updateincident.json");
    	Response response = RestAssured.given().contentType("application/json")
    			.header("Authorization","Bearer cyTohkhJERJZKfqy4TNfJwVlS6uTUb5ozvmVgjFguQ3iCQVbkJfelfumjm80renOu_r9HCUInR_0ZFqhZ6217g")
    			.when().body(fileName).put("/incident/"+sys_id);
    	response.prettyPrint();
 
    	System.out.println(response.getStatusCode());
    	
  

	}

}
