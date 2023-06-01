package ToString;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "Red";
    int year = 2023;

//    Override toString method.
    public String toString(){
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}
