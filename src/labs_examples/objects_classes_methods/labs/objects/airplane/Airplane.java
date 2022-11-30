package labs_examples.objects_classes_methods.labs.objects.airplane;

public class Airplane {

    public static void main(String[] args) {
        Turbine myTurbine = new Turbine("Boeing", 10, "Diesel");
        Seating mySeating = new Seating(6, true, 10);
        Capacity myCapacity = new Capacity(300, 20, 450);
        FlightSystem myFlightSystem = new FlightSystem(true, 3);

        System.out.println("Number of crew = " + myCapacity.getNumCrew());
        System.out.println("Do we have autopilot?" + myFlightSystem.isHasAutopilot());

        System.out.println(mySeating.toString());
        System.out.println(myTurbine.toString());

    }

    double fuelCapacity;
    double currentFuelLevel;
    Turbine turbine;
    Capacity capacity;
    FlightSystem flightSystem;
    Seating seating;

    public Airplane(double fuelCapacity, double currentFuelLevel, Turbine turbine, Capacity capacity, FlightSystem flightSystem, Seating seating) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.turbine = turbine;
        this.capacity = capacity;
        this.flightSystem = flightSystem;
        this.seating = seating;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public Turbine getEngine() {
        return turbine;
    }

    public void setEngine(Turbine turbine) {
        this.turbine = turbine;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public FlightSystem getFlightSystem() {
        return flightSystem;
    }

    public void setFlightSystem(FlightSystem flightSystem) {
        this.flightSystem = flightSystem;
    }

    public Seating getSeating() {
        return seating;
    }

    public void setSeating(Seating seating) {
        this.seating = seating;
    }
}
