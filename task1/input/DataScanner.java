package by.epamtc.stanislavmelnikov.task1.input;

import by.epamtc.stanislavmelnikov.task1.output.ConsoleOutput;

import java.util.Scanner;

/**
 * This class is used for data input.
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class DataScanner {
    private ConsoleOutput consoleOutput;

    public DataScanner(ConsoleOutput consoleOutput) {
        this.consoleOutput = consoleOutput;
    }

    /**
     * Method is used for data input.
     * If user enters wrong data, method print message - "wrong data input", and request information once again.
     * @return Number,entered by user.
     */
    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            consoleOutput.printWrongDataInputMessage();
            consoleOutput.printInputRequestMessage();
            scanner.next();
        }
        int sourceNumber = scanner.nextInt();
        scanner.close();
        return sourceNumber;
    }
}
