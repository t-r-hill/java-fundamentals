package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Tom");
        names.add("Louise");
        names.add("Felix");

        System.out.println(names.get(1));

        System.out.println(names.indexOf("Felix"));

    }
}
