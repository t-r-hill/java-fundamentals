package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Laptop implements Computer{
    int batteryLevel;
    boolean isOn;
    String currentStatus;

    public Laptop(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on - battery level = " + batteryLevel);
        isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off - battery level = " + batteryLevel);
        isOn = false;
    }

    @Override
    public void runProgram(String program) {
        if (isOn) {
            if (batteryLevel > 0) {
                currentStatus = ("Running program " + program);
                System.out.println(currentStatus);
                batteryLevel--;

            } else System.out.println("Battery is empty, please charge");
        } else System.out.println("Please turn on");
    }

    @Override
    public void endProgram(){
        System.out.println(currentStatus + " has finished");
        currentStatus = "Idle";
        System.out.println("Battery level = " + batteryLevel);
    }

    public void charge(){
        System.out.println("Charging");
        batteryLevel++;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }
}
