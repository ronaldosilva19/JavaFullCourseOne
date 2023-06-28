package Class.Math.ExampleOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x: ");
        x = scanner.nextInt();
        System.out.println("Enter side y: ");
        y =  scanner.nextInt();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("The hypotenuse is: "+z);
    }
}
