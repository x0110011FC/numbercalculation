package specialnumber;

import java.util.List;

public class SpecialNumber {

    private static final double Y_PARAM = 1000.0;

    public static double getThirdLargestNumber(List<Double> list) {

        if (list.size() == 2) {
            return list.get(list.size() - 2);
        } else if (list.size() == 1) {
            return list.get(list.size() - 1);
        } else {
            return list.get(list.size() - 3);
        }
    }

    public static double getApproximateNumber(double zParam) {
        return Y_PARAM / zParam;
    }
}
