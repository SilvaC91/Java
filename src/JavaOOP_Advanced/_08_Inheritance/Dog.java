package JavaOOP_Advanced._08_Inheritance;

public class Dog extends Animal {
    private String breed;

    public Dog(String breed, double heights, double weight){
        super(heights,weight);
        this.breed = breed;
    }

    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public double runSpeedMetersPerSecond(double height){
        double speed = height * 2;
        return speed;
    }

}




