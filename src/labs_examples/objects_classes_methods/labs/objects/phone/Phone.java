package labs_examples.objects_classes_methods.labs.objects.phone;

public class Phone {
    String make;
    String model;
    int Version;
    String colour;
    int price;

    public Phone(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Phone(String make, String model, int version, String colour) {
        this.make = make;
        this.model = model;
        Version = version;
        this.colour = colour;
    }

    public Phone(String make, String model, int version, String colour, int price) {
        this.make = make;
        this.model = model;
        Version = version;
        this.colour = colour;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", Version=" + Version +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
