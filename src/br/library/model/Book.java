package br.library.model;

/**
 * @author Jose Ronaldo da Silva
 */
public class Book {
    private String type;
    private double price;
   public Book(String type, double price){
        this.setType(type);
        this.setPrice(price);
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
    public void setPrice(double price){
       this.price = price;
    }
    public double getPrice(){
       return this.price;
    }
    public String toString(){
        return "This type to book is : " + this.getType() +
                " and price is: " + this.getPrice();
    }

}
