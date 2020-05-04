package ictgradschool.industry.lab_controlflow.ex08;

import java.security.KeyStore;

/**
 * Please run TestExerciseNine to check your answers
 */
public class ExerciseEight {

    /**
     * Q1. Compare two names and if they are the same return "Same name",
     * otherwise if they start with exactly the same letter return "Same
     * first letter", otherwise return "No match".
     *
     * @param firstName
     * @param secondName
     * @return one of three Strings: "Same name", "Same first letter",
     * "No match"
     */
    public String areSameName(String firstName, String secondName) {
        String message = "";

        char letter1 = firstName.charAt(0);
        char letter2 = secondName.charAt(0);

        if (firstName.equals(secondName)) {
            message = "Same name";
        } else if (letter1 == letter2) {
            message = "Same first letter";
        } else {
            message = "No match";
        }
        return message;
    }
    /** areSameName(String, String) => String **/


    /**
     * Q2. Determine if the given year is a leap year.
     *
     * @param year
     * @return true if the given year is a leap year, false otherwise
     */
    public boolean isALeapYear(int year) {
        boolean leapYear = false;

        if (year % 4 == 0) {
            leapYear = true;
        }
        if (year % 100 == 0 && year % 400 != 0) {
            leapYear = false;
        }
        return leapYear;
    }
    /** isALeapYear(int) => boolean **/


    /**
     * Q3. When given an integer, return an integer that is the reverse (its
     * numbers are in reverse to the input).
     * order.
     *
     * @param number
     * @return the integer with digits in reverse order
     */
    public int reverseInt(int number) {
        int reverseNum = 0;
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            reverseNum = reverseNum * 10 + digit;
        }

        return reverseNum;
    }
    /** reverseInt(int) => void **/


    /**
     * Q4. Return the given string in reverse order.
     *
     * @param str
     * @return the String with characters in reverse order
     */
    public String reverseString(String str) {
        String reverseStr = "";
        int length = str.length();

        while (length > 0) {

            reverseStr = reverseStr + str.charAt(length - 1);
            str = str.substring(0, length - 1);
            length -= 1;

        }
        return reverseStr;
    }
    /** reverseString(String) => void **/


    /**
     * Q5. Generates the simple multiplication table for the given integer.
     * The resulting table should be 'num' columns wide and 'num' rows tall.
     *
     * @param num
     * @return the multiplication table as a newline separated String
     */
    public String simpleMultiplicationTable(int num) {
        String multiplicationTable = "";

        for (int j = 1; j < num + 1; j++) {

            int number = 0;
            for (int i = 0; i < num; i++) {

                number = number + j;
                multiplicationTable = multiplicationTable + number + " ";

            }
            multiplicationTable = multiplicationTable.substring(0, multiplicationTable.length() - 1);
            multiplicationTable = multiplicationTable + "\n";
        }
        multiplicationTable = multiplicationTable.substring(0, multiplicationTable.length() - 1);
        return multiplicationTable;
    }
    /** simpleMultiplicationTable(int) => void **/


    /**
     * Q6. Determines the Excel column name of the given column number.
     *
     * @param num
     * @return the column title as a String
     */
    public String convertIntToColTitle(int num) {
        String columnName = "";
        // TODO write answer for Q6
        char before = 0;
        if (num <= 0) {
            return "Input is invalid";
        }

        char last = num % 26 == 0 ? 'Z' : (char) (num % 26 + 64);
        if (num <= 26) {
            return String.valueOf(last);
        }

        while (num > 26) {

            num = (num - 1) / 26;
            if (num % 26 == 0) {
                before = 'Z';
            } else {

                before = (char) (num % 26 + 64);
            }
            columnName = columnName + String.valueOf(before);
        }
        columnName += String.valueOf(last);
        return columnName;

    }

    /** convertIntToColTitle(int) => void **/


    /**
     * Q7. Determine if the given number is a prime number.
     *
     * @param num
     * @return true is the given number is a prime, false otherwise
     */
    public boolean isPrime(int num) {
        // TODO write answer for Q7
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    /** isPrime(int) => void **/


    /**
     * Q8. Determine if the given integer is a palindrome (ignoring negative
     * sign).
     *
     * @param num
     * @return true is int is palindrome, false otherwise
     */
    public boolean isIntPalindrome(int num) {
        // TODO write answer for Q8

        int reverseNum = 0;
        int num1 = num;
        while (num1 != 0) {

            int digit = num1 % 10;
            num1 /= 10;
            reverseNum = reverseNum * 10 + digit;
        }

        if (reverseNum == num) {
            return true;
        } else {

        }

        return false;
    }
    /** isIntPalindrom(int) => boolean **/


    /**
     * Q9. Determine if the given string is a palindrome (case folded).
     *
     * @param str
     * @return true if string is palindrome, false otherwise
     */
    public boolean isStringPalindrome(String str) {
        // TODO write answer for Q9
        String reverseStr = "";
        int n = str.length();

        for (int i = 0; i < n / 2; i++) {

            if (str.toCharArray()[i] != str.toCharArray()[n - i - 1]) {
                return false;
            } else {
                return true;
            }

        }
        return false;
    }
    /** isStringPalindrome(String) => boolean **/


    /**
     * Q10. Generate a space separated list of all the prime numbers from 2
     * to the highest prime less than or equal to the given integer.
     *
     * @param num
     * @return the primes as a space separated list
     */
    public String printPrimeNumbers(int num) {
        boolean ispn;
        String primesStr = "";
        if(num<=1){
            return "No prime number found";
        }
        for (int i = 2; i <= num; i++) {
            ispn=true;
            for (int j = 1; j <=i; j++) {
                if(i%j==0&&j!=1&&j!=i){
                    ispn=false;
                    break;
                }
            }
            if(ispn){
                primesStr+=i+" ";
            }
        }
        primesStr = primesStr.substring(0,primesStr.length()-1);
        return primesStr;
    }
}
