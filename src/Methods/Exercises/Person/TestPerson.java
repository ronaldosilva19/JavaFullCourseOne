package Methods.Exercises.Person;

import java.util.Scanner;

/**
 * @author Jose Ronaldo da Silva
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = scanner.nextLine();
        System.out.print("Type your age: ");
        int age = scanner.nextInt();
        double weight, height;
        System.out.print("Type your weight and height: ");
        weight = scanner.nextDouble();
        height = scanner.nextDouble();

        System.out.println(person.SayInformation(name));
        System.out.println(person.SayInformation(age));
        System.out.println(person.SayInformation(weight, height));
    }
}
