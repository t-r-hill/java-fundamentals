package labs_examples.lambdas.labs;

import java.util.function.Function;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

class Exercise_03{

    public static void main(String[] args) {
        saySomething("Goodbye", MethodRefExample::addHello);

        MethodRefExample example2 = new MethodRefExample(2);
        saySomething("Hello", example2::addExampleNum);

        MethodRefExample example3 = Exercise_03.f.apply(3);
        saySomething("Hello", example3::addExampleNum);
    }

    private static void saySomething(String m, Function<String, String> f) {
        System.out.println(f.apply(m));
    }

    static Function<Integer, MethodRefExample> f = MethodRefExample::new;


}

class MethodRefExample{
    int exampleNum;

    MethodRefExample(int num){
        this.exampleNum = num;
    }

    public static String addHello(String input){ return input + ". " + "Hello!";}

    String addExampleNum(String input){ return input + " . This is is example number" + exampleNum;}

}