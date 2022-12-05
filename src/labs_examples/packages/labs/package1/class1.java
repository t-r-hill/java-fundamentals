package labs_examples.packages.labs.package1;

import labs_examples.packages.labs.package2.class2;

public class class1 {

    public static void main(String[] args) {
        method1();
        method2();
        method3();
        class2.method1();
        class2.method2();
        class2.method3();


    }

    static void method1(){
        System.out.println("Printing package1.class1.method1");
    }

    protected static void method2(){
        System.out.println("Printing package1.class1.method2");
    }

    public static void method3(){
        System.out.println("Printing package1.class1.method3");
    }
}
