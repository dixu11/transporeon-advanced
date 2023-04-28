package basics.exceptions.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    private static final String FILE_PATH = "products.csv";
    private List<Product> products = new ArrayList<>();

    public void loadProducts() {
        Scanner scanner = new Scanner(FILE_PATH);
        String firstLine = scanner.nextLine();
        System.out.println(firstLine);
    }




}
