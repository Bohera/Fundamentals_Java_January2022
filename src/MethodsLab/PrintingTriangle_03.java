package MethodsLab;

import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        printNumberTriangles(number);

    }

    private static void printNumberTriangles(int number) {
        for (int length = 1; length <= number; length++) {
            printIncreasingNumbers(length);
        }
        for (int length = number - 1; length > 0; length--) {
            printIncreasingNumbers(length);
        }
    }

    private static void printIncreasingNumbers(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i);
            if (i < length) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
