package addPatientPojoClass;

public class Sentra {
	private String doors;
	private String transmission;
	
	//Create No Argument Constructor
	public Sentra() {
		super();
	}
	
	//Create Parameterized Constructor
	public Sentra(String doors, String transmission) {
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
