package Constructors.Example1;


public class Main {
    public static void main(String[] args){
        Human human1 = new Human("Ronaldo", 29, 60.4);
        Human human2 = new Human("Polina", 36, 62);

        human1.Eat();
        human2.Drink();
    }
}
