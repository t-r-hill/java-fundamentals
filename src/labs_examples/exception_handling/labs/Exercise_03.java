package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
 class Exercise_03{
    public static void main(String[] args) {
        int[] nums = {1,0,2,0,3,0,4,0,5};
        try{
            System.out.println(nums[2]/nums[0]);
        } catch (ArithmeticException exc1){
            System.out.println("Error Handled");
            System.out.println(exc1.toString());
        } catch (ArrayIndexOutOfBoundsException exc2){
            System.out.println("Error Handled");
            System.out.println(exc2.toString());
        } finally{
            System.out.println("This happens whether an exception occurs or not");
        }
    }
}