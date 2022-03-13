package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        number = scanner.nextInt();
        int otherNumber;
        otherNumber = scanner.nextInt();

        int sum = number + otherNumber;


        System.out.print(sum + "\n");
        System.out.println(sum);

        System.out.println("the result is: " + sum);
        System.out.printf("the result is: %d", sum);
    }
}
