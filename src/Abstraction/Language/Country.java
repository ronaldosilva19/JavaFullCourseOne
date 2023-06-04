package Abstraction.Language;

public abstract class Country {
    String country;
    int federation_units;
    String population;

    Country(String country, int federation_units, String population){
        this.country = country;
        this.federation_units  = federation_units;
        this.population = population;
    }
    abstract void Language();
    abstract void Continent();
    abstract void President();
    abstract void PrintData();
    abstract void Print();
}
