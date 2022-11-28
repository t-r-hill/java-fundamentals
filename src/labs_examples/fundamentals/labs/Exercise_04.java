package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below

        // declaring the variables

        boolean isBool = true;
        byte b = 5;
        char c = 'a';
        short s = 2022;
        long l = 1000000l;
        float f = 3.141459f;
        double d = 3.1415926536;

        // printing the variables

        System.out.println("isBool a boolean = " + isBool);
        System.out.println("a byte is small like b = " + b);
        System.out.println("a char is a single character like c = " + c);
        System.out.println("a short is a bit bigger than a byte and about the right size for storing a year like s = " + s);
        System.out.println("a long can store biggggg numbers like l " + l);
        System.out.println("a float stores decimals like pi = " + f);
        System.out.println("but pi to more precision needs a double like d = " + d);




    }

}
