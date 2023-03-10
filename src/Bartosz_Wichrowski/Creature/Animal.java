package Bartosz_Wichrowski.Creature;

import Bartosz_Wichrowski.Behaviours.Feedable;
import Bartosz_Wichrowski.Behaviours.Saleable;

public abstract class Animal implements Saleable, Feedable {
    String species;
    String name;
    Double weight;
    Boolean alive;

    public Animal(String species) {
        this.species = species;
        this.alive = true;
    }

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight > 0 ? weight : null;
        this.alive = true;
    }

    public void walkOut(){
        if(!this.alive){
            System.out.println("Ty paskudo, to zwierzę nie żyje!!!");
        }else{
            this.weight -= 0.5;
            if(this.weight <= 0)
                this.alive = false;
        }
    }

    public void feed() {
        if(!this.alive){
            System.out.println("Ty paskudo, to zwierzę nie żyje!!!");
        }
        else{
            this.weight += 0.5;
        }
    }

    public void feed(Double foodWeight) {
        this.weight += foodWeight;
        System.out.println("nowa waga to " + this.weight);
    }
    
	public String toString() {
		return "animal of species: " + this.species;
	}

    public void sell(Human seller, Human buyer, Double price) {
            if(seller.pet == this && buyer.cash >= price){
                seller.cash += price;
                buyer.cash -= price;
                buyer.pet = seller.pet;
                seller.pet = null;

            }
    }
}
