package Overload.Methods.partThree;

/**
 * @author Jose Ronaldo da Silva
 */
public class App {
    public static void main(String[] args) {
        NumberBox box = new NumberBox();
        box.secretNumber = 10;
        System.out.println(box.EhPair());
        int[] Ans = box.SayMultiplicationTable();

        System.out.print("[ ");
        for(int i = 0; i < Ans.length; i++) {
            System.out.print(Ans[i] + " ");
        }
        System.out.print("]\n");
        System.out.println(box.SayWhatNumber());
    }
}
