package deserializationJSONTest;

import java.io.File;

import com.fasterxml.jackson.databind.json.JsonMapper;

import addPatientPojoClass.AddPatientPojoClassTest;

public class DeserializationAddPatientTest {
	public static void main(String[] args) throws Throwable{
		JsonMapper jsonMapperObj = new JsonMapper();
		//jsonMapperObj.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		AddPatientPojoClassTest jsonReader = jsonMapperObj.readValue(new File("./AddPatientComplexTestData1.json"), AddPatientPojoClassTest.class);
		
		String santradoorsObj = jsonReader.getCars().getNissan().getSentra().getDoors();
		String santraTransmissionObj = jsonReader.getCars().getNissan().getSentra().getTransmission();
		String maximaDoorsObj = jsonReader.getCars().getNissan().getMaxima().getDoors();
		String maximaTransmissionObj = jsonReader.getCars().getNissan().getMaxima().getTransmission();
		String taurusdoorsObj = jsonReader.getCars().getFord().getTaurus().getDoors();
		String taurusTransmissionObj = jsonReader.getCars().getFord().getTaurus().getTransmission();
		String escortdoorsObj = jsonReader.getCars().getFord().getEscort().getDoors();
		String escortTransmissionObj = jsonReader.getCars().getFord().getEscort().getTransmission();
		
		System.out.println(santradoorsObj);
		System.out.println(santraTransmissionObj);
		System.out.println(maximaDoorsObj);
		System.out.println(maximaTransmissionObj);
		System.out.println(taurusdoorsObj);
		System.out.println(taurusTransmissionObj);
		System.out.println(escortdoorsObj);
		System.out.println(escortTransmissionObj);
	}
}
