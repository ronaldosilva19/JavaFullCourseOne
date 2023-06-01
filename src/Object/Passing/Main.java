package Object.Passing;

public class Main {
    public static void main(String[] args){
        Garage garage = new Garage();
        Car car = new Car("BMW");
        Bike bike = new Bike("Aro 26");
        garage.Park(car);
        garage.Model(bike, car);
    }
}
