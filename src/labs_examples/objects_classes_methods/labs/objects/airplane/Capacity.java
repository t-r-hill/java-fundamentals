package labs_examples.objects_classes_methods.labs.objects.airplane;

public class Capacity {
    private int numPassengers;
    private int numCrew;
    private int numLuggage;

    public Capacity(int numPassengers, int numCrew, int numLuggage) {
        this.numPassengers = numPassengers;
        this.numCrew = numCrew;
        this.numLuggage = numLuggage;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public int getNumCrew() {
        return numCrew;
    }

    public void setNumCrew(int numCrew) {
        this.numCrew = numCrew;
    }

    public int getNumLuggage() {
        return numLuggage;
    }

    public void setNumLuggage(int numLuggage) {
        this.numLuggage = numLuggage;
    }

    @Override
    public String toString() {
        return "Capacity{" +
                "numPassengers=" + numPassengers +
                ", numCrew=" + numCrew +
                ", numLuggage=" + numLuggage +
                '}';
    }
}
