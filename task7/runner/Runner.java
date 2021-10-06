package by.epamtc.stanislavmelnikov.task7.runner;

import by.epamtc.stanislavmelnikov.task7.input.DataScanner;
import by.epamtc.stanislavmelnikov.task7.logic.CoordinatesDistanceCalculator;
import by.epamtc.stanislavmelnikov.task7.output.ConsoleOutput;

import java.util.Map;
import java.util.Set;

/**
 * Class runs application, that computes pair of coordinates closest to center.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class Runner {

    public static void main(String[] args) {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        DataScanner dataScanner = new DataScanner(consoleOutput);
        Set<Map.Entry<Integer, Integer>> coordinates = dataScanner.inputCoordinates();
        CoordinatesDistanceCalculator coordinatesDistanceCalc = new CoordinatesDistanceCalculator();
        Map.Entry<Integer, Integer> closestCoordinates = coordinatesDistanceCalc.findClosestCoordinates(coordinates);
        consoleOutput.printResult(closestCoordinates);
    }
}
