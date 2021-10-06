package by.epamtc.stanislavmelnikov.task4.output;

/**
 * Class is used for data output.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class ConsoleOutput {
    public void printInputRequestMessage(int indexOfInputNumber) {
        System.out.println("Enter number № " + indexOfInputNumber + ":");
    }

    public void printWrongInputDataMessage() {
        System.out.println("Wrong data. Try again");
    }

    public void printResultMessage(boolean isMoreThanTwo) {
        System.out.println("Even numbers more or equals two: " + isMoreThanTwo);
    }
}
