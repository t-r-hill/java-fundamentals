package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 * <p>
 * 1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 * 2.) Create a few objects of your generic class with different data types to demonstrate it's
 * dynamic usage.
 */

class Exercise_01 {
    public static void main(String[] args) {
        Generic<String> gen1 = new Generic<String>("Hello", "world");
        Generic<Integer> gen2 = new Generic<Integer>(1, 2);


    }
}

class Generic<T> {
    T val1;
    T val2;

    Generic(T val1, T val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }
}
