package labs_examples.objects_classes_methods.labs.objects.airplane;

public class FlightSystem {
    private boolean hasAutopilot;
    private int numPilots;

    public FlightSystem(boolean hasAutopilot, int numPilots) {
        this.hasAutopilot = hasAutopilot;
        this.numPilots = numPilots;
    }

    public boolean isHasAutopilot() {
        return hasAutopilot;
    }

    public void setHasAutopilot(boolean hasAutopilot) {
        this.hasAutopilot = hasAutopilot;
    }

    public int getNumPilots() {
        return numPilots;
    }

    public void setNumPilots(int numPilots) {
        this.numPilots = numPilots;
    }

    @Override
    public String toString() {
        return "FlightSystem{" +
                "hasAutopilot=" + hasAutopilot +
                ", numPilots=" + numPilots +
                '}';
    }
}
