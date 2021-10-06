package by.epamtc.stanislavmelnikov.task3.input;

import by.epamtc.stanislavmelnikov.task3.output.ConsoleOutput;

import java.util.Scanner;

/**
 * This class is used for data input.
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
     * Method used for gathering info about given square.
     * Uses infinite cycle to check whether input data is correct. In case of wrong input, invokes
     * {@link ConsoleOutput#printWrongInputDataMessage()} method to inform user about input error.
     * @return Area of given square.
     */
    public int inputAreaOfOuterSquare() {
        Scanner scanner = new Scanner(System.in);
        int area;
        while (true) {
            while (!scanner.hasNextInt()) {
                consoleOutput.printWrongInputDataMessage();
                scanner.next();
            }
            area = scanner.nextInt();
            if (area > 0) {
                break;
            } else {
                consoleOutput.printWrongInputDataMessage();
            }
        }
        scanner.close();
        return area;
    }
}
