package labs_examples.lambdas.labs;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */

class Exercise_01{

    public static void main(String[] args) {
        // Part 1 + 2
        NoParametersVoid anon1 = new NoParametersVoid() {
            @Override
            public void call() {
                System.out.println("Called NoParametersVoid from anon");
            }
        };

        NoParametersVoid lambda1 = () -> System.out.println("Called NoParametersVoid from lambda");

        anon1.call();
        lambda1.call();

        // Part 3 + 4
        OneParameterReturn<Integer> anon3 = new OneParameterReturn<Integer>() {
            @Override
            public Integer transform(Integer var) {
                Integer a = 10 * var;
                return a;
            }
        };

        OneParameterReturn<Integer> lambda3 = (Integer x) -> x * 10;

        System.out.println(anon3.transform(5));
        System.out.println(lambda3.transform(5));

        // Part 5 + 6
        TwoParameterReturn<Integer, String> anon5 = new TwoParameterReturn<Integer, String>(){
            @Override
            public String BiTransform(Integer a, Integer b){
                Integer c = a + b;
                return "The sum of " + a + " and " + b + " equals " + c;
            }
        };

        TwoParameterReturn<Integer, String> lambda5 = (Integer a, Integer b) -> {
            Integer c = a + b;
            return "The sum of " + a + " and " + b + " equals " + c;
        };

        System.out.println(anon5.BiTransform(2,3));
        System.out.println(lambda5.BiTransform(2,3));

        Function<Integer, Integer> lambda7 = (a) -> 4 * a +7;
        Supplier<String> lambda8 = () -> "Supplied by get()";

        System.out.println(lambda7.apply(6));
        System.out.println(lambda8.get());
    }
}

interface NoParametersVoid {
    void call();
}

interface OneParameterReturn<T> {
    T transform(T var);
}

interface TwoParameterReturn<T, R> {
    R BiTransform(T var1, T var2);
}

