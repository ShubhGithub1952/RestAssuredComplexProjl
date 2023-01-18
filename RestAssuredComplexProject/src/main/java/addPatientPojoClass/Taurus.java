package addPatientPojoClass;

public class Taurus {
	private String doors;
	private String transmission;
	
	//Create No Argument Constructor
		public Taurus() {
			super();
		}
		
	//Create Parameterised Constructor
	public Taurus(String doors, String transmission) {
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
