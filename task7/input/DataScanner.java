package by.epamtc.stanislavmelnikov.task7.input;

import by.epamtc.stanislavmelnikov.task7.output.ConsoleOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Class is used for data input.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class DataScanner {
    private ConsoleOutput consoleOutput;

    public DataScanner(ConsoleOutput consoleOutput) {
        this.consoleOutput = consoleOutput;
    }

    /**
     * Method used for input of coordinates.
     *
     * @return Set of Map.entry with two pairs of XY entered by user.
     * @throws NumberFormatException on string input.
     */
    public Set<Map.Entry<Integer, Integer>> inputCoordinates() {
        Scanner scanner = new Scanner(System.in);
        String coordinatesXY;
        Map<Integer, Integer> pairsOfXY = new HashMap<>();
        for (int i = 0; i <= 1; i++) {
            consoleOutput.printDataRequestMessage(i + 1);
            coordinatesXY = scanner.nextLine();
            String[] tempCoordsArray = coordinatesXY.split(" ");
            try {
                int x = Integer.parseInt(tempCoordsArray[0]);
                int y = Integer.parseInt(tempCoordsArray[1]);
                pairsOfXY.put(x, y);
            } catch (NumberFormatException e) {
                consoleOutput.printWrongDataInputMessage();
                return inputCoordinates();
            }
        }
        scanner.close();
        return pairsOfXY.entrySet();
    }
}
