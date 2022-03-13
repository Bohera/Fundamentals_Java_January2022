package MidExamPreparationOctober2021Feb2022;

import java.util.Arrays;
import java.util.Scanner;

public class test_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int arrayLength = numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == -1) {
                arrayLength--;
            }
        }

        int[] numbersNew = new int[arrayLength];
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == -1) {
                temp++;
            } else {
                numbersNew[i - temp] = numbers[i];
            }
        }

        for (int i = 0; i < numbersNew.length; i++) {
            System.out.print(numbersNew[i]);
            if (i < numbersNew.length) {
                System.out.print(" ");
            }
        }

    }
}
