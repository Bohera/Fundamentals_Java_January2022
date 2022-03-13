package MethodsLab;

import java.util.Scanner;

public class SignOfInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        printSign(number);

    }

    private static void printSign(int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0){
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number " + number + " is zero.");
        }
    }
}
