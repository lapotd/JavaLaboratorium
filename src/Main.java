import Device.Car;
import Device.Phone;

public class Main {
    public static void main(String[] args) {
        Human bartek = new Human("Bartek");
        Car car = new Car("volksvagen","golf",2000);
        Phone phone = new Phone("Iphone","14",2022);
        Animal animal = new Animal ("dzik", 75.0);

        phone.turnOn();
        car.turnOn();

    }
}