package oop.exceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("start");
        try {
            int value = 10 / 1;
            System.out.println(value);
            System.out.println("...");
            int[] table = new int[5];
            System.out.println(table[1]);
            table = null;
            // System.out.println(table[0]);
            Scanner scanner = new Scanner(System.in);
            scanner.nextInt();
            System.out.println("....");
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by 0!");
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("something went wrong!!");
        } catch (Exception e) {
            System.out.println("oh no, unexpected problem, tell your developer about that!");
            e.printStackTrace();
        }
        System.out.println("end");

    }
}
