package by.epamtc.stanislavmelnikov.task2;

import by.epamtc.stanislavmelnikov.task2.logic.LeapYearsCalculator;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearsCalculatorTest {

    @Test
    void calculateLeapYears() {
        LeapYearsCalculator leapYearsCalculator = new LeapYearsCalculator();
        int leapYear = 2020;
        List<Integer> actual = leapYearsCalculator.calculateLeapYears();
        Assertions.assertTrue(actual.contains(leapYear));
    }


    @Test
    void isLeapYear() {
        LeapYearsCalculator leapYearsCalculator = new LeapYearsCalculator();
        leapYearsCalculator.calculateLeapYears();
        int leapYear = 2016;
        Assertions.assertTrue(leapYearsCalculator.isLeapYear(leapYear));
    }
}