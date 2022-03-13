package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FromLeftToTheRight_021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineCount = scanner.nextInt();

        for (int i = 0; i < lineCount; i++) {
            long numberOne = scanner.nextLong();
            long numberTwo = scanner.nextLong();

            if (numberOne > numberTwo) {
                String digitLength = "" + numberOne;
                int sum = 0;
                for (int j = 0; j < digitLength.length() ; j++) {
                    sum += numberOne % 10;
                    numberOne /= 10;
                }
                System.out.println(Math.abs(sum));
            } else {
                String digitLength = "" + numberTwo;
                int sum = 0;
                for (int j = 0; j < digitLength.length() ; j++) {
                    sum += numberTwo % 10;
                    numberTwo /= 10;
                }
                System.out.println(Math.abs(sum));
            }

        }

    }
}
