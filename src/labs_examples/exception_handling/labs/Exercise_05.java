package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        int[] nums = {9,7,5,3,1};
        for (int num : nums){
            System.out.println(num);
            if (num == 3){
                throw new ArithmeticException();
            }
        }
    }

}