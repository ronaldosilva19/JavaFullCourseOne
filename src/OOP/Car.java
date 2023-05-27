package OOP;

public class Car {
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 500000.00;

    public static void PrintInstance(Car car){
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);
        System.out.println(car.price);
    }
    void Drive(){
        System.out.println("You drive the car.");
    }
    void Brake(){
        System.out.println("You step on the brakes.");
    }
}
