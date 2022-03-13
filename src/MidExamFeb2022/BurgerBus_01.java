package MidExamFeb2022;

import java.util.Scanner;

public class BurgerBus_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cityCount = Integer.parseInt(scanner.nextLine());

        double totalProfit = 0.0;

        for (int i = 1; i <= cityCount; i++) {
            String currentCity = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());

            if (i % 3 == 0 && i != 15) {
                expenses += expenses * 0.5;
            }
            if (i % 5 == 0) {
                income -= income * 0.1;
            }

            double currentProfit = income - expenses;
            totalProfit += currentProfit;

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", currentCity, currentProfit);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}
