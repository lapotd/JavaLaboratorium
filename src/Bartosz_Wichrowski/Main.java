package Bartosz_Wichrowski;

import Bartosz_Wichrowski.Creature.Animal;
import Bartosz_Wichrowski.Creature.Human;
import Bartosz_Wichrowski.Device.Car;
import Bartosz_Wichrowski.Device.Phone;

public class Main {
    public static void main(String[] args) {
        Human bartek = new Human("Bartek",100.0);
        Car car = new Car("volksvagen","golf",2000);
        Phone phone = new Phone("Iphone","14",2022);
        Animal animal = new Animal ("dzik", 75.0);

        Human seller = new Human("seller",100.0);
        seller.car = car;
        car.sell(seller,bartek,19.0);

        seller.pet = bartek;
        bartek.sell(seller,bartek,20.0);


    }
}