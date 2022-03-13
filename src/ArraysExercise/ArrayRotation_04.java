package ArraysExercise;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayLine = scanner.nextLine().split("\\s+");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            String firstElement = arrayLine[0];
            for (int j = 0; j < arrayLine.length - 1; j++) {
                arrayLine[j] = arrayLine[j + 1];
            }
            arrayLine[arrayLine.length - 1] = firstElement;
        }

        System.out.println(String.join(" ", arrayLine));
    }
}
