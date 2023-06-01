package Array.OfObjects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        Food[] refrigerator = new Food[3];

//        Food food1 = new Food("Pizza");
//        Food food2 = new Food("Hamburger");
//        Food food3 = new Food("Hotdog");

//        refrigerator[0] = food1;
//        refrigerator[1] = food2;
//        refrigerator[2] = food3;

//        Food[] refrigerator = {food1, food2, food3};

       ArrayList<Food> lunch;
       lunch = CreateFood.Input();
       CreateFood.PrintArrayList(lunch);
    }
}
