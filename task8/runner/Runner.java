package by.epamtc.stanislavmelnikov.task8.runner;

import by.epamtc.stanislavmelnikov.task8.input.DataScanner;
import by.epamtc.stanislavmelnikov.task8.logic.FunctionValueCalculator;
import by.epamtc.stanislavmelnikov.task8.output.ConsoleOutput;

public class Runner {
    public static void main(String[] args) {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        DataScanner dataScanner = new DataScanner(consoleOutput);
        consoleOutput.printDataRequestMessage();
        int x = dataScanner.inputX();
        FunctionValueCalculator functionValueCalculator = new FunctionValueCalculator();
        double fX = functionValueCalculator.computeValueOfFunction(x);
        consoleOutput.printResult(fX);
    }
}
