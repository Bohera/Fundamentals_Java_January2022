package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext("END")) {

            boolean isInt = scanner.hasNextInt();
            boolean isDouble = scanner.hasNextDouble();
            boolean isBoolean = scanner.nextBoolean();
            boolean isString = true;

            String input = scanner.nextLine();

            if (isInt) {
                System.out.printf("%s is integer type%n", input);
                isString = false;
            } else if (isDouble) {
                System.out.printf("%s is double type%n", input);
                isString = false;
            } else if (isBoolean) {
                System.out.printf("%s is boolean type%n", input);
                isString = false;
            }
            if (input.length() == 1 && isString) {
                System.out.printf("%s is character type%n", input);
            } else if (isString) {
                System.out.printf("%s is string type%n", input);
            }

        }

    }
}
