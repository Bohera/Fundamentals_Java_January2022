package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long numberOne = Integer.parseInt(scanner.nextLine());
        long numberTwo = Integer.parseInt(scanner.nextLine());

        double factorialNumberOne = factorialNumberOne(numberOne);
        double factorialNumberTwo = factorialNumberOne(numberTwo);

        System.out.printf("%.2f", factorialNumberOne / factorialNumberTwo);

    }

    private static long factorialNumberOne(long numberOne) {
        if (numberOne == 0) {
            return 1;
        }
        long factorialNumberOne = numberOne;
        for (long f = numberOne - 1; f > 0; f--) {
            factorialNumberOne *= f;
        }
        return factorialNumberOne;
    }
}
