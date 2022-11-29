package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a first number: ");
        // assign input to variable as int
        int num1 = scanner.nextInt();
        // prompt user again
        System.out.print("Enter a second number: ");
        // assign input to variable as int
        int num2 = scanner.nextInt();
        // assign sum variable
        int sum = 0;
        double average = 0;

        // calculate sum
        if (num1 < num2){
            int count = num2 - num1 + 1;
            for ( ; num1 <= num2; num1++){
                sum += num1;
            }
            average = (double) sum / count;
            num1 -= num2;
        } else if (num2 < num1){
            int count = num1 - num2 + 1;
            for ( ; num2 <= num1; num2++){
                sum += num2;
            }
            average = (double) sum / count;
            num2 -= num1;
        } else {
            sum = 0;
            average = 0;
        }
        System.out.println("The sum of all the integers between " + num1 + " and " + num2 + " is = " + sum);
        System.out.println("The average of " + num1 + " and " + num2 + " is = " + average);
    }
}
