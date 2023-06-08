package Encapsulation.Car;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
    public String getMake(){
        return this.make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void Copy(Car car){
        this.setMake(car.getMake());
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }
    public String toString(){
        return "Make : " + this.getMake() + "\n" +
                "Model : " + this.getModel() + "\n" +
                "Year : " + this.getYear();
    }
}
