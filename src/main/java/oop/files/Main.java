package oop.files;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductCsvFileRepository repository = new ProductCsvFileRepository();
        Product product1 = new Product("Tv", 3000, 3);
        Product product2 = new Product("Phone", 1500, 2);
        List<Product> products = List.of(product1, product2);
        //easy way of creating list of many elements in one go but this list is
        //immutable -> cannot be modified
//        List<Product> products = new ArrayList<>(List.of(product1, product2));
        //to make modified list you have to transfer elements to another list
    //    products.add(product1);

        repository.saveProduct(products);


    }
}
