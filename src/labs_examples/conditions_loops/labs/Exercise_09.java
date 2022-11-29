package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {
        int i = 0;
        while (i < 100){
            if (i == 24){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
