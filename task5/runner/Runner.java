package by.epamtc.stanislavmelnikov.task5.runner;

import by.epamtc.stanislavmelnikov.task5.input.DataScanner;
import by.epamtc.stanislavmelnikov.task5.logic.PerfectNumbersDetector;
import by.epamtc.stanislavmelnikov.task5.output.ConsoleOutput;

import java.util.List;

/**
 * Class runs application that checks whether number, entered by user, is perfect( sum of all number dividers equals
 * number itself.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class Runner {
    /**
     * Method starts application.
     *
     * @param args No args.
     */
    public static void main(String[] args) {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        DataScanner dataScanner = new DataScanner(consoleOutput);
        consoleOutput.printInputNumberMessage();
        int sourceNumber = dataScanner.inputNumber();
        PerfectNumbersDetector perfectNumbersDetector = new PerfectNumbersDetector();
        List<Integer> dividers = perfectNumbersDetector.findAllDividersOfNumber(sourceNumber);
        boolean result = perfectNumbersDetector.isPerfectNumber(dividers, sourceNumber);
        consoleOutput.printResultMessage(result);
    }
}
