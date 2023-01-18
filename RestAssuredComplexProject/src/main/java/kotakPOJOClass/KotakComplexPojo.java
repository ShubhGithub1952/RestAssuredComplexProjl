package kotakPOJOClass;

public class KotakComplexPojo {
	private Time time;
	private String disclaimer;
	private String chartName;
	private BPI bpi;
	
	//create no argument Constructor 
	public KotakComplexPojo() {
		super();
	}

	//Create the Parameterised Constructor
	public KotakComplexPojo(Time time, String disclaimer, String chartName, BPI bpi) {
		super();
		this.time = time;
		this.disclaimer = disclaimer;
		this.chartName = chartName;
		this.bpi = bpi;
	}

	// Provide the Getter and Setter Method
	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getDisclaimer() {
		return disclaimer;
	}

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public String getChartName() {
		return chartName;
	}

	public void setChartName(String chartName) {
		this.chartName = chartName;
	}

	public BPI getBpi() {
		return bpi;
	}

	public void setBpi(BPI bpi) {
		this.bpi = bpi;
	}
	
}
