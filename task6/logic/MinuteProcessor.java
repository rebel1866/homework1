package by.epamtc.stanislavmelnikov.task6.logic;

/**
 * Class is used for minutes processing, contains one method for processing operations related with minutes.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class MinuteProcessor {
    /**
     * Total amount of seconds in one minute.
     */
    private final int AMOUNT_OF_SECONDS_IN_MINUTE = 60;

    /**
     * Method takes total amount of seconds, remained after method {@link HourProcessor#countFullHours(int)} work,
     * than counts how many full minutes there are in these seconds,
     * and how much seconds left.
     *
     * @param inputSeconds
     * @return array, first index contains full minutes, second contains amount of seconds remain.
     */
    public int[] countFullMinutes(int inputSeconds) {
        int secondsRemain = inputSeconds % AMOUNT_OF_SECONDS_IN_MINUTE;
        int secondsTotal = inputSeconds - secondsRemain;
        int fullMinutes = secondsTotal / AMOUNT_OF_SECONDS_IN_MINUTE;
        int[] fullMinutesWithSecondsRemain = new int[2];
        fullMinutesWithSecondsRemain[0] = fullMinutes;
        fullMinutesWithSecondsRemain[1] = secondsRemain;
        return fullMinutesWithSecondsRemain;
    }
}
