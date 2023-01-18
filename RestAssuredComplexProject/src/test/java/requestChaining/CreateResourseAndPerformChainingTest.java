package requestChaining;

import java.util.List;
import java.util.Random;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import rmgProject.AddProjectPojoClass;
/**
 * 
 * @author SHUBH
 *
 */
public class CreateResourseAndPerformChainingTest {
	@Test
	public void createResourseTest() {
		
		//Create the resource inside the Server 
		baseURI="http://localhost:8084";
		Random random = new Random();
		int randomNumber = random.nextInt(500);
		AddProjectPojoClass addProjectObj = new AddProjectPojoClass("TYSSShubhamBP", "HealthTreasure"+randomNumber, "In-Progress", 28);
		Response response = given()
				.body(addProjectObj)
				.contentType(ContentType.JSON)
				.when()
				.post("/addProject");
		response.then().assertThat().statusCode(201);
		String createdByObj = response.jsonPath().get("createdBy");
		String actualProjectId = response.jsonPath().get("projectId");
		response.then().assertThat().time(Matchers.lessThan(3000L));
		response.then().assertThat().statusCode(201);
		response.then().contentType(ContentType.JSON);
		System.out.println(createdByObj);
		Assert.assertEquals("TYSSShubhamBP", createdByObj);
		response.then().log().all();
		System.out.println("===============================================================");
		
		// Get The Response From Server and Verify Resourse is Created or Not
		Response getAllResponse = given()
				.contentType(ContentType.JSON)
				.when().get("/projects");
		List<String> actualProjectIds = getAllResponse.jsonPath().get("projectId");
		boolean flag=false;
		for (String expectedProjectId : actualProjectIds) {
			if (expectedProjectId.equals(actualProjectId)) {
				flag=true;
				break;
			}
		}
		//System.out.println(flag);
		Assert.assertTrue(flag);
		Reporter.log("Resource is Created inside the Server !",flag);
		System.out.println("===========================================================");
		Response getResponse = given()
				.pathParam("projectID", actualProjectId)
				.when().get("/projects/{projectID}");
		getResponse.then().assertThat().statusCode(200);
		Assert.assertEquals(getResponse.jsonPath().get("createdBy"), "TYSSShubhamBP");
		getResponse.then().log().all();
		System.out.println("============================================================ ");
		// Modify Resourse which is Existed in Server
		AddProjectPojoClass modifyaddProjectObj1 = new AddProjectPojoClass("TYSSSatishBP", "HealthTreasure"+randomNumber, "Completed", 20);
		Response putResponse = given()
		.pathParam("projectID", actualProjectId)
		.body(modifyaddProjectObj1)
		.contentType(ContentType.JSON)
		.when().put("/projects/{projectID}");
		putResponse.then().assertThat().statusCode(200);
		putResponse.then().time(Matchers.lessThan(2000L));
		Assert.assertEquals(putResponse.jsonPath().get("createdBy") , "TYSSSatishBP");
		putResponse.then().log().all();
		Reporter.log("Resource has been Updated by PUT Method !", true);
		System.out.println("=============================================================");
		//Delete the Resource Which is Existed in Server 
		Response deleteResponse = given()
		.pathParam("projectID", actualProjectId)
		.when().delete("/projects/{projectID}");
		deleteResponse.then().assertThat().statusCode(204);
		Reporter.log("Resource is Deleted form the Server !",true);
	}
}
