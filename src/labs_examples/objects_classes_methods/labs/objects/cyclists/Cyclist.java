package labs_examples.objects_classes_methods.labs.objects.cyclists;

public class Cyclist {
    String firstName;
    String lastName;
    int age;
    int FTP;
    String team;

    public Cyclist(String firstName, String lastName, int age, int FTP, String team) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.FTP = FTP;
        this.team = team;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
}
