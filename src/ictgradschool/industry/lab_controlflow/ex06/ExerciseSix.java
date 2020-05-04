package ictgradschool.industry.lab_controlflow.ex06;

/**
 * Programming for Industry
 * Lab 02 - Control Flow
 * Exercise Six
 */
public class ExerciseSix {

    /**
     * Exercise 6: Using a for loop, complete the printRowOfAmpersands() method so that it prints a row of
     * ampersands (&).  The number of ampersands it should print is passed via the int parameter, howMany.
     *
     * For example, when called by: printRowAmpersands(5);
     * The method prints: &&&&&
     *
     * @param howMany the number of ampersands to print.
     */
    public void printRowOfAmpersands(int howMany) {

        for (int i =1; i<= howMany; i++){
            System.out.print('&');
        }

        // TODO Print the given number of ampersands.

    }
}
