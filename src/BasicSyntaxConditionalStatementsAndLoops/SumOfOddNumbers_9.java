package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int oddNumbersFound = 0;
        int number = 1;
        int sum = 0;

        while (oddNumbersFound < n) {
            if (number % 2 != 0) {
                System.out.println(number);
                sum += number;
                oddNumbersFound++;
            }
            number++;
        }
        System.out.println("Sum: " + sum);
    }
}
