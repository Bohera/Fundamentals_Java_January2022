package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login_51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        StringBuilder sb = new StringBuilder(username);
        String reverse = sb.reverse().toString();

        int counter = 0;

        while (true) {
            if (!password.equals(reverse)) {
                counter++;
                if (counter == 4) {
                    System.out.printf("User %s blocked!", username);
                    return;
                }
                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.printf("User %s logged in.", username);
            }
            password = scanner.nextLine();
        }
    }
}
