package oop.lineFactory;


public class Line {
    private int length;
    private String filling;

    public Line(int length, String filling) {
        this.length = length;
        this.filling = filling;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(filling);
        }
        System.out.print("\n");
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                ", filling='" + filling + '\'' +
                '}';
    }
}
