package Bartosz_Wichrowski.Device.Cars;

import Bartosz_Wichrowski.Creature.Human;
import Bartosz_Wichrowski.Behaviours.Saleable;

public abstract class Car extends Bartosz_Wichrowski.Device.Device implements Saleable{
    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer,model,yearOfProduction);
        this.mileage = 0.0;
    }

    public Double mileage;
    public Double worth;
    public String color;


    public String toString() {
    	return "Bartosz_Wichrowski.Car of model: " + this.model;
    }
    public void turnOn(){
         System.out.println("Samochod wlacza sie");
    }
    public abstract void refuel();

    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getCar() == this && buyer.cash >= price){
            seller.cash += price;
            buyer.cash -= price;
            seller.carSold();
            buyer.carBought(seller.getCar());
            System.out.println("Udalo sie kupic auto");
        }
        else {
            System.out.println("Nie udalo sie kupic auta");
        }
    }
}
