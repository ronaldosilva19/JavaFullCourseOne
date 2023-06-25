package Object.Identity;

/**
 * Main Program.
 *
 * @author Jose Ronaldo da Silva
 */
public class App {

    public static void main(String[] args) {
        Person ronaldo = new Person();
        ronaldo.setName("Ronaldo");
        ronaldo.setAge(29);

        System.out.println(ronaldo);
    }
}
