package Super.Keyword;

public class Villain extends Person{
    String intelligence;

    Villain(String name, int age, String intelligence){
        super(name, age);
        this.intelligence = intelligence;
    }

    public String toString(){
        return super.toString() + this.intelligence;
    }
}
