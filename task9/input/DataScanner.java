package by.epamtc.stanislavmelnikov.task9.input;

import by.epamtc.stanislavmelnikov.task9.output.ConsoleOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataScanner {
    private ConsoleOutput consoleOutput;

    public DataScanner(ConsoleOutput consoleOutput) {
        this.consoleOutput = consoleOutput;
    }

    public int inputRadius() {
        Scanner scanner = new Scanner(System.in);
        int radius;
        try {
            radius = scanner.nextInt();
            if (radius <= 0) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            consoleOutput.printWrongDataInputMessage();
            return inputRadius();
        }
        scanner.close();
        return radius;
    }
}
