package by.epamtc.stanislavmelnikov.task5.output;

/**
 * Class is used for data output.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class ConsoleOutput {
    public void printInputNumberMessage() {
        System.out.println("Enter number, please: ");
    }

    public void printWrongInputMessage() {
        System.out.println("You've entered wrong data, try again.");
    }

    public void printResultMessage(boolean result) {
        System.out.println("The given number is perfect number: " + result);
    }
}
