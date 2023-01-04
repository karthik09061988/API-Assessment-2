package assessmentchaining;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class RestAssuredBase {
	
public static String sys_id;	
@BeforeMethod	
public void setup() 
{
	RestAssured.baseURI="https://dev120775.service-now.com/api/now/table";

}

}
