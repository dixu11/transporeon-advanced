package oop.streams;

public class EquationTask {
    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> {
                    System.out.println("hello");
                }
        );

        //simpler version
        Thread thread2 = new Thread(() -> System.out.println("hello"));


        Equation addition = new Equation() {
            @Override
            public int execute(int number1, int number2) {
                return number1 + number2;
            }
        };

        /*Equation subtraction = ( int n1, int n2) -> {
            return n1 - n2;
        };*/


        Equation subtraction = (n1, n2) ->  n1 - n2;


        System.out.println(addition.execute(10, 5));
        System.out.println(subtraction.execute(10, 5));

        //Lambda expressions is simplification of the code when try too quickly implement interface with one abstract method
        //Functional Interface - interface that has exactly one abstract method


    }
}

interface Equation {
    int execute(int number1, int number2);
}
