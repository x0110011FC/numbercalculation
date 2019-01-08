package firstnumber;

/*
 * First number calculation is based on ((0.5 * x^2) + (30 * x) + 10) / 25
 * Formula is decomposed into separate methods. This makes calculation more clear
 * and understandable.
 *
 * 1. (0.5 * x^2) -> calculatePartOne()
 * 2. (30 * x) + 10 -> calculatePartTwo()
 * 3. decomposed parts are summed up and divided by 25 -> calculateFirstNumber()
 *
 * */

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FirstNumber {

    private final double xParameter;

    // Params related to calculatePartOne()
    private static final double MULTIPLICATION_PARAM_X = 0.5;
    private static final double EXPONENT = 2;
    // Params related to calculatePartTwo()
    private static final int MULTIPLICATION_PARAM_Y = 30;
    private static final int ADDITION_PARAM_X = 10;
    // Params related to calculateFirstNumber()
    private static final int DENOMINATOR = 25;

    private double calculatePartOne(double xParameter) {
        double result;

        result = MULTIPLICATION_PARAM_X * Math.pow(xParameter, EXPONENT);

        return result;
    }

    private double calculatePartTwo(double xParameter) {
        double result;

        result = (MULTIPLICATION_PARAM_Y * xParameter) + ADDITION_PARAM_X;

        return result;
    }

    public double calculateFirstNumber() {

        double result;

        result = (calculatePartOne(xParameter) + calculatePartTwo(xParameter)) / DENOMINATOR;

        return result;
    }
}

