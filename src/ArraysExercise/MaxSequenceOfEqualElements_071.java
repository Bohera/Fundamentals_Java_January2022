package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInt = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(number -> Integer.parseInt(number))
                .toArray();


        int count = 1;
        int maxCount = Integer.MIN_VALUE;
        int equalElement = arrayInt[0];

        for (int number = 1; number < arrayInt.length; number++) {
            if (arrayInt[number] == arrayInt[number - 1]) {
                count++;

                if (count > maxCount) {
                    maxCount = count;
                    equalElement = arrayInt[number];
                }
            } else {
                count = 1;
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(equalElement + " ");
        }
    }
}