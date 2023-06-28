package Inheritance.ExampleTwo;

public class TestBike {
    public static void main(String[] args) {
        Wheel bicycle = new Wheel();
        bicycle.toSpin();
        bicycle.Walk();
        bicycle.Stop();
        bicycle.Brake();

        bicycle.setsInProgress("Stopped");
        if(bicycle.getInProgress()){
            System.out.println("Moving.");
        }else{
            System.out.println("Stopped.");
        }
    }
}
