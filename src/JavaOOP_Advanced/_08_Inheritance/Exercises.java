package JavaOOP_Advanced._08_Inheritance;

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
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog bassotto = new Dog("Bassotto",26.7,8.3);
        System.out.println(bassotto.getBreed());
        System.out.println(bassotto.getHeight());
        System.out.println(bassotto.getWeight());
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish trota = new Fish("Trota",12.4,2.5);
        System.out.println(trota.getSpecies());
        System.out.println(trota.getHeight());
        System.out.println(trota.getWeight());

        Bird aquila = new Bird(2.0,76.4,4.2);
        System.out.println(aquila.getWingSpan());
        System.out.println(aquila.getHeight());
        System.out.println(aquila.getWeight());
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog bassotto = new Dog("Bassotto",26.7,8.3);
        double dogSpeed = bassotto.runSpeedMetersPerSecond(bassotto.getHeight());

        Fish trota = new Fish("Trota",12.4,2.5);
        double fishSpeed = trota.swimSpeedMetersPerSecond(trota.getWeight());

        Bird aquila = new Bird(2.0,76.4,4.2);
        double birdSpeed = aquila.flySpeedMetersPerSecond(aquila.getWingSpan());

       double fastestAnimal = Math.max(dogSpeed, fishSpeed);
       fastestAnimal = Math.max(fastestAnimal, birdSpeed);

        System.out.println(fastestAnimal);

    }
}
