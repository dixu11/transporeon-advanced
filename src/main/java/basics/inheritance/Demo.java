package basics.inheritance;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);

        dog.doTricks();
        dog.teachDogNewTrick("sit");
        dog.teachDogNewTrick("give hand");
        dog.teachDogNewTrick("play dead");
        dog.teachDogNewTrick("bark on command");
        dog.doTricks();

        System.out.println(dog);
    }
}
