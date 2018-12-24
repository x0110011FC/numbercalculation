package specialnumber;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class SpecialNumberTest {

    private List<Double> list = new ArrayList<>();
    private List<Double> list1 = new ArrayList<>();
    private List<Double> list2 = new ArrayList<>();
    private List<Double> list3 = new ArrayList<>();
    private List<Double> list4 = new ArrayList<>();


    @Test
    public void getThirdLargestNumber() {

        list.add(3.4);
        list.add(4.5);
        list.add(6.4);
        list.add(10.0);
        list.add(1.1);

        list.stream().sorted().distinct().collect(Collectors.toList());
        assertEquals(6.4, SpecialNumber.getThirdLargestNumber(list), 0);

        list1.add(-3.4);
        list1.add(-4.5);
        list1.add(-6.4);
        list1.add(-10.0);
        list1.add(-1.1);

        list1.stream().sorted().distinct().collect(Collectors.toList());
        assertEquals(-6.4, SpecialNumber.getThirdLargestNumber(list1), 0);

        list2.add(0.0);
        list2.add(-10.3);
        list2.add(1.0);
        list2.add(0.0);
        list2.add(1.1);

        list2.stream().sorted().distinct().collect(Collectors.toList());
        assertEquals(1.0, SpecialNumber.getThirdLargestNumber(list2), 0);

        // only 2 elements in the list
        list3.add(3.4);
        list3.add(4.5);
        assertEquals(3.4, SpecialNumber.getThirdLargestNumber(list3), 0);

        // only 1 element in the list
        list4.add(3.4);
        assertEquals(3.4, SpecialNumber.getThirdLargestNumber(list4), 0);

    }

    @Test
    public void getApproximateNumber() {
        assertEquals(1000, SpecialNumber.getApproximateNumber(1), 0);
        assertEquals(-1000, SpecialNumber.getApproximateNumber(-1), 0);
        assertEquals(2000, SpecialNumber.getApproximateNumber(0.5), 0);
        assertEquals(1, SpecialNumber.getApproximateNumber(1000), 0);
    }
}