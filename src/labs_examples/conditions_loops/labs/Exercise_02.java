package labs_examples.conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 7 to represent a day of the week: ");
        // assign input to variable as int
        int number = scanner.nextInt();
        String weekday = "Other";

        if (number == 1){
            weekday = "Monday";
        } else if (number == 2){
            weekday = "Tuesday";
        } else if (number == 3){
            weekday = "Wednesday";
        } else if (number == 4){
            weekday = "Thursday";
        } else if (number == 5){
            weekday = "Friday";
        } else if (number == 6){
            weekday = "Saturday";
        } else if (number == 7){
            weekday = "Sunday";
        } else {
            weekday = "Other";
        }
        System.out.println(weekday);

    }
}
