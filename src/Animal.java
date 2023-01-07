public class Animal {
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
    
	public String toString() {
		return "animal of species: " + this.species;
	}
}
