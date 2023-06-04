package JavaOOP_Advanced._11_Records__ternary_operator__BigInteger;


import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        double x = Math.random() * 100;
        String output = x >= 50 ? "x is greater than or equal to 50" : "x is less than 50";
        System.out.println(output);
    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person p1 = new Person("Giulia", 36, "Via Matteotti, 8");
        System.out.println(p1.toString());
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        BigInteger num1 = new BigInteger("3948393848764637387736626472746545262");
        BigDecimal num2 = new BigDecimal("89.647382993874654656473893939387664");
        BigInteger divideResult = new BigInteger("0");
        BigDecimal decimalDivideResult = new BigDecimal("0.0");
        divideResult = num1.divide(new BigInteger("3"));
        System.out.println(divideResult);
        decimalDivideResult = num2.divide(BigDecimal.valueOf(Math.PI));
        System.out.println(decimalDivideResult);
    }

}
