import firstnumber.FirstNumber;
import growthrate.GrowthRate;
import resultseries.CalculateOverallSeries;
import specialnumber.SpecialNumber;
import util.ReadConsoleInput;
import util.Rounder;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    private static FirstNumber firstNumber;
    private static GrowthRate growthRate;
    private static CalculateOverallSeries calculateOverallSeries;
    private static Scanner scanner = new Scanner(System.in);
    private static Stream.Builder<Double> resultStreamBuilder = Stream.builder();
    private static Stream.Builder<Double> resultRoundedStreamBuilder = Stream.builder();
    private static int length;
    private static double approximateNumber;
    private static double specialNumber;

    public static void main(String[] args) {
        // user input
        System.out.println("Insert parameter X: ");

        ReadConsoleInput.readDouble(scanner);
        firstNumber = new FirstNumber(scanner.nextDouble());

        System.out.println("Insert parameter Y: ");
        ReadConsoleInput.readDouble(scanner);
        growthRate = new GrowthRate(scanner.nextDouble(), firstNumber.calculateFirstNumber());

        System.out.println("Insert series length: ");
        ReadConsoleInput.readInteger(scanner);
        length = scanner.nextInt();

        System.out.println("\nFirst number = " + firstNumber.calculateFirstNumber());
        System.out.printf("Growth rate = %.2f", growthRate.getGrowthRate());

        // show unmodified list of values
        calculateOverallSeries = new CalculateOverallSeries(firstNumber.calculateFirstNumber(), growthRate.getGrowthRate());

        System.out.println("\nDefault numbers\n");
        resultStreamBuilder.add(firstNumber.calculateFirstNumber());
        for (int i = 1; i < length; i++) {
            resultStreamBuilder.add(calculateOverallSeries.calculateSeries(i));
        }

        Stream<Double> resultStream = resultStreamBuilder.build();
        resultStream.sorted().distinct().forEach(System.out::println);

        // show rounded list of values
        System.out.println("\nRounded numbers\n");
        resultRoundedStreamBuilder.add(Rounder.getRoundedNumber(firstNumber.calculateFirstNumber()));
        for (int i = 1; i < length; i++) {
            resultRoundedStreamBuilder.add(Rounder.getRoundedNumber(calculateOverallSeries.calculateSeries(i)));
        }

        Stream<Double> resultStreamRounded = resultRoundedStreamBuilder.build();

        List<Double> list = resultStreamRounded.sorted().distinct().collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println("\nSpecial number = " + SpecialNumber.getThirdLargestNumber(list) + "\n");
        System.out.println("Insert parameter Z: ");
        ReadConsoleInput.readDouble(scanner);

        approximateNumber = SpecialNumber.getApproximateNumber(scanner.nextDouble());
        specialNumber = list.stream().min(Comparator.comparingDouble(i -> Math.abs(i - approximateNumber))).get();
        System.out.println("\nApproximate number = " + Rounder.getRoundedNumber(approximateNumber) + " which makes " + specialNumber + " special. \n");
    }

}
