package For.Each.Loop;

import java.util.ArrayList;
import  java.util.Arrays;

public class Main {

    public static ArrayList<ArrayList<String>> Matrix = new ArrayList<>();

    public static ArrayList<ArrayList<String>> AddMatrix(ArrayList<String> names, ArrayList<String> cars, ArrayList<String> cities){
        Matrix.add(names);
        Matrix.add(cars);
        Matrix.add(cities);

        return Matrix;
    }

    public static void PrintMatrix(ArrayList<ArrayList<String>> Matrix){
        // Print elements to matrix using For-Each Loop.
        for(ArrayList<String> index : Matrix){
            for(String value : index){
                System.out.printf(value + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ronaldo", "Ani", "Polina"));
        ArrayList<String> cars = new ArrayList<>(Arrays.asList("Ferrari", "Audi", "Ranger"));
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Natal", "Fortaleza", "Recife"));

        ArrayList<ArrayList<String>> Matrix;
        Matrix = Main.AddMatrix(names, cars, cities);
        Main.PrintMatrix(Matrix);
    }
}
