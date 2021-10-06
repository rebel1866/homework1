package by.epamtc.stanislavmelnikov.task1;

import by.epamtc.stanislavmelnikov.task1.logic.LastFigureComputer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LastFigureComputerTest {

    @Test
    void calculateSquare() {
        LastFigureComputer lastFigureComputer = new LastFigureComputer();
        int expected = 25;
        int actual = lastFigureComputer.calculateSquare(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findLastFigure() {
        LastFigureComputer lastFigureComputer = new LastFigureComputer();
        int expected = 3;
        int actual = lastFigureComputer.findLastFigure(543);
        Assertions.assertEquals(expected, actual);
    }
}