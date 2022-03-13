package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "int":
                int intOne = Integer.parseInt(scanner.nextLine());
                int intTwo = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(intOne, intTwo));
                break;
            case "char":
                char charOne = scanner.nextLine().charAt(0);
                char charTwo = scanner.nextLine().charAt(0);
                System.out.println(getMax(charOne, charTwo));
                break;
            case "string":
                String stringOne = scanner.nextLine();
                String stringTwo = scanner.nextLine();
                System.out.println(getMax(stringOne, stringTwo));
                break;
        }

        String output = "";

    }

    private static int getMax(int intOne, int intTwo) {
        if (intOne > intTwo) {
            return intOne;
        }
        return intTwo;
    }

    private static char getMax(char charOne, char charTwo) {
        if (charOne > charTwo) {
            return charOne;
        }
        return charTwo;
    }

    private static String getMax(String stringOne, String stringTwo) {
        if (stringOne.compareTo(stringTwo) >= 0) {
            return stringOne;
        }
        return stringTwo;
    }
}
