package Abstraction.Language;

public class Main {
    public static void main(String[] args){
        Brazil brazil = new Brazil("Brazil" , 26, "210 million", "Brasilia");
        Russia russia = new Russia("Russia", 85, "144 million", "Moscow");

        brazil.Print();
        brazil.PrintData();
        System.out.println();
        russia.Print();
        russia.PrintData();

    }
}
