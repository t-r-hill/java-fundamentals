package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

class Demo{
    public static void main(String[] args) {
        ArrayList<Number> nums = new ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
//        ArrayList<String> nums = new ArrayList();
//        nums.add("Hello");
//        nums.add("how");
//        nums.add("are");
//        nums.add("you");
        System.out.println(GenericMethod.sum(nums));
    }

}

class GenericMethod{
    public static int sum(ArrayList<? extends Number> nums){
        int sum = 0;
        for (Number num : nums){
            sum += num.intValue();
        }
        return sum;
    }
}