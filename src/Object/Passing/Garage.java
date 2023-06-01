package Object.Passing;

public class Garage {
    void Park(Car car){
        System.out.println("The " + car.name + " is parked in the garage");
    }

    void Model(Bike bike, Car car){
        System.out.println("This model is " + bike.model + " name is " + car.name);
    }
}
