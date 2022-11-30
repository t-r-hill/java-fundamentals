package labs_examples.objects_classes_methods.labs.objects.airplane;

public class Turbine {
    private String manufacturer;
    private int size;
    private String fuel;

    public Turbine(String manufacturer, int size, String fuel) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.fuel = fuel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
