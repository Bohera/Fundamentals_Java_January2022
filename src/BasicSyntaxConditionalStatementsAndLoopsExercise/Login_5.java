package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        int attemptCount = 0;

        StringBuilder sb = new StringBuilder(username);
        String reverse = sb.reverse().toString();

        while (true) {
            if (!password.equals(reverse)) {
                attemptCount++;
                if (attemptCount == 4) {
                    System.out.printf("User %s blocked!", username);
                    return;
                }
                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.printf("User %s logged in.", username);
                break;
            }
            password = scanner.nextLine();
        }
    }
}