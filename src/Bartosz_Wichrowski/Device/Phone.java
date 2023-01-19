package Bartosz_Wichrowski.Device;

import java.net.URL;
import java.util.List;

public class Phone extends Device {
	public String screenSize;
	public String os;

	public static final String appServerAddress = "www.netflix.com";
	public static final String defaultProtocol = "HTTP";
	public static final String defaultVersion = "1.1";

	public Phone(String producer, String model, Integer yearOfProduction) {
		super(producer,model,yearOfProduction);
	}
	
	public String toString() {
		return "phone of model: " + this.model;
	}

	public void turnOn(){
		System.out.println("Telefon wlacza sie");
	}

	public void installAnApp(String name){

	}

	public void installAnApp(String name, String version){

	}

	public void installAnApp(String name, String version, String serverAddress) {

	}

	public void installAnApp(List<String> appToDownloadNames){

	}
	public void installAnApp(URL appDownloadUrl){

	}

}

