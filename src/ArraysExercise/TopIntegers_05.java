package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                                .split("\\s+"))
                                .mapToInt(number -> (Integer.parseInt(number)))
                                .toArray();

        for (int digit = 0; digit < numbers.length; digit++) {
            boolean isTop = true;
            for (int comparedTo = digit + 1; comparedTo < numbers.length; comparedTo++) {
                if (numbers[digit] > numbers[comparedTo]) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop || digit == numbers.length - 1) {
                System.out.print(numbers[digit] + " ");
            }
        }

    }
}
