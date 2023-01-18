package kotak.DeSerializationTest;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.json.JsonMapper;

import kotakPOJOClass.KotakComplexPojo;

public class ComplexDeSerializationTest {
	@Test
	public void deSerializationTest() throws Throwable {
		JsonMapper jsonObj = new JsonMapper();
		KotakComplexPojo deSerializeObj = jsonObj.readValue(new File(".\\KotakComplexData.json"), KotakComplexPojo.class);
		double EUR_Rate_Float = deSerializeObj.getBpi().geteUR().getRate_float();
		System.out.println(EUR_Rate_Float);
	}
}
