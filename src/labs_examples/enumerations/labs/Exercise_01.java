package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

class Exercise_01{

    public static void main(String[] args) {
        System.out.println(FamilyMember.TOM.getFullName());
    }
}

enum FamilyMember{
    TOM("Thomas Hill"),
    LOUISE("Louise Pegg"),
    FELIX("Felix Hill");

    private String fullName;

    FamilyMember(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}