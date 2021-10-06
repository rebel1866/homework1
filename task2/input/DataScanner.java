package by.epamtc.stanislavmelnikov.task2.input;

import by.epamtc.stanislavmelnikov.task2.entity.Months;
import by.epamtc.stanislavmelnikov.task2.output.ConsoleOutput;

import java.util.InputMismatchException;
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
     * Method is used for year input.
     *
     * @return Year value.
     * @throws InputMismatchException on entered string arguments or when given year is less than 0.
     */
    public int inputYear() {
        Scanner scanner = new Scanner(System.in);
        int year;
        try {
            year = scanner.nextInt();
            if (year < 0) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            consoleOutput.printWrongDataInputMessage();
            consoleOutput.printYearRequestMessage();
            return inputYear();
        }
        return year;
    }

    /**
     * Method does month input.
     *
     * @return Month value.
     * @throws IllegalArgumentException when there's no such a month, that user's entered.
     */
    public Months inputMonth() {
        Scanner scanner = new Scanner(System.in);
        String inputMonth = scanner.nextLine();
        Months currentMonth;
        try {
            currentMonth = Months.valueOf(inputMonth.toUpperCase());
        } catch (IllegalArgumentException e) {
            consoleOutput.printWrongDataInputMessage();
            consoleOutput.printMonthRequestMessage();
            return inputMonth();
        } finally {
            scanner.close();
        }
        return currentMonth;
    }
}