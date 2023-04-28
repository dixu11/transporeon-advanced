package basics.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //call to method
        int value = readNumber();
        System.out.println("result is: " + value);
    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        try {
            System.out.println("Give me number");
           return scanner.nextInt();
        } catch (InputMismatchException e) {
           return readNumber();
        }finally {
            System.out.println("there was a try to type a number");
        }
    }

}
