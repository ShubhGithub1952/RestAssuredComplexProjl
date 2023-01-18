package addPatientPojoClass;

public class Escort {
	private String doors;
	private String transmission;
	
	//No argument Constructor
	public Escort() {
		super();
	}
	
	//Create Parameterised Constructor
	public Escort(String doors, String transmission) {
		super();
		this.doors = doors;
		this.transmission = transmission;
	}
	//Provide getter and Setter Method
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
}
