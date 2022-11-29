package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a word: ");
        // assign input to variable as int
        String word = scanner.nextLine();

        // assign variables
        String vowels = "aeiou";
        int len = word.length();
        int i = 0;

        // loop through each letter of word
        while (i < len){
            char pot_vowel = word.charAt(i);
            int j = 0;
            // loop through each letter of vowels
            while (j < 5){
                char vowel = vowels.charAt(j);
                if (pot_vowel == vowel){
                    System.out.println("Your word is " + word + " and the first vowel is " + vowel);
                    return;
                } j++;
            } i++;
        }
        System.out.println("There is no vowel in " + word);
    }
}
