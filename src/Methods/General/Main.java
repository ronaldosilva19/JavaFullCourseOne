package Methods.General;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void PrintArrayListInteger(ArrayList<Integer> ArrayInt){
        System.out.print("[ ");
        for(Integer value : ArrayInt){
            System.out.print(value + " ");
        }
        System.out.print(" ]");
        System.out.println();
    }

    public static void PrintArrayListDouble(ArrayList<Double> ArrayDouble){
        System.out.print("[ ");
        for(Double value : ArrayDouble) {
            System.out.print(value + " ");
        }
        System.out.print(" ]");
        System.out.println();
    }

    public static void PrintArrayListString(ArrayList<String> ArrayString){
        System.out.print("[ ");
        for(String value : ArrayString){
            System.out.print(value + " ");
        }
        System.out.print(" ]");
        System.out.println();
    }
    public static void main(String[] args){
        ArrayList<Integer> ArrayInt = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ArrayList<Double> ArrayDouble = new ArrayList<>(Arrays.asList(1.5, 3.14, 10.17, 0.95, 11.78));
        ArrayList<String> ArrayString = new ArrayList<>(Arrays.asList("Ronaldo", "Ani", "Polina", "Dima", "Sergey"));

        Main.PrintArrayListInteger(ArrayInt);
        Main.PrintArrayListDouble(ArrayDouble);
        Main.PrintArrayListString(ArrayString);
    }
}
