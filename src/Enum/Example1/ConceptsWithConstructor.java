package Enum.Example1;
/**
 * @author ronaldosilva
 */

public enum ConceptsWithConstructor {
    GREAT("Approved with honors!"),
    GOOD("Regular"),
    REGULAR("Approved!"),
    BAD("Disapproved!");

    private final String message;

    public static void PrintConcepts(){
        ConceptsWithConstructor[] concepts = ConceptsWithConstructor.values();
        for(ConceptsWithConstructor concepts1 : concepts){
            System.out.println(concepts1);
        }
    }
    ConceptsWithConstructor(String message){
        this.message = message;
    }

    public String ApprovedCalculates(){
        return this.message;
    }

}
