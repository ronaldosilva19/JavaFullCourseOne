package Encapsulation.Car;

import Encapsulation.Car.Car;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Audi", "Conversible", 2023);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
