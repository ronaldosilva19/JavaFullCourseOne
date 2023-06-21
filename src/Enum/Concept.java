package Enum;

public enum Concept {
    GREAT,
    GOOD,
    REGULAR,
    BAD;

    public void ApprovalCalculate(Concept concept) {
        if (concept == GREAT) {
            System.out.println("Approved with honors!");
        } else if (concept == GOOD) {
            System.out.println("Approved!");
        } else if (concept == REGULAR) {
            System.out.println("Regular");
        }else if(concept == BAD){
            System.out.println("Disapproved!");
        }
    }
}
