package basics.inheritance;

public abstract class Animal {

    public void eatSomething() {
        System.out.println("Animal is eating");
    }

    //in abstract classes we can make abstract methods
    public abstract void makeSound();

}
