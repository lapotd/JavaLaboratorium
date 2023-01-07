import Device.Car;
import Device.Phone;

public class Human extends Animal {

	public Human(String name) {
		super("homo sapiens");
		this.name = name;
		this.salary = 0.0;
		this.weight = 70.0;
	}
	public Animal pet;
	public Phone phone;
	public String name;
	private Double salary;
	private Car car;

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
	
	public String toString() {
		return "human named: " + this.name;
	}

}
