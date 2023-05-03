package JavaOOP._019_Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student1 = new Student("Mario","Rossi",19,1,"Economia");

        student1.setName("Roberto");
        student1.setLastName("Casale");
        student1.setAge(23);
        student1.setYearOfCourse(3);
        student1.setCourse("Informatica");

        System.out.println("Name = " + student1.getName()
        + "\nLast name = " + student1.getLastName()
        + "\nAge = " + student1.getAge()
        + "\nYear of course = " + student1.getYearOfCourse()
        + "\nCourse = " + student1.getCourse());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Student std = new Student("Sonia", "Reis", 25, 5, "Lettere");

        System.out.println(std.getName());
        std.setName("Giulia");
        System.out.println(std.getName());
        System.out.println(std.getNameCounter());
    }
}