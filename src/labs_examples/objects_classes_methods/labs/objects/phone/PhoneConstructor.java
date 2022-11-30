package labs_examples.objects_classes_methods.labs.objects.phone;

public class PhoneConstructor {

    public static void main(String[] args) {
        Phone phone1 = new Phone("Apple", "iphone");
        Phone phone2 = new Phone("Samsung", "Galaxy", 12, "Silver");
        Phone phone3 = new Phone("Nokia", "3310", 1, "Navy", 100);

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
    }
}
