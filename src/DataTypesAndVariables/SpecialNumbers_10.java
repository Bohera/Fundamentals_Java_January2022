package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(input);

        for (int i = 1; i <= n; i++) {
            int number = i;
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

        }

    }
}
