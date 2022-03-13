package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double moneySpend = 0;
        String input = scanner.nextLine();
        double gamePrice = 0;

        while (!input.equals("Game Time")) {
            switch (input) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    if (balance >= gamePrice) {
                        System.out.println("Bought " + input);
                        moneySpend += gamePrice;
                        balance -= gamePrice;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    if (balance >= gamePrice) {
                        System.out.println("Bought " + input);
                        moneySpend += gamePrice;
                        balance -= gamePrice;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    if (balance >= gamePrice) {
                        System.out.println("Bought " + input);
                        moneySpend += gamePrice;
                        balance -= gamePrice;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    if (balance >= gamePrice) {
                        System.out.println("Bought " + input);
                        moneySpend += gamePrice;
                        balance -= gamePrice;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    if (balance >= gamePrice) {
                        System.out.println("Bought " + input);
                        moneySpend += gamePrice;
                        balance -= gamePrice;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;

            }
            if (balance == 0) {
                System.out.println("Out of money!");
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", moneySpend, balance);
    }
}
