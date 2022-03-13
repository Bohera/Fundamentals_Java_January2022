package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(number -> Integer.parseInt(number))
                .toArray();

        int sumLeft = 0;
        int sumRight = 0;
        int index = 0;
        boolean sumCheck = false;

        if (numbers.length == 1) {
            System.out.println(0);
            return;
        } else if (numbers.length == 2) {
            // ako sa 2 i ednoto e 0 to trqbva da ima proverka i za tova (lipsata na element e == 0)
            if (numbers[0] == 0) {
                index = 1;
                sumCheck = true;
            } else if (numbers[1] == 0) {
                index = 0;
                sumCheck = true;
            } else {
                System.out.println("no");
                return;
            }
        } else {
            for (int number = 1; number < numbers.length - 1; number++) {
                for (int checkSumLeft = number - 1; checkSumLeft >= 0; checkSumLeft--) {
                    sumLeft += numbers[checkSumLeft];
                }
                for (int checkSumRight = number + 1; checkSumRight < numbers.length; checkSumRight++) {
                    sumRight += numbers[checkSumRight];
                }
                if (sumLeft == sumRight) {
                    index = number;
                    sumCheck = true;
                    break;
                } else {
                    sumLeft = 0;
                    sumRight = 0;
                    sumCheck = false;
                }
            }
        }

        if (sumLeft == sumRight && sumCheck) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}
