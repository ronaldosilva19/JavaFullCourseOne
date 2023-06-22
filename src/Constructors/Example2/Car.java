package Constructors.Example2;

/**
 * @author Jose Ronaldo da Silva
 */
public class Car {
    Person pilot;

    Car(){
        this.pilot = new Person("Test.");
    }
    Car(Person person){
        this.pilot = person;
    }
}
