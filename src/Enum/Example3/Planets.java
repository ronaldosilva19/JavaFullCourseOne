package Enum.Example3;

/**
 * @author ronaldosilva
 */
public enum Planets {
    EARTH("Earth", 5.976e+24, 6.37814e6),
    MARS("Mars", 6.421e+23, 3.3972e6),
    JUPITER("Jupiter", 5.688e+26, 6.0268e7);
    private final double mass, radius;
    private final String planet;
    private static final double GRAV_CONST = 6.67300E-11;
    Planets(String planet, double mass, double radius){
        this.mass = mass;
        this.radius = radius;
        this.planet = planet;
    }

    public String getPlanet(){
        return this.planet;
    }
    public double SurfaceGravity(){
        return GRAV_CONST * this.mass / (this.radius * this.radius);
    }

    double Weight(double mass){
        return mass * SurfaceGravity();
    }
}
