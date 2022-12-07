package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */
 class Exercise_04{

    public static void main(String[] args) {
        // Assign file paths for input and output
        String fileIn = "src/labs_examples/input_output/files/family.csv";
        String fileOut  = "src/labs_examples/input_output/files/family_copy.csv";
        // Assign arraylist to store family members
        ArrayList<FamilyMember> family = new ArrayList<FamilyMember>();

        // Stream csv and create family member for each line, then add to arraylist
        try(BufferedReader in = new BufferedReader(new FileReader(fileIn))){
            String line;
            while ((line = in.readLine()) != null){
                String[] strings = line.split(",");
                FamilyMember familyMember = new FamilyMember();
                familyMember.setfName(strings[0]);
                familyMember.setlName(strings[1]);
                familyMember.setnName(strings[2]);
                familyMember.setAge(Integer.parseInt(strings[3]));
                family.add(familyMember);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Print contents of arraylist to console
        for (FamilyMember member : family){
            System.out.println(member.toString());
        }

        // Take contents of arraylist and write as a line to a new csv file
        try(PrintWriter out = new PrintWriter(new FileWriter(fileOut))){
            for (FamilyMember member : family){
                out.println(member.getfName() + "," +
                        member.getlName() + "," +
                        member.getnName() +  "," +
                        member.age);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

class FamilyMember{
     String fName;
     String lName;
     String nName;
     int age;

    public FamilyMember() {
    }

    public FamilyMember(String fName, String lName, String nName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.nName = nName;
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "FamilyMember{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", nName='" + nName + '\'' +
                ", age=" + age +
                '}';
    }
}