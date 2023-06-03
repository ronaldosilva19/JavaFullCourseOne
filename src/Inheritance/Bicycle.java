package Inheritance;

public class Bicycle extends Vehicle{
    int wheels = 2;
    int pedals = 2;

    void Go(){
        System.out.println("This Bike is moving.");
    }

    void Stop(){
        System.out.println("This Bike is stopped");
    }
}
