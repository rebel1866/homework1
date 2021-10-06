package by.epamtc.stanislavmelnikov.task6.input;

import by.epamtc.stanislavmelnikov.task6.output.ConsoleOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class is used for data input.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class DataScanner {
    ConsoleOutput consoleOutput;

    public DataScanner(ConsoleOutput consoleOutput) {
        this.consoleOutput = consoleOutput;
    }

    /**
     * Method request user to input amount of seconds.
     *
     * @return Amount of seconds.
     * @throws InputMismatchException on string input or when number entered less than 0.
     */
    public int inputSeconds() {
        Scanner scanner = new Scanner(System.in);
        int sourceSeconds;
        try {
            sourceSeconds = scanner.nextInt();
            if (sourceSeconds < 0) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            consoleOutput.printWrongInputMessage();
            return inputSeconds();
        }
        scanner.close();
        return sourceSeconds;
    }
}
