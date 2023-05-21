package ArrayLists.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<ArrayList<String>> Matrix = new ArrayList<>();
    public static ArrayList<ArrayList<String>> AddArrayList(ArrayList<String> names, ArrayList<String> cars, ArrayList<String> cities){

        Matrix.add(names);
        Matrix.add(cars);
        Matrix.add(cities);

        return Matrix;
    }

    public static void PrintMatrix(ArrayList<ArrayList<String>> Matrix){
        for(int i = 0; i < Matrix.size(); i++){
            for(int j = 0; j < Matrix.get(i).size(); j++){
                System.out.printf(Matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ronaldo", "Ani", "Polina"));
        ArrayList<String> cars = new ArrayList<>(Arrays.asList("Ferrari", "Audi", "Porsche"));
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Moscow", "Saint Petersburg"));

        ArrayList<ArrayList<String>> Mat;
        Mat = Main.AddArrayList(names, cars, cities);
        Main.PrintMatrix(Mat);
    }
}
