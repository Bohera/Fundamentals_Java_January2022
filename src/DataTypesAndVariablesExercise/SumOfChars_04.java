package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int inputCount = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < inputCount; i++) {
            char input = scanner.nextLine().charAt(0);
            sum += input;
        }
        System.out.printf("The sum equals: %s", sum);
    }
}