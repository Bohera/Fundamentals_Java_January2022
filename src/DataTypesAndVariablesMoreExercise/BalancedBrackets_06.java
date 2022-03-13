package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String lastBracketType = "";
        int counterClose = 0;
        int counterOpen = 0;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.equals("(") || input.equals(")")) {
                if (input.equals("(")) {
                    counterOpen++;
                } else {
                    counterClose++;
                    if (counterOpen - counterClose != 0){
                        System.out.println("UNBALANCED");
                        return;
                    }
                }
            }
        }
        if (counterOpen == counterClose) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
