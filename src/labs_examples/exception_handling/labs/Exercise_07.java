package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
class Exercise_07{
    public static void main(String[] args){
        try {
            GenException.genException();
        } catch (CustomException e) {
            System.out.println(e.toString());;
        }
    }


}

class GenException{
    public static void genException() throws CustomException {
        throw new CustomException();
    }
}

class CustomException extends Exception{
    @Override
    public String toString(){
        return "Custom exception has been thrown";
    }
}

