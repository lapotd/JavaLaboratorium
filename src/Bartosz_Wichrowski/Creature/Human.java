package Bartosz_Wichrowski.Creature;

import Bartosz_Wichrowski.Device.Car;
import Bartosz_Wichrowski.Device.Phone;

public class Human extends Animal {

	public Human(String name, Double cash) {
		super("homo sapiens");
		this.name = name;
		this.salary = 0.0;
		this.weight = 70.0;
		this.cash = cash;
	}
	public Animal pet;
	public Phone phone;
	public String name;
	public Double cash;
	private Double salary;
	public Car car;

	public Double getSalary() {
		return this.salary;
	}
	
	public void setSalary(Double value) {
		if(value<0) {
			System.out.println("Nie mozna ustawi� ujemnej wyp�aty");
			return;
		}
		System.out.println("nowe dane zosta�y wys�ane do systemu ksi�gowego");
		System.out.println("istnieje konieczno�� odebrania aneksu do umowy od pani Hani z kadr");
		System.out.println("ZUS i US ju� wiedz� o zmianie wyp�aty i nie ma sensu ukrywa� dochodu");
		this.salary = value;
	}
	
	public Car getCar() {
		return this.car;
	}
	
	public void setCar(Car newCar) {
		if(this.salary > newCar.worth) {
			System.out.println("Udalo sie kupic auto za gotowke");
			this.car = newCar;
		}
		else if(this.salary> newCar.worth/12) {
			System.out.println("Udalo sie kupic auto na kredyt");
			this.car = newCar;
		}
		else {
			System.out.println("zapisz si� na studia i znajd� now� robot� albo id� po podwy�k�");
		}
	}

	public void carSold(){
		this.car=null;
	}

	public void carBought(Car car){
		this.car=car;
	}

	public void sell(Human seller, Human buyer, Double price) {
		System.out.println("Ty bydlaku, probojesz sprzedac czlowieka!");
		return;
	}
	
	public String toString() {
		return "human named: " + this.name;
	}

}
