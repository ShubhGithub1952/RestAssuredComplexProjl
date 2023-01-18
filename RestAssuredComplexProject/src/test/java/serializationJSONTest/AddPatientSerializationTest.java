package serializationJSONTest;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.json.JsonMapper;

import addPatientPojoClass.AddPatientPojoClassTest;
import addPatientPojoClass.Cars;
import addPatientPojoClass.Escort;
import addPatientPojoClass.Ford;
import addPatientPojoClass.Maxima;
import addPatientPojoClass.Nissan;
import addPatientPojoClass.Sentra;
import addPatientPojoClass.Taurus;

public class AddPatientSerializationTest {
	public static void main(String[] args) throws Throwable {
		//Create object for Taurus and Escort 
		//Provide Argument for Constructor
		Taurus taurusObj = new Taurus("4", "Manual");
		Escort escortObj = new Escort("8", "Automatic");
		
		//Create Object for Sentra and Maxima
		//Provide Argument for Constructor
		Sentra sentraObj = new Sentra("8", "Automatic");
		Maxima maximaObj = new Maxima("4", "Manual");
		
		//Create object Nissan and Pass the Argument
		Nissan nissanObj = new Nissan(sentraObj, maximaObj);
		
		//Create Object for Ford and Pass the Argument
		Ford fordObj = new Ford(taurusObj, escortObj);
		
		//Create Object for Cars and Pass the Argument
		Cars carsObj = new Cars(nissanObj, fordObj);
		
		//Create Object for AddPatietn Pojoclass and Pass the Argument
		AddPatientPojoClassTest addPatientObj = new AddPatientPojoClassTest(carsObj);
		
		JsonMapper jsonMapperObj = new JsonMapper();
		jsonMapperObj.writeValue(new File("./AddPatientComplexTestData1.json"), addPatientObj);
	}
}
