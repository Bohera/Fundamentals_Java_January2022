package MethodsLab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calculation = scanner.nextLine();
        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        switch (calculation) {
            case "add":
                adding(numberOne, numberTwo);
                break;
            case "multiply":
                multiplying(numberOne, numberTwo);
                break;
            case "subtract":
                subtracting(numberOne, numberTwo);
                break;
            case "divide":
                dividing(numberOne, numberTwo);
                break;
        }

    }

    private static void dividing(int numberOne, int numberTwo) {
        System.out.println(numberOne / numberTwo);
    }

    private static void subtracting(int numberOne, int numberTwo) {
        System.out.println(numberOne - numberTwo);
    }

    private static void multiplying(int numberOne, int numberTwo) {
        System.out.println(numberOne * numberTwo);
    }

    private static void adding(int numberOne, int numberTwo) {
        System.out.println(numberOne + numberTwo);
    }
}
