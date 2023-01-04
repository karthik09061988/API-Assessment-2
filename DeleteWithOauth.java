package assessmentoauth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteWithOauth {
    @Test
	public void delete() {
    	
    	RestAssured.baseURI="https://dev120775.service-now.com/api/now/table";
    	Response response = RestAssured.given().header("Authorization","Bearer Ycr1P-xAYXu63EMjhASdpIUCbJDgVqbLEapop9NUinWgr6x-TKtvx9rJ2o5FmX_GFPVb2SB6J7Kt0prB7ghXjw")
    			.delete("/incident/d4f9327697721110aba1318c1253af97");
   
    	System.out.println(response.getStatusCode());
    	
  

	}

}
