package DataTypesAndVariables;

import java.util.Scanner;

public class CharsToString_062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);
        String fullOutput = String.format("%s%s%s", firstChar, secondChar, thirdChar);

        System.out.printf(fullOutput);

    }
}
