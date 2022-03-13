package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        while (number % 2 != 0) {
            System.out.println("Please write an even number.");
            number = scanner.nextInt();
        }
        int absolute = Math.abs(number);
        System.out.printf("The number is: %d", absolute);

    }
}
