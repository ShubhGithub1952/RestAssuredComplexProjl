package kotakPOJOClass;

public class Time {
	private String updated;
	private String updatedISO;
	private String updateduk;
	
	//Create No argument Constructor
	public Time() {
		super();
	}

	// Provide parameterised Constructor
	public Time(String updated, String updatedISO, String updateduk) {
		super();
		this.updated = updated;
		this.updatedISO = updatedISO;
		this.updateduk = updateduk;
	}

	//Create the Getter and Setter Method
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getUpdatedISO() {
		return updatedISO;
	}

	public void setUpdatedISO(String updatedISO) {
		this.updatedISO = updatedISO;
	}

	public String getUpdateduk() {
		return updateduk;
	}

	public void setUpdateduk(String updateduk) {
		this.updateduk = updateduk;
	}
	
}
