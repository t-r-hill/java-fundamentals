package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class Exercise_04 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 3, 0, 4, 0, 5};
        try {
            System.out.println(nums[2] / nums[3]);
        } catch (ArithmeticException exc1) {
            System.out.println("Error Handled");
            System.out.println(exc1.toString());
            try {
                System.out.println(nums[2] / nums[11]);
            } catch (ArrayIndexOutOfBoundsException exc2) {
                System.out.println("Error Handled");
                System.out.println(exc2.toString());
            }
        }
    }
}