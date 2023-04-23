package JavaBasics._003_Variables_and_naming_conventions_comments;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int age = 31;
        System.out.println("My age is " + age);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        char nameInitial = 'S';
        int age = 31;
        System.out.println("My age is " + age + ", my name initial is " + nameInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // create a variable to represent whether or not had lunch
        boolean hasEatenLunch = false;
        // create a variable to represent the cost of lunch
        double lunchCost = 5.99;
        // output the cost of lunch
        System.out.println("Lunch cost=" + lunchCost);
        // output whether or not had lunch
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
