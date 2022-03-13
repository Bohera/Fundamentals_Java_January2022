package MidExamFeb2022;

import java.util.Scanner;

public class SpaceTravel_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] travelRoad = scanner.nextLine().split("\\|+");

        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= travelRoad.length - 1; i++) {
            if (i == travelRoad.length - 1) {
                System.out.println("You have reached Titan, all passengers are safe.");
            } else {
                String[] command = travelRoad[i].split("\\s+");
                switch (command[0]) {
                    case "Travel":
                        int lightYears = Integer.parseInt(command[1]);
                        if (lightYears <= fuel) {
                            fuel -= lightYears;
                            System.out.printf("The spaceship travelled %d light-years.%n", lightYears);
                        } else {
                            System.out.println("Mission failed.");
                            return;
                        }
                        break;
                    case "Enemy":
                        int enemyArmor = Integer.parseInt(command[1]);
                        if (ammunition >= enemyArmor) {
                            ammunition -= enemyArmor;
                            System.out.printf("An enemy with %d armour is defeated.%n", enemyArmor);
                        } else {
                            if (enemyArmor * 2 <= fuel) {
                                fuel -= enemyArmor * 2;
                                System.out.printf("An enemy with %d armour is outmaneuvered.%n", enemyArmor);
                            } else {
                                System.out.println("Mission failed.");
                                return;
                            }
                        }
                        break;
                    case "Repair":
                        int fuelAndAmmo = Integer.parseInt(command[1]);
                        fuel += fuelAndAmmo;
                        ammunition += fuelAndAmmo * 2;
                        System.out.printf("Ammunitions added: %d.%n", fuelAndAmmo * 2);
                        System.out.printf("Fuel added: %d.%n", fuelAndAmmo);
                        break;
                }
            }
        }
    }
}
