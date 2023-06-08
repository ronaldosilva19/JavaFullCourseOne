package Interface.exampleOne;

public class App {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.Flee();
        hawk.Hunt();

        fish.Hunt();
        fish.Flee();
    }
}
