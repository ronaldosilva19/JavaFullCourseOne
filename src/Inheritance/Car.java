package Inheritance;

public class Car extends Vehicle{
    int wheels = 4;
    int doors = 4;

    void Go(){
        System.out.println("This Car is moving.");
    }

    void Stop(){
        System.out.println("This Car is stopped");
    }
}
