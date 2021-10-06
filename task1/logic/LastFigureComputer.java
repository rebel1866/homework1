package by.epamtc.stanislavmelnikov.task1.logic;

/**
 * Class calculates last figure of square of number, that user have entered.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class LastFigureComputer {
    /**
     * Method squares given number.
     *
     * @param number Variable, calculated by method {@link #findLastFigure(int)}
     * @return Square of number
     */
    public int calculateSquare(int number) {
        int powIndex = 2;
        int squareOfNumber = (int) Math.pow(number, powIndex);
        return squareOfNumber;
    }

    /**
     * Method finds last figure of given number.
     *
     * @param number
     * @return integer number, last figure of given param.
     */
    public int findLastFigure(int number) {
        int divider = 10;
        return number % divider;
    }
}
