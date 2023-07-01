package br.visibility.Protected.Error;

import br.visibility.Protected.Product;

/**
 * Class used to represent a Product.
 *
 * @author Jose Ronaldo da Silva
 */
public class SubProductAnotherPackage extends Product {
   public String getProduct(){
       setProductName("Pen");
       return "Product: " + getProductName();
   }

    public static void main(String[] args) {
        System.out.println(new SubProductAnotherPackage().getProduct());
    }
}
