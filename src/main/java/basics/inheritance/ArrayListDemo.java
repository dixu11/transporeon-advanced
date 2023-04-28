package basics.inheritance;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("Daniel");
        names.add("Iza");
        names.add("Marcin");
        names.add("Ada");
        System.out.println(names);
        System.out.println(names.size());



    }
}
