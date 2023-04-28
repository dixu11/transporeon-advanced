package collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
   private List<String> names = new MyArrayList<>();

    @Test
    public void add_should_save_one_element(){

        names.add("Ada");
        Assertions.assertEquals("Ada",names.get(0));
        Assertions.assertEquals(1,names.size());
    }

    @Test
    public void add_should_save_two_element(){
        names.add("Ada");
        names.add("Adam");
        Assertions.assertEquals("Ada",names.get(0));
        Assertions.assertEquals("Adam",names.get(1));
        Assertions.assertEquals(2,names.size());
    }
    @Test
    public void add_should_save_eleven_element(){
        names.add("Ada");
        names.add("Adam");
        names.add("Ada");
        names.add("Iza");
        names.add("Jan");
        names.add("Zofia");
        names.add("Tom");
        names.add("Tom2");
        names.add("Tom3");
        names.add("Tom4");
        names.add("Tom5");
        Assertions.assertEquals("Ada",names.get(0));
        Assertions.assertEquals("Adam",names.get(1));
        Assertions.assertEquals("Tom2",names.get(7));
        Assertions.assertEquals("Tom3",names.get(8));
        Assertions.assertEquals("Tom4",names.get(9));
        Assertions.assertEquals("Tom5",names.get(10));
        Assertions.assertEquals(11,names.size());
    }
}
