package labs_examples.objects_classes_methods.labs.oop.A_inheritance.cyclist;

public class ProfessionalCyclist extends Cyclist{
    String dateTurnedProfessioanl;
    int annualEarnings;
    int numVictories;

    public ProfessionalCyclist(String firstName, String lastName, int age, String dateTurnedProfessioanl, int annualEarnings, int numVictories) {
        super(firstName, lastName, age);
        this.dateTurnedProfessioanl = dateTurnedProfessioanl;
        this.annualEarnings = annualEarnings;
        this.numVictories = numVictories;
    }

    public String getDateTurnedProfessioanl() {
        return dateTurnedProfessioanl;
    }

    public void setDateTurnedProfessioanl(String dateTurnedProfessioanl) {
        this.dateTurnedProfessioanl = dateTurnedProfessioanl;
    }

    public int getAnnualEarnings() {
        return annualEarnings;
    }

    public void setAnnualEarnings(int annualEarnings) {
        this.annualEarnings = annualEarnings;
    }

    public int getNumVictories() {
        return numVictories;
    }

    public void setNumVictories(int numVictories) {
        this.numVictories = numVictories;
    }

    @Override
    public void cleansBike(){
        System.out.println("Don't be silly, I have someone to do that for me!");
    }

    @Override
    public void goesOnTrainingRide(){
        System.out.println("See you in 6 hours...");
    }
}
