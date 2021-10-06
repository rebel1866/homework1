package by.epamtc.stanislavmelnikov.task6.runner;

import by.epamtc.stanislavmelnikov.task6.input.DataScanner;
import by.epamtc.stanislavmelnikov.task6.logic.HourProcessor;
import by.epamtc.stanislavmelnikov.task6.logic.MinuteProcessor;
import by.epamtc.stanislavmelnikov.task6.output.ConsoleOutput;

/**
 * Class runs application that computes how many full hours, minutes and seconds there are in seconds entered by user.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class Runner {
    /**
     * Main method, start program.
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        DataScanner dataScanner = new DataScanner(consoleOutput);
        consoleOutput.printDataRequestMessage();
        int sourceSeconds = dataScanner.inputSeconds();
        HourProcessor hourProcessor = new HourProcessor();
        int[] fullHoursAndSecondsRemain = hourProcessor.countFullHours(sourceSeconds);
        int fullHours = fullHoursAndSecondsRemain[0];
        MinuteProcessor minuteProcessor = new MinuteProcessor();
        int secondsRemain = fullHoursAndSecondsRemain[1];
        int[] fullMinutesAndSecondsRemain = minuteProcessor.countFullMinutes(secondsRemain);
        int fullMinutes = fullMinutesAndSecondsRemain[0];
        int totalSecondsRemain = fullMinutesAndSecondsRemain[1];
        consoleOutput.printResult(sourceSeconds, fullHours, fullMinutes, totalSecondsRemain);
    }
}
