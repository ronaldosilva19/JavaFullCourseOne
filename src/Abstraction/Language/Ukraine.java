package Abstraction.Language;

public class Ukraine extends Country{
    String capital;

    Ukraine(String country, int federation_units, String population, String capital){
        super(country, federation_units, population);
        this.capital = capital;
    }

    @Override
    void Language() {
        System.out.println("Language : Ukrainian.");
    }

    @Override
    void Continent() {
        System.out.println("Continent : Eastern Europe.");
    }

    @Override
    void President() {
        System.out.println("President : Volodymyr Zelensky.");
    }

    @Override
    void PrintData() {
        System.out.println("Federation units : " + super.federation_units + "\n" +
                "Population : " + super.population + "\n" + "Country : " + super.country + "\n" +
                "Capital : " + this.capital);
    }

    @Override
    void Print() {
        Language();
        Continent();
        President();
    }
}
