package Scope.Variables;

import java.util.Random;

public class DiceRoller {
    Random random;
    int number;
    DiceRoller(){
        random = new Random();
        Roll();
    }
    void Roll(){
        number = random.nextInt(10) + 1;
        System.out.println(number);
    }
}
