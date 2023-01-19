package Bartosz_Wichrowski;

import Bartosz_Wichrowski.Creature.Human;
import Bartosz_Wichrowski.Creature.Pet;
import Bartosz_Wichrowski.Device.Cars.Car;
import Bartosz_Wichrowski.Device.Cars.Diesel;
import Bartosz_Wichrowski.Device.Phone;

public class Main {
    public static void main(String[] args) {
        Human bartek = new Human("Bartek",100.0);
        Diesel car = new Diesel("volksvagen","golf",2000);
        Phone phone = new Phone("Iphone","14",2022);
        Pet animal = new Pet("dzik", 75.0);

        car.refuel();


    }
}