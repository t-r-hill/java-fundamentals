package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 7 to represent a month of the calendar year: ");
        // assign input to variable as int
        int number = scanner.nextInt();
        String month = "Other";

        switch(number){
            case 1:{
                month = "January";
                break;
            }
            case 2:{
                month = "February";
                break;
            }
            case 3:{
                month = "March";
                break;
            }
            case 4:{
                month = "April";
                break;
            }
            case 5:{
                month = "May";
                break;
            }
            case 6:{
                month = "June";
                break;
            }
            case 7:{
                month = "July";
                break;
            }
            case 8:{
                month = "August";
                break;
            }
            case 9:{
                month = "September";
                break;
            }
            case 10:{
                month = "October";
                break;
            }
            case 11:{
                month = "November";
                break;
            }
            case 12:{
                month = "December";
                break;
            }
            default:{
                month = "Other";
            }

        }
        System.out.println(month);
    }

}
