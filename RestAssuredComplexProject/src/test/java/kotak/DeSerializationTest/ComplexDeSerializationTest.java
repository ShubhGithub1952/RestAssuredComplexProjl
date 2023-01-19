package kotak.DeSerializationTest;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.json.JsonMapper;

import kotakPOJOClass.KotakComplexPojo;
import kotakPOJOClass.USD;

public class ComplexDeSerializationTest {
	@Test
	public void deSerializationTest() throws Throwable {
		
		JsonMapper jsonObj = new JsonMapper();
		KotakComplexPojo deSerializeObj = jsonObj.readValue(new File(".\\KotakComplexData.json"), KotakComplexPojo.class);
		 String Symbolobj = deSerializeObj.getBpi().getuSD().getSymbol();
		System.out.println(Symbolobj);
	}
}
