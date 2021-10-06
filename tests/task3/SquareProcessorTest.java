package by.epamtc.stanislavmelnikov.task3;

import by.epamtc.stanislavmelnikov.task3.logic.SquareProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareProcessorTest {

    @Test
    void countRadiusOfInnerCircle() {
        SquareProcessor squareProcessor = new SquareProcessor();
        double expected = 2.0;
        double actual = squareProcessor.countRadiusOfInnerCircle(16);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void countSquaresDifference() {
        SquareProcessor squareProcessor = new SquareProcessor();
        double expected = 2.0;
        double actual = squareProcessor.countSquaresDifference(18,9);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void countAreaInnerSquare() {
        SquareProcessor squareProcessor = new SquareProcessor();
        double expected = 18.0;
        double actual = squareProcessor.countAreaInnerSquare(3.0);
        Assertions.assertEquals(expected, actual);
    }
}