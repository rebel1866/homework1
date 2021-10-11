package by.epamtc.stanislavmelnikov.task4.logic;

/**
 * Class used for working with even numbers, contains method for checking whether given number is even.
 *
 * @author Stanislav Melnikov
 * @version 1.0
 */
public class EvenNumbersCounter {
    /**
     * Method checks is given number even or not.
     *
     * @param numbers array of numbers entered.
     * @return boolean, if true, it means there are even numbers more than two.
     */
    public boolean isEvenNumbersMoreThanTwo(int... numbers) {
        int counterEvenNumbers = 0;
        for (int element : numbers) {
            if (element % 2 == 0) {
                counterEvenNumbers++;
            }
        }
        return counterEvenNumbers >= 2;
    }
}
