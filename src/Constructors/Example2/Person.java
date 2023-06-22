package Constructors.Example2;

/**
 * @author Jose Ronaldo da Silva
 */
public class Person {
    String name;
    int age;
    double weight;

    Person(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    Person(String name){
        this.name = name;
    }

    public String toString(){
        return this.name + "\nAge : " + this.age + " weight : "
                + this.weight;
    }
}
