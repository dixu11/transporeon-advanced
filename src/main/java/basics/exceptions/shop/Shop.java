package basics.exceptions.shop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    private static final String FILE_PATH = "products.csv";
    private List<Product> products = new ArrayList<>();

    public void loadProducts() throws FileNotFoundException {
        File file = new File(FILE_PATH);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            Product product = parseLineAndCreateProduct(line);
            products.add(product);
        }
    }

    private Product parseLineAndCreateProduct(String line) {
        String[] elements = line.split(";");
        String name = elements[0];
        double price = Double.parseDouble(elements[1]);
        int quantity = Integer.parseInt(elements[2]);
        return new Product(name, quantity, price);
    }

    public List<Product> getProducts() {
        return products;
    }
}
