package ArraysLab;

import java.util.Scanner;

public class CondenseArrayToNumber_____07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] stringArray = input.split("\\s+");

        int[] numbers = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            numbers[i] = Integer.parseInt(stringArray[i]);
        }

        if (stringArray.length == 1) {
            System.out.println(numbers[0]);
        } else {
            int numRepetitions = numbers.length - 1;

            for (int repetitions = 0; repetitions < numRepetitions; repetitions++) {
                int[] condensed = new int[numbers.length - 1];
                for (int i = 0; i < numbers.length - 1; i++) {
                    condensed[i] = numbers[i] + numbers[i + 1];
                }
                numbers = condensed;
            }
            System.out.print(numbers[0]);
        }
    }
}
