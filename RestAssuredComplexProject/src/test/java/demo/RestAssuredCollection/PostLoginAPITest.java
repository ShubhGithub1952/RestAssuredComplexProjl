package demo.RestAssuredCollection;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Random;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class PostLoginAPITest {

	public static void main(String[] args) {
		Random random = new Random();
		int randomNumb = random.nextInt(500);
		HashMap<String, String> map = new HashMap<String, String>();
		//map.put("username","Tobias");
		map.put("email","tobias.funke@reqres.in");
		map.put("password","Tobias"+randomNumb);
		
		Response postResponse = given()
		.body(map)
		.contentType(ContentType.JSON)
		.when().post("https://reqres.in/api/register");
		postResponse.then().assertThat().statusCode(200);
		postResponse.then().log().all();
		String token = postResponse.jsonPath().get("token");
		System.out.println(token);
	}
}
