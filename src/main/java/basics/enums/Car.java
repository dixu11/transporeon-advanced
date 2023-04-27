package basics.enums;

import java.util.Scanner;

public class Car {

    public void drive(Intersection intersection) {
        String correctDirection = intersection.getCorrectDirection();

        switch (correctDirection) {
            case Directions.LEFT_SIDE:
                System.out.println("goes left");
                break;
            case Directions.RIGHT_SIDE:
                System.out.println("goes right");
        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to go?");
        System.out.println("Type:");
        System.out.println("L or R");
        String whichSideToGo = scanner.nextLine();


        if (correctDirection.equals(whichSideToGo)) {
            System.out.println("You pass safely");
        }else{
            System.out.println("it's accident!");
        }

    }


}
