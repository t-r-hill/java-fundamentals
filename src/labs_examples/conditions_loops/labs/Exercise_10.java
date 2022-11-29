package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 10 to skip: ");
        // assign input to variable as int
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            if (i == num){
                continue;
            } System.out.println(i);
        }
    }
}
