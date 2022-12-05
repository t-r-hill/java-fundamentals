package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int[] nums = {1,0,2,0,3,0,4,0,5};
        try{
            System.out.println(nums[2]/nums[1]);
        } catch (ArithmeticException exc){
            System.out.println("Error Handled");
            System.out.println(exc.toString());
        }
    }
}