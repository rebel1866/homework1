package by.epamtc.stanislavmelnikov.task10.output;

import java.util.List;
import java.util.Map;

public class ConsoleOutput {

    public void printDataRequestMessage() {
        System.out.println("Enter a,b and h: ");
    }

    public void printWrongDataInputMessage() {
        System.out.println("Wrong data. Try again.");
    }

    public void printResult(List<Map.Entry<Double, Double>> functionValues) {
        for (var keyValue : functionValues) {
            System.out.println(keyValue.getKey() + " = " + String.format("%.2f", keyValue.getValue()));
        }
    }
}