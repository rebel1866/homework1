package by.epamtc.stanislavmelnikov.task10.logic;

import java.util.*;

public class FunctionValuesComputer {

    public List<Map.Entry<Double, Double>> calculateFunctionValues(double start, double end, double step) {
        List<Map.Entry<Double, Double>> functionValues = new ArrayList<>();
        for (double i = start; i <= end; i = i + step) {
            functionValues.add(Map.entry(i, executeFunction(i)));
        }
        return functionValues;
    }

    public double executeFunction(double x) {
        return Math.tan(x);
    }
}
