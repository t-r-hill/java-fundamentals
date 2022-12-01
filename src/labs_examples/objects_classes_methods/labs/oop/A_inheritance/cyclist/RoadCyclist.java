package labs_examples.objects_classes_methods.labs.oop.A_inheritance.cyclist;

public class RoadCyclist extends ProfessionalCyclist{
    int FTP;
    String team;
    int numGrandTours;

    public RoadCyclist(String firstName, String lastName, int age, String dateTurnedProfessioanl, int annualEarnings, int numVictories, int FTP, String team, int numGrandTours) {
        super(firstName, lastName, age, dateTurnedProfessioanl, annualEarnings, numVictories);
        this.FTP = FTP;
        this.team = team;
        this.numGrandTours = numGrandTours;
    }

    public int getFTP() {
        return FTP;
    }

    public void setFTP(int FTP) {
        this.FTP = FTP;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getNumGrandTours() {
        return numGrandTours;
    }

    public void setNumGrandTours(int numGrandTours) {
        this.numGrandTours = numGrandTours;
    }
}
