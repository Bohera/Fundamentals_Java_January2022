package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dnaSequenceLength = Integer.parseInt(scanner.nextLine());

        String nextSequence = scanner.nextLine();

        int topCounter = 0;
        int topStartingIndex = 0;
        int topSum = 0;
        int topSequenceNumber = 0;

        int[] topSequence = new int[dnaSequenceLength];

        int counter = 0;
        int startingIndex = 0;
        int sum = 0;
        int sequenceNumber = 0;


        while (!nextSequence.equals("Clone them!")) {

            int[] currentSequence = Arrays.stream(nextSequence
                            .split("!+"))
                            .mapToInt(e -> Integer.parseInt(e))
                            .toArray();
            sequenceNumber++;

            int index = dnaSequenceLength;

            for (int i = 0; i < currentSequence.length ; i++) {
                if ((i != currentSequence.length - 1) && currentSequence[i] == 1 && currentSequence[i + 1] == 1 && index == dnaSequenceLength) {
                    index = i;
                }
                sum += currentSequence[i];
            }
            if (index == startingIndex && sum > topSum) {
                topSequence = currentSequence;
                topStartingIndex = startingIndex;
                topCounter = counter;
                topSum = sum;


            } else if (startingIndex < topStartingIndex) {
                topCounter = counter;
                topStartingIndex = startingIndex;
                topSequenceNumber = sequenceNumber;
                topSequence = currentSequence;
                topSum = sum;
            }
            counter = 0;
            startingIndex = 0;
            nextSequence = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", sequenceNumber, topSum);
        for (int i = 0; i < topSequence.length; i++) {
            System.out.print(topSequence[i] + " ");
        }
    }
}
