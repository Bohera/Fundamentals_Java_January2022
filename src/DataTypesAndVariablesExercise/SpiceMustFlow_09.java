package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = scanner.nextInt();

        int currentYield = startingYield;
        int daysCounter = 0;
        int totalSpice = 0;

        while (currentYield >= 100) {
            daysCounter++;
            totalSpice += currentYield;
            currentYield -= 10;
            totalSpice -= 26;
        }
        if (totalSpice - 26 >= 0) {
            totalSpice -= 26;
        }
        System.out.println(daysCounter);
        System.out.println(totalSpice);
    }
}
