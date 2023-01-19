package Bartosz_Wichrowski.Device.Cars;

public class Diesel extends Car{
    public Diesel(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public void refuel() {
        System.out.println("car refueled");
    }
}
