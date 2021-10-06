package by.epamtc.stanislavmelnikov.task8.logic;

public class FunctionValueCalculator {

    public double computeValueOfFunction(int x) {
        if (x >= 3) {
            return -(Math.pow(x, 2)) + 3 * x + 9;
        }
        return 1 / (Math.pow(x, 3) - 6);
    }
}
