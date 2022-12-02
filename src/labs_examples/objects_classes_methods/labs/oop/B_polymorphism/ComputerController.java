package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class ComputerController {

    public static void main(String[] args) {

        Laptop myLaptop = new Laptop( 5);
        Desktop myDesktop = new Desktop();

        ComputerDependency tester = new ComputerDependency(myLaptop);

        tester.testComputer();
        tester.setComputer(myDesktop);
        tester.testComputer();
    }
}
