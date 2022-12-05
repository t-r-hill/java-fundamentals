package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
class Exercise_02{
    public static void main(String[] args) {
        int[] nums = {1,0,2,0,3,0,4,0,5};
        try{
            System.out.println(nums[2]/nums[11]);
        } catch (ArithmeticException exc1){
            System.out.println("Error Handled");
            System.out.println(exc1.toString());
        } catch (ArrayIndexOutOfBoundsException exc2){
            System.out.println("Error Handled");
            System.out.println(exc2.toString());
        }
    }
}

