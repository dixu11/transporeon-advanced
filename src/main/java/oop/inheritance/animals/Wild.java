package oop.inheritance.animals;

public interface Wild {

   public final static int NUMBER = 10; //all fields in interfaces are public static final by definition

    default void attack(){ //default means it is no longer abstract
        System.out.println("It attacks!");
    }

    // we can make static methods like in every other classes
    public static void main(String[] args) {

    }
}
