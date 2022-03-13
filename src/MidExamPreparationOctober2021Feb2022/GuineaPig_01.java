package MidExamPreparationOctober2021Feb2022;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodKilo = Double.parseDouble(scanner.nextLine()) * 1000;
        double hayKilo = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverKilo = Double.parseDouble(scanner.nextLine()) * 1000;
        double puppyKilo = Double.parseDouble(scanner.nextLine()) * 1000;

        int dayCounter = 1;
        boolean enoughSupply = true;
        for (int i = 30; i > 0; i--) {
            foodKilo -= 300;
            if (i % 2 != 0) {
                hayKilo -= foodKilo * 0.05;
            }
            if (dayCounter == 3) {
                coverKilo -= puppyKilo / 3;
            }
            if (dayCounter != 3) {
                dayCounter++;
            } else {
                dayCounter = 1;
            }
            if (foodKilo <= 0 || hayKilo <= 0 || coverKilo <= 0) {
                enoughSupply = false;
            }
        }

        if (enoughSupply) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", (double)Math.round(foodKilo) / 1000, (double)Math.round(hayKilo) / 1000, (double)Math.round(coverKilo) / 1000);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
