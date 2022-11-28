package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

        // declaring variables for radius and height

        double r = 3.14;
        int h = 5;

        // calculating volume and surface area

        double vol = Math.PI * Math.pow(r,2) * h;
        double sa = 2 * Math.PI * r * h + Math.PI * Math.pow(r,2) * 2;

        // printing values to console

        System.out.println("radius = " + r);
        System.out.println("height = " + h);
        System.out.println("volume = " + vol);
        System.out.println("surface area = " + sa);

    }
}