package by.epamtc.stanislavmelnikov.task8.input;

import by.epamtc.stanislavmelnikov.task8.output.ConsoleOutput;

import java.util.Scanner;

public class DataScanner {
    private ConsoleOutput consoleOutput;

    public DataScanner(ConsoleOutput consoleOutput) {
        this.consoleOutput = consoleOutput;
    }

    public int inputX() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            consoleOutput.printWrongInputDataMessage();
            scanner.next();
        }
        int x = scanner.nextInt();
        scanner.close();
        return x;
    }
}
