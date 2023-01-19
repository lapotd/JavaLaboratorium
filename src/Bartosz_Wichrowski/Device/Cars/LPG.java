package Bartosz_Wichrowski.Device.Cars;

public class LPG extends Car{

    public LPG(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public void refuel() {
        System.out.println("car refueled");
    }
}
