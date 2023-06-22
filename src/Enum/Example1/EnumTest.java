package Enum.Example1;

/**
 * @author ronaldosilva
 */
public class EnumTest {
    public static void main(String[] args) {
        Concept.GREAT.ApprovalCalculate(Concept.GREAT);
        System.out.println("Concept...: " +
                ConceptsWithConstructor.BAD.ApprovedCalculates());

       ConceptsWithConstructor.PrintConcepts();
    }

}
