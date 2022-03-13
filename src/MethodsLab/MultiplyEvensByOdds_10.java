package MethodsLab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(n));
    }

    private static int getMultipleOfEvensAndOdds(int n) {
        int sumOfEvens = getSumOfEvenDigits(n);
        int sumOfOdds = getSumOfOddDigits(n);

        return sumOfEvens * sumOfOdds;
    }

    private static int getSumOfOddDigits(int n) {
        int oddSum = 0;
        int[] arrayDigits = Arrays.stream(Integer.toString(n).split(""))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < arrayDigits.length; i++) {
            if (arrayDigits[i] % 2 != 0) {
                oddSum += arrayDigits[i];
            }
        }
        return oddSum;
    }

    private static int getSumOfEvenDigits(int n) {
        int evensSum = 0;
        int[] arrayDigits = Arrays.stream(Integer.toString(n).split(""))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        for (int i = 0; i < arrayDigits.length; i++) {
            if (arrayDigits[i] % 2 == 0) {
                evensSum += arrayDigits[i];
            }
        }
        return evensSum;
    }
}
