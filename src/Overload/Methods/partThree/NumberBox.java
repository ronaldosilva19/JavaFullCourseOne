package Overload.Methods.partThree;

/**
 * @author Jose Ronaldo da Silva
 */
public class NumberBox {
    int secretNumber;

    boolean EhPair(){
        int mod =  (this.secretNumber % 2);
        return mod == 0;
    }

    int[] SayMultiplicationTable(){

        return SayMultiplicationTable(20);
    }
    int[] SayMultiplicationTable(int quantity){
        int[] table = new int[quantity];
        for(int n = 1; n <= quantity; n++){
            table[n - 1] = this.secretNumber * n;
        }
        return table;
    }
    String SayWhatNumber(){
        return "The secret number is: " + this.secretNumber;
    }
}
