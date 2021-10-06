package by.epamtc.stanislavmelnikov.task3.runner;

import by.epamtc.stanislavmelnikov.task3.input.DataScanner;
import by.epamtc.stanislavmelnikov.task3.logic.SquareProcessor;
import by.epamtc.stanislavmelnikov.task3.output.ConsoleOutput;

/**
 * Class runs application, which is used for computing area of inner square, based on outer square and the circle,
 * placed between two squares. Area of outer square is only given by user.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class Runner {
    /**
     * Main method, runs program.
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        DataScanner dataScanner = new DataScanner(consoleOutput);
        consoleOutput.printDataRequestMessage();
        int areaOuterSquare = dataScanner.inputAreaOfOuterSquare();
        SquareProcessor squareProcessor = new SquareProcessor();
        double radiusInnerCircle = squareProcessor.countRadiusOfInnerCircle(areaOuterSquare);
        double areaInnerSquare = squareProcessor.countAreaInnerSquare(radiusInnerCircle);
        consoleOutput.printInnerSquareArea(areaInnerSquare);
        double sizeDifference = squareProcessor.countSquaresDifference(areaOuterSquare, areaInnerSquare);
        consoleOutput.printSquaresDifference(sizeDifference);
    }
}
