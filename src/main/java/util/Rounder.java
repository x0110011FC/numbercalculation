package util;
/*
 * Make numbers rounded to the nearest 0.25
 *
 * */

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Rounder {
    public static double getRoundedNumber(double initialNumber) {
        double result;

        result = Math.round(initialNumber * 4) / 4.0;

        return result;
    }
}
