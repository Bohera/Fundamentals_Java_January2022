package MidExamPreparationOctober2021Feb2022;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = nextIntArray(scanner);
        String command = scanner.nextLine();

        int totalShots = 0;
        while (!command.equals("End")) {
            int index = Integer.parseInt(command);

            if (isValidIndex(targets, index)) {
                int shotTarget = targets[index];
                if (shotTarget != -1) {
                    targets[index] = -1;
                    totalShots++;
                    for (int i = 0; i < targets.length; i++) {
                        if (targets[i] != -1) {
                            if (targets[i] > shotTarget) {
                                targets[i] -= shotTarget;
                            } else if (targets[i] <= shotTarget) {
                                targets[i] += shotTarget;
                            }
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", totalShots);
        printIntArray(targets, " ");
    }

    private static boolean isValidIndex(int[] targets, int index) {
        return index >= 0 && index < targets.length;
    }

    private static void printIntArray(int[] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(separator);
            }
        }
    }

    private static int[] nextIntArray(Scanner scanner) {
        int[] tempArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        return tempArray;

    }

}
