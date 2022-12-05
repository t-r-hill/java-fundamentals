package labs_examples.static_nonstatic.labs;

public class Controller {

    public static void main(String[] args) {
        Class1.staticMethod2();
        Class1 class1 = new Class1();
        class1.nonStaticMethod2();
    }
}
