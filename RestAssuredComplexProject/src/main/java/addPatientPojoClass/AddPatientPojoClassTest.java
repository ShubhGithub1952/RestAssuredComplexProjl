package addPatientPojoClass;

public class AddPatientPojoClassTest {
	private Cars cars;
	
	//Create Constructor
		public AddPatientPojoClassTest() {
			super();
		} 
		
	//Create Parameterised Constructor
	public AddPatientPojoClassTest(Cars cars) {
		super();
		this.cars = cars;
	}
	
	//Provide getter and Setter Method
	public Cars getCars() {
		return cars;
	}

	
	public void setCars(Cars cars) {
		this.cars = cars;
	}
}
