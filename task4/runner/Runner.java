package by.epamtc.stanislavmelnikov.task4.runner;

import by.epamtc.stanislavmelnikov.task4.logic.EvenNumbersCounter;
import by.epamtc.stanislavmelnikov.task4.input.DataScanner;
import by.epamtc.stanislavmelnikov.task4.output.ConsoleOutput;

/**
 * Class runs application, that requests user to input 4 numbers and than computes, how many even numbers there are among.
 * If there are more than two, program prints true to console.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class Runner {
    /**
     * Main method, starts application.
     *
     * @param args No args.
     */
    public static void main(String[] args) {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        DataScanner dataScanner = new DataScanner(consoleOutput);
        int[] numbers = dataScanner.inputNumbers();
        EvenNumbersCounter evenNumbersCounter = new EvenNumbersCounter();
        boolean isEvenNumbersMoreThanTwo = evenNumbersCounter.isEvenNumbersMoreThanTwo(numbers);
        consoleOutput.printResultMessage(isEvenNumbersMoreThanTwo);
    }
}
