package Device;

public class Car extends Device {
    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer,model,yearOfProduction);
        this.mileage = 0.0;
    }

    public Double mileage;
    public Double worth;
    public String color;


    public String toString() {
    	return "Device.Car of model: " + this.model;
    }
     public void turnOn(){
         System.out.println("Samochod wlacza sie");
    }
}
