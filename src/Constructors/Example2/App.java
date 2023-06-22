package Constructors.Example2;

/**
 * @author Jose Ronaldo da Silva
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person("Ronaldo", 29, 59.5);
        Person person1 = new Person("Polina");

        System.out.println(person);
        System.out.println(person1);

        Car car = new Car();
        System.out.println(car.pilot.name);

        Car car1 = new Car(person);
        System.out.println(car1.pilot.toString());
    }
}
