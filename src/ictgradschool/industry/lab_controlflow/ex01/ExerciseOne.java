package ictgradschool.industry.lab_controlflow.ex01;

/**
 * Programming for Industry
 * Lab 02 - Control Flow
 * Exercise One
 */
public class ExerciseOne {

    /**
     * Exercise One: Write a Java "if" statement that prints out "Healthy Weight" if the value of bmi is between
     * 19 and 25 (inclusive).
     */
    public void printHealthyWeight(int bmi) {

        System.out.println("bmi is: " + bmi);

        if (bmi>=19&&bmi<=25) {
            System.out.println("Healthy Weight");
        }
    }

    /**
     * Runs the program.
     *
     * Don't edit this, but feel free to look at it for testing purposes.
     */
    public static void main(String[] args) {
        ExerciseOne cr = new ExerciseOne();

        cr.printHealthyWeight(12); // Should NOT print "Healthy Weight"
        cr.printHealthyWeight(19); // Should print "Healthy Weight"
        cr.printHealthyWeight(22); // Should print "Healthy Weight"
        cr.printHealthyWeight(25); // Should print "Healthy Weight"
        cr.printHealthyWeight(32); // Should NOT print "Healthy Weight"
    }

}
