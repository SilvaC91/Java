package JavaOOP_Advanced._08_Inheritance;

public class Fish extends Animal{

    private String species;

    public Fish(String species, double height, double weight){
        super(height, weight);
        this.species = species;
    }

    public String getSpecies(){
        return this.species;
    }
    public void setSpecies(String species){
        this.species = species;
    }

    public double swimSpeedMetersPerSecond(double weight){
        double speed = weight * 2;
        return speed;
    }
}
