package kotak.SerializationTest;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.json.JsonMapper;

import kotakPOJOClass.BPI;
import kotakPOJOClass.EUR;
import kotakPOJOClass.GBP;
import kotakPOJOClass.KotakComplexPojo;
import kotakPOJOClass.Time;
import kotakPOJOClass.USD;

public class ComplexSerializationTest {
	
	//Provide argument KotakComplexPojo class throuh the KotakComplexPojo Constructor
	 String disclaimer="This data was produced from the CoinDesk Bitcoin Price Index (USD). Non-USD currency data converted using hourly conversion rate from openexchangerates.org";
	 String chartName="Bitcoin";
	@Test
	public void serializationTest() throws Throwable {
		//Provide Values of EUR Attributes
		EUR eurObj = new EUR("EUR", "&euro;", "20,657.2602", "Euro", 20657.2602);
		
		//Provide Values of GBP Attributes
		GBP gbpObj = new GBP("GBP", "&pound;", "17,719.1523", "British Pound Sterling", 17719.1523);
		
		//Provide Values of USD Attributes
		USD usdObj = new USD("GBP", "&#36;", "21,205.5074", "United States Dollar", 21205.5074);
		
		//Provide Values of BPI Attributes
		BPI bpiObj = new BPI(usdObj, gbpObj, eurObj);
		
		//Provide Values of Time Attributes
		Time timeObj = new Time("Jan 18, 2023 09:39:00 UTC", "2023-01-18T09:39:00+00:00", "Jan 18, 2023 at 09:39 GMT");
		
		//Provide Values of KotakComplexPojo Attributes
		KotakComplexPojo kotakComplexObj = new KotakComplexPojo(timeObj, disclaimer, chartName, bpiObj);
		
		// Create Object for JSONMapper to Convert java Objects into the JSON Object
		JsonMapper jsonObj = new JsonMapper();
		jsonObj.writeValue(new File("./KotakComplexData2.json"), kotakComplexObj);
	}
}
