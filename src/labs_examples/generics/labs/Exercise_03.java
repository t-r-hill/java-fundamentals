package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Exercise_03{

    public static void main(String[] args) {
        ArrayList<String> palindromeTest = new ArrayList<>();
        palindromeTest.add("poop");
        palindromeTest.add("trart");
        palindromeTest.add("heh");
        System.out.println(GenericMethodClass.countStrings(palindromeTest));
        Integer[] oneToTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(GenericMethodClass.swapPositions(oneToTen, 2, 7));
        System.out.println(GenericMethodClass.maxInRange(palindromeTest));
    }
}

class GenericMethodClass{

    public static <T extends Number, V extends Number> double genericSum(T val1, V val2){
        return val1.doubleValue() + val2.doubleValue();
    }

    public static <T extends Collection<String>> int countStrings(T words){
        int count = 0;
        for (String word : words){
            boolean isPalindrome = false;
            for (int i = 0; i < word.length() / 2; i++){
                if (word.charAt(i) == word.charAt(word.length() - i - 1)){
                    isPalindrome = true;
                } else{
                    isPalindrome = false;
                    break;
                }
            } if (isPalindrome) count++;
        } return count;
    }

    public static <T> T[] swapPositions(T[] arr, int ix1, int ix2){
        T temp = arr[ix1];
        arr[ix1] = arr[ix2];
        arr[ix2] = temp;
        return arr;
    }

    public static <T extends Comparable<T>> T maxInRange(List<T> list){
        T max = list.get(0);
        for (T t : list){
            if (t.compareTo(max) > 1){
                max = t;
            }
        } return max;
    }
}