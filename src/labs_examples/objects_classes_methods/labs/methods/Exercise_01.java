package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println(multiply(57,34));
        System.out.println(divide(986,23));
        joke();
        System.out.println(yearsToSeconds(4));
        System.out.println(varargs(1,2,3,4,5,6));


    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        return a* b;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        return a / b;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(){
        System.out.println("What do you call a man with a spade in his head?");
        System.out.println("Dug!");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long yearsToSeconds(int years){
        return (long) ((long) years * 365.25 * 24 * 60 * 60);
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varargs(int...array){
        return array.length;
    }






}
