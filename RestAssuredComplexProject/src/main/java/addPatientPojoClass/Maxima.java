package addPatientPojoClass;

public class Maxima {
	private String doors;
	private String transmission;
	
	//Create No Argument Constructor
	public Maxima() {
		super();
	}
	
	//Create PArameterized Constructor
	public Maxima(String doors, String transmission) {
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
