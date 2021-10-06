package by.epamtc.stanislavmelnikov.task5.input;

import by.epamtc.stanislavmelnikov.task5.output.ConsoleOutput;

import java.util.Scanner;

/**
 * Class is used for data input.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class DataScanner {
    private ConsoleOutput consoleOutput;

    public DataScanner(ConsoleOutput consoleOutput) {
        this.consoleOutput = consoleOutput;
    }

    /**
     * Method does data input - one integer number. Checks whether entered data is correct.
     *
     * @return int number
     */
    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            consoleOutput.printWrongInputMessage();
            scanner.next();
        }
        int inputNumber = scanner.nextInt();
        scanner.close();
        return inputNumber;
    }
}
