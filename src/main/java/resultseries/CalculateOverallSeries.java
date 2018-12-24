package resultseries;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CalculateOverallSeries {
    private final double firstNumber;
    private final double growthRate;

    public double calculateSeries(int index) {
        double result;

        result = growthRate * Math.pow(firstNumber, index);

        return result;
    }
}




