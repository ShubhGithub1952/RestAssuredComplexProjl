package addPatientPojoClass;

public class Ford {
	private Taurus taurus;
	private Escort escort;
	
	//No argument Constructor
	public Ford() {
		super();
	}
	
	// Create Parameterized Constructor
	public Ford(Taurus taurus, Escort escort) {
		super();
		this.taurus = taurus;
		this.escort = escort;
	}
	
	//Provide getter and Setter Method
	public Taurus getTaurus() {
		return taurus;
	}
	public void setTaurus(Taurus taurus) {
		this.taurus = taurus;
	}
	public Escort getEscort() {
		return escort;
	}
	public void setEscort(Escort escort) {
		this.escort = escort;
	}
	
}
