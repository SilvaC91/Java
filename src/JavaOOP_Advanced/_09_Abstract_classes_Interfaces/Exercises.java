package JavaOOP_Advanced._09_Abstract_classes_Interfaces;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     * Create an abstract class called "Shape" with fields of height and width
     *
     * Create classes called "Rectangle" and "Circle" that extend the GeometricShape class and implement the calculateArea() method.
     *
     * Create instances of both and calculate their area
     *
     * To calculate the area copy the following code:  Math.PI * Math.pow((height / 2), 2)
     *
     * BONUS: Make sure the height and width values are exactly the same for Circle, change the constructor to do this
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Rectangle rectangle = new Rectangle(5,4);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Area of rectangle: " + rectangleArea);

        Circle circle = new Circle(5,8);
        double circleArea = circle.calculateArea();
        System.out.println("Area of circle: " +circleArea);
    }

    /**
     * 2:
     *
     *
     * Create an interface class called "Movable" that has the following methods: moveForward, moveBackward
     *
     * Create classes called "Car" and "Boat" that implement the Movable Interface
     *
     * Write code below that creates instances of both the Car and Boat class and demonstrates the use of the methods from the Movable interface.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Car car = new Car();
        int carMovementFromInitialPosition = car.moveForward(5) - car.moveBackward(3);
        System.out.println("Movement of car from initial position: " + carMovementFromInitialPosition);

        Boat boat = new Boat();
        int boatMovementFromInitialPosition = boat.moveForward(7) - boat.moveBackward(10);
        System.out.println("Movement of boat from initial position: " + boatMovementFromInitialPosition);
    }

    /**
     * 3:
     *
     *
     * Create an interface called "Playable" with an abstract method called "play()".
     *
     * Create an abstract class called "Instrument" that implements the Playable interface and contains the fields "name" and "brand".
     *
     * Create classes called "Guitar" and "Piano" that extend the Instrument class and implement the play() method.
     *
     * Write code below that creates instances of both the Guitar and Piano class and demonstrates the use of the play() method.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Guitar guitar = new Guitar("Stratocaster", "Fender");
        guitar.play();

        Piano piano = new Piano("P121","Yamaha");
        piano.play();
    }
}
