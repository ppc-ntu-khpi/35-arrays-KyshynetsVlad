# Практична робота "Масиви, вирази, керування виконанням програми"

# Виконання:

## Умова
<b>Я описав завдання номер 2:</b>
<p>Заповнити масив довільного розміру числами в порядку зростання, починаючи з центру масиву, наприклад, [5,4,3,2,1,0,1,2,3,4,5].</p>

# Код:

## CLASS Exercise:
```java
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
``` 
## CLASS TestResult:
```package test;
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
``` 
## Скріншоти

![Done](https://github.com/ppc-ntu-khpi/35-arrays-KyshynetsVlad/blob/master/Scrins/Scrin1.png "Done")
![Done](https://github.com/ppc-ntu-khpi/35-arrays-KyshynetsVlad/blob/master/Scrins/Scrin2.png "Done")

## Документація
[Сайт](https://ppc-ntu-khpi.github.io/35-arrays-KyshynetsVlad/)
