package firstnumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstNumberTest {

    FirstNumber firstNumber1 = new FirstNumber(1);
    FirstNumber firstNumber2 = new FirstNumber(-1);
    FirstNumber firstNumber3 = new FirstNumber(-10.22);
    FirstNumber firstNumber4 = new FirstNumber(10.34);
    FirstNumber firstNumber5 = new FirstNumber(0);

    @Test
    public void calculateFirstNumber() {
        assertEquals(1.62, firstNumber1.calculateFirstNumber(), 0);
        assertEquals(-0.78, firstNumber2.calculateFirstNumber(), 0);
        assertEquals(-9.775032000000001, firstNumber3.calculateFirstNumber(), 0);
        assertEquals(14.946312, firstNumber4.calculateFirstNumber(), 0);
        assertEquals(0.4, firstNumber5.calculateFirstNumber(), 0);
    }
}