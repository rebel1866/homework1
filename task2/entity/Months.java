package by.epamtc.stanislavmelnikov.task2.entity;

/**
 * This enum stores list of months and amount of days, that each of them contains.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public enum Months {
    JANUARY("31"),
    FEBRUARY("28"),
    MARCH("31"),
    APRIL("30"),
    MAY("31"),
    JUNE("30"),
    JULE("31"),
    AUGUST("31"),
    SEPTEMBER("30"),
    OCTOBER("31"),
    NOVEMBER("30"),
    DECEMBER("31");

    private String amountOfDays;

    Months(String amountOfDays) {
        this.amountOfDays = amountOfDays;
    }

    public String getAmountOfDays() {
        return amountOfDays;
    }
}
