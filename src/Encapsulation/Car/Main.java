package Encapsulation.Car;
public class Main {
    public static void main(String[] args){
        Car car = new Car("Audi", "Convertible", 2023);
        Car car1 = new Car("Corvette", "Plus", 2019);

        car1.Copy(car); // copy of objects.
        System.out.println(car);
        System.out.println(car1);
    }
}
