package basics.lineFactory;

import java.util.Random;

public class LineFactory {
    private final Random random = new Random();

    public Line withRandomLength(String filling) {
        return new Line(getRandomLength(), filling);
    }

    public Line withRandomFilling(int length) {
      return new Line(length,getRandomFilling());
    }

    public Line withRandomFillingAndRandomLength(){
        return new Line(getRandomLength(), getRandomFilling());
    }

    private int getRandomLength() {
        return random.nextInt(1, 20);
    }

    private String getRandomFilling() {
        char randomFilling =(char) random.nextInt(50,100);
        return randomFilling + "";
    }

}
