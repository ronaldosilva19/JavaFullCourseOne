package Polymorphism.One;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        for(Vehicle vehicle : racers){
            vehicle.Go();
        }
    }
}
