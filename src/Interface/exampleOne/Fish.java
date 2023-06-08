package Interface.exampleOne;

public class Fish implements Prey, Predator {

    @Override
    public void Hunt() {
        System.out.println("This fish is hunting smaller fish.");
    }

    @Override
    public void Flee() {
        System.out.println("This fish is fleeing from a larger fish.");
    }
}
