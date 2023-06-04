package Abstraction.Language;

public class Main {
    public static void main(String[] args){
        Brazil brazil = new Brazil("Brazil" , 26, "210 million inhabitants", "Brasilia");
        Russia russia = new Russia("Russia", 85, "144 million inhabitants", "Moscow");
        Ukraine ukraine = new Ukraine("Ukraine", 24, "43 million inhabitants", "Kiev");

        brazil.Print();
        brazil.PrintData();
        System.out.println();
        russia.Print();
        russia.PrintData();
        System.out.println();
        ukraine.Print();
        ukraine.PrintData();

    }
}
