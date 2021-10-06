package by.epamtc.stanislavmelnikov.task2.logic;

import by.epamtc.stanislavmelnikov.task2.entity.Months;

public class AmountOfDaysCalculator {
    /**
     * Calculates amount of days in month, user's entered.
     *
     * @param isLeapYear
     * @param currentMonth
     * @return Amount of days in current month regarding current year.
     */
    public int countAmountOfDaysMonth(boolean isLeapYear, Months currentMonth) {
        // additional day is used when there's leap year and current month is February
        int additionalDay = 1;
        int amountOfDays = Integer.parseInt(currentMonth.getAmountOfDays());
        if (isLeapYear & currentMonth == Months.FEBRUARY) {
            return amountOfDays + additionalDay;
        }
        return amountOfDays;
    }
}
