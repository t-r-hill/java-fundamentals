package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {

    public static void main(String[] args) {
        String sentence = "'The brown fox jumped over the gate'";
        int[] numsArray = {56, 87, 64, 23};
        System.out.println("Multiply with 2 parameters = " + multiply(2,3));
        System.out.println("Multiply with 3 parameters = " + multiply(2,3, 4));
        System.out.println("Multiply with 4 parameters = " + multiply(2,3, 4, 5));
        System.out.println("Max of 56,87,64,23 is " + max(56,87,64,23));
        System.out.println("There are " + countConsonants(sentence) + " consonants in " + sentence);
        System.out.println("Is 53 prime? " + isPrime(53));
        System.out.println("The minimum and maximum values of " + Arrays.toString(numsArray) + " are " + Arrays.toString(minMax(numsArray)));
        System.out.println("From 0 up to 248 these numbers are divisible by 3 and 4: " + multiples(248, 3,4));
        System.out.println("The reverse of " + Arrays.toString(numsArray) + " is " + Arrays.toString(reverseIntArray(numsArray)));
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static int multiply(int a, int b, int c){
        return a * b * c;
    }

    public static int multiply(int a, int b, int c, int d){
        return a * b * c * d;
    }

    public static int max(int a, int b, int c, int d){
        int max = a;
        int[] nums = {a,b,c,d};
        for (int num : nums){
            max = (max > num) ? max : num;
        }
        return max;
    }

    public static int countConsonants(String sentence){
        String lsentence = sentence.toLowerCase();
        String consonants = "bcdfghjklmnpqrstvwxyz";
        int count = 0;
        for (int i = 0; i < sentence.length(); i++){
            if (consonants.indexOf(lsentence.charAt(i)) >= 0) count++;
        }
        return count;
    }

    public static boolean isPrime(int num){
        boolean hasFactor = false;
        for (int i = 2; i * i <= num; i++){
            if (num % i == 0){
                hasFactor = true;
                break;
            }
        }
        return !hasFactor;
    }

    public static int[] minMax(int[] nums){
        int[] minMax = {nums[0], nums[0]};
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < minMax[0]){
                minMax[0] = nums[i];
            }
            else if (nums[i] > minMax[1]) minMax[1] = nums[i];
        }
        return minMax;
    }

    public static ArrayList<Integer> multiples(int maxNum, int divisor1, int divisor2){
        int mult = divisor1 * divisor2;
        int num = mult;
        ArrayList<Integer> mults = new ArrayList<Integer>();
        while (num < maxNum){
            mults.add(num);
            num += mult;
        }
        return mults;
    }

    public static int[] reverseIntArray(int[] array){
        int temp;
        for (int i = 0; i < array.length / 2; i++){
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
