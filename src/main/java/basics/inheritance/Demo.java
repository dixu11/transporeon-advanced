package basics.inheritance;

import basics.inheritance.animals.Animal;
import basics.inheritance.animals.Cat;
import basics.inheritance.animals.Dog;
import basics.inheritance.animals.Mouse;

public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog("Reksio", 10, 4);
        Cat cat = new Cat("Łukasz", 3, "white");
        Cat cat2 = new Cat();

        System.out.println(dog);
        dog.bark();
        dog.doTricks();
        dog.teachDogNewTrick("sit");
        dog.teachDogNewTrick("give hand");
        dog.teachDogNewTrick("play dead");
        dog.teachDogNewTrick("bark on command");
        dog.doTricks();
        dog.eatSomething();

        System.out.println(dog);

        System.out.println("---------");
        cat.meow();
        cat.distractTheOwner();
        cat.eatSomething();
        System.out.println("---------");
        AnimalKeeper animalKeeper = new AnimalKeeper();
//        animalKeeper.feedDog(dog);
//        animalKeeper.feedCat(cat);
        animalKeeper.feed(cat);
        animalKeeper.feed(dog);

        System.out.println("---------");
//        Animal animal = new Dog();
//        Cat cat1 = (Cat) animal;
//        cat1.meow();

        System.out.println("----------");
        //polymorphism example
        Animal animal = new Dog();
        animal.makeSound();
        animal = new Cat();
        animal.makeSound();
        //it is not possible to make object (instance) directly from abstract class
        //and it is good because we don't want them in our code
       // animal = new Animal();

        System.out.println("----------");
        Mouse mouse = new Mouse("Mickey",5);
        Animal[] animals = {dog, dog2, cat, cat2, animal,mouse};
        //animalKeeper.feed(animals);
        animalKeeper.feed(dog,dog2,cat,cat2,animal,mouse);
        System.out.println(animals.length);


    }
}
