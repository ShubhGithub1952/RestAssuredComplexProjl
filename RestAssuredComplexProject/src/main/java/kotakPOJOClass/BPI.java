package kotakPOJOClass;

public class BPI {
	private USD uSD;
	private GBP gBP;
	private EUR eUR;
	
	//Create No arguement constructor
	public BPI() {
		super();
	}
	
	//Create the Parameterised Constructor
	public BPI(USD uSD, GBP gBP, EUR eUR) {
		super();
		this.uSD = uSD;
		this.gBP = gBP;
		this.eUR = eUR;
	}
	
	//Provide Getter and Setter Method
	public USD getuSD() {
		return uSD;
	}
	public void setuSD(USD uSD) {
		this.uSD = uSD;
	}
	public GBP getgBP() {
		return gBP;
	}
	public void setgBP(GBP gBP) {
		this.gBP = gBP;
	}
	public EUR geteUR() {
		return eUR;
	}
	public void seteUR(EUR eUR) {
		this.eUR = eUR;
	}
}
