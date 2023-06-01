package Array.OfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateFood {
    public static ArrayList<Food> lunch = new ArrayList<>();

    public static ArrayList<Food> Input(){
        for(int i = 0; i < 5; i++){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Lunch number: " + (i+1));
            String aux = scanner.nextLine();
            Food food = new Food(aux);
            lunch.add(food);
        }

        return lunch;
    }

    public static void PrintArrayList(ArrayList<Food> lunch) {
        System.out.println("\nFood used for lunch: ");
        for (Food food : lunch) {
            System.out.println(food);
        }
    }
}
