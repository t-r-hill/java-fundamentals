package labs_examples.objects_classes_methods.labs.oop.A_inheritance.cyclist;

public class CyclistController {

    public static void main(String[] args) {
        RoadCyclist proRoad = new RoadCyclist("Geraint", "Thomas", 36, "2006", 100000,25,390,"Ineos",23);
        AmateurCyclist me = new AmateurCyclist("Thomas", "Hill", 31, 30, false);

        proRoad.cleansBike();
        me.cleansBike();

        proRoad.goesOnTrainingRide();
        me.goesOnTrainingRide();
    }
}
