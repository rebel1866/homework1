package by.epamtc.stanislavmelnikov.task9.logic;

public class CircleProcessor {
    private final double PI = 3.1415926535;

    public double countCircumference(int radius) {
        return 2 * PI * radius;
    }

    public double countSquare(int radius) {
        return PI * Math.pow(radius, 2);
    }
}
