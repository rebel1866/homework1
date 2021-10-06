package by.epamtc.stanislavmelnikov.task2.logic;

import java.util.ArrayList;

/**
 * Class calculates list of leap years. Also class contains method, that checks whether given year is leap or not.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class LeapYearsCalculator {
    private ArrayList<Integer> leapYears = new ArrayList<>();
    /**
     * Constant, max possible value of year for user to enter.
     */
    private final int YEAR_MAX_VALUE = 10000;
    /**
     * Constant, min possible value of year for user to enter.
     */
    private final int YEAR_MIN_VALUE = 0;
    /**
     * Constant, represents, that leap years occurs every 4 years.
     */
    private final int LEAP_YEAR_STEP = 4;

    /**
     * Method fills up list {@link #leapYears}
     *
     * @return Nothing
     */
    public void calculateLeapYears() {
        for (int i = YEAR_MIN_VALUE; i < YEAR_MAX_VALUE; i = i + LEAP_YEAR_STEP) {
            leapYears.add(i);
        }
    }

    /**
     * Method checks, whether given year is leap.
     *
     * @param inputYear param, given by user
     * @return Is leap year or not
     */
    public boolean isLeapYear(int inputYear) {
        return leapYears.contains(inputYear);
    }
}