package domain;
import java.util.Arrays;

/**
 * Class Exercise
 */
public class Exercise {
    /**
     * The method that calculates our variable
     * @param n Variable that outputs the result
     * @return Array of numbers divided into two parts and expanded
     */
    public static String Calculate(int[] n) {
        /**
         * Variable counter equal to zero
         */
        int counter = 0;
        /**
         * Loop for setting the numbers on the right side of the array
         */
        for (int i = n.length/2; i < n.length; i++) {
            /**
             * Array initialization
             */
            n[i] = counter;
            /**
             * Increase the counter by plus one
             */
            counter++;
        }
        /**
         * Resetting the counter
         */
        counter = 0;
        /**
         * Loop for setting the numbers on the left side of the array
         */
        for (int j = n.length/2; j != -1; j--) {
            /**
             * Array initialization
             */
            n[j] = counter;
            /**
             * Increase the counter by plus one
             */
            counter++;
        }
        /**
         * Returning an array in a string
         */
        return Arrays.toString(n);
    }
}
