package by.epamtc.stanislavmelnikov.task6.output;

/**
 * Class is used for data output.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class ConsoleOutput {
    public void printDataRequestMessage() {
        System.out.println("Enter amount of seconds, please: ");
    }

    public void printWrongInputMessage() {
        System.out.println("You've entered wrong data, try again.");
    }

    public void printResult(int inputSeconds, int fullHours, int fullMinutes, int seconds) {
        System.out.println("Input seconds: " + inputSeconds);
        System.out.println("Full hours: " + fullHours);
        System.out.println("Full minutes: " + fullMinutes);
        System.out.println("Seconds: " + seconds);
    }
}
