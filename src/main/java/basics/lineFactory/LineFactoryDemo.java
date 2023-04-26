package basics.lineFactory;

/**
 * 6. Line Factory
 * In the program with Lines, create an additional class: LineFactory, and in it create methods that produce and return:
 * - a Line object of random length with a selected character,
 * - a line of the selected length but with a random character,
 * - a line with random length and random character,
 * - specified number of lines (using method parameter) with random length and character (use previous method),
 * - a line with length of two and a random character but each subsequent line returned is supposed to be 2x longer than the previous one.
 * Then, in the LineDemo class, test all the methods by printing the lines produced by them.
 */
public class LineFactoryDemo {

    public static void main(String[] args) {
        char letter = 'a';
//        letter = (char) (letter + 1);
        letter++;
        System.out.println(letter);


        LineFactory factory = new LineFactory();
        Line line = factory.withRandomLength("*");
        line.print();
        factory.withRandomFilling(8).print();
        Line line2 = factory.withRandomFillingAndRandomLength();
        line2.print();


    }


}
