package by.epamtc.stanislavmelnikov.task6.logic;

/**
 * Class is used for hours processing, contains one method for processing operations related with hour.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class HourProcessor {
    /**
     * Total amount of seconds in one hour.
     */
    private final int AMOUNT_OF_SECONDS_IN_HOUR = 3600;

    /**
     * Method takes total amount of seconds, entered by user, than counts how many full hours there are in these seconds,
     * and how much seconds left.
     *
     * @param inputSeconds
     * @return array, first index contains full hours, second contains amount of seconds remain.
     */
    public int[] countFullHours(int inputSeconds) {
        int secondsRemain = inputSeconds % AMOUNT_OF_SECONDS_IN_HOUR;
        int secondsTotal = inputSeconds - secondsRemain;
        int fullHours = secondsTotal / AMOUNT_OF_SECONDS_IN_HOUR;
        int[] fullHoursWithSecondsRemain = new int[2];
        fullHoursWithSecondsRemain[0] = fullHours;
        fullHoursWithSecondsRemain[1] = secondsRemain;
        return fullHoursWithSecondsRemain;
    }
}
