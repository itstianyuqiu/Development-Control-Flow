package ictgradschool.industry.lab_controlflow.ex03;

/**
 * Programming for Industry
 * Lab 02 - Control Flow
 * Exercise Three
 */
public class ExerciseThree {

    /**
     * Excersise 3a: Write a Java  boolean expression which tests whether the value of the char variable, userResponse,
     * is equal to either 'y' or 'Y'.
     *
     * @param userResponse the user's response
     * @return true if the response is 'y' or 'Y", false otherwise.
     */
    public boolean testForYes(char userResponse) {

        boolean expression = false;

        if (userResponse == 'y' || userResponse == 'Y'){
            expression = true;
        }
        // TODO Check whether userResponse is 'y' or 'Y'.

        return expression;
    }

    /**
     * Exercise 3b: Write a Java boolean expression which tests whether the value of the int variable, amount,
     * is odd (i.e. not evenly divisible by 2).
     *
     * @param amount the amount to check
     * @return true if the amount is odd, false otherwise.
     */
    public boolean testForOdd(int amount) {

        boolean expression = false;

        if (amount % 2 != 0) {
            expression = true;
        }
        // TODO Check whether "amount" is odd.

            return expression;
    }

    /**
     * Exercise 3c: Write a Java boolean expression which tests whether the String variable, firstName,
     * begins with the letter 'A'.
     *
     * @param firstName the name to check
     * @return true if the name starts with 'A', false otherwise.
     */
    public boolean startsWithA(String firstName) {

        boolean expression = false;

        char letter = firstName.charAt(0);

        if (letter =='a' || letter =='A'){
            expression = true;
        }
        // TODO Check whether firstName starts with 'A' (or 'a').

        return expression;
    }

    /**
     * Exercise 3d: Write a Java boolean expression which tests whether the String variable, singer, is equal
     * to "Taylor Swift" (Hint: remember that Strings are objects, not primitive types).
     *
     * @param singer the singer to check
     * @return true if the singer is Taylor Swift, false otherwise.
     */
    public boolean isTaylorSwift(String singer) {

        boolean expression = false;
        if (singer.equals("Taylor Swift")){
            expression = true;
        }
        // TODO Check whether the given singer is Taylor Swift.

        return expression;
    }

    /**
     * Exercise 3e: Write a Java boolean expression which tests whether the value of the int variable yearBorn,
     * is greater than 1978 but is not equal to 2013.
     *
     * @param yearBorn the year to check
     * @return true if the year meets the given requirements, false otherwise.
     */
    public boolean isCorrectYear(int yearBorn) {

        boolean expression = false;

        if (yearBorn > 1978 && yearBorn != 2013){
            expression = true;
        }
        // TODO Check whether the given year meets the stated requirements

        return expression;
    }
}
