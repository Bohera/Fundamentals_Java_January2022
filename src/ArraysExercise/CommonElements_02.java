package ArraysExercise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split("\\s+");
        String[] secondLine = scanner.nextLine().split("\\s+");

        for (int i = 0; i < secondLine.length;i++) {
            for (int j = 0; j < firstLine.length; j++) {
                String firstElement = firstLine[j];
                String secondElement = secondLine[i];

                if (firstElement.equals(secondElement)) {
                    System.out.print(firstLine[j] + " ");
                }
            }
        }

    }
}
