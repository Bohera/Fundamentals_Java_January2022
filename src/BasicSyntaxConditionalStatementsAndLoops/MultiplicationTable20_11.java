package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class MultiplicationTable20_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int multiplier = scanner.nextInt();

        for (int i = multiplier; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d X %d = %d%n", number, i, result);
        }
        if (multiplier > 10) {
            int result = number * multiplier;
            System.out.printf("%d X %d = %d%n", number, multiplier, result);
        }

    }
}
