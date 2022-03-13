package DataTypesAndVariables;

import java.util.Scanner;

public class CharsToString_061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String output = "";

        for (int i = 0; i < 3; i++) {
            char input = scanner.nextLine().charAt(0);
            output += input;
        }

        System.out.println(output);
    }
}