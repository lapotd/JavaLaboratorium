package Bartosz_Wichrowski.Device.Cars;

public class Electric extends Car{

    public Electric(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public void refuel() {
        System.out.println("car refueled");
    }
}
