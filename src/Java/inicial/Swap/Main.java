package Java.inicial.Swap;

public class Main {
    public static void Swap(String name, String name1){
    // Swap two variables.
        String tmp;
        tmp = name;
        name = name1;
        name1 = tmp;

        System.out.println("Name: " + name);
        System.out.println("Name1: " + name1);
    }

    public static void main(String[] args){
       Main.Swap("Ronaldo", "Jose");
    }
}
