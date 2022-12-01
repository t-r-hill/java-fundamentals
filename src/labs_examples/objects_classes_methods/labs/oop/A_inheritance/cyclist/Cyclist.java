package labs_examples.objects_classes_methods.labs.oop.A_inheritance.cyclist;

public class Cyclist {
    String firstName;
    String lastName;
    int age;

    public void goesOnTrainingRide(){
        System.out.println("Going cycling....back in a bit");
    }

    public void cleansBike(){
        System.out.println("Bike is nice and shiny!");
    }

    public Cyclist(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
