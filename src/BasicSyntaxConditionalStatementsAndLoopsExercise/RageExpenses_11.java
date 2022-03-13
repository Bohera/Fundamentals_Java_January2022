package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double accumulatedPrice = 0;
        int brokeKeyboard = 0;

        for (int i = 1; i <= lostCount; i++) {
            if (i % 2 == 0) {
                accumulatedPrice += headsetPrice;
            }
            if (i % 3 == 0) {
                accumulatedPrice += mousePrice;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                brokeKeyboard++;
                accumulatedPrice += keyboardPrice;
                if (brokeKeyboard % 2 == 0) {
                    accumulatedPrice += displayPrice;
                }
            }

        }
        System.out.printf("Rage expenses: %.2f lv.", accumulatedPrice);


    }
}
