package ArrayList.Class.Two;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Main {

    public static ArrayList<String> CreateArrayList(){
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        int choice;

        while(true){
            System.out.print("Enter 1 to add, 2 to remove or 0 to end the program: ");
            choice = scanner.nextInt();
            if(choice == 1){
                scanner.nextLine();
                System.out.print("Enter the name to insert into the ArrayList: ");
                name = scanner.nextLine();
                names.add(name);
                System.out.println("After to insert:");
                PrintArrayList(names);
            }else if(choice == 2){
                scanner.nextLine();
                PrintArrayList(names);
                System.out.print("Enter the name to remove into the ArrayList: ");
                name = scanner.nextLine();
                names.remove(name);
                System.out.println("After to remove:");
                PrintArrayList(names);
            }else if(choice == 0){
                break;
            }
        }
        return names;
    }
    public static void PrintArrayList(ArrayList<String> names){
        for(String name : names){
            System.out.println(name);
        }
    }

    public static void PrintThroughIterator(ArrayList<String> names){
        Iterator<String> iterator = names.iterator(); // defining iterator.
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static ArrayList<String> Clone(ArrayList<String> names){
        ArrayList<String> copyNames = new ArrayList<>();
        for(String name : names){
            copyNames.add(name);
        }
        return copyNames;
    }

    public static void main(String[] args) {
        ArrayList<String> names;

        names = CreateArrayList();
        System.out.println("Array elements after operations.");
        PrintArrayList(names);
        System.out.println();
        System.out.println("Though Iterator:");
        PrintThroughIterator(names);

        ArrayList<String> copyNames = Clone(names);
        names.clear();

        if(names.isEmpty()){
            System.out.println("ArraysList is empty.");
            System.out.println("Size of ArrayList: " + names.size());
        }else{
            System.out.println("Size of ArrayList: " + names.size());
        }
        System.out.println("Size of CopyArrayList: " + copyNames.size());
    }
}
