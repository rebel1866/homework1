package by.epamtc.stanislavmelnikov.task1.output;
/**
 * Class is used for data output on console.
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class ConsoleOutput {
    public void printInputRequestMessage() {
        System.out.println("Enter number, please:");
    }

    public void printWrongDataInputMessage() {
        System.out.println("You've entered wrong data! Please, try again.");
    }

    public void printResult(int result) {
        System.out.println("The last figure of square of given number is: " + result);
    }
}
