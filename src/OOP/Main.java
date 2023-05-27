package OOP;

public class Main {
    public static void main(String[] args){
        Car myCar1 = new Car();
        Car myCar2 = new Car();

        Car.PrintInstance(myCar1);
        System.out.println();
        Car.PrintInstance(myCar2);
        System.out.println();
        myCar1.Drive();
        System.out.println();
        myCar2.Brake();
    }
}
