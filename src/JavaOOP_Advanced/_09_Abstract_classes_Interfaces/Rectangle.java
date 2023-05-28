package JavaOOP_Advanced._09_Abstract_classes_Interfaces;

public class Rectangle extends Shape{

    public Rectangle(double height, double width){
        super(height, width);
    }

    @Override
    double calculateArea(){
        return getWidth() * getHeight();
    }
}
