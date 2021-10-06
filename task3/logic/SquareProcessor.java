package by.epamtc.stanislavmelnikov.task3.logic;

public class SquareProcessor {
    public double countRadiusOfInnerCircle(int areaOuterSquare) {
        return (Math.sqrt(areaOuterSquare / 4));
    }

    public double countSquaresDifference(double areaOuterSquare, double areaInnerSquare) {
        return areaOuterSquare / areaInnerSquare;
    }

    public double countAreaInnerSquare(double radiusOuterCircle) {
        return (2 * Math.pow(radiusOuterCircle, 2));
    }
}
