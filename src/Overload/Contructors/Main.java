package Overload.Contructors;

public class Main {
    public static void main(String[] args){
        Pizza pizza = new Pizza("thicc crust", "tomato", "mozzarella", "pepperoni");
        System.out.println("Here are the ingrei=dients of ");

        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        System.out.println(pizza.bread);
    }
}
