package Inheritance.ExampleOne;

import Inheritance.ExampleOne.Bicycle;
import Inheritance.ExampleOne.Car;
import Inheritance.ExampleOne.Vehicle;

public class WorkShop {

    public Vehicle Next(){
        double code = (Math.random() * 1000);
        if(code >= 0 && code <= 500){
            return new Bicycle();
        }else{
            return new Car();
        }
    }
    public void Print(Vehicle vehicle){
        vehicle.Go();
        vehicle.Stop();
    }
}
