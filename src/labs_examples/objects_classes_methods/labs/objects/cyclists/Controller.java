package labs_examples.objects_classes_methods.labs.objects.cyclists;

public class Controller {

    public static void main(String[] args) {
        Cyclist cyclist1 = new Cyclist("Geraint", "Thomas", 35, 390, "Ineos");
        Bicycle bike1 = new Bicycle("Pinarello", "Dogma", 56, "Shimano", 2022);
        System.out.println(cyclist1.firstName + " " + cyclist1.lastName + " rides a " + bike1.make + " " + bike1.model);

    }
}
