package labs_examples.objects_classes_methods.labs.objects.cyclists;

public class Bicycle {
    String make;
    String model;
    int size;
    String groupset;
    int year;

    public Bicycle(String make, String model, int size, String groupset, int year) {
        this.make = make;
        this.model = model;
        this.size = size;
        this.groupset = groupset;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getGroupset() {
        return groupset;
    }

    public void setGroupset(String groupset) {
        this.groupset = groupset;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
