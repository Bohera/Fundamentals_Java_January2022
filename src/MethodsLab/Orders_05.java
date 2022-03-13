package MethodsLab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        orderCalculation(product, count);

    }

    private static void orderCalculation(String product, int count) {
        switch (product) {
            case "coffee":
                System.out.printf("%.2f", 1.50 * count);
                break;
            case "water":
                System.out.printf("%.2f", 1.00 * count);
                break;
            case "coke":
                System.out.printf("%.2f", 1.40 * count);
                break;
            case "snacks":
                System.out.printf("%.2f", 2.00 * count);
                break;
        }
    }
}
