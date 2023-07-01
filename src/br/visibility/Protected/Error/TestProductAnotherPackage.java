package br.visibility.Protected.Error;

import br.visibility.Protected.Product;

/**
 * Class used to test the protected visibility of the
 * attribute and methods of the Product class from
 * another package.
 *
 * @author Jose Ronaldo da Silva
 */
public class TestProductAnotherPackage {
    public static void main(String[] args) {
        Product product = new Product();
        //product.setProductName("Clock"); Compilation ERROR.
    }
}
