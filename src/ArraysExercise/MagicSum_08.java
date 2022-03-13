package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayLine = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arrayLine.length; i++) {
            for (int j = i + 1; j < arrayLine.length; j++) {
                if (arrayLine[i] + arrayLine[j] == sum) {
                    System.out.println(arrayLine[i] + " " + arrayLine[j]);
                }
            }
        }
    }
}
