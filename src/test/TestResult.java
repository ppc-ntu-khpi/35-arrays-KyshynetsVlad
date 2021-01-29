package test;
import domain.Exercise;

/**
 * Main class TestResult
 */
public class TestResult {
    /**
     * An array of command line arguments supplied to the program, with each argument being a String in the array.
     * @param args Writing an array to a string
     */
    public static void main(String[] args) {
        /**
         * Setting the size of an array
         */
        int[] n = new int[11];
        /**
         * Displaying an array
         */
        System.out.println("Your Array:" + Exercise.Calculate(n));
    }
}
