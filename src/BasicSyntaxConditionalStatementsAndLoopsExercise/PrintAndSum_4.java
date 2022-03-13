package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PrintAndSum_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int sum = 0;

        for (int i = number1; i <= number2; i++) {
            System.out.printf("%d ",i);
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
