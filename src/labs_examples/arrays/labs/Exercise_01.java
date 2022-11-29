package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Please enter 10 numbers");
        // assign input to variable as int
        int[] nums = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++){
            System.out.print("\n");
            System.out.print("Please enter number " + (i+1) + " : ");
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }

        double avg = (double) sum / nums.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);

    }

}