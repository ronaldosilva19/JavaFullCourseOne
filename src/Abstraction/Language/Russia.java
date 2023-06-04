package Abstraction.Language;

public class Russia extends Country{

    String capital;

    Russia(String country, int federation_units, String population, String capital){
        super(country, federation_units, population);
        this.capital = capital;
    }
    @Override
    void Language() {
        System.out.println("Language : Russian.");
    }

    @Override
    void Continent() {
        System.out.println("Continent : Europe.");
    }

    @Override
    void President() {
        System.out.println("President : Vladimir Putin.");
    }
    @Override
    void PrintData(){
        System.out.println("Federations units : " + super.federation_units +
                "\n" + "Population : " + super.population + "\n" + "Country : " + super.country +
                "\n" + "Capital : " + this.capital);
    }

    @Override
    void Print() {
        Language();
        Continent();
        President();
    }


}
