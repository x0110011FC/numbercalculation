package growthrate;

import lombok.RequiredArgsConstructor;

/*
 * Growth rate calculation is based on (2% of y)/25/(firstNumber)
 * Formula is decomposed into separate methods. This makes calculation more clear
 * and understandable.
 *
 * 1. (2% of y) -> getPercent()
 * 2. (2% of y)/25 -> getDivided()
 * 3. decomposed parts are summed up and divided by firstNumber -> getGrowthRate()
 *
 * */
@RequiredArgsConstructor
public class GrowthRate {

    private final double yParameter;
    private final double firstNumber;

    private static final double PERCENTAGE = 0.02;
    private static final int DENOMINATOR = 25;

    private double getPercent(double yParam) {
        double result;

        result = PERCENTAGE * yParam;

        return result;
    }

    private double getDivided(double yParam) {
        double result;

        result = getPercent(yParam) / DENOMINATOR;

        return result;
    }

    public double getGrowthRate() {
        double result;

        result = getDivided(yParameter) / firstNumber;

        return result;
    }
}
