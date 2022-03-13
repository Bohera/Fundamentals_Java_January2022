package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class RefactoringPrimeChecker_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int divide = 2; divide < i; divide++) {
                if (i % divide == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }

    }
}
