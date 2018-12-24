package resultseries;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateOverallSeriesTest {

    CalculateOverallSeries calculateOverallSeries = new CalculateOverallSeries(1.62, 2.5);
    CalculateOverallSeries calculateOverallSeries1 = new CalculateOverallSeries(0, 0);
    CalculateOverallSeries calculateOverallSeries2 = new CalculateOverallSeries(-1, 0);

    @Test
    public void calculateSeries() {
        assertEquals(4.050000000000001, calculateOverallSeries.calculateSeries(1), 0);
        assertEquals(6.561000000000002, calculateOverallSeries.calculateSeries(2), 0);

        assertEquals(0.0, calculateOverallSeries1.calculateSeries(1), 0);
        assertEquals(0.0, calculateOverallSeries1.calculateSeries(2), 0);


        assertEquals(-0.0, calculateOverallSeries2.calculateSeries(1), 0);
        assertEquals(-0.0, calculateOverallSeries2.calculateSeries(2), 0);

    }
}