package util;

import java.util.Scanner;

public class ReadConsoleInput {

    public static void readDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Only numeric values are accepted!");
            scanner.next();
        }
    }

    public static void readDoubleWithOutZero(Scanner scanner) {

        while (scanner.nextDouble() == 0.0) {
            System.out.println("Numeric value cannot be 0!");
            scanner.next();
        }
    }

    public static void readInteger(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Only numeric values are accepted!");
            scanner.next();
        }
    }
}
