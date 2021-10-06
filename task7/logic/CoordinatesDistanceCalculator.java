package by.epamtc.stanislavmelnikov.task7.logic;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Class is used for processing coordinates data. Contains two methods.
 * One of them {@link #countXYDistanceToCenter(Map.Entry)} counts distance of coordinates to center,
 * another one {@link #findClosestCoordinates(Set)} checks which of two given pairs of XY is closest
 * to center.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class CoordinatesDistanceCalculator {
    /**
     * Counts total distance of coordinates to center.
     *
     * @param coordinates Map.entry, parametrized by Integer,Integer
     * @return double value - distance of coordinates to center.
     */
    public double countXYDistanceToCenter(Map.Entry<Integer, Integer> coordinates) {
        int x = coordinates.getKey();
        int y = coordinates.getValue();
        double distanceToCenter = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        return distanceToCenter;
    }

    /**
     * Method takes two pairs of XY and computes which of them is closest to center.
     * Once the calculations have been made method returns Map.Entry with pair of XY that is closer to center
     * than another one.
     *
     * @param pairsXY Set of Map.Entry
     * @return Map.Entry, contains pair of XY that is closest to center.
     */
    public Map.Entry<Integer, Integer> findClosestCoordinates(Set<Map.Entry<Integer, Integer>> pairsXY) {
        Iterator<Map.Entry<Integer, Integer>> iterator = pairsXY.iterator();
        var firstPairXY = iterator.next();
        var secondPairXY = iterator.next();
        double distanceFirstPair = countXYDistanceToCenter(firstPairXY);
        double distanceSecondPair = countXYDistanceToCenter(secondPairXY);
        if (distanceFirstPair < distanceSecondPair) {
            return firstPairXY;
        }
        return secondPairXY;
    }
}
