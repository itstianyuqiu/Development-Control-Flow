package ictgradschool.industry.lab_controlflow.ex02;

/**
 * Programming for Industry
 * Lab 02 - Control Flow
 * Exercise Two
 */
public class ExerciseTwo {

    /**
     * Excersise Two: Declare a boolean called hasFinished, then write some code which calls the printResults()
     * method if hasFinished is true.
     */
    public void ex02() {

        boolean hasFinished = false;


        if (hasFinished==true) {
            printResults();
        }


    }

    private void printResults() {
        System.out.println("RESULTS!");
    }

    /**
     * Runs the program.
     *
     * Don't edit this, but feel free to look at it for testing purposes.
     */
    public static void main(String[] args) {
        ExerciseTwo cr = new ExerciseTwo();
        cr.ex02();
    }

}
