package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"

        int len = str.length();

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2

        boolean areStringsEqual = str.equals(str2);

        // please concatenate str & str2 and set the result to a new String variable below

        String concatStrings = str + str2;

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        String str3 = "eat";

        String str4 = "meat";

        Boolean subString = str4.substring(1).equals(str3);

        // printing results

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
        System.out.println("areStringsEqual = " +areStringsEqual);
        System.out.println("str and str2 concatenated = " + concatStrings);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);
        System.out.println("is str3 a substring of str4 = " + subString);
    }


}