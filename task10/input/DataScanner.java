package by.epamtc.stanislavmelnikov.task10.input;

import by.epamtc.stanislavmelnikov.task10.output.ConsoleOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataScanner {
    private ConsoleOutput consoleOutput;

    public DataScanner(ConsoleOutput consoleOutput) {
        this.consoleOutput = consoleOutput;
    }

    public List<Double> inputInfo() {
        Scanner scanner = new Scanner(System.in);
        List<Double> sourceData = new ArrayList<>();
        int amountArguments = 3;
        for (int i = 0; i < amountArguments; i++) {
            while (!scanner.hasNextDouble()) {
                consoleOutput.printWrongDataInputMessage();
                scanner.next();
            }
            sourceData.add(scanner.nextDouble());
        }
        scanner.close();
        return sourceData;
    }
}
