package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DataTypeFinder_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String dataType = "";

        while (!input.equals("END")) {
            String compareValue = input.toLowerCase();
            if (compareValue.matches("[-+]*[0-9]+[.][0-9]*")) {
                dataType = "floating point";
            } else if (compareValue.matches("[-+]*[0-9]+")) {
                dataType = "integer";
            } else if (compareValue.equals("true") || compareValue.equals("false")) {
                dataType = "boolean";
            } else if (input.length() == 1) {
                dataType = "character";
            } else {
                dataType = "string";
            }
            System.out.printf("%s is %s type%n", input, dataType);
            input = scanner.nextLine();
        }

    }
}
