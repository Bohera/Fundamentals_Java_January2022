package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class BalancedBrackets_061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isBalanced = true;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input == "(") {

            }
        }
        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
