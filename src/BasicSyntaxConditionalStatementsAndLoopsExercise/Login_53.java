package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login_53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }
        String input = scanner.nextLine();
        int count = 0;
        while (!input.equals(password)) {
            count++;
            if (count < 4) {
                System.out.println("Incorrect password. Try again.");
                input = scanner.nextLine();
            } else {
                System.out.printf("User %s blocked!", username);
                break;
            }

        }

        if (input.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
