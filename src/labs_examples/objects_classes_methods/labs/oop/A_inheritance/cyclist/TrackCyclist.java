package labs_examples.objects_classes_methods.labs.oop.A_inheritance.cyclist;

public class TrackCyclist extends Cyclist{
    String event;
    int max5sPower;
    int max60sPower;
    int max5mPower;

    public TrackCyclist(String firstName, String lastName, int age, String event, int max5sPower, int max60sPower, int max5mPower) {
        super(firstName, lastName, age);
        this.event = event;
        this.max5sPower = max5sPower;
        this.max60sPower = max60sPower;
        this.max5mPower = max5mPower;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getMax5sPower() {
        return max5sPower;
    }

    public void setMax5sPower(int max5sPower) {
        this.max5sPower = max5sPower;
    }

    public int getMax60sPower() {
        return max60sPower;
    }

    public void setMax60sPower(int max60sPower) {
        this.max60sPower = max60sPower;
    }

    public int getMax5mPower() {
        return max5mPower;
    }

    public void setMax5mPower(int max5mPower) {
        this.max5mPower = max5mPower;
    }

    @Override
    public void cleansBike(){
        System.out.println("I only cycle indoors, it doesn't need cleaning");
    }
}
