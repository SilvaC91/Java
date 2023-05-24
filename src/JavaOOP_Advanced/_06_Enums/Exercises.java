package JavaOOP_Advanced._06_Enums;


import java.util.Date;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }
    private enum Days {
        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);

        boolean isWeekend;
        Days(boolean isWeekend){
            this.isWeekend = isWeekend;
        }
        public boolean getIsWeekend(){
            return this.isWeekend;
        }
    }

    private enum Seasons {
        SPRING, SUMMER, FALL, WINTER;
    }

    private enum TrafficLight {
        RED("GREEN"),
        YELLOW("RED"),
        GREEN("YELLOW");

        private String nextLight;

        TrafficLight(String nextLight){
            this.nextLight = nextLight;
        }
        public String getNextLight(){
            return this.nextLight;
        }
    }

    private enum Operator{
        ADD, SUBTRACT, MULTIPLY, DIVIDE;
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */

    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days d : Days.values()) {
            System.out.println(d);
        }

    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Seasons currentSeason = Seasons.SPRING;
        SeasonMonths(currentSeason);
    }
    public static void SeasonMonths(Seasons season){
        switch (season){
            case SPRING :
                System.out.println("Dal 21 Marzo al 21 Giugno");
                break;
            case SUMMER :
                System.out.println("Dal 21 Giugno al 22 Settembre");
                break;
            case FALL :
                System.out.println("Dal 23 Settembre al 21 Dicembre");
                break;
            case WINTER :
                System.out.println("Dal 22 Dicembre al 21 Marzo ");
                break;
        }
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        TrafficLight currentLight = TrafficLight.YELLOW;
        String nextLight = currentLight.getNextLight();
        System.out.println(nextLight);


    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        Days currentDay = Days.SATURDAY;
        if(currentDay.getIsWeekend()){
            System.out.println("It's weekend!");
        }else {
            System.out.println("It's weekday");
        }
    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;
        double result = Calculator(Operator.ADD,num1,num2);
        System.out.println(result);
    }
    public static Double Calculator(Operator operator, double num1, double num2){
        double result = 0;
        switch (operator){
            case ADD:
                result = num1 + num2;
                break;
            case SUBTRACT:
                result = num1 - num2;
                break;
            case MULTIPLY:
                result = num1 * num2;
                break;
            case DIVIDE:
                result = num1 / num2;
                break;
        }
        return result;
    }

}