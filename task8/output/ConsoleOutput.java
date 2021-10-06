package by.epamtc.stanislavmelnikov.task8.output;

public class ConsoleOutput {
    public void printDataRequestMessage() {
        System.out.println("Input x: ");
    }

    public void printWrongInputDataMessage() {
        System.out.println("Wrong data, try again");
    }

    public void printResult(double result) {
        System.out.println("Result: " + result);
    }
}
