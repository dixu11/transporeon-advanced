package basics.inheritance;

public class Cat {

    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat() {
        name = "Luna";
        age = 1;
        color = "black";
    }

    public void meow() {
        System.out.println("meow! meow...");
    }

    public void distractTheOwner() {
        System.out.println(name + " is distracting with it's meowing...");
        meow();
        meow();
        meow();
        meow();
        meow();
    }
}
