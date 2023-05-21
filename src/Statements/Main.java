package Statements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int age;
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if(age >= 10 && age <= 12){
            System.out.println("Ok Boomer!");
        }else if(age >= 13 && age <= 17){
            System.out.println("You are a teenager!");
        }else if(age >= 18 && age <= 60){
            System.out.println("You are an adult!");
        }else if(age >= 61){
            System.out.println("You are Old!");
        }else{
            System.out.println("You are not an adult!");
        }
    }
}
