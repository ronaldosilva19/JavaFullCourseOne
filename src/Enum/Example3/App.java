package Enum.Example3;
/**
 * @author ronaldosilva
 */
public class App {
    public static void main(String[] args) {
        double weight = 78;
        double mass = weight / Planets.EARTH.SurfaceGravity();

        for(Planets planet : Planets.values()){
            System.out.println("Your weight in planet " + planet.getPlanet()
                    + " is " + planet.Weight(mass));
        }

    }
}
