package Device;

public class Device {
    public final String model;
    public final String producer;
    public final int yearOfProduction;

    public Device(String model, String producer, int yearOfProduction){
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return ("this device is of model : " + model);
    }
}
