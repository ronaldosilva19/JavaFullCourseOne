package Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ages = {20, 35, 44};

        for(int i = 0; i < ages.length; i++){
            System.out.println("Age: "+ages[i]);
        }

        String[] cars = new String[3];
        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        int j = 0;
        while(j < cars.length){
            System.out.println("Car: "+cars[j]);
            j++;
        }
    }
}
