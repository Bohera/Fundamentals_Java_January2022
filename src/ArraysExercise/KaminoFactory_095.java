package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_095 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int length = Integer.parseInt(scan.nextLine()); // размер на ДНК символите
        String input = scan.nextLine(); // четем данните за ДНК, докато не получим Close them

        int bestSequenceSum = 0; // най-големият сбор от цифрите на ДНК
        int bestSequenceIndex = 0; //най-добър индекс
        int count = 0;
        int sequenceIndex = length;

        int[] dnaSequence = new int[length];

        while (!input.equals("Clone them!")) { // докато не получим Clone them, четем ДНК
            int[] arr = Arrays.stream(input.split("!+")).mapToInt(Integer::parseInt).toArray();

            int sum = 0;
            int index = length;
            count++;

            for (int i = 0; i < arr.length; i++) {
                if ((i != arr.length - 1) && arr[i] == 1 && arr[i + 1] == 1 && index == length) {
                    index = i;
                }
                sum += arr[i];
            }
            if (index == sequenceIndex && sum > bestSequenceSum) {
                dnaSequence = arr;
                bestSequenceIndex = count;
                bestSequenceSum = sum;
                sequenceIndex = index;

            } else if (index < sequenceIndex) {
                dnaSequence = arr;
                bestSequenceIndex = count;
                bestSequenceSum = sum;
                sequenceIndex = index;
            }
            input = scan.nextLine();
        }
        if (bestSequenceSum == 0) {
            bestSequenceIndex = 1;
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, bestSequenceSum);
        for (int value : dnaSequence) {
            System.out.print(value + " ");
        }
    }
}