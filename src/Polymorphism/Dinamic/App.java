package Polymorphism.Dinamic;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want?");
        System.out.print("(1 = Dog) or (2 = Cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.Speak();
        }else if(choice == 2){
            animal = new Cat();
            animal.Speak();
        }else{
            animal = new Animal();
            System.out.println("That choice was invalid.");
            animal.Speak();
        }
    }
}
