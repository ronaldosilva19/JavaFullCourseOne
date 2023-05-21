package While.Loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String last_name = "";

        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);

        do{
            System.out.println("Enter your second name: ");
            last_name = scanner.nextLine();
        }while(name.isBlank());
        System.out.println("Hello "+last_name);
    }
}
