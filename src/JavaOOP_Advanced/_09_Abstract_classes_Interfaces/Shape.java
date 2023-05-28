package JavaOOP_Advanced._09_Abstract_classes_Interfaces;

public abstract class Shape {

    private double height, width;

    public Shape(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double getHeight() {
        return this.height;
    }public void setHeight(double height){
        this.height = height;
    }
    public double getWidth() {
        return this.width;
    }public void setWidth(double width){
        this.width = width;
    }
    abstract double calculateArea();
}
