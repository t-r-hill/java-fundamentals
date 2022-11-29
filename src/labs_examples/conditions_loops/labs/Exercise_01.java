package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 1: Even or Odd
 *
 *      Write a program that gets a number between 1 and 1,000,000
 *      from the user and determines whether it is odd
 *      or even using an if statement. Print the result.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 */

public class Exercise_01 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 1,000,000,000 to determine whether it is odd or even: ");
        // assign input to variable as int
        int number = scanner.nextInt();
        String message = "";

        // write completed code here
        if (number < 1){
            message = "That number is too small, please enter a number between 1 and 1,000,000,000";
        } else if (number > 1000000000){
            message = "That number is too large, please enter a number between 1 and 1,000,000,000";
        } else if (number % 2 == 0){
            message = "That number is even";
        } else{
            message = "That number is odd";
        }
        System.out.println(message);

    }
}
