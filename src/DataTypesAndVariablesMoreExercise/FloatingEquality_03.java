package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        double actualDifference = Math.abs(firstNumber - secondNumber);

        double precisionThreshold = 0.000001;

        if (actualDifference <= precisionThreshold) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
