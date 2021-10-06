package by.epamtc.stanislavmelnikov.task2.output;

/**
 * Class is used for interaction with user through console.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class ConsoleOutput {
    public void printYearRequestMessage() {
        System.out.println("Enter year, please:");
    }

    public void printWrongDataInputMessage() {
        System.out.println("You've entered wrong data, try again!");
    }

    public void printMonthRequestMessage() {
        System.out.println("Enter month, please:");
    }

    public void printResult(int result) {
        System.out.println("Amount of days in month: " + result);
    }
}
