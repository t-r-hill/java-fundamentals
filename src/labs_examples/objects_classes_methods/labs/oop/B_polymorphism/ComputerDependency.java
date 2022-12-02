package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class ComputerDependency {
    Computer computer;

    public ComputerDependency(Computer computer){
        this.computer = computer;
    }

    public void setComputer(Computer computer){
        this.computer = computer;
    }

    public void testComputer(){
        computer.turnOn();
        computer.runProgram("Java");
        computer.endProgram();
        computer.turnOff();
    }
}
