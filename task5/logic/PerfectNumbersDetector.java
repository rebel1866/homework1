package by.epamtc.stanislavmelnikov.task5.logic;

import java.util.ArrayList;
import java.util.List;

/**
 * Class used for working with perfect numbers. Contains methods for searching perfect numbers and method to check,
 * is given number perfect or not.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class PerfectNumbersDetector {
    /**
     * Method finds all dividers of given number.
     *
     * @param number One integer number.
     * @return Collection (List) of numbers that are dividers of given number.
     */
    public List<Integer> findAllDividersOfNumber(int number) {
        List<Integer> dividers = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                dividers.add(i);
            }
        }
        return dividers;
    }

    /**
     * Method checks is given number perfect or not.
     *
     * @param dividers List of dividers of given number.
     * @param number   Number, entered by user.
     * @return boolean, if true - given number is perfect.
     */
    public boolean isPerfectNumber(List<Integer> dividers, int number) {
        int dividersSum = 0;
        for (int divider : dividers) {
            dividersSum = dividersSum + divider;
        }
        return number == dividersSum;
    }
}
