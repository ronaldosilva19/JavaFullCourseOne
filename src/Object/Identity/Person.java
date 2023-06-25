package Object.Identity;

/**
 * Class used to represent a Person
 *
 * @author Jose Ronaldo da Silva
 */
public class Person {
    private String name;
    private int age;

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Name: " + getName() + "\n" + "Age: " + getAge() + "\n";
    }
}
