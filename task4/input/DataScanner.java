package by.epamtc.stanislavmelnikov.task4.input;

import by.epamtc.stanislavmelnikov.task4.output.ConsoleOutput;

import java.util.Scanner;

/**
 * This class is used for data input.
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
     * Method does input of 4 numbers, using cycle.
     *
     * @return int array, with numbers entered.
     */
    public int[] inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        int amountNumbersToInput = 4;
        int[] numbers = new int[amountNumbersToInput];
        for (int i = 0; i < amountNumbersToInput; i++) {
            consoleOutput.printInputRequestMessage(i + 1);
            while (!scanner.hasNextInt()) {
                consoleOutput.printWrongInputDataMessage();
                scanner.next();
            }
            int sourceNumber = scanner.nextInt();
            numbers[i] = sourceNumber;
        }
        scanner.close();
        return numbers;
    }
}
