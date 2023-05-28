package JavaOOP_Advanced._09_Abstract_classes_Interfaces;

public class Circle extends Shape{

    public Circle(double height, double width){
        super(height, height);

    }

    @Override
    double calculateArea(){
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }
}
