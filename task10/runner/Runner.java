package by.epamtc.stanislavmelnikov.task10.runner;

import by.epamtc.stanislavmelnikov.task10.input.DataScanner;
import by.epamtc.stanislavmelnikov.task10.logic.FunctionValuesComputer;
import by.epamtc.stanislavmelnikov.task10.output.ConsoleOutput;

import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        DataScanner dataScanner = new DataScanner(consoleOutput);
        consoleOutput.printDataRequestMessage();
        List<Double> sourceData = dataScanner.inputInfo();
        double start = sourceData.get(0);
        double end = sourceData.get(1);
        double step = sourceData.get(2);
        FunctionValuesComputer functionValuesComputer = new FunctionValuesComputer();
        List<Map.Entry<Double, Double>> functionValues = functionValuesComputer.calculateFunctionValues(start, end, step);
        consoleOutput.printResult(functionValues);
    }
}
