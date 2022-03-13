package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInt = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(number -> Integer.parseInt(number))
                .toArray();

        int maxCountLast = 1;
        int equalElementLast = 0;

        int maxCountCurrent = 1;
        int equalElementCurrent = 0;

        for (int number = 0; number < arrayInt.length; number++) {
            for (int comparedTo = number + 1; comparedTo < arrayInt.length; comparedTo++) {
                if (arrayInt[number] != arrayInt[comparedTo]) {
                    if (maxCountCurrent > maxCountLast) {
                        maxCountLast = maxCountCurrent;
                        equalElementLast = equalElementCurrent;
                    }
                    maxCountCurrent = 1;
                    equalElementCurrent = 0;
                    break;
                } else {
                    maxCountCurrent++;
                    equalElementCurrent = arrayInt[number];
                }
            }
            if (maxCountCurrent == arrayInt.length) {
                maxCountLast = maxCountCurrent;
                equalElementLast = equalElementCurrent;
                break;
            }
        }
        if (maxCountLast == 1) {
            equalElementLast = arrayInt[0];
        }
        int[] arrayOutput = new int[maxCountLast];

        for (int i = 0; i < arrayOutput.length; i++) {
            arrayOutput[i] = equalElementLast;
        }
        Arrays.stream(arrayOutput).forEach(number -> System.out.print(number + " "));
    }
}
