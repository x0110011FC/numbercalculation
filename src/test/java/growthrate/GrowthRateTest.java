package growthrate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static util.Rounder.getRoundedNumber;

public class GrowthRateTest {

    GrowthRate growthRate = new GrowthRate(5062.5, 1.62);
    GrowthRate growthRate1 = new GrowthRate(0, 1.62);
    GrowthRate growthRate2 = new GrowthRate(1, 1.62);
    GrowthRate growthRate3 = new GrowthRate(-1, 1.62);
    GrowthRate growthRate4 = new GrowthRate(-5062.5, 1.62);


    @Test
    public void getGrowthRate() {
        assertEquals(2.5, getRoundedNumber(growthRate.getGrowthRate()), 0);
        assertEquals(0.0, getRoundedNumber(growthRate1.getGrowthRate()), 0);
        assertEquals(0.0, getRoundedNumber(growthRate2.getGrowthRate()), 0);
        assertEquals(0.0, getRoundedNumber(growthRate3.getGrowthRate()), 0);
        assertEquals(-2.5, getRoundedNumber(growthRate4.getGrowthRate()), 0);
    }
}