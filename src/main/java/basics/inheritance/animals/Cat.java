package basics.inheritance.animals;

public class Cat extends Animal {

    private String color;

    public Cat(String name, int age, String color) {
        super(name,age);
        this.color = color;
    }

    public Cat() {
        super("Luna",1);
        color = "black";
        eatSomething();
    }


    public void makeSound() {
        meow();
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

    public void eatSomething() {
        super.eatSomething();
        System.out.println("this animal is cat and it's eating mice");
    }
}