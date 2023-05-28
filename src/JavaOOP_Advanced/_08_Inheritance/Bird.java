package JavaOOP_Advanced._08_Inheritance;

public class Bird extends Animal{

    private double wingSpan;

    public Bird(double wingSpan, double height, double weight){
        super(height, weight);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan(){
        return this.wingSpan;
    }
    public void setWingSpan(double wingSpan){
        this.wingSpan = wingSpan;
    }

    public double flySpeedMetersPerSecond(double wingSpan){
        double speed = wingSpan * 4;
        return speed;
    }
}



