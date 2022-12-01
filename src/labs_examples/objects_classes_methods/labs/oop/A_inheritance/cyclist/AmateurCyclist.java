package labs_examples.objects_classes_methods.labs.oop.A_inheritance.cyclist;

public class AmateurCyclist extends Cyclist{
    int ageGroup;
    boolean hasRacingLicence;

    public AmateurCyclist(String firstName, String lastName, int age, int ageGroup, boolean hasRacingLicence) {
        super(firstName, lastName, age);
        this.ageGroup = ageGroup;
        this.hasRacingLicence = hasRacingLicence;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public boolean isHasRacingLicence() {
        return hasRacingLicence;
    }

    public void setHasRacingLicence(boolean hasRacingLicence) {
        this.hasRacingLicence = hasRacingLicence;
    }
}
