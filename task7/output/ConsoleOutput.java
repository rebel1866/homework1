package by.epamtc.stanislavmelnikov.task7.output;

import java.util.Map;

/**
 * Class is used for data output.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class ConsoleOutput {
    public void printDataRequestMessage(int numberOfCoordinatePair) {
        System.out.println("Enter pair of coordinates number " + numberOfCoordinatePair);
    }

    public void printWrongDataInputMessage() {
        System.out.println("Wrong data. Try again.");
    }

    public void printResult(Map.Entry<Integer, Integer> coordinates) {
        System.out.println("These coordinates are the closest to the center: ");
        System.out.println("X: " + coordinates.getKey() + " Y: " + coordinates.getValue());
    }
}
