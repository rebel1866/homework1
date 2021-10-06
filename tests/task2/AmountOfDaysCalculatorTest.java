package by.epamtc.stanislavmelnikov.task2;

import by.epamtc.stanislavmelnikov.task2.entity.Months;
import by.epamtc.stanislavmelnikov.task2.logic.AmountOfDaysCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AmountOfDaysCalculatorTest {

    @Test
    void countAmountOfDaysMonth() {
        AmountOfDaysCalculator amountOfDaysCalculator = new AmountOfDaysCalculator();
        int expected = 29;
        int actual = amountOfDaysCalculator.countAmountOfDaysMonth(true, Months.FEBRUARY);
        Assertions.assertEquals(expected, actual);
    }
}