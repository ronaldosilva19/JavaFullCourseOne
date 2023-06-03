package Inheritance;

public class Main {
    public static void main(String[] args){
        // Car car = new Car();
        //car.Go();

//        Bicycle bicycle = new Bicycle();
//        bicycle.Stop();

        WorkShop workShop = new WorkShop();
        for(int i = 0; i < 10; i++){
            Vehicle vehicle = workShop.Next();
            workShop.Print(vehicle);
        }
    }
}
