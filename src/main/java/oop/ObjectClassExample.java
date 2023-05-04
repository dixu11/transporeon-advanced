package oop;

import oop.intruduction.Person;

import java.util.Random;

public class ObjectClassExample {
    public static void main(String[] args) {
        Object[] objects = new Object[3];
        Person person = new Person("Jan", 18);
        Random random = new Random();
        String text = "abc";
        objects[0] = person;
        objects[1] = random;
        objects[2] = text;

        for (Object object : objects) {

        }




    }
}
