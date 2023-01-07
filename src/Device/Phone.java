package Device;

public class Phone extends Device {
	public String screenSize;
	public String os;

	public Phone(String producer, String model, Integer yearOfProduction) {
		super(producer,model,yearOfProduction);
	}
	
	public String toString() {
		return "phone of model: " + this.model;
	}

}
