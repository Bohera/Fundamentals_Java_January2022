package DataTypesAndVariables;

import java.util.Scanner;

public class test_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double bottleLiters = 0.5;
        double totalBeerLiters = Double.parseDouble(input);


        double bottlesFloatingPoint = totalBeerLiters / bottleLiters;
        int bottles = (int) bottlesFloatingPoint;

        System.out.printf("Total: %d bottles", bottles);
        System.out.printf("Remaining unbottled: %f liters", totalBeerLiters - bottles * bottleLiters);
    }
}
