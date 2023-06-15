package Abstraction.Language;

public class Brazil extends Country{

    String capital;
    Brazil(String country, int federation_units, String population, String capital){
        super(country, federation_units, population);
        this.capital = capital;
    }
    @Override
    void Language(){
        System.out.println("Language : Portuguese/Brazil");
    }

    @Override
    void Continent() {
        System.out.println("Continent : South America.");
    }

    @Override
    void President() {
        System.out.println("President : Lula");
    }

    @Override
    void PrintData() {
        System.out.println("Federations units : " + super.federation_units +
                "\n" + "Population : " + super.population + "\n" + "Country : " + super.country
                + "\n" + "Capital: " + this.capital);
    }

    @Override
    void Print() {
        Language();
        Continent();
        President();
    }
}
