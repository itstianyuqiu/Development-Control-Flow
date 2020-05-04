package ictgradschool.industry.lab_controlflow.ex04;

/**
 * Programming for Industry
 * Lab 02 - Control Flow
 * Exercise Four
 */
public class ExerciseFour {

    /**
     * Excersise 4: Complete the getGender() method below so that it assigns the correct value to the gender variable
     * according to the code passed in as a char parameter.
     *
     * <p>The gender will be determined as follows:</p>
     * <ul>
     *     <li>If code is equal to 'F' or 'f' the method should assign "Female" to gender</li>
     *     <li>Else if the code is equal to 'M' or 'm' the method should assign "Male" to gender</li>
     *     <li>Else the method should assign "Unknown" to the gender variable</li>
     * </ul>
     *
     * @param code the code to check
     * @return the correct gender, based on the code.
     */
    public String getGender(char code) {

        String gender = "";

        if (code == 'F' || code == 'f'){
            gender = "Female";

        }
        else if (code == 'M' || code == 'm'){
            gender ="Male";
        }
        else {
            gender = "Unknown";
        }

        // TODO Assign the correct gender.

        return gender;
    }
}
