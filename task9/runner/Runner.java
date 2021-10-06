package by.epamtc.stanislavmelnikov.task9.runner;

import by.epamtc.stanislavmelnikov.task9.input.DataScanner;
import by.epamtc.stanislavmelnikov.task9.logic.CircleProcessor;
import by.epamtc.stanislavmelnikov.task9.output.ConsoleOutput;

public class Runner {
    public static void main(String[] args) {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        DataScanner dataScanner = new DataScanner(consoleOutput);
        consoleOutput.printDataRequestMessage();
        int radius = dataScanner.inputRadius();
        CircleProcessor circleProcessor = new CircleProcessor();
        double circumference = circleProcessor.countCircumference(radius);
        double square = circleProcessor.countSquare(radius);
        consoleOutput.printCircumference(circumference);
        consoleOutput.printSquare(square);
    }
}
