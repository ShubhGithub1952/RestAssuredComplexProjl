package addPatientPojoClass;

public class Nissan {
	private Sentra sentra;
	private Maxima maxima;
	
	//Create No Argument Constructor
	public Nissan() {
		super();
	}
	
	//Create Parameterized Constructor
	public Nissan(Sentra sentra, Maxima maxima) {
		super();
		this.sentra = sentra;
		this.maxima = maxima;
	}
	// Provide Getter and Setter Method
	public Sentra getSentra() {
		return sentra;
	}
	public void setSentra(Sentra sentra) {
		this.sentra = sentra;
	}
	public Maxima getMaxima() {
		return maxima;
	}
	public void setMaxima(Maxima maxima) {
		this.maxima = maxima;
	}
	
}
