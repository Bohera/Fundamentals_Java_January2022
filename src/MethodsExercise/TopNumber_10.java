package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = Integer.parseInt(scanner.nextLine());

        checkIfDivisibleByEight(number);


    }

    private static void checkIfDivisibleByEight(long number) {
        for (int i = 1; i <= number; i++) {
            if (i > 15) {
                long[] digitsInNumber = Arrays.stream(Integer.toString(i)
                                .split(""))
                        .mapToLong(e -> Integer.parseInt(e))
                        .toArray();
                long sum = 0;
                for (int j = 0; j < digitsInNumber.length; j++) {
                    sum += digitsInNumber[j];
                }
                if (sum % 8 == 0) {
                    checkIfOddDigit(digitsInNumber);
                }
            }

        }

    }

    private static void checkIfOddDigit(long[] digitsInNumber) {
        boolean isOdd = false;
        for (int i = 0; i < digitsInNumber.length; i++) {
            if (digitsInNumber[i] % 2 != 0) {
                isOdd = true;
            }
        }
        if (isOdd) {
            for (int i = 0; i < digitsInNumber.length; i++) {
                System.out.print(digitsInNumber[i]);
            }
            System.out.println();
        }
    }
}
