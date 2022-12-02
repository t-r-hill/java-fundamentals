package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Desktop implements Computer{
    boolean isOn;
    String currentStatus;

    public Desktop(){};

    @Override
    public void turnOn() {
        System.out.println("Turning on");
        isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off");
        isOn = false;
    }

    @Override
    public void runProgram(String program) {
        if (isOn) {
            currentStatus = ("Running program " + program);
            System.out.println(currentStatus);
        } else System.out.println("Please turn on");
    }

    @Override
    public void endProgram() {
        System.out.println(currentStatus + " has finished");
        currentStatus = "Idle";
    }

    public boolean isOn() {
        return isOn;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }
}
