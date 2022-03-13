package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine_71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double moneyTotal = 0;
        double price = 0;

        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                moneyTotal += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    price = 2.0;
                    if (moneyTotal < price) {
                        System.out.println("Sorry, not enough money");

                    } else {
                        System.out.println("Purchased Nuts");
                        moneyTotal -= price;
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (moneyTotal < price) {
                        System.out.println("Sorry, not enough money");

                    } else {
                        System.out.println("Purchased Water");
                        moneyTotal -= price;
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (moneyTotal < price) {
                        System.out.println("Sorry, not enough money");

                    } else {
                        System.out.println("Purchased Crisps");
                        moneyTotal -= price;
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (moneyTotal < price) {
                        System.out.println("Sorry, not enough money");

                    } else {
                        System.out.println("Purchased Soda");
                        moneyTotal -= price;
                    }
                    break;
                case "Coke":
                    price = 1.0;
                    if (moneyTotal < price) {
                        System.out.println("Sorry, not enough money");

                    } else {
                        System.out.println("Purchased Coke");
                        moneyTotal -= price;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", moneyTotal);

    }
}
