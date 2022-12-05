package labs_examples.static_nonstatic.labs;

public class Class1 {
    public static void staticMethod1(){
        System.out.println("Class1 staticMethod1");
    }

    public static void staticMethod2(){
        System.out.println("Calling Class1 staticMethod1");
        staticMethod1();
        System.out.println("Calling Class1 nonStaticMethod1");
        Class1 class1 = new Class1();
        class1.nonStaticMethod1();
        System.out.println("Calling Class2 staticMethod1");
        Class2.staticMethod1();
        System.out.println("Calling Class2 nonStaticMethod1");
        Class2 class2 = new Class2();
        class2.nonStaticMethod1();
    }

    public void nonStaticMethod1(){
        System.out.println("Class1 nonStaticMethod1");
    }

    public void nonStaticMethod2(){
        System.out.println("Calling Class1 staticMethod1");
        staticMethod1();
        System.out.println("Calling Class1 nonStaticMethod1");
        Class1 class1 = new Class1();
        class1.nonStaticMethod1();
        System.out.println("Calling Class2 staticMethod1");
        Class2.staticMethod1();
        System.out.println("Calling Class2 nonStaticMethod1");
        Class2 class2 = new Class2();
        class2.nonStaticMethod1();
    }
}
