package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_09 {
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
            for (int index = 0; index < currentSequence.length ; index++) {
                sum += currentSequence[index];
                if (currentSequence[index] == 1) {
                    if (counter == 0) {
                        startingIndex = index;
                    }
                    counter++;
                } else {
                    if (startingIndex == topStartingIndex && sum > topSum) {
                        topCounter = counter;
                        topStartingIndex = startingIndex;
                        topSequenceNumber = sequenceNumber;
                        topSequence = currentSequence;
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
                }
            }

            sum = 0;

            nextSequence = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", sequenceNumber, topSum);
        for (int i = 0; i < topSequence.length; i++) {
            System.out.print(topSequence[i] + " ");
        }
    }
}
