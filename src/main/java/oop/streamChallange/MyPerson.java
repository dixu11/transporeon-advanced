package oop.streamChallange;

import java.time.LocalDate;
import java.util.Random;

public class MyPerson extends Person{
  private static Random random = new Random();

    public MyPerson(String name) {
        super(name);
    }

    @Override
    protected int getRandomCash() {

        int result = random.nextInt(1, 10);
        return result;
    }

    @Override
    public LocalDate getRandomBirthDate() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }
}
