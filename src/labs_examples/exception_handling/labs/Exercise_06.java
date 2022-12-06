package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Exercise_06{

    public static void main(String[] args) {
        ExceptionExample.catchesException();
    }
}

class ExceptionExample{
    public static void throwsException() throws ArithmeticException{
        int[] nums = {9,7,5,3,1};
        for (int num : nums){
            System.out.println(num);
            if (num == 3){
                throw new ArithmeticException();
            }
        }
    }

    public static void catchesException(){
        try{
            throwsException();
        } catch (ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}