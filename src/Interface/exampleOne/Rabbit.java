package Interface.exampleOne;

import Interface.exampleOne.Prey;

public class Rabbit implements Prey {
    @Override
    public void Flee() {
        System.out.println("*The rabbit is fleeing.");
    }
}
