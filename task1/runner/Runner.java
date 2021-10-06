package by.epamtc.stanislavmelnikov.task1.runner;

import by.epamtc.stanislavmelnikov.task1.input.DataScanner;
import by.epamtc.stanislavmelnikov.task1.logic.LastFigureComputer;
import by.epamtc.stanislavmelnikov.task1.output.ConsoleOutput;

/**
 * This class runs application, which uses last figure of number to find last figure of its square.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class Runner {
    /**
     * Main method
     *
     * @param args Unused
     * @return Nothing
     */
    public static void main(String[] args) {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        DataScanner dataScanner = new DataScanner(consoleOutput);
        consoleOutput.printInputRequestMessage();
        int sourceNumber = dataScanner.inputNumber();
        LastFigureComputer lastFigureComputer = new LastFigureComputer();
        int lastFigureOfNumber = lastFigureComputer.findLastFigure(sourceNumber);
        int squareOfLastFigure = lastFigureComputer.calculateSquare(lastFigureOfNumber);
        int result = lastFigureComputer.findLastFigure(squareOfLastFigure);
        consoleOutput.printResult(result);
    }
}
