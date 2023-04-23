package JavaBasics._002_Java_Primitives_and_Literals;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        System.out.print('S');
        System.out.println('C');
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        System.out.print("My age is ");
        System.out.println(31);

        System.out.print("I had lunch = ");
        System.out.println(true);

        System.out.print("Price of my lunch is ");
        System.out.println(6.70);
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        int age = 31;
        boolean hadLunch = true;
        double lunchPrice = 6.70;

        System.out.print("My age is ");
        System.out.println(age);

        System.out.print("I had lunch = ");
        System.out.println(hadLunch);

        System.out.print("Price of my lunch is ");
        System.out.println(lunchPrice);
    }
}
