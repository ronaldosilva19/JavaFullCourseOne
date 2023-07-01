package br.visibility.Protected;

/**
 * Class used to test the protected visibility of
 * the attribute and methods of the Product class.
 *
 * @author Jose Ronaldo da Silva
 */
public class TestProductPackage {
    public static void main(String[] args) {
        Product productClock = new Product();
        productClock.setProductName("Clock.");
        System.out.println(productClock.getProductName());

        Product productPen = new Product();
        productPen.setProductName("Pen");
        System.out.println(productPen.getProductName());
    }
}
