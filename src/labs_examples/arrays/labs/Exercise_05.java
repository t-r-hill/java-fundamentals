package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
            }
        for (int i = 0; i < array.length; i += 2){
            System.out.println(array[array.length - 1 - i]);
        }
    }
}