package MidExamPreparationOctober2021Feb2022;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] houses = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        int cupidPosition = 0;
        while (!command.equals("Love!")) {
            String[] commandAsStrings = command.split("\\s+");
            int jumpLength = Integer.parseInt(commandAsStrings[1]);
            cupidPosition += jumpLength;

            if (cupidPosition >= houses.length) {
                cupidPosition = 0;
            }
            if (houses[cupidPosition] == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", cupidPosition);
            } else {
                houses[cupidPosition] -= 2;
                if (houses[cupidPosition] == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", cupidPosition);
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", cupidPosition);

        boolean isValid = true; //може без boolean и долу да проверява за failedHouse == 0;
        int failedHouse = 0;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != 0) {
                isValid = false;
                failedHouse++;
            }
        }
        if (isValid) { //failedhouse == 0;
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", failedHouse);
        }
    }
}
