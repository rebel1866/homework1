package by.epamtc.stanislavmelnikov.task2.runner;

import by.epamtc.stanislavmelnikov.task2.entity.Months;
import by.epamtc.stanislavmelnikov.task2.input.DataScanner;
import by.epamtc.stanislavmelnikov.task2.logic.AmountOfDaysCalculator;
import by.epamtc.stanislavmelnikov.task2.logic.LeapYearsCalculator;
import by.epamtc.stanislavmelnikov.task2.output.ConsoleOutput;

/**
 * Class runs application, intended to calculate amount of days in month correctly regarding leap years.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class Runner {
    /**
     * Method runs program.
     *
     * @param args No input args.
     */
    public static void main(String[] args) {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        DataScanner dataScanner = new DataScanner(consoleOutput);
        consoleOutput.printYearRequestMessage();
        int year = dataScanner.inputYear();
        consoleOutput.printMonthRequestMessage();
        Months inputMonth = dataScanner.inputMonth();
        LeapYearsCalculator leapYearsCalculator = new LeapYearsCalculator();
        leapYearsCalculator.calculateLeapYears();
        boolean isLeapYear = leapYearsCalculator.isLeapYear(year);
        AmountOfDaysCalculator amountOfDaysCalculator = new AmountOfDaysCalculator();
        int result = amountOfDaysCalculator.countAmountOfDaysMonth(isLeapYear, inputMonth);
        consoleOutput.printResult(result);
    }
}
