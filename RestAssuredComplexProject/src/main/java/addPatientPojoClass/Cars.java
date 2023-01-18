package addPatientPojoClass;

public class Cars {
	private Nissan nissan;
	private Ford ford;
	// Create Constructor 
	public Cars() {
		super();
	}
	
	// Create Parameterized Constructor 
	public Cars(Nissan nissan, Ford ford) {
		super();
		this.nissan = nissan;
		this.ford = ford;
	}
	
	// Provide Getter and Setter Methods 
	public Nissan getNissan() {
		return nissan;
	}
	public void setNissan(Nissan nissan) {
		this.nissan = nissan;
	}
	public Ford getFord() {
		return ford;
	}
	public void setFord(Ford ford) {
		this.ford = ford;
	}
	
}
