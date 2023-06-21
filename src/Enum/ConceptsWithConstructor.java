package Enum;

public enum ConceptsWithConstructor {
    GREAT("Approved with honors!"),
    GOOD("Regular"),
    REGULAR("Approved!"),
    BAD("Disapproved!");

    private String message;

    private EnumsConstructor(String message){
        this.message = message;
    }

    public String ApprovedCalculate(String message){
        return this.message;
    }

}
