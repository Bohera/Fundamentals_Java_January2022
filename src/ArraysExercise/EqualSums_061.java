package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(number -> Integer.parseInt(number))
                .toArray();


        boolean sumCheck = false;

        for (int number = 0; number < numbers.length ; number++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int checkSumLeft = 0; checkSumLeft < number; checkSumLeft++) {
                sumLeft += numbers[checkSumLeft];
            }
            for (int checkSumRight = number + 1; checkSumRight < numbers.length; checkSumRight++) {
                sumRight += numbers[checkSumRight];
            }
            if (sumLeft == sumRight) {
                System.out.println(number);
                sumCheck = true;
            }
        }

        if(!sumCheck) {
            System.out.println("no");
        }

  }
}

