package basics.inheritance;

public class AnimalKeeper {

    public void feedDog(Dog dog) {
        dog.eatSomething();
        dog.bark();
    }

    public void feedCat(Cat cat) {
        cat.eatSomething();
        cat.meow();
    }

    public void feed(Animal animal) {
        animal.eatSomething();
//     how to make it make a sound?
        animal.bark();
        animal.meow();
    }

}
