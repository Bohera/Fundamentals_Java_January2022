package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        int sum = sumNumberOneTwo(numberOne, numberTwo);

        subtractThreeFromSumPrint(sum, numberThree);

    }

    private static void subtractThreeFromSumPrint(int sum, int numberThree) {
        System.out.println(sum - numberThree);
    }

    private static int sumNumberOneTwo(int numberOne, int numberTwo) {
            int sum = numberOne + numberTwo;
            return sum;
    }
}
