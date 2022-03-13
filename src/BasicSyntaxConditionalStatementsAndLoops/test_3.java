package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class test_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your age:");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("You're too young to drink");
        } else if (age < 65) {
            System.out.println("You can drink");
        } else {
            System.out.println("It's not advisable for you to drink");
        }
    }
}
