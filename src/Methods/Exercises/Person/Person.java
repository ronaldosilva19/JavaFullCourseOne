package Methods.Exercises.Person;

/**
 * @author Jose Ronaldo da Silva
 */
public class Person {
    public String SayInformation(String name){
        return "My name is " + name + ".";
    }
    public String SayInformation(int age){
        return "My age is " + age + " years old!";
    }
    public String SayInformation(double weight, double height){
        return "My weight is " + weight + " kilos" + " and my height is " + height + " meters.";
    }
}
