package basics.enums;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        Intersection intersection = new Intersection(Directions.LEFT_SIDE);
        Intersection intersection2 = new Intersection(Directions.RIGHT_SIDE);

        Car car = new Car();

        car.drive(intersection);
        car.drive(intersection2);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
