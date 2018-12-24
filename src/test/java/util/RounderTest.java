package util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RounderTest {

    @Test
    public void getRoundedNumber() {
        assertEquals(0, Rounder.getRoundedNumber(0.0), 0);
        assertEquals(1, Rounder.getRoundedNumber(1), 0);
        assertEquals(10.75, Rounder.getRoundedNumber(10.63), 0);
        assertEquals(12, Rounder.getRoundedNumber(12.12), 0);
    }
}