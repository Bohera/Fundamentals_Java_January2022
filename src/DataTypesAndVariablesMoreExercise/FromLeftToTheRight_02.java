package DataTypesAndVariablesMoreExercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineCount = scanner.nextInt();

        for (int i = 0; i < lineCount; i++) {
            BigDecimal numberOne = scanner.nextBigDecimal();
            BigDecimal numberTwo = scanner.nextBigDecimal();
            int compare = 0;
            compare = numberOne.compareTo(numberTwo);

            if (compare == 1) {

            }

        }

    }
}
