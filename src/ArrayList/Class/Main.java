package ArrayList.Class;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> food = new ArrayList<>();
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ranger");
        cars.add("Civic");
        cars.add("Corvette");
        cars.add("Ferrari");
        cars.add("Audi");

        for(int i = 0; i <= 10; i++){
            food.add(i*2);
        }
        for(Integer value : food){
            System.out.println(value);
        }

        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
