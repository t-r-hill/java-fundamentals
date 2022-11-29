package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (i * 5 + j + 1) * 3;
            }
        }

        for (int[] i : array){
            for (int j : i){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}
