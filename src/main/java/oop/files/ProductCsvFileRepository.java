package oop.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class ProductCsvFileRepository {


    //save was implemented in Exceptions example!!
  /*  public List<Product> readProducts() {

    }*/


    public void saveProduct(List<Product> products) {
        try {
            PrintWriter out = new PrintWriter("products2.csv");
            for (Product product : products) {
                out.println(product.getName() + ";" + product.getPrice() + ";"
                + product.getQuantity());
            }
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        }
    }



}
