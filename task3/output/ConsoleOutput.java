package by.epamtc.stanislavmelnikov.task3.output;

/**
 * Class is used to communicate with user with help of console.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class ConsoleOutput {
    public void printInnerSquareArea(double innerSquareArea) {
        System.out.println("Area of inner square is: " + innerSquareArea);
    }

    public void printSquaresDifference(double difference) {
        System.out.println("Outer square is bigger then inner in " + difference + " times.");
    }

    public void printWrongInputDataMessage() {
        System.out.println("Wrong data entered. Try again");
    }

    public void printDataRequestMessage() {
        System.out.println("Input area of outer square, please: ");
    }
}
