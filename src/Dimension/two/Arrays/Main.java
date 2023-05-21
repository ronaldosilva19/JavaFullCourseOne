package Dimension.two.Arrays;

public class Main {
    public static void main(String[] args) {
       String[][] cars = {{"Camaro", "Corvette", "Silverato"},
                          {"Mustang", "Ranger", "F-150"},
                          {"Ferrari", "Lambo", "Tesla"}
                          };

       int i = 0;
       while(i < cars.length){
           System.out.println();
           int j = 0;
           while (j <cars.length){
               System.out.print(cars[i][j]+" ");
               j++;
           }
           i++;
       }
    }
}
