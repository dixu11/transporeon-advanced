package basics.exceptions.shop;

import java.io.FileNotFoundException;

public class ShopDemo {

    public static void main(String[] args) {
        Shop shop = new Shop();
      try {
          shop.loadProducts();
          System.out.println(shop.getProducts());
      }catch (FileNotFoundException e){
          System.out.println("Problem loading a file...");
      }
    }


}
