package assessmentputschemavalidation;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateIncident extends RestAssuredBase {
    @Test
	public void create() {
    	Response response = RestAssured.given().contentType("application/json")
    			.header("Authorization","Bearer cyTohkhJERJZKfqy4TNfJwVlS6uTUb5ozvmVgjFguQ3iCQVbkJfelfumjm80renOu_r9HCUInR_0ZFqhZ6217g")
    			.when().post("/incident");
    	response.prettyPrint();
    JsonPath path = response.jsonPath();
    sys_id = path.get("result.sys_id");
    System.out.println("The Extracted sys_ID is"+sys_id);
    	System.out.println(response.getStatusCode());
    	response.then().assertThat().statusCode(201);
    	
	}

}
