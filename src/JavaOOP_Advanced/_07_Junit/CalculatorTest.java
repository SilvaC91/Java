package JavaOOP_Advanced._07_Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Calculator calculator = new Calculator();
        Assertions.assertEquals(7, calculator.add(5, 2));
        Assertions.assertEquals(1,calculator.add(-4,5));
        Assertions.assertEquals(5,calculator.add(5,0));

        Assertions.assertEquals(1,calculator.subtract(3, 2));
        Assertions.assertEquals(-2,calculator.subtract(-6, -4));
        Assertions.assertEquals(-10,calculator.subtract(-6, 4));
        Assertions.assertEquals(-7,calculator.subtract(0, 7));
    }

    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Calculator calculator = new Calculator();

        Assertions.assertEquals(10, calculator.multiply(5, 2));
        Assertions.assertEquals(-20,calculator.multiply(-4,5));
        Assertions.assertEquals(24,calculator.multiply(-4,-6));
        Assertions.assertEquals(-0,calculator.multiply(5,0));

        Assertions.assertEquals(2.0,calculator.divide(4.0, 2.0));
        Assertions.assertEquals(1.5,calculator.divide(3.0, 2.0));
        Assertions.assertEquals(-5.0,calculator.divide(10.0, -2.0));
        Assertions.assertEquals(6.0,calculator.divide(-36.0, -6.0));
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Calculator calculator = new Calculator();

        Assertions.assertEquals(8,calculator.power(2.0,3.0));
        Assertions.assertEquals(1.0/8.0,calculator.power(2.0,-3.0));
        Assertions.assertEquals(-8.0,calculator.power(-2.0,3.0));
        Assertions.assertEquals(4.0,calculator.power(-2.0,2.0));
        Assertions.assertEquals(6.0,calculator.power(6.0,1.0));
        Assertions.assertEquals(1.0,calculator.power(3.0,0.0));
        Assertions.assertEquals(0.0,calculator.power(0.0,5.0));
        Assertions.assertEquals(16.777216,calculator.power(1.6,6.0));
        Assertions.assertEquals(1410.2404494412485635,calculator.power(5.4,4.3));



    }
}