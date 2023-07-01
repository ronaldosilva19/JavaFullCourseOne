package br.visibility.Protected;

/**
 * Class used to represent a Product.
 *
 * @author Jose Ronaldo da Silva
 */
public class Product {
    protected String productName;

    protected void setProductName(String productName){
        this.productName = productName;
    }

    protected String getProductName() {
        return this.productName;
    }
}
